package objects;

import java.io.Serializable;

public class XMLFormat implements Serializable {   // FIELDS

    private String AC_type;
    private String AC_type_input;
    private String topLabel;
    private String topLabel_input;
    private String topLabel_Vident;
    private String topLabel_Vneed;
    private String topLabel_Vdata;
    private String topLabel_Vlength;
    private String topLabel_VRNG1;
    private String topLabel_VRNG2;
    private String topLabel_Vcmt;
    private String L1;
    private String L1_input;
    private String L1_Vident;
    private String L1_Vneed;
    private String L1_Vdata;
    private String L1_Vlength;
    private String L1_VRNG1;
    private String L1_VRNG2;
    private String L1_Vcmt;
    private String L2;
    private String L2_input;
    private String L2_Vident;
    private String L2_Vneed;
    private String L2_Vdata;
    private String L2_Vlength;
    private String L2_VRNG1;
    private String L2_VRNG2;
    private String L2_Vcmt;
    private String L3;
    private String L3_input;
    private String L4;
    private String L4_input;
    private String L5;
    private String L5_input;
    private String L6;
    private String L6_input;
    private String L7;
    private String L7_input;
    private String L8;
    private String L8_input;
    private String L9;
    private String L9_input;
    private String L10;
    private String L10_input;
    private String R1;
    private String R1_input;
    private String R2;
    private String R2_input;
    private String R3;
    private String R3_input;
    private String R4;
    private String R4_input;
    private String R5;
    private String R5_input;
    private String R6;
    private String R6_input;
    private String R7;
    private String R7_input;
    private String R8;
    private String R8_input;
    private String R9;
    private String R9_input;
    private String R10;
    private String R10_input;

    // ZERO-ARGUMENT CONSTRUCTORS
    public XMLFormat() {
        AC_type = "";
        AC_type_input = "";
        topLabel = "";
        topLabel_input = "";
        topLabel_Vident ="";
        topLabel_Vneed="";
        topLabel_Vdata="";
        topLabel_Vlength="";
        topLabel_VRNG1="";
        topLabel_VRNG2="";
        topLabel_Vcmt="";
        L1 = "";
        L1_input = "";
        L1_Vident ="";
        L1_Vneed="";
        L1_Vdata="";
        L1_Vlength="";
        L1_VRNG1="";
        L1_VRNG2="";
        L1_Vcmt="";
        L2 = "";
        L2_input = "";
        L2_Vident ="";
        L2_Vneed="";
        L2_Vdata="";
        L2_Vlength="";
        L2_VRNG1="";
        L2_VRNG2="";
        L2_Vcmt="";
        L3 = "";
        L3_input = "";
        L4 = "";
        L4_input ="";
        L5 = "";
        L5_input ="";
        L6 = "";
        L6_input ="";
        L7 = "";
        L7_input ="";
        L8 = "";
        L8_input ="";
        L9 = "";
        L9_input ="";
        L10 = "";
        L10_input ="";
        R1 = "";
        R1_input = "";
        R2 = "";
        R2_input = "";
        R3 = "";
        R3_input = "";
        R4 = "";
        R4_input = "";
        R5 = "";
        R5_input = "";
        R6 = "";
        R6_input = "";
        R7 = "";
        R7_input = "";
        R8 = "";
        R8_input = "";
        R9 = "";
        R9_input = "";
        R10 = "";
        R10_input = "";

    }

