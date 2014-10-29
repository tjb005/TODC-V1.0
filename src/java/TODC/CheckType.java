package TODC;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import data.QueryXML;
import objects.XMLFormat;
import javax.xml.stream.*;

public class CheckType extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException, FileNotFoundException {

        try {
            // Get aircraft type from the request
            String AC_type = request.getParameter("AC_type");

            // Get session ID
            HttpSession session = request.getSession();
            String JSessionId = session.getId();

            // Get XML file which specifies the format for the AC_type
            ServletContext sc = getServletContext();
            String file = sc.getRealPath("/XML/XML_form_editor.xml");

             // Read XML
            QueryXML ReadXML = new QueryXML();
            XMLFormat Format = ReadXML.getXMLFormat(AC_type, file);

            // Store attributes in the session object
            session.setAttribute("ID",JSessionId);
            session.setAttribute("AC_type", AC_type);
            session.setAttribute("XMLFormat", Format);

            // Forward request and response objects to JSP page
            String url = "/input.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        } catch (XMLStreamException ex) {
            Logger.getLogger(CheckType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
