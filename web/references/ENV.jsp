<!doctype html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>ENV</title>
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
            <li class="active"><a href="ENV.jsp">ENV</a></li>
            <li><a href="CFG.jsp">CFG</a></li>
            <li><a href="CDLMEL.jsp">CDL/MEL</a></li>
            <li><a href="RES.jsp">RES</a></li>
          </ul>
        </div>
        
      </div>
    </div>
    
    <!-- info/form -->
    <div class="container">
      
      <form class="form-horizontal" role="form">
      
        <div class="form-group">
          <label for="oat" class="col-xs-3 col-sm-2 control-label">OAT</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="oat" placeholder="Type in OAT">
          </div>
        </div>
        
        <div class="form-group">
          <label for="wind" class="col-xs-3 col-sm-2 control-label">WIND</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="windspeed" placeholder="Type in windspeed">
          </div>
        </div>
        
        <div class="form-group">
          <label for="WC" class="sr-only">W/C</label>
          <div class="col-xs-9 col-sm-6 col-xs-offset-3 col-sm-offset-2">
            <input type="text" class="form-control" id="WC" placeholder="Type in W/C">
          </div>
        </div>
        
        <div class="form-group">
          <label for="QNH" class="col-xs-3 col-sm-2 control-label">QNH</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="QNH" placeholder="Type in QNH">
          </div>
        </div>
        
        <div class="form-group">
          <label for="runway-conditions" class="col-xs-3 col-sm-2 control-label">RWY COND</label>
          <div class="col-xs-9 col-sm-6 styled-select">
            <select class="form-control" id="runway-conditions" placeholder="Click here for runway conditions">
              <option>Click here to select runway conditions</option>
              <option>Dry</option>
              <option>Wet</option>
            </select>
          </div>
        </div>
        
      </form>
    </div>
    
    <!-- extra info -->
    <div class="container" id="extra-info">
      <p>
        <small>
        </small>
      </p>
    </div>
    
    <!--footer-->
    <div class= "navbar navbar-default navbar-fixed-bottom">
      <div class="container">
      
        <a href="#" class="btn navbar-btn btn-clear pull-right">CLEAR</a>
        <a href="#" class="btn navbar-btn btn-default pull-right">MET</a>
        
      </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>