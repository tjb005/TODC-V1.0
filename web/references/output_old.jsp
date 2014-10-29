<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Virgin Australia Take-off Data Calculator </title>
        <!-- CSS -->
        <link rel="stylesheet" media="screen" type ="text/css" href="styles/calc_style.css" />
        <!--JS-->
        <script type ="text/javascript" src ="javascripts/submitForm.js"></script>
        <script type ="text/javascript" src ="javascripts/print.js"></script>
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

                            <%@ page import="objects.XMLFormat" %>
                            <%@ page import="objects.Answer" %>
                            <% XMLFormat XMLFormat = (XMLFormat) session.getAttribute("XMLFormat");%>
                            <% Answer answer = (Answer) session.getAttribute("answer");%>
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
                                                            <td><input type="button" value="Submit" onClick="validate(this.form)"></td>
                                                            <td><input type="reset" value="Reset"></td>
                                                        </tr>
                                                    </table>
                                            </tr>
                                        </table>
                                    </td>
                                    <td id="InOutTD">
                                        <iframe id="iFrame" src="outputs/<%= answer.getFileNameOut()%>"></iframe>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </td></tr>
            </table>
            <jsp:include page = "/includes/footer.jsp"></jsp:include>
        </div>
    </body>
</html>