    // CONSTRUCTORS
    public XMLFormat(String AC_type,String AC_type_input, 
            String topLabel,String topLabel_input,String topLabel_Vident, String topLabel_Vneed, String topLabel_Vdata,String topLabel_Vlength,String topLabel_VRNG1,String topLabel_VRNG2,String topLabel_Vcmt,
            String L1,String L1_input,String L1_Vident, String L1_Vneed, String L1_Vdata,String L1_Vlength,String L1_VRNG1,String L1_VRNG2,String L1_Vcmt,
            String L2,String L2_input,String L2_Vident, String L2_Vneed, String L2_Vdata,String L2_Vlength,String L2_VRNG1,String L2_VRNG2,String L2_Vcmt,
            String L3,String L3_input,
            String L4,String L4_input, String L5, String L5_input, String L6, String L6_input,
            String L7, String L7_input, String L8, String L8_input, String L9, String L9_input,
            String L10, String L10_input, String R1, String R1_input,String R2,String R2_input,
            String R3,String R3_input,String R4, String R4_input, String R5,String R5_input,
            String R6,String R6_input, String R7,String R7_input,String R8,String R8_input,
            String R9,String R9_input, String R10,String R10_input)
    {

        this.AC_type = AC_type;
        this.AC_type_input = AC_type_input;
        this.topLabel = topLabel;
        this.topLabel_input = topLabel_input;
        this.topLabel_Vident = topLabel_Vident;
        this.topLabel_Vneed = topLabel_Vneed;
        this.topLabel_Vdata = topLabel_Vdata;
        this.topLabel_Vlength = topLabel_Vlength;
        this.topLabel_VRNG1 = topLabel_VRNG1;
        this.topLabel_VRNG2 = topLabel_VRNG2;
        this.topLabel_Vcmt = topLabel_Vcmt;
        this.L1 = L1;
        this.L1_input = L1_input;
        this.L1_Vident = L1_Vident;
        this.L1_Vneed = L1_Vneed;
        this.L1_Vdata = L1_Vdata;
        this.L1_Vlength = L1_Vlength;
        this.L1_VRNG1 = L1_VRNG1;
        this.L1_VRNG2 = L1_VRNG2;
        this.L1_Vcmt = L1_Vcmt;
        this.L2 = L2;
        this.L2_input = L2_input;
        this.L2_Vident = L2_Vident;
        this.L2_Vneed = L2_Vneed;
        this.L2_Vdata = L2_Vdata;
        this.L2_Vlength = L2_Vlength;
        this.L2_VRNG1 = L2_VRNG1;
        this.L2_VRNG2 = L2_VRNG2;
        this.L2_Vcmt = L2_Vcmt;
        this.L3 = L3;
        this.L3_input = L3_input;
        this.L4 = L4;
        this.L4_input = L4_input;
        this.L5 = L5;
        this.L5_input = L5_input;
        this.L6 = L6;
        this.L6_input = L6_input;
        this.L7 = L7;
        this.L7_input = L7_input;
        this.L8 = L8;
        this.L8_input = L8_input;
        this.L9 = L9;
        this.L9_input = L9_input;
        this.L10 = L10;
        this.L10_input = L10_input;
        this.R1 = R1;
        this.R1_input = R1_input;
        this.R2 = R2;
        this.R2_input = R2_input;
        this.R3 = R3;
        this.R3_input = R3_input;
        this.R4 = R4;
        this.R4_input = R4_input;
        this.R5 = R5;
        this.R5_input = R5_input;
        this.R6 = R6;
        this.R6_input = R6_input;
        this.R7 = R7;
        this.R7_input = R7_input;
        this.R8 = R8;
        this.R8_input = R8_input;
        this.R9 = R9;
        this.R9_input = R9_input;
        this.R10 = R10;
        this.R10_input = R10_input;
    }

    ////// AC_type ////////
    public void setAC_type(String AC_type) {
        this.AC_type = AC_type;
    }

    public String getAC_type() {
        return AC_type;
    }

    ////// AC_type input ////////
    public void setAC_type_input(String AC_type_input) {
        this.AC_type_input = AC_type_input;
    }

    public String getAC_type_input() {
        return AC_type_input;
    }

    ////// Top Label ////////
    public void setTopLabel(String topLabel) {
        this.topLabel = topLabel;
    }

    public String getTopLabel() {
        return topLabel;
    }

