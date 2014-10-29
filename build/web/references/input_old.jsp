<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Virgin Australia Take-off Data Calculator </title>
        <!-- CSS -->
        <link rel="stylesheet" media="screen" type ="text/css" href="styles/calc_style.css" />
        <!--JSP-->
        <%@ page import="objects.XMLFormat" %>
        <% XMLFormat XMLFormat = (XMLFormat) session.getAttribute("XMLFormat");%>
    </head>
    <body>
        <div>
            <jsp:include page = "/includes/heading.jsp"></jsp:include>
            <table><tr>
                    <td>
                        <jsp:include page = "/includes/links.jsp"></jsp:include>
                    </td>
                    <td>
                        <form action="<%=response.encodeURL("input")%>" method="post" id="form">
                            <table id="InOut">
                                <tr>
                                    <td id="InOutTD">
                                        <table id="Table">
                                            <tr><td colspan="3">
                                                    <table id="TailTable">
                                                        <tr>
                                                            <td id="tail_col_1"><%= XMLFormat.getTopLabel()%></td>
                                                            <td id="tail_col_2"><%= XMLFormat.getTopLabel_input()%>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                            <tr><td colspan="3"></td></tr>
                                            <tr><td colspan="3">
                                                    <table id="Table2">
                                                        <tr>
                                                            <td id="LEFT"><%= XMLFormat.getL1()%></td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"><%= XMLFormat.getR1()%></td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT"><%= XMLFormat.getL1_input()%></td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT">
                                                                <table id="WindTable">
                                                                    <tr id="WindTable">
                                                                        <td id="WindRIGHT"><input type="text" name="winddir" id="WndTXTBox1"> / </td>
                                                                        <td id="WindRIGHT"><input type="text" name="windmag" id="WndTXTBox2"> KT </td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT"><%= XMLFormat.getL2()%> </td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"><%= XMLFormat.getR2()%></td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT"><%= XMLFormat.getL2_input()%></td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"><%= XMLFormat.getR2_input()%> C</td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT"><%= XMLFormat.getL3()%></td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"><%= XMLFormat.getR3()%></td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT">|<%= XMLFormat.getL3_input()%>| </td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"><%= XMLFormat.getR3_input()%> </td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT"><%= XMLFormat.getL4()%></td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"></td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT">|<%= XMLFormat.getL4_input()%>| </td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"><%= XMLFormat.getR4()%><%= XMLFormat.getR4_input()%>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT"><%= XMLFormat.getL5()%></td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"><%= XMLFormat.getR5()%></td>
                                                        </tr>
                                                        <tr>
                                                            <td id="LEFT"></td>
                                                            <td id="MID"></td>
                                                            <td id="RIGHT"><%= XMLFormat.getR5_input()%>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                        <br>
                                        <table id="Table">
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL6()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR6()%></td>
                                            </tr>
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL6_input()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR6_input()%>
                                            </tr>
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL7()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR7()%></td>
                                            </tr>
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL7_input()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR7_input()%></td>
                                            </tr>
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL8()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR8()%></td>
                                            </tr>
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL8_input()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR8_input()%></td>
                                            </tr>
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL9()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR9()%></td>
                                            </tr>
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL9_input()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR9_input()%></td>
                                            </tr>
                                            <tr>
                                                <td id="LEFT"><%= XMLFormat.getL10()%></td>
                                                <td id="MID"></td>
                                                <td id="RIGHT"><%= XMLFormat.getR10()%><br>
                                                    <table>
                                                        <tr>
                                                            <td><input type="button" value="Submit" onClick="form.submit()"></td>
                                                            <td><input type="reset" value="Reset"></td>
                                                        </tr>
                                                    </table>
                                            </tr>
                                        </table>
                                    </td>
                                    <td id="InOutTD">
                                        <iframe id="iFrame" src=""></iframe>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </td></tr>
            </table>
            <jsp:include page = "/includes/footer.jsp"></jsp:include>
            <script type="text/javascript">
                function validate(form)
                {
                    // VALIDATE: TOP LABEL LENGTH
                    var toplen = form.<%= XMLFormat.getTopLabel_Vident()%>.value.length;
                    if(toplen != "<%= XMLFormat.getTopLabel_Vlength()%>"){
                        topval = "false"
                    }else topval ="true"
                    if(<%= XMLFormat.getTopLabel_Vlength()%>==null){topval ="true"}

                    // VALIDATE: L1 LENGTH
                    var L1len = form.<%= XMLFormat.getL1_Vident()%>.value.length;
                    if(L1len != "<%= XMLFormat.getL1_Vlength()%>"){
                        L1val = "false"
                    }else L1val ="true"
                     if(<%= XMLFormat.getL1_Vlength()%>==null){L1val ="true"}
                    
                     // VALIDATE: L2 LENGTH
                    var L2len = form.<%= XMLFormat.getL2_Vident()%>.value.length;
                    if(L2len != "<%= XMLFormat.getL2_Vlength()%>"){
                        L2val = "false"
                    }else L2val ="true"
                     if(<%= XMLFormat.getL2_Vlength()%>==null){L2val ="true"}


                    //VALIDATE: Wind direction has three values
                    var winddirlen = form.winddir.value.length;
                    if(winddirlen != "3"){
                        winddirval = "false"
                    }else winddirval ="true"

                    //VALIDATE: Wind magnitude has three values
                    var windmaglen = form.windmag.value.length;
                    if(windmaglen != "3"){
                        windmagval = "false"
                    }else windmagval ="true"


                    //VALIDATE: Taxiway designator has four values
                    var taxiway_len = form.taxiway.value.length;
                    if(taxiway_len > "4"){
                        taxiway_len = "false"
                    }else taxiway_len ="true"


                    //VALIDATE: Special designator has six values
                    var special_len = form.special.value.length;
                    if(special_len > "6"){
                        special_len = "false"
                    }else special_len ="true"

                    // VALIDATE: TOP LABEL
                    if(<%= XMLFormat.getTopLabel_Vneed()%> <%= XMLFormat.getTopLabel_Vdata()%> <%= XMLFormat.getTopLabel_VRNG1()%> <%= XMLFormat.getTopLabel_VRNG2()%> topval=="false" )
                    {
                        alert("<%= XMLFormat.getTopLabel_Vcmt()%>")
                        form.<%= XMLFormat.getTopLabel_Vident()%>.value.focus();
                    }

                    // VALIDATE: L1
                    else if (<%= XMLFormat.getL1_Vneed()%> <%= XMLFormat.getL1_Vdata()%> <%= XMLFormat.getL1_VRNG1()%> <%= XMLFormat.getL1_VRNG2()%> L1val=="false" )
                    {
                        alert("<%= XMLFormat.getL1_Vcmt()%>")
                        form.<%= XMLFormat.getL1_Vident()%>.value.focus();
                    }

                    // VALIDATE: L2
                    else if (<%= XMLFormat.getL2_Vneed()%> <%= XMLFormat.getL2_Vdata()%> <%= XMLFormat.getL2_VRNG1()%> <%= XMLFormat.getL2_VRNG2()%> L2val=="false" )
                    {
                        alert("<%= XMLFormat.getL2_Vcmt()%>")
                        form.<%= XMLFormat.getL2_Vident()%>.value.focus();
                    }

                    //VALIDATE: WIND DIRECTION
                    else if(form.winddir.value == "" || isNaN(form.winddir.value) || form.winddir.value < 0 || form.winddir.value >360 ||
                        winddirval == "false")
                    {
                        alert("Please enter wind direction between 000 to 360");
                        form.winddir.value.focus();
                    }

                    //VALIDATE: WIND MAGNITUDE
                    else if(form.windmag.value == "" || isNaN(form.windmag.value) || form.windmag.value < -10 || form.windmag.value > 40 ||
                        windmagval == "false")
                    {
                        alert("Please enter wind magnitude between -10 to 40");
                        form.windmag.value.focus();
                    }

      

                    // VALIDATE TEMPERATURE
                    else if(form.temp.value == "" || isNaN(form.temp.value) || form.temp.value > 55 || form.temp.value <-40 )
                    {
                        alert("Please enter temperature value between -40 to 50");
                        form.temp.value.focus();
                    }

                    //VALIDATE: TAXIWAY
                    else if (form.taxiway.value != "" && taxiway_len == "false" )
                    {
                        alert("Please select taxiway designator with less than four characters")
                        form.taxiway.value.focus();
                    }

                    // VALIDATE QNH
                    else if(form.QNH.value == "" || isNaN(form.QNH.value) || form.QNH.value > 1100 || form.QNH.value <900 )
                    {
                        alert("Please enter QNH value between 900 and 1100");
                        form.QNH.value.focus();
                    }

                    //VALIDATE: SPECIAL
                    else if (form.special.value != "" && special_len == "false" )
                    {
                        alert("Please select SPECIAL designator with less than six characters")
                        form.special.value.focus();
                    }

                    // VALIDATE PLANNED TOW
                    else if (form.inputweight.value == "" || isNaN(form.inputweight.value) || form.inputweight.value < 50000 || form.inputweight.value >79015)
                    {
                        alert("Please enter weight between 50000kg to 79015kg");
                        form.inputweight.value.focus();
                    }

                    else{
                        form.submit();
                        document.getElementById("iFrame").src = "images/loading.gif";
                    }

                }



            </script>
        </div>
    </body>
</html>