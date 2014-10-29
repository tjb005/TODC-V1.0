package data;

import java.io.*;
import objects.User;

public class InputTODC {

    public static void add(User user, String path, long timeOfReq) throws IOException {
        File file = new File(path);
        PrintWriter out = new PrintWriter(
                new FileWriter(file, false));
        out.println("REQPER01/" + "AC:" + user.getTail() + "," + "," + "," + "," + "/AP:"
                + user.getAirport() + "," + user.getTemp() + "," + user.getQNH() + ","
                + user.getWinddir() + "," + user.getWindmag() + "/RY:" + user.getRunway()
                + "," + user.getTaxiway() + "," + user.getSpecial() + "," + user.getNotam() + ","
                + user.getSurface() + "," + "," + "/TD:" + user.getInputweight() + "," + user.getFlaps() + ","
                + user.getIclimb() + "," + user.getBleeds() + "," + user.getAice() + "," + "," + "," + user.getThrust()
                + "," + user.getIclimb() + "/AD:" + timeOfReq + "," + "N" + "," + "WEB");
        out.close();
    }
}