    ////// Top Label Input ////////
    public void setTopLabel_input(String topLabel_input) {
        String[] input_param = topLabel_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.topLabel_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.topLabel_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getTopLabel_input() {
        return topLabel_input;
    }

    ////// Top Label Ident Validation ////////
    public void setTopLabel_Vident(String topLabel_input) {
        String[] input_param = topLabel_input.split(",");
        this.topLabel_Vident = input_param[1];
    }

    public String getTopLabel_Vident() {
        return topLabel_Vident;
    }

    ////// Top Label Mandatory Field Validation ////////
    public void setTopLabel_Vneed(String topLabel_val) {
        String[] input_param = topLabel_val.split(",");
        if(input_param[0] == null ? "0" == null : input_param[0].equals("0")){
        this.topLabel_Vneed = "/**/";
        }else{this.topLabel_Vneed="form."+ this.topLabel_Vident + ".value == '' ||";}
    }

    public String getTopLabel_Vneed() {
        return topLabel_Vneed;
    }

     ////// Top Label Data Type Validation ////////
    public void setTopLabel_Vdata(String topLabel_val) {
        String[] input_param = topLabel_val.split(",");
        if(input_param[1] == null ? "0" == null : input_param[1].equals("0")){
        this.topLabel_Vdata = "/**/";
        }else{this.topLabel_Vdata="isNaN(form."+ this.topLabel_Vident +".value) ||";}
    }

    public String getTopLabel_Vdata() {
        return topLabel_Vdata;
    }

    ////// Top Label Length Validation ////////
    public void setTopLabel_Vlength(String topLabel_val) {
        String[] input_param = topLabel_val.split(",");
        this.topLabel_Vlength = input_param[2];
    }

    public String getTopLabel_Vlength() {
        return topLabel_Vlength;
    }

    ////// Top Label Min Range Validation ////////
    public void setTopLabel_VRNG1(String topLabel_val) {
        String[] input_param = topLabel_val.split(",");
        if(input_param[3] == null ? "null" == null : input_param[3].equals("null")){
        this.topLabel_VRNG1 = "/**/";
        }else{this.topLabel_VRNG1="form."+ this.topLabel_Vident +".value <" + input_param[3] + "||" ;}
    }

    public String getTopLabel_VRNG1() {
        return topLabel_VRNG1;
    }

    ////// Top Label Max Range Validation ////////
    public void setTopLabel_VRNG2(String topLabel_val) {
        String[] input_param = topLabel_val.split(",");
        if(input_param[4] == null ? "null" == null : input_param[3].equals("null")){
        this.topLabel_VRNG2 = "/**/";
        }else{this.topLabel_VRNG2="form."+ this.topLabel_Vident + ".value >" + input_param[4]+ "||" ;}
    }

    public String getTopLabel_VRNG2() {
        return topLabel_VRNG2;
    }


    ////// Top Label Comment Validation ////////
    public void setTopLabel_Vcmt(String topLabel_val) {
        String[] input_param = topLabel_val.split(",");
        this.topLabel_Vcmt = input_param[5];
    }

    public String getTopLabel_Vcmt() {
        return topLabel_Vcmt;
    }

    ////// L1 ////////
    public void setL1(String L1) {
        this.L1 = L1;
    }

    public String getL1() {
        return L1;
    }

    ////// L1 Input ////////
    public void setL1_input(String L1_input) {
        String[] input_param = L1_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L1_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L1_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL1_input() {
        return L1_input;
    }

    ////// L1 Ident Validation ////////
    public void setL1_Vident(String L1_input) {
        String[] input_param = L1_input.split(",");
        this.L1_Vident = input_param[1];
    }

    public String getL1_Vident() {
        return L1_Vident;
    }

    ////// L1 Mandatory Field Validation ////////
    public void setL1_Vneed(String L1_val) {
        String[] input_param = L1_val.split(",");
        if(input_param[0] == null ? "0" == null : input_param[0].equals("0")){
        this.L1_Vneed = "/**/";
        }else{this.L1_Vneed="form."+ this.L1_Vident + ".value == '' ||";}
    }

    public String getL1_Vneed() {
        return L1_Vneed;
    }

     ////// L1 Data Type Validation ////////
    public void setL1_Vdata(String L1_val) {
        String[] input_param = L1_val.split(",");
        if(input_param[1] == null ? "0" == null : input_param[1].equals("0")){
        this.L1_Vdata = "/**/";
        }else{this.L1_Vdata="isNaN(form."+ this.L1_Vident +".value) ||";}
    }

    public String getL1_Vdata() {
        return L1_Vdata;
    }

    ////// L1 Length Validation ////////
    public void setL1_Vlength(String L1_val) {
        String[] input_param = L1_val.split(",");
        this.L1_Vlength = input_param[2];
    }

    public String getL1_Vlength() {
        return L1_Vlength;
    }

    ////// L1 Min Range Validation ////////
    public void setL1_VRNG1(String L1_val) {
        String[] input_param = L1_val.split(",");
        if(input_param[3] == null ? "null" == null : input_param[3].equals("null")){
        this.L1_VRNG1 = "/**/";
        }else{this.L1_VRNG1="form."+ this.L1_Vident +".value <" + input_param[3] + "||" ;}
    }

    public String getL1_VRNG1() {
        return L1_VRNG1;
    }

    ////// L1 Max Range Validation ////////
    public void setL1_VRNG2(String L1_val) {
        String[] input_param = L1_val.split(",");
        if(input_param[4] == null ? "null" == null : input_param[3].equals("null")){
        this.L1_VRNG2 = "/**/";
        }else{this.L1_VRNG2="form."+ this.L1_Vident + ".value >" + input_param[4]+ "||" ;}
    }

    public String getL1_VRNG2() {
        return L1_VRNG2;
    }


    ////// L1 Comment Validation ////////
    public void setL1_Vcmt(String L1_val) {
        String[] input_param = L1_val.split(",");
        this.L1_Vcmt = input_param[5];
    }

    public String getL1_Vcmt() {
        return L1_Vcmt;
    }


    ////// L2 ////////
    public void setL2(String L2) {
        this.L2 = L2;
    }

    public String getL2() {
        return L2;
    }

    ////// L2 Input ////////
    public void setL2_input(String L2_input) {
        String[] input_param = L2_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L2_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L2_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL2_input() {
        return L2_input;
    }

    ////// L2 Ident Validation ////////
    public void setL2_Vident(String L2_input) {
        String[] input_param = L2_input.split(",");
        this.L2_Vident = input_param[1];
    }

    public String getL2_Vident() {
        return L2_Vident;
    }

    ////// L2 Mandatory Field Validation ////////
    public void setL2_Vneed(String L2_val) {
        String[] input_param = L2_val.split(",");
        if(input_param[0] == null ? "0" == null : input_param[0].equals("0")){
        this.L2_Vneed = "/**/";
        }else{this.L2_Vneed="form."+ this.L2_Vident + ".value == '' ||";}
    }

    public String getL2_Vneed() {
        return L2_Vneed;
    }

     ////// L2 Data Type Validation ////////
    public void setL2_Vdata(String L2_val) {
        String[] input_param = L2_val.split(",");
        if(input_param[1] == null ? "0" == null : input_param[1].equals("0")){
        this.L2_Vdata = "/**/";
        }else{this.L2_Vdata="isNaN(form."+ this.L2_Vident +".value) ||";}
    }

    public String getL2_Vdata() {
        return L2_Vdata;
    }

    ////// L2 Length Validation ////////
    public void setL2_Vlength(String L2_val) {
        String[] input_param = L2_val.split(",");
        this.L2_Vlength = input_param[2];
    }

    public String getL2_Vlength() {
        return L2_Vlength;
    }

    ////// L2 Min Range Validation ////////
    public void setL2_VRNG1(String L2_val) {
        String[] input_param = L2_val.split(",");
        if(input_param[3] == null ? "null" == null : input_param[3].equals("null")){
        this.L2_VRNG1 = "/**/";
        }else{this.L2_VRNG1="form."+ this.L2_Vident +".value <" + input_param[3] + "||" ;}
    }

    public String getL2_VRNG1() {
        return L2_VRNG1;
    }

    ////// L2 Max Range Validation ////////
    public void setL2_VRNG2(String L2_val) {
        String[] input_param = L2_val.split(",");
        if(input_param[4] == null ? "null" == null : input_param[3].equals("null")){
        this.L2_VRNG2 = "/**/";
        }else{this.L2_VRNG2="form."+ this.L2_Vident + ".value >" + input_param[4]+ "||" ;}
    }

    public String getL2_VRNG2() {
        return L2_VRNG2;
    }


    ////// L2 Comment Validation ////////
    public void setL2_Vcmt(String L2_val) {
        String[] input_param = L2_val.split(",");
        this.L2_Vcmt = input_param[5];
    }

    public String getL2_Vcmt() {
        return L2_Vcmt;
    }

    ////// L3 ////////
    public void setL3(String L3) {
        this.L3 = L3;
    }

    public String getL3() {
        return L3;
    }

    ////// L3_input ////////
    public void setL3_input(String L3_input) {
        String[] input_param = L3_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L3_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L3_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL3_input() {
        return L3_input;
    }

    ////// L4 ////////
    public void setL4(String L4) {
        this.L4 = L4;
    }

    public String getL4() {
        return L4;
    }

    ////// L4_input ////////
    public void setL4_input(String L4_input)
    {
        String[] input_param = L4_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L4_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L4_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL4_input() {
        return L4_input;
    }

    ////// L5 ////////
    public void setL5(String L5) {
        this.L5 = L5;
    }

    public String getL5() {
        return L5;
    }


    ////// L5_input ////////
    public void setL5_input(String L5_input) {
        String[] input_param = L5_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L5_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L5_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL5_input() {
        return L5_input;
    }

    ////// L6 ////////
    public void setL6(String L6) {
        this.L6 = L6;
    }

    public String getL6() {
        return L6;
    }

    ////// L6_input ////////
    public void setL6_input(String L6_input) {
        String[] input_param = L6_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L6_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L6_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL6_input() {
        return L6_input;
    }

    ////// L7 ////////
    public void setL7(String L7) {
        this.L7 = L7;
    }

    public String getL7() {
        return L7;
    }

    ////// L7_input ////////
    public void setL7_input(String L7_input) {
        String[] input_param = L7_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L7_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L7_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL7_input() {
        return L7_input;
    }

    ////// L8 ////////
    public void setL8(String L8) {
        this.L8 = L8;
    }

    public String getL8() {
        return L8;
    }

        ////// L8_input ////////
    public void setL8_input(String L8_input) {
        String[] input_param = L8_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L8_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L8_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL8_input() {
        return L8_input;
    }

    ////// L9 ////////
    public void setL9(String L9) {
        this.L9 = L9;
    }

    public String getL9() {
        return L9;
    }

    ////// L9_input ////////
    public void setL9_input(String L9_input) {
        String[] input_param = L9_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L9_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L9_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL9_input() {
        return L9_input;
    }

    ////// L10 ////////
    public void setL10(String L10) {
        this.L10 = L10;
    }

    public String getL10() {
        return L10;
    }


    ////// L10_input ////////
    public void setL10_input(String L10_input) {
        String[] input_param = L10_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.L10_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.L10_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getL10_input() {
        return L10_input;
    }

    ////// R1 ////////
    public void setR1(String R1) {
        this.R1 = R1;
    }

    public String getR1() {
        return R1;
    }

    ////// R1_input ////////
    public void setR1_input(String R1_input) {
        String[] input_param = R1_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R1_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R1_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR1_input() {
        return R1_input;
    }

    ////// R2 ////////
    public void setR2(String R2) {
        this.R2 = R2;
    }

    public String getR2() {
        return R2;
    }

        ////// R2_input ////////
    public void setR2_input(String R2_input) {
        String[] input_param = R2_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R2_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R2_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR2_input() {
        return R2_input;
    }

    ////// R3 ////////
    public void setR3(String R3) {
        this.R3 = R3;
    }

    public String getR3() {
        return R3;
    }

    ////// R3_input ////////
    public void setR3_input(String R3_input) {
        String[] input_param = R3_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R3_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R3_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR3_input() {
        return R3_input;
    }

    ////// R4 ////////
    public void setR4(String R4) {
        this.R4 = R4;
    }

    public String getR4() {
        return R4;
    }

    ////// R4_input////////
    public void setR4_input(String R4_input) {
        String[] input_param = R4_input.split(",");

        if (input_param[0].equals("0")) {
                String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                        + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

                this.R4_input = textbox;

        } else if (input_param[0].equals("1")){
                String startTag = "<select name =" + '"' + input_param[1]
                        + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
                String[] middletag = new String[(input_param.length-3)/3];
                String endTag = "</select>";

                int counter = 0;

                for (int i = 3; i < input_param.length; i=i+3)
                {
                middletag[counter]="<option value=" + '"' + input_param[i] + '"' + input_param[i+2] + ">" + input_param[i+1] +"</option>";
                counter++;
                }

                String TotalMiddletag= middletag[0];

                for (int m=1; m < middletag.length; m++){
                TotalMiddletag = TotalMiddletag + middletag[m];}

                this.R4_input = startTag + TotalMiddletag + endTag;}
    }

    public String getR4_input() {

        return R4_input;
    }

    ////// R5 ////////
    public void setR5(String R5) {
        this.R5 = R5;
    }

    public String getR5() {
        return R5;
    }

    ////// R5_input ////////
    public void setR5_input(String R5_input) {
        String[] input_param = R5_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R5_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R5_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR5_input() {
        return R5_input;
    }

    ////// R6 ////////
    public void setR6(String R6) {
        this.R6 = R6;
    }

    public String getR6() {
        return R6;
    }

    ////// R6_input ////////
    public void setR6_input(String R6_input) {
        String[] input_param = R6_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R6_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R6_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR6_input() {
        return R6_input;
    }

    ////// R7 ////////
    public void setR7(String R7) {
        this.R7 = R7;
    }

    public String getR7() {
        return R7;
    }

    ////// R7_input ////////
    public void setR7_input(String R7_input) {
        String[] input_param = R7_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R7_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R7_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR7_input() {
        return R7_input;
    }

    ////// R8 ////////
    public void setR8(String R8) {
        this.R8 = R8;
    }

    public String getR8() {
        return R8;
    }

        ////// R8_input ////////
    public void setR8_input(String R8_input) {
        String[] input_param = R8_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R8_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R8_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR8_input() {
        return R8_input;
    }

    ////// R9 ////////
    public void setR9(String R9) {
        this.R9 = R9;
    }

    public String getR9() {
        return R9;
    }

    ////// R9_input ////////
    public void setR9_input(String R9_input) {
        String[] input_param = R9_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R9_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R9_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR9_input() {
        return R9_input;
    }

        ////// R10 ////////
    public void setR10(String R10) {
        this.R10 = R10;
    }

    public String getR10() {
        return R10;
    }

    ////// R10_input ////////
    public void setR10_input(String R10_input) {
        String[] input_param = R10_input.split(",");

        if (input_param[0].equals("0")) {
            String textbox = "<input type=" + '"' + "text" + '"' + "name=" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";

            this.R10_input = textbox;

        } else if (input_param[0].equals("1")) {
            String startTag = "<select name =" + '"' + input_param[1]
                    + '"' + "" + "style=" + '"' + "width:" + input_param[2] + '"' + ">";
            String[] middletag = new String[(input_param.length - 3) / 3];
            String endTag = "</select>";

            int counter = 0;

            for (int i = 3; i < input_param.length; i = i + 3) {
                middletag[counter] = "<option value=" + '"' + input_param[i] + '"' + input_param[i + 2] + ">" + input_param[i + 1] + "</option>";
                counter++;
            }

            String TotalMiddletag = middletag[0];

            for (int m = 1; m < middletag.length; m++) {
                TotalMiddletag = TotalMiddletag + middletag[m];
            }

            this.R10_input = startTag + TotalMiddletag + endTag;
        }
    }

    public String getR10_input() {
        return R10_input;
    }
}
