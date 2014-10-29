<!doctype html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>CDL/MEL</title>
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
            <li class="active"><a href="CDLMEL.jsp">CDL/MEL</a></li>
            <li><a href="RES.jsp">RES</a></li>
          </ul>
        </div>
        
      </div>
    </div>
    
    <!-- info/form -->
    <div class="container">
      
      <form class="form-horizontal" role="form">
      
        <div class="form-group">
          <label for="CDL1" class="col-xs-3 col-sm-2 control-label">CDL 1</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="CDL1" placeholder="CDL 1">
          </div>
        </div>
        
        <div class="form-group">
          <label for="CDL2" class="col-xs-3 col-sm-2 control-label">CDL 2</label>
          <div class="col-xs-9 col-sm-6">
            <input type="text" class="form-control" id="CDL2" placeholder="CDL 2">
          </div>
        </div>
        
        <div class="form-group">
          <label for="MEL1" class="col-xs-3 col-sm-2 control-label">MEL 1</label>
          <div class="col-xs-9 col-sm-6 styled-select">
            <select class="form-control" id="MEL1" placeholder="Click here for first MEL">
              <option>Click here to select MEL</option>
              <option>nil</option>
              <option>33-44-66A <small>One brake deactivated</small></option>
              <option>33-25-47B <small>Engine failure</small></option>
            </select>
          </div>
        </div>
        
        <div class="form-group">
          <label for="MEL2" class="col-xs-3 col-sm-2 control-label">MEL 2</label>
          <div class="col-xs-9 col-sm-6 styled-select">
            <select class="form-control" id="MEL2" placeholder="Click here for Second MEL">
              <option>Click here to select MEL</option>
              <option>nil</option>
              <option>33-25-47B <small>Engine failure</small></option>
              <option>35-09-78A <small>One brake deactivated</small></option>
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
        <a href="#PopupBox" data-toggle="modal" class="btn navbar-btn btn-default pull-right">CALC</a>
        
      </div>
    </div>
    
    <!--Popup Box-->
    <div class="modal fade" id="PopupBox" role="dialog">
      <div class="modal-dialog">
        <div class="modal-content">
            
            <div class="modal-header">
              <h4>Enter Wind:</h4>
            </div>
          
            <div class="modal-body">
            
              <div class="row">
                <div class="col-xs-8 col-xs-offset-2">
                  <form class="form" role="form">
                    <div class="form-group">
                      <label for="windspeed-input" class="sr-only">ms/s</label>
                      <input type="text" class="form-control" id="windspeed input" placeholder="ms/s">
                    </div>
                  </form>
                </div>
              </div>
            
              <div class="row">
                <div class="col-xs-8 col-xs-offset-2">
                  <a href="#" class="btn btn-calc">1</a>
                  <a href="#" class="btn btn-calc">2</a>
                  <a href="#" class="btn btn-calc">3</a>
                </div>
              </div>
              
              <div class="row">
                <div class="col-xs-8 col-xs-offset-2">
                  <a href="#" class="btn btn-calc">4</a>
                  <a href="#" class="btn btn-calc">5</a>
                  <a href="#" class="btn btn-calc">6</a>
                </div>
              </div>
              
              <div class="row">
                <div class="col-xs-8 col-xs-offset-2">
                  <a href="#" class="btn btn-calc">7</a>
                  <a href="#" class="btn btn-calc">8</a>
                  <a href="#" class="btn btn-calc">9</a>
                </div>
              </div>
              
              <div class="row">
                <div class="col-xs-8 col-xs-offset-2">
                  <a href="#" class="btn btn-calc">.</a>
                  <a href="#" class="btn btn-calc">0</a>
                  <a href="#" class="btn btn-calc">CLR</a>
                </div>
              </div>
              
            </div>
          
            <div class="modal-footer">
              <a href="#" class="btn btn-default btn-xs" data-dismiss="modal">Cancel</a>
              <button class="btn btn-primary btn-xs" type="submit">Done</button>
            </div>
            
          </form>
        </div>
      </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>