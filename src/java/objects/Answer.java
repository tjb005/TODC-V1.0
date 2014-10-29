package objects;
import java.io.Serializable;

public class Answer implements Serializable
{   // FIELDS

    private String FileNameOut;
    private String MVN; //message version number
    private String tail;
    private String bleeds;
    private String aice;
    private String altinop;
    private String derate;
    private String CoG;
    private String MEL1;
    private String MEL2;
    private String MEL3;
    private String MEL4;
    private String airport;
    private String temp;
    private String QNH;
    private String windmag;
    private String winddir;
    private String runway;
    private String taxiway;
    private String special;
    private String notam;
    private String TORA;
    private String TODA;
    private String ASDA;
    private String slope;
    private String windcomp;
    private String surface;
    private String lineup;
    private String ObsRev;
    private String notes;
    private String LIMweight;
    private String LIM_flap;
    private String PLANweight;
    private String PLAN_flap;
    private String iclimb;
    private String v1;
    private String vr;
    private String v2;
    private String leveloff;
    private String MaxThrustSet;
    private String assumedtemp;
    private String assumedtempN1;
    private String CDL;
    private String REQ_flap;
    private String speedRatio;
    private String THRY_weight;
    private String errorCode;
    private String errorText;
    private String time;
    private String FMCreq;
    private String addr;

    // ZERO-ARGUMENT CONSTRUCTORS
    public Answer()
    {
       FileNameOut="";
       MVN ="";
       tail="";
       bleeds = "";
       aice = "";
       altinop="";
       derate ="";
       CoG = "";
       MEL1= "" ;
       MEL2= "" ;
       MEL3= "" ;
       MEL4= "" ;
       airport = "";
       temp ="";
       QNH = "";
       windmag = "";
       winddir = "";
       runway = "";
       taxiway = "";
       special = "";
       notam = "";
       TORA = "";
       TODA = "";
       ASDA = "";
       slope = "";
       windcomp = "";
       surface = "";
       lineup = "";
       ObsRev ="";
       notes ="";
       LIMweight ="";
       LIM_flap = "";
       PLANweight = "";
       PLAN_flap = "";
       iclimb = "";
       v1 = "";
       vr = "";
       v2 = "";
       leveloff = "";
       MaxThrustSet = "";
       assumedtemp = "";
       assumedtempN1 = "";
       CDL = "";
       REQ_flap = "";
       speedRatio = "";
       THRY_weight = "";
       errorCode = "";
       errorText = "";
       time = "";
       FMCreq = "";
       addr = "";
    }

    // CONSTRUCTORS
    public Answer(String FileNameOut,String MVN, String tail, String bleeds, String aice, String altinop, String derate,
            String CoG, String MEL1, String MEL2, String MEL3, String MEL4, String airport, String temp, 
            String QNH, String windmag, String winddir, String runway, String taxiway, String special, String notam,
            String TORA, String TODA, String ASDA, String slope, String windcomp, String surface, String lineup,
            String ObsRev, String notes, String LIMweight, String LIM_flap, String PLANweight, String PLAN_flap,
            String iclimb, String v1, String vr, String v2, String leveloff, String MaxThrustSet, String assumedtemp,
            String assumedtempN1, String CDL, String REQ_flap, String speedRatio, String THRY_weight, String errorCode,
            String errorText, String time, String FMCreq, String addr)
    {
        this.FileNameOut=FileNameOut;
        this.MVN = MVN;
        this.tail = tail;
        this.bleeds = bleeds;
        this.aice = aice;
        this.altinop = altinop;
        this.derate = derate;
        this.CoG = CoG;
        this.MEL1 = MEL1;
        this.MEL2 = MEL2;
        this.MEL3 = MEL3;
        this.MEL4 = MEL4;
        this.airport = airport;
        this.temp = temp;
        this.QNH = QNH;
        this.windmag = windmag;
        this.winddir = winddir;
        this.runway = runway;
        this.taxiway = taxiway;
        this.special = special;
        this.notam = notam;
        this.TORA = TORA;
        this.TODA = TODA;
        this.ASDA = ASDA;
        this.slope = slope;
        this.windcomp = windcomp;
        this.surface = surface;
        this.lineup = lineup;
        this.ObsRev = ObsRev;
        this.notes = notes;
        this.LIMweight = LIMweight;
        this.LIM_flap = LIM_flap;
        this.PLANweight = PLANweight;
        this.PLAN_flap = PLAN_flap;
        this.iclimb = iclimb;
        this.v1 = v1;
        this.vr = vr;
        this.v2 = v2;
        this.leveloff = leveloff;
        this.MaxThrustSet = MaxThrustSet;
        this.assumedtemp = assumedtemp;
        this.assumedtempN1 = assumedtempN1;
        this.CDL = CDL;
        this.REQ_flap = REQ_flap;
        this.speedRatio = speedRatio;
        this.THRY_weight = THRY_weight;
        this.errorCode = errorCode;
        this.errorText = errorText;
        this.time = time;
        this.FMCreq = FMCreq;
        this.addr = addr;
    }


