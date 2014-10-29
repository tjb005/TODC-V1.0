<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Project B</title>
        <!-- CSS -->
        <link rel="stylesheet" media="screen" type ="text/css" href="styles/calc_style.css" />
        <!--JS-->
        <script type ="text/javascript" src ="javascripts/submitForm.js"></script>
        <script type ="text/javascript" src ="javascripts/print.js"></script>

        <%@ page import="objects.XMLFormat" %>
        <%@ page import="objects.Answer" %>
        <% XMLFormat XMLFormat = (XMLFormat) session.getAttribute("XMLFormat");%>
        <% Answer answer = (Answer) session.getAttribute("answer");%>
    </head>
    <body onLoad="javascript:location.href='out/<%= answer.getFileNameOut()%>'">
    

    </body>
</html>