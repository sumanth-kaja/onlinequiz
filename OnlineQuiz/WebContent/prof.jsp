<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Code By WebDevTrick ( https://webdevtrick.com ) -->
<html>
 
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
  
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300">
      <link rel="stylesheet" href="style.css">

  <meta charset="UTF-8">
  <title>Professor page</title>
  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/css/bootstrap.min.css'>
   <link rel="stylesheet" href="style.css">
<style>
div.a{

text-align:center;
color:white;
}	
input
{
textarea:none;
 background-color:#34495e;
}

</style>
</head>
<body>
<div id="menu-nav">
  <div id="navigation-bar">
    <ul>
   
      <li><a href="subjects.jsp"><i class="fa fa-home"></i><span>Home</span></a></li>
      <li><a href="#"><i class="fa fa-user"> </i><span>About</span></a></li>
      <li><a href="#"><i class="fa fa-book"> </i><span>Contact</span></a></li>
      <li><a href="changePasswd.jsp"><i class="fa fa-key"> </i><span>Change password</span></a></li>
	  <li><a href="#"><i class="glyphicon glyphicon-log-out"></i> <span>logout</span></a></li>
    </ul>
      </div>
  
  </div>
  
<div style=" background-color:#34495e;border:1px solid;padding:8px;height:500px;

  border-radius: 6px;

  margin-top: 8px;

  margin-left: 210px;margin-right:210px;">

<h2>INSTRUCTIONS </h2>
<br>
<br>

<ul>

<li></li>

 <li>Questions should not be repeated.</li>


</ul >

<br>

<br>

<ul style="list-style:none;">
<form method="post">
<td><input  style="background-color:orange;
  color: black;width:20%;
  padding: 6px;
  border: 1px solid;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  cursor:pointer;" type="submit"  value="Add Question"  formaction="Addquestion.jsp"></td>
  
  <td><input  style="background-color:orange;
  color: black;width:20%;
  padding: 6px;
  border: 1px solid;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  cursor:pointer;" type="submit" name="delete"  value="Delete questions"  formaction="DeleteServlet"></td>
  
  <td><input  style="background-color:orange;
  color: black;width:20%;
  padding: 6px;
  border: 1px solid;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  cursor:pointer;" type="submit" name="view" value="View Question" formaction="Displayservlet" ></td>
  
  <td><input  style="background-color:orange;
  color: black;width:20%;
  padding: 6px;
  border: 1px solid;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  cursor:pointer;" type="submit"  value="Edit Question" ></td>
  </form>

</ul>

</div>

   
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
  <br>
  <br>
  <br>
  <br>
  <br>
<div>
<div>
<div>
<!-- Footer -->
<footer class="page-footer font-small unique-color-dark">
<div class="divider">
  <div style="background-color: #6351ce;">
    <div class="container">

      <!-- Grid row-->
      <div class="row py-4 d-flex align-items-center">

        <!-- Grid column -->
        <div class="col-md-6 col-lg-5 text-center text-md-left mb-4 mb-md-0">
          <h6 class="mb-0">Get connected with us on social networks!</h6>
        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <div class="col-md-6 col-lg-7 text-center text-md-right">

          <!-- Facebook -->
          <a class="fb-ic">
            <i class="fab fa-facebook-f white-text mr-4"> </i>
          </a>
          <!-- Twitter -->
          <a class="tw-ic">
            <i class="fab fa-twitter white-text mr-4"> </i>
          </a>
          <!-- Google +-->
          <a class="gplus-ic">
            <i class="fab fa-google-plus-g white-text mr-4"> </i>
          </a>
          <!--Linkedin -->
          <a class="li-ic">
            <i class="fab fa-linkedin-in white-text mr-4"> </i>
          </a>
          <!--Instagram-->
          <a class="ins-ic">
            <i class="fab fa-instagram white-text"> </i>
          </a>

        </div>
        <!-- Grid column -->

      </div>
      <!-- Grid row-->

    </div>
  </div>
</div>
  <!-- Footer Links -->
  <div class="container text-center text-md-left mt-5">

    <!-- Grid row -->
    <div class="row mt-3">

      <!-- Grid column -->
      <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">

        <!-- Content -->
        <h6 class="text-uppercase font-weight-bold">About Online Quiz Application</h6>
        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
        <p>Quiz is also a brief assessment used in education and similar fields to measure growth in knowledge,
          abilities
          and/or skills.</p>

      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">

        <!-- Links -->
        <h6 class="text-uppercase font-weight-bold">Products</h6>
        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
        <p>
          <a href="#!">MDBootstrap</a>
        </p>
        <p>
          <a href="#!">MDWordPress</a>
        </p>
       

      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">

        <!-- Links -->
        <h6 class="text-uppercase font-weight-bold">Useful links</h6>
        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
        <p>
          <a href="#!">Your Account</a>
        </p>
        <p>
          <a href="#!">Help</a>
        </p>

      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">

        <!-- Links -->
        <h6 class="text-uppercase font-weight-bold">Contact</h6>
        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
        <p>
          <i class="fas fa-home mr-3"></i> Banglore,560100, India</p>
        <p>
          <i class="fas fa-envelope mr-3"></i> quizapplication@gmail.com</p>
        <p>
          <i class="fas fa-phone mr-3"></i> +919582574554</p>
      

      </div>
      <!-- Grid column -->

    </div>
    <!-- Grid row -->

  </div>
  <!-- Footer Links -->

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2019 Copyright:
    <a href="https://mdbootstrap.com/education/bootstrap/"> wipro.com</a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->
 </div>
</div>
</div>
</body>
 </html>