   ////// FileNameOut ////////
   public void setFileNameOut(String FileNameOut)
    {
        this.FileNameOut = FileNameOut;
    }

    public String getFileNameOut()
    {
        return FileNameOut;
    }
   ////// MVN ////////
   public void setMVN(String MVN)
    {
        this.MVN = MVN;
    }

    public String getMVN()
    {
        return MVN;
    }

   ////// TAIL ////////
   public void setTail(String tail)
    {
        this.tail = tail;
    }

    public String getTail()
    {
        return tail;
    }

   ////// BLEEDS ////////
   public void setBleeds(String bleeds)
    {
        this.bleeds = bleeds;
    }

    public String getBleeds()
    {
        return bleeds;
    }

   ////// ANTI-ICE ////////
   public void setAice(String aice)
    {
        this.aice = aice;
    }

    public String getAice()
    {
        return aice;
    }

   ////// ALTERNATE/INOPERATIVE ITEMS ////////
   public void setAltinop(String altinop)
    {
        this.altinop = altinop;
    }

    public String getAltinop()
    {
        return altinop;
    }

   ////// DERATE ////////
   public void setDerate(String derate)
    {
        this.derate = derate;
    }

    public String getDerate()
    {
        return derate;
    }

    ////// CoG ////////
   public void setCoG(String CoG)
    {
        this.CoG = CoG;
    }

    public String getCoG()
    {
        return CoG;
    }

   ////// MEL1 ////////
   public void setMel1(String MEL1)
    {
        this.MEL1 = MEL1;
    }

    public String getMEL1()
    {
        return MEL1;
    }

    ////// MEL2 ////////
   public void setMel2(String MEL2)
    {
        this.MEL2 = MEL2;
    }

    public String getMEL2()
    {
        return MEL2;
    }

    ////// MEL3 ////////
   public void setMel3(String MEL3)
    {
        this.MEL3 = MEL3;
    }

    public String getMEL3()
    {
        return MEL3;
    }

   ////// MEL4 ////////
   public void setMel4(String MEL4)
    {
        this.MEL4 = MEL4;
    }

    public String getMEL4()
    {
        return MEL4;
    }

   ////// AIRPORT ////////
   public void setAirport(String airport)
    {
        this.airport = airport;
    }

    public String getAirport()
    {
        return airport;
    }
    
    ////// TEMPERATURE ////////
   public void setTemp(String temp)
    {
        this.temp = temp;
    }

    public String getTemp()
    {
        return temp;
    }

    ////// QNH ////////
   public void setQNH(String QNH)
    {
        this.QNH = QNH;
    }

    public String getQNH()
    {
        return QNH;
    }

    ////// WIND SPEED ////////
   public void setWindmag(String windmag)
    {
        this.windmag = windmag;
    }

    public String getWindmag()
    {
        return windmag;
    }

    ////// WIND DIRECTION ////////
   public void setWinddir(String winddir)
    {
        this.winddir = winddir;
    }

    public String getWinddir()
    {
        return winddir;
    }

   ////// RUNWAY ////////
   public void setRunway(String runway)
    {
        this.runway = runway;
    }

    public String getRunway()
    {
        return runway;
    }

    ////// TAXIWAY ////////
   public void setTaxiway(String taxiway)
    {
        this.taxiway = taxiway;
    }

    public String getTaxiway()
    {
        return taxiway;
    }

    ////// SPECIAl ////////
   public void setSpecial(String special)
    {
        this.special = special;
    }

    public String getSpecial()
    {
        return special;
    }

    ////// NOTAM ////////
   public void setNotam(String notam)
    {
        this.notam = notam;
    }

    public String getNotam()
    {
        return notam;
    }

   ////// TORA ////////
   public void setTORA(String TORA)
    {
        this.TORA = TORA;
    }

    public String getTORA()
    {
        return TORA;
    }

    ////// TODA ////////
   public void setTODA(String TODA)
    {
        this.TODA = TODA;
    }

    public String getTODA()
    {
        return TODA;
    }

   ////// ASDA ////////
   public void setASDA(String ASDA)
    {
        this.ASDA = ASDA;
    }

    public String getASDA()
    {
        return ASDA;
    }

   ////// SLOPE ////////
   public void setSlope(String slope)
    {
        this.slope = slope;
    }

    public String getSlope()
    {
        return slope;
    }

    ////// WIND COMPONENT ////////
   public void setWindcomp(String windcomp)
    {
        this.windcomp = windcomp;
    }

    public String getWindcomp()
    {
        return windcomp;
    }

