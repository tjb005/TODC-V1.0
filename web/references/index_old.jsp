<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS -->
        <link rel="stylesheet" type ="text/css" href="styles/calc_style.css"/>
    </head>
    <body>
        <jsp:include page = "/includes/heading.jsp"></jsp:include>

        <div id="index">
        <table style="border:solid black">
            <tr><td>
                    <img alt = "A330"  src = "images/A330.jpg" id="index_images"/><br>
                </td>
                <td>
                    <img alt = "B737"  src = "images/737.jpg" id="index_images"/><br>
                </td>
            </tr>
            <tr>
                <td><center>
                     <a href = "<%=response.encodeURL("CheckType?AC_type=A330243")%>"> Airbus A330-243 </a>
                    </center>
                </td>
                <td><center>
                       <a href = "<%=response.encodeURL("CheckType?AC_type=B737800W")%>"> Boeing 737-800W </a>
                    </center>
                </td>
            </tr>
            <tr>
                <td>
                    <img alt = "B777"  src = "images/777.jpg" id="index_images"/><br>
                </td>
                <td>
                    <img alt = "E190"  src = "images/E190.jpg" id="index_images"/><br>
                </td>
            </tr>
            <tr>
                <td><center>
                     <a href = "<%=response.encodeURL("CheckType?AC_type=B777300ER")%>"> Boeing 777-300ER </a>
                     </center>
                </td>
                <td><center>
                     <a href = "<%=response.encodeURL("CheckType?AC_type=B777300ER")%>">E190</a>
                    </center>
                </td>
            </tr>
        </table>
        </div>
    </body>
</html>




