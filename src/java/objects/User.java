package objects;
import java.text.*; // needed for DecimalFormat class
import java.io.Serializable;

public class User implements Serializable
{   // FIELDS
    private String tail;
    private String inputweight;
    private String airport;
    private String runway;
    private String surface;
    private String winddir;
    private String windmag;
    private String temp;
    private String QNH;
    private String flaps;
    private String thrust;
    private String bleeds;
    private String aice;
    private String iclimb;
    private String taxiway;
    private String special;
    private String notam;

    // ZERO-ARGUMENT CONSTRUCTORS
    public User()
    {
       tail = "";
       inputweight = "";
       airport = "";
       runway = "";
       surface = "";
       winddir = "";
       windmag = "";
       temp = "";
       QNH = "";
       flaps = "";
       thrust = "";
       bleeds = "";
       aice ="";
       iclimb = "";
       taxiway = "";
       special = "";
       notam = "";
    }

    // CONSTRUCTORS
    public User(String tail, String inputweight, String airport, String runway, String surface, String winddir,String windmag,
            String temp, String QNH, String flaps, String thrust, String bleeds, String aice, String iclimb, String taxiway,
            String special, String notam
            )
    {
        this.tail = tail;
        this.inputweight = inputweight;
        this.airport = airport;
        this.runway = runway;
        this.surface = surface;
        this.winddir = winddir;
        this.windmag = windmag;
        this.temp = temp;
        this.QNH = QNH;
        this.flaps = flaps;
        this.thrust = thrust;
        this.bleeds = bleeds;
        this.aice = aice;
        this.iclimb = iclimb;
        this.taxiway = taxiway;
        this.special = special;
        this.notam = notam;

    }

   /// INTEGER FORMATS ///
   DecimalFormat oneDigit = new DecimalFormat("#0.0");
   DecimalFormat noDigit = new DecimalFormat("#0");

   //////AIRCRAFT TAIL ////////
   public void setTail(String tail)
    {
        this.tail = tail;
    }

    public String getTail()
    {
        return tail;
    }
    
    //////AIRPORT ////////
   public void setAirport(String airport)
    {
        this.airport = airport;
    }

    public String getAirport()
    {
        return airport;
    }

    //////// RUNWAY ////////
    public void setRunway(String runway)
    {
        this.runway = runway;
    }

    public String getRunway()
    {
        return runway;
    }

    //////// SURFACE ////////
    public void setSurface(String surface)
    {
        this.surface = surface;
    }

    public String getSurface()
    {
        return surface;
    }

    /////////WIND DIRECTION ////////////
    public void setWinddir(String winddir)
    {
        this.winddir = winddir;
    }

    public String getWinddir()
    {
        return winddir;
    }

    /////////WIND MAGNITUDE ////////////
    public void setWindmag(String windmag)
    {
        this.windmag = windmag;
    }

    public String getWindmag()
    {
        return windmag;
    }

    //////// Taxiway //////////
    public void setTaxiway(String taxiway)
    {
        this.taxiway = taxiway;
    }

    public String getTaxiway()
    {
        return taxiway;
    }

    //////// Special //////////
    public void setSpecial(String special)
    {
        this.special = special;
    }

    public String getSpecial()
    {
        return special;
    }

    //////// NOTAM //////////
    public void setNotam(String notam)
    {
        this.notam = notam;
    }

    public String getNotam()
    {
        return notam;
    }

    ////////// TEMPERATURE /////////////////
    public void setTemp(String temp)
    {

        // Convert temp into double
        double temp2 = Double.parseDouble(temp);

        // Find magnitude of temp
        String temp_mag;
        if (temp2 < 0) {
            temp_mag = "M";
        } else {
            temp_mag = "P";
        }

        // Find 1st decimal place value of temp
        temp2 = Math.abs(temp2);
        double tt = (int) temp2;
        double oneDec = (temp2 - tt) * 10;

        // String outputs for temp
        String oneDec_out = noDigit.format(oneDec);
        String temp_out = noDigit.format(temp2);

        // Create temp output
        this.temp = temp_mag+temp_out+oneDec_out;
    }

    public String getTemp()
    {
        return temp;
    }

    //////// QNH ///////////
    public void setQNH(String QNH)
    {
        // Round to integer
        double QNHdouble = Double.parseDouble(QNH);
        QNHdouble = Math.round(QNHdouble);
        String QNH2 = noDigit.format(QNHdouble);

        this.QNH = QNH2;
    }

    public String getQNH()
    {
        return QNH;
    }

    //////// FLAPS ///////////
    public void setFlaps(String flaps)
    {
        this.flaps = flaps;
    }

    public String getFlaps()
    {
        return flaps;
    }

    //////// THRUST //////////
    public void setThrust(String thrust)
    {
        this.thrust = thrust;
    }

    public String getThrust()
    {
        return thrust;
    }
    
    //////// BLEEDS //////////
    public void setBleeds(String bleeds)
    {
        this.bleeds = bleeds;
    }

    public String getBleeds()
    {
        return bleeds;
    }
    
    //////// ANTI-ICE //////////
    public void setAice(String aice)
    {
        this.aice = aice;
    }

    public String getAice()
    {
        return aice;
    }

    //////// IMPROVED CLIMB//////////
    public void setIclimb(String iclimb)
    {
        this.iclimb = iclimb;
    }

    public String getIclimb()
    {
        return iclimb;
    }

    //////// INPUT WEIGHT//////////
    public void setInputweight(String inputweight)
    {
        this.inputweight = inputweight;
    }

    public String getInputweight()
    {
        return inputweight;
    }

}