    ////// SURFACE CONDITION ////////
   public void setSurface(String surface)
    {
        this.surface = surface;
    }

    public String getSurface()
    {
        return surface;
    }

   ////// LINE-UP ALLOWANCE ////////
   public void setLineup(String lineup)
    {
        this.lineup = lineup;
    }

    public String getLineup()
    {
        return lineup;
    }

   ////// OBSTACLE DATA REVISION DATE ////////
   public void setObsRev(String ObsRev)
    {
        this.ObsRev = ObsRev;
    }

    public String getObsRev()
    {
        return ObsRev;
    }

    ////// NOTES ////////
   public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public String getNotes()
    {
        return notes;
    }

   ////// LIMIT WEIGHT ////////
   public void setLIMweight(String LIMweight)
    {
        this.LIMweight = LIMweight;
    }

    public String getLIMweight()
    {
        return LIMweight;
    }

    ////// TAKE-OFF FLAP FOR LIMIT WEIGHT////////
   public void setLIM_flap(String LIM_flap)
    {
        this.LIM_flap = LIM_flap;
    }

    public String getLIM_flap()
    {
        return LIM_flap;
    }

    ////// PLANNED WEIGHT ////////
   public void setPLANweight(String PLANweight)
    {
        this.PLANweight = PLANweight;
    }

    public String getPLANweight()
    {
        return PLANweight;
    }

    ////// PLANNED FLAP ////////
   public void setPLAN_flap(String PLAN_flap)
    {
        this.PLAN_flap = PLAN_flap;
    }

    public String getPLAN_flap()
    {
        return PLAN_flap;
    }

    ////// IMPROVED CLIMB ////////
   public void setIclimb(String iclimb)
    {
        this.iclimb = iclimb;
    }

    public String getIclimb()
    {
        return iclimb;
    }

   ////// V1 ////////
   public void setV1(String v1)
    {
        this.v1 = v1;
    }

    public String getV1()
    {
        return v1;
    }

   ////// VR ////////
   public void setVr(String vr)
    {
        this.vr = vr;
    }

    public String getVr()
    {
        return vr;
    }

   ////// V2 ////////
   public void setV2(String v2)
    {
        this.v2 = v2;
    }

    public String getV2()
    {
        return v2;
    }

    ////// LEVEL OFF ////////
   public void setLeveloff(String leveloff)
    {
        this.leveloff = leveloff;
    }

    public String getLeveloff()
    {
        return leveloff;
    }

   ////// MAXIMUM THRUST SETTING ////////
   public void setMaxThrustSet(String MaxThrustSet)
    {
        this.MaxThrustSet = MaxThrustSet;
    }

    public String getMaxThrustSet()
    {
        return MaxThrustSet;
    }

    ///////// ASSUMED TEMP ////////////
    public void setAssumedtemp(String assumedtemp)
    {
        this.assumedtemp = assumedtemp;
    }

    public String getAssumedtemp()
    {
        return assumedtemp;
    }

    ///////// ASSUMED TEMP TO THRUST SETTING ////////////
    public void setAssumedtempN1(String assumedtempN1)
    {
        this.assumedtempN1 = assumedtempN1;
    }

    public String getAssumedtempN1()
    {
        return assumedtempN1;
    }

    ///////// CDL ////////////
    public void setCDL(String CDL)
    {
        this.CDL = CDL;
    }

    public String getCDL()
    {
        return CDL;
    }

    ///////// REQUESTED TO FLAP ////////////
    public void setREQ_flap(String REQ_flap)
    {
        this.REQ_flap = REQ_flap;
    }

    public String getREQ_flap()
    {
        return REQ_flap;
    }

    ///////// SPEED RATIO ////////////
    public void setSpeedRatio(String speedRatio)
    {
        this.speedRatio = speedRatio;
    }

    public String getSpeedRatio()
    {
        return speedRatio;
    }

    ///////// THEORETICAL WEIGHT ////////////
    public void setTHRY_weight(String THRY_weight)
    {
        this.THRY_weight = THRY_weight;
    }

    public String getTHRY_weight()
    {
        return THRY_weight;
    }


    ///////// ERROR CODE ////////////
    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    ///////// ERROR TEXT ////////////
    public void setErrorText(String errorText)
    {
        this.errorText = errorText;
    }

    public String getErrorText()
    {
        return errorText;
    }

    /////////TIME ////////////
    public void setTime(String time)
    {
        this.time = time;
    }

    public String getTime()
    {
        return time;
    }

    ///////// FMC REQ ////////////
    public void setFMCreq(String FMCreq)
    {
        this.FMCreq = FMCreq;
    }

    public String getFMCreq()
    {
        return FMCreq;
    }

    ///////// ADDRESS ////////////
    public void setAddr(String addr)
    {
        this.addr = addr;
    }

    public String getAddr()
    {
        return addr;
    }
}
