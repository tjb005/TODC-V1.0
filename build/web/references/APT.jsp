<!doctype html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>APT</title>
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
            <li class="active"><a href="APT.jsp">APT</a></li>
            <li><a href="ENV.jsp">ENV</a></li>
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
          <label for="aircraft-number" class="col-xs-3 col-sm-2 control-label">AIRCRAFT</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="aircraft-number" placeholder="Type in Aircraft">
          </div>
        </div>
        
        <div class="form-group">
          <label for="flight-number" class="sr-only">FLIGHT NUMBER</label>
          <div class="col-xs-9 col-sm-6 col-xs-offset-3 col-sm-offset-2">
            <input type="text" class="form-control" id="flight-number" placeholder="Type in Flight Number">
          </div>
        </div>
        
        <div class="form-group">
          <label for="airport" class="col-xs-3 col-sm-2 control-label">AIRPORT</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="airport" placeholder="Type in Airport">
          </div>
        </div>
        
        <div class="form-group">
          <label for="runway" class="col-xs-3 col-sm-2 control-label">RUNWAY</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="runway" placeholder="Type in runway">
          </div>
        </div>
        
        <div class="form-group">
          <label for="taxiway" class="col-xs-3 col-sm-2 control-label">TAXIWAY</label>
          <div class="col-xs-9 col-sm-6 styled-select">
            <select class="form-control" id="taxiway" placeholder="Click here for taxiway">
              <option>Click here to select taxiway</option>
              <option>Taxiway 1</option>
              <option>Taxiway 2</option>
              <option>Taxiway 3</option>
            </select>
          </div>
        </div>
        
        <div class="form-group">
          <label for="special" class="col-xs-3 col-sm-2 control-label">SPECIAL</label>
          <div class="col-xs-9 col-sm-6 styled-select">
            <select class="form-control" id="special" placeholder="Click here for special conditions">
              <option>Click here for special conditions</option>
              <option>Special condition 1</option>
              <option>Special condition 2</option>
              <option>Special condition 3</option>
            </select>
          </div>
        </div>
        
      </form>
    </div>
    
    <!-- extra info -->
    <div class="container" id="extra-info">
      <p>
        <small>
          Aukland International Airport<br />
          TORA 2500m<br />
          TODA 2560m<br />
          ASDA 2560m<br />
        </small>
      </p>
    </div>
    
    <!--footer-->
    <div class= "navbar navbar-default navbar-fixed-bottom">
      <div class="container">
      
        <a href="#" class="btn navbar-btn btn-clear pull-right">CLEAR</a>
        <a href="#" class="btn navbar-btn btn-default pull-right">INFO</a>
        
      </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>