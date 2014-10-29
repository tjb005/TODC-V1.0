<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Project Bravo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <link href="styles/bootstrap.css" rel="stylesheet">
        <link href="styles/styles.css" rel="stylesheet">
        <!--JSP-->
        <%@ page import="objects.XMLFormat" %>
        <% XMLFormat XMLFormat = (XMLFormat) session.getAttribute("XMLFormat");%>
    </head>

    <body onload="collapseElement('cfg_page');collapseElement('env_page');collapseElement('cdlmel_page');
      collapseElement('met');collapseElement('clrall');collapseElement('cdlmel_page');collapseElement('error');
      collapseElement('limit');document.getElementById('apt_menu').className='active';">

        <!-- header -->
        <div class="container">
            <h3>
                <%= XMLFormat.getTopLabel()%><br />
                TAKEOFF DATA
            </h3>
        </div>

        <!-- menu -->
        <jsp:include page = "/includes/navbar.jsp"></jsp:include>

        <!-- info/form -->
        <div class="container">

            <form action="<%=response.encodeURL("input")%>" method="post" class="form-horizontal" >

                <!-- apt -->
                <jsp:include page = "/includes/apt.jsp"></jsp:include>

                <!-- env -->
                <jsp:include page = "/includes/env.jsp"></jsp:include>

                <!-- cfg -->
                <jsp:include page = "/includes/cfg.jsp"></jsp:include>

                <!-- cdl mel -->
                <jsp:include page = "/includes/cdlmel.jsp"></jsp:include>

                <!--footer-->
                <jsp:include page = "/includes/footer.jsp"></jsp:include>

            </form>
        </div>

        <!--Pages function-->
        <jsp:include page = "/includes/pagefunction.jsp"></jsp:include>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="js/bootstrap.js"></script>

    </body>
</html>