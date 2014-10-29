<div id="links">
    <br><br>
        <a href = "main.jsp"> Main </a><br><br>
        <a href = "<%=response.encodeURL("CheckType?AC_type=A330243")%>"> A330-243 </a><br><br>
        <a href = "<%=response.encodeURL("CheckType?AC_type=B737800W")%>"> 737-800W </a><br><br>
        <a href = "<%=response.encodeURL("CheckType?AC_type=B777300ER")%>"> 777-300ER </a><br><br>
        <a href = "<%=response.encodeURL("CheckType?AC_type=B777300ER")%>"> E190 </a><br><br>
        <br><br><br><br><br><br><br><br><br><br>
        <input type="button" value="PRINT" id="print" onClick="resultPrint(iFrame)"><br><br>
        <input type="button" value="HELP" id="print"><br><br>
</div>
