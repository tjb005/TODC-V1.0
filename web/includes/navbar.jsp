<div class="navbar navbar-inverse navbar-static-top">
    <div class="container">

        <div class="collapse navbar-collapse navHeaderCollapse show">
            <ul class="nav navbar-nav navbar-left">
                <li id="apt_menu"><a href="#" onclick="collapseElement('cfg_page'); collapseElement('env_page');
                            collapseElement('cdlmel_page');expandElement('apt_page');
                            collapseElement('clrall');collapseElement('met');collapseElement('error');
                            collapseElement('limit'); expandElement('info');expandElement('calc');
                            expandElement('clr');document.getElementById('apt_menu').className = '';

                            document.getElementById('apt_menu').className = 'active';document.getElementById('env_menu').className = '';
                            document.getElementById('cfg_menu').className = '';document.getElementById('cdlmel_menu').className = '';">APT</a></li>

                <li id="env_menu"><a href="#" onclick="collapseElement('apt_page'); collapseElement('cfg_page');
                            collapseElement('cdlmel_page');expandElement('env_page');collapseElement('calc');
                            collapseElement('info');collapseElement('clrall');collapseElement('met');
                            collapseElement('error');collapseElement('limit');expandElement('clr');

                            document.getElementById('apt_menu').className = '';document.getElementById('env_menu').className = 'active';
                            document.getElementById('cfg_menu').className = '';document.getElementById('cdlmel_menu').className = '';">ENV</a></li>

                <li id="cfg_menu"><a href="#" onclick="collapseElement('apt_page'); collapseElement('env_page');
                            collapseElement('cdlmel_page');expandElement('cfg_page');collapseElement('calc');collapseElement('info');
                            collapseElement('clrall');collapseElement('error');collapseElement('limit');expandElement('clr');
                            expandElement('met');document.getElementById('cfg_menu').className = 'active';


                            document.getElementById('apt_menu').className = '';document.getElementById('env_menu').className = '';
                            document.getElementById('cfg_menu').className = 'active';document.getElementById('cdlmel_menu').className = '';">CFG</a></li>

                <li id="cdlmel_menu"><a href="#" onclick="collapseElement('apt_page'); collapseElement('env_page');
                            collapseElement('cfg_page');expandElement('cdlmel_page');collapseElement('calc');collapseElement('info');
                            collapseElement('clr');collapseElement('met');collapseElement('error');collapseElement('limit');
                            expandElement('clrall');document.getElementById('cdlmel_menu').className = 'active';

                            document.getElementById('apt_menu').className = '';document.getElementById('env_menu').className = '';
                            document.getElementById('cfg_menu').className = '';document.getElementById('cdlmel_menu').className = 'active';">CDL/MEL</a></li>

            </ul>
        </div>

    </div>
</div>