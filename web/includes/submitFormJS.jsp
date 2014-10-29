<script type="text/javascript">
    function validate(form)
    {
         <%@ page import="objects.XMLFormat" %>
         <% XMLFormat XMLFormat = (XMLFormat) session.getAttribute("XMLFormat");%>

        // VALIDATE: Top label length
        var toplen = form.<%= XMLFormat.getTopLabel_Vident()%>.value.length;
        if(toplen != "<%= XMLFormat.getTopLabel_Vlength()%>"){
            topval = "false"
        }else topval ="true"


        //VALIDATE: Wind direction has three values
        var winddirlen = form.winddir.value.length;
        if(winddirlen != "3"){
            winddirval = "false"
        }else winddirval ="true"

        //VALIDATE: Wind magnitude has three values
        var windmaglen = form.windmag.value.length;
        if(windmaglen != "3"){
            windmagval = "false"
        }else windmagval ="true"

        //VALIDATE: Runway designator three values
        var runway_len = form.runway.value.length;
        if(runway_len != "3"){
            runway_len = "false"
        }else runway_len ="true"

        //VALIDATE: Taxiway designator has four values
        var taxiway_len = form.taxiway.value.length;
        if(taxiway_len > "4"){
            taxiway_len = "false"
        }else taxiway_len ="true"


        //VALIDATE: Special designator has six values
        var special_len = form.special.value.length;
        if(special_len > "6"){
            special_len = "false"
        }else special_len ="true"

        // VALIDATE: TOP
        if(form.<%= XMLFormat.getTopLabel_Vident()%>.value == "null")
        {
            alert("Please enter tail")
            form.<%= XMLFormat.getTopLabel_Vident()%>.value.focus();
        }

        // VALIDATE: 
        else if (form.airport.value == "" || aptval == "false" )
        {
            alert("Please enter four letter airport ICAO code")
            form.airport.value.focus();
        }

        //VALIDATE: WIND DIRECTION
        else if(form.winddir.value == "" || isNaN(form.winddir.value) || form.winddir.value < 0 || form.winddir.value >360 ||
            winddirval == "false")
        {
            alert("Please enter wind direction between 000 to 360");
            form.winddir.value.focus();
        }

        //VALIDATE: WIND MAGNITUDE
        else if(form.windmag.value == "" || isNaN(form.windmag.value) || form.windmag.value < -10 || form.windmag.value > 40 ||
            windmagval == "false")
        {
            alert("Please enter wind magnitude between -10 to 40");
            form.windmag.value.focus();
        }

        //VALIDATE: RUNWAY
        else if (form.runway.value == "" || runway_len == "false" )
        {
            alert("Please select runway")
            form.runway.value.focus();
        }

        // VALIDATE TEMPERATURE
        else if(form.temp.value == "" || isNaN(form.temp.value) || form.temp.value > 55 || form.temp.value <-40 )
        {
            alert("Please enter temperature value between -40 to 50");
            form.temp.value.focus();
        }

        //VALIDATE: TAXIWAY
        else if (form.taxiway.value != "" && taxiway_len == "false" )
        {
            alert("Please select taxiway designator with less than four characters")
            form.taxiway.value.focus();
        }

        // VALIDATE QNH
        else if(form.QNH.value == "" || isNaN(form.QNH.value) || form.QNH.value > 1100 || form.QNH.value <900 )
        {
            alert("Please enter QNH value between 900 and 1100");
            form.QNH.value.focus();
        }

        //VALIDATE: SPECIAL
        else if (form.special.value != "" && special_len == "false" )
        {
            alert("Please select SPECIAL designator with less than six characters")
            form.special.value.focus();
        }

        // VALIDATE PLANNED TOW
        else if (form.inputweight.value == "" || isNaN(form.inputweight.value) || form.inputweight.value < 50000 || form.inputweight.value >79015)
        {
            alert("Please enter weight between 50000kg to 79015kg");
            form.inputweight.value.focus();
        }

        else{
            form.submit();
            document.getElementById("iFrame").src = "images/loading.gif";
        }

    }

</script>
