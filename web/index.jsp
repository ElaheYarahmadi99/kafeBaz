<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!--
Created by IntelliJ IDEA.
User: ehsan
Date: 8/2/2020
Time: 9:48 AM
To change this template use File | Settings | File Templates.
-->
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Kafe | Home</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <%--<script src='https://kit.fontawesome.com/a076d05399.js'></script>--%>

    <link rel="stylesheet" href="root/w3.css">
    <style>
        body,h1 {font-family: "Raleway", Arial, sans-serif}
        h1 {letter-spacing: 6px}
        .w3-row-padding img {margin-bottom: 12px}
    </style>
</head>
<body>
<%
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
%>
<!-- !PAGE CONTENT! -->
<div class="w3-content" style="max-width:1500px">

    <!-- Header -->
    <header class="w3-panel w3-center w3-opacity" style="padding:128px 16px">
        <h1 class="w3-xlarge">make your day</h1>
        <h1>KAFE</h1>

        <div class="w3-padding-32">
            <div class="w3-bar">
                <a href="#" class="w3-bar-item w3-button">Home</a>
                <a href="#" class="w3-bar-item w3-button">Contact</a>
                <a href="#" class="w3-bar-item w3-button ">Location</a>
            </div>
        </div>
    </header>

    <!-- Photo Grid -->
    <div class="w3-row-padding" style="margin-bottom:128px ;"  >
      <div class="w3-half">
          <%
              for (String str:list){
                  if ( (list.indexOf(str)%2)==0)
                      out.print("<div id=\"item\" class=\"card p-1\" style=\"width:100%; filter: grayscale(75%);  transition: 200ms;\"  onmousemove=\"color_style(this.id)\" onmouseout=\"return_color_style(this.id)\">" +"\n"+
                              "<img class=\"card-img-top\" src=\" "+ "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Doppio.jpg/1280px-Doppio.jpg" + "\" alt=\"" + "POST_TITLE" +"\">" +"\n"+
                              "<div class=\"card-body\">" + "\n"+
                              "<h4 class=\"card-title\">"+ "POST_TITLE" +"</h4>" +"\n"+
                              "<p class=\"card-text\">"+"DESCRIPTION"+"</p>" +"\n"+
                              "<a href=\"#\" class=\"btn btn-primary\">Add</a>" +"\n"+
                              "</div>" +"\n"+
                              "</div>" + "\n"
                      );
              }
          %>
      </div>
        <div class="w3-half w3-center">

        </div>

    </div>

    <!-- End Page Content -->
    <i class="fa fa-minus w3-hover-opacity"></i> <label><input value="0" class="border-0 text-center" type="text" style="-moz-user-input: none ; width: 3rem"></label> <i class="fa fa-plus w3-hover-opacity"></i>
</div>

<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-light-grey w3-center w3-large">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
</footer>


<script>
    function color_style(id) {
        let item = document.getElementById(id);
        item.style.filter="grayscale(30%)";
    }
    function return_color_style(id) {
        let item = document.getElementById(id);
        item.style.filter="grayscale(75%)";
    }
</script>

</body>
</html>



