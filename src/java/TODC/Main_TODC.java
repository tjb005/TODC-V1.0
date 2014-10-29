package TODC;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import objects.User;
import data.InputTODC;
import data.OutputTODC;
import java.util.Date;
import objects.Answer;

public class Main_TODC extends HttpServlet
{
    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException
    {
        // Get parameters from the request
        String tail = request.getParameter("tail");
        String airport = request.getParameter("airport");
        String runway = request.getParameter("runway");
        String taxiway = request.getParameter("taxiway");
        String special = request.getParameter("special");
        String inputweight = request.getParameter("inputweight");
        String bleeds = request.getParameter("bleeds");
        String aice = request.getParameter("aice");
        String winddir = request.getParameter("winddir");
        String windmag = request.getParameter("windmag");
        String temp = request.getParameter("temp");
        String QNH = request.getParameter("QNH");
        String surface = request.getParameter("surface");
        String flaps = request.getParameter("flaps");
        String MEL1 = request.getParameter("MEL1");
        String MEL2 = request.getParameter("MEL2");
        String CDL1 = request.getParameter("CDL1");
        String CDL2 = request.getParameter("CDL2");
        String thrust = request.getParameter("thrust");
        String iclimb = request.getParameter("iclimb");
        String notam = "";

        // Get Session
        HttpSession session = request.getSession();

        // Initialise objects
        Answer answer = new Answer();
        User user = new User(tail, inputweight, airport, runway, surface, winddir, windmag, temp, QNH,
                flaps, thrust, bleeds, aice, iclimb, taxiway, special, notam);

        ////////////////////////////// TODC input  ////////////////////////////
        // Time of request
        Date now = new Date();
        long timeOfReq = now.getTime();
        //
        // Session ID
        String ID = (String) session.getAttribute("ID");
        String ID5 = ID.substring(0,5);
        //
        // Aircraft Tail
        String tailPre = tail.substring(0,2);
        String tailIdent = tail.substring(3,6);
        //
        // Filename
        //String FileNameIn = timeOfReq + ID5 + tailPre + tailIdent + ".jsp";
        String FileNameIn = timeOfReq + ID5 + tailPre + tailIdent + ".REQ";

        // Directory where request file is written to
        ServletContext in = getServletContext();
        //String inPath = in.getRealPath("/inputs/" + FileNameIn);
        String inPath = "C:/ACARSIN/" + FileNameIn;

        // Format input variables
        user.setTemp(temp);
        user.setQNH(QNH);

        // Write TODC request to file
        InputTODC.add(user, inPath, timeOfReq);
        ////////////////////////////////////////////////////////////////////////

        ///////////////////////////////TODC output /////////////////////////////

        // Directory where response files are read
        ServletContext out = getServletContext();
        String outPath = out.getRealPath("/out/");
        //String outPath = "C:/ACARSOUT/";

        //FileNameIn = "output.txt";
        String FileNameOut = timeOfReq + ID5 + tailPre + tailIdent + ".FMT";

        // Check for outputs from TODC that match request
        while (answer.getFileNameOut() == null ? "" == null : answer.getFileNameOut().equals("")) {
            OutputTODC.check(user, answer, outPath, FileNameOut);
        }

        ////////////////////////////////////////////////////////////////////////

        // Set attributes to session
        session.setAttribute("time",timeOfReq);
        session.setAttribute("user", user);
        session.setAttribute("answer",answer);

        // Forward request and response objects to JSP page
        String url = "/output.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}