package data;

import java.io.*;
import objects.User;
import objects.Answer;

public class OutputTODC
{
    public static void check(User user, Answer answer, String filepath, String FileNameIn) throws IOException
    {
       /// TEST OUTPUT CONSOLE ///
       //File file = new File("c:/testconsole.txt");
       //PrintWriter out = new PrintWriter(new FileWriter(file, false));
       //////////////////////////

       File dir = new File(filepath);
       String[] dirlist = dir.list();


       for(int i=0; i<dirlist.length; i++)
       {
           if(dirlist[i] == null ? FileNameIn == null : dirlist[i].equals(FileNameIn))
           {
           answer.setFileNameOut(dirlist[i]);
           }
       
       }
       /// TEST OUTPUT CONSOLE ///
       //out.println(answer.getFileNameOut());
       //out.close();
       //////////////////////////
    }
}