<!doctype html>
<html>
  <head>
    <title>Select Aircraft</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="styles/bootstrap.css" rel="stylesheet">
    <link href="styles/styles.css" rel="stylesheet">
  </head>

<body>

  <!-- header -->
  <div class="container">
    <div class="container-signin">

    <h3>
      <span class="glyphicon glyphicon-plane"></span> SELECT AIRCRAFT
    </h3>

    <ul class="nav nav-pills nav-justified">
      <li><a href="<%=response.encodeURL("CheckType?AC_type=A330243")%>">A330</a></li>
      <li><a href="<%=response.encodeURL("CheckType?AC_type=B737800W")%>">B737</a></li>
      <li><a href="<%=response.encodeURL("CheckType?AC_type=B777300ER")%>">B777</a></li>
    </ul>

    </div>
  </div>

</body>
</html>

