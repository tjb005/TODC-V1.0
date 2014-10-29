<!doctype html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>RES</title>
    <link href="styles/bootstrap.css" rel="stylesheet">
    <link href="styles/styles.css" rel="stylesheet">
  </head>

  <body>
  
    <!-- header -->
    <div class="container">
      <h3>
        Q300<br />
        TAKEOFF DATA
      </h3>
    </div>
    
    <!-- menu -->
    <div class="navbar navbar-inverse navbar-static-top">
      <div class="container">
        
        <!-- **a button to click on when the menu list is hidden
        <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
          <span class = "icon-bar"></span>
          <span class = "icon-bar"></span>
          <span class = "icon-bar"></span>
        </button>
        -->
        
        <div class="collapse navbar-collapse navHeaderCollapse show">
          <ul class="nav navbar-nav navbar-left">
            <li><a href="APT.jsp">APT</a></li>
            <li><a href="ENV.jsp">ENV</a></li>
            <li><a href="CFG.jsp">CFG</a></li>
            <li><a href="CDLMEL.jsp">CDL/MEL</a></li>
            <li class="active"><a href="RES.jsp">RES</a></li>
          </ul>
        </div>
        
      </div>
    </div>
    
    <!-- info/form -->
    <div class="container">
      <div class="table-responsive">
        <table class="table table-hover table-bordered table-striped">
          <tr>
            <th>MTOW</th>
            <th>V1</th>
          </tr>
          <tr class="success">
            <td>18,030 kg</td>
            <td>123</td>
          </tr>
          <tr>
            <th>FLAP</th>
            <th>VR</th>
          </tr>
          <tr class="success">
            <td>15</td>
            <td>123</td>
          </tr>
          <tr>
            <th>ACCEL HT</th>
            <th>V2</th>
          </tr>
          <tr class="success">
            <td>800 ft</td>
            <td>123</td>
          </tr>
        </table>
      </div>
    </div>
    
    <!-- extra info -->
    <div class="container" id="extra-info">
      <p>
        <small>
          Notes: At 2.0 DME AKL<br />
          Turn lft HDG 115m
        </small>
      </p>
    </div>
    
    <!--footer-->
    <div class= "navbar navbar-default navbar-fixed-bottom">
      <div class="container">
      
        <a href="#" class="btn navbar-btn btn-clear pull-right">CLR ALL</a>
        <a href="#" class="btn navbar-btn btn-warning pull-right">LIMIT</a>
        <a href="#" class="btn navbar-btn btn-danger pull-right">ERROR</a>
        
      </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>