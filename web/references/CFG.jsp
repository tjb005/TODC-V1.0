<!doctype html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>CFG</title>
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
            <li class="active"><a href="CFG.jsp">CFG</a></li>
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
          <label for="flap" class="col-xs-3 col-sm-2 control-label">FLAP</label>
          <div class="col-xs-9 col-sm-6 styled-select">
            <select class="form-control" id="flap" placeholder="Click here for flap options">
              <option>Click here to select flap options</option>
              <option>Flap setting 1</option>
              <option>Flap setting 2</option>
              <option>Flap setting 3</option>
            </select>
          </div>
        </div>
      
        <div class="form-group">
          <label for="plane-weight" class="col-xs-3 col-sm-2 control-label">PLAN WT</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="plane-weight" placeholder="Plane Weight">
          </div>
        </div>
        
        <div class="form-group">
          <label for="start" class="col-xs-3 col-sm-2 control-label">START</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="start" placeholder="Rolling">
          </div>
        </div>
        
        <div class="form-group">
          <label for="aircon" class="col-xs-3 col-sm-2 control-label">AIRCON</label>
          <div class="col-xs-9 col-sm-6 styled-select">
            <select class="form-control" id="aircon" placeholder="Click here for air conditions">
              <option>Click here to select air conditions</option>
              <option>On</option>
              <option>Off</option>
            </select>
          </div>
        </div>
        
        <div class="form-group">
          <label for="anti-ice" class="col-xs-3 col-sm-2 control-label">ANTI ICE</label>
          <div class="col-xs-9 col-sm-6 styled-select">
            <select class="form-control" id="anti-ice" placeholder="Click here for anti-ice settings">
              <option>Click here to select anti-ice settings</option>
              <option>On</option>
              <option>Off</option>
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
        
      </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>