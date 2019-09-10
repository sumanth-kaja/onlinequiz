
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
<title>login</title>
<script type="text/javascript">

function noBack(){
	
	window.history.forward(1)};
	setTimeout("noBack()",0);
	window.onunload=function(){null};
	

</script>

<style>
body{
overflow:hidden;
background-image:url("http://redpithemes.com/Documentation/assets/img/page_bg/page_bg_blur02.jpg");
background-repeat:norepeat;
width:auto;
height:200%;
height:300vh;

}

.login_page
{
top:0px;
width: 370px;
padding: 10%;
margin:auto;
}

div.a{
padding:1px;
text-align:center;
color:white;
}
input[type=text]
 {
  width: 80%;
  padding: 8px;
  border: 1px solid;
  color:black;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
}
input[type=password]
 {
  width: 80%;
  padding: 8px;
  border: 1px solid ;
  color:black;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
}
input[type=submit] {
  background-color:orange;
  color: black;width: 50%;
  padding: 8px;
  border: 1px solid;
  border-radius: 20px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  cursor:pointer;
}
div.transbox {
 margin-top:10px;
  height:383px;
  width:433px;
  background-color:#ff6961;
  border: 1px solid black;
  border-radius:15px;
  opacity: 0.8;
  filter: alpha(opacity=80);
  padding:10px;
 
}

div.b{
text-align:left;
padding:15px;
color:white;
}
div.c{
text-align:right;
padding:10px;
color:white;
}





section{
margin-top:1px;
height:550px;
}
input:focus{
border-color:dodgerBlue;
box-shadow:0 0 8px 0 dodgerBlue;
}

.inputWithIcon{
font-family:fontawesome;
position:relative;
}
.inputWithIcon i{
position:absolute;
left:0;
top:8px;
padding:9px 8px;
color:#aaa;
transition:.3s;
}
.inputWithIcon input:focus +i{
color:dodgerBlue;
}


  
</style>
</head>



<body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">

<form action="LoginServlet" method="post">


<section>

<div class="login_page">
<div class="form">
<div class="a">
<div class="transbox">

<img   src="oneicon.png" style="margin-top:8px;" height="50" width="50">


<h1 style= text-align:center;color:white;>Login </h1>
<div class="inputWithIcon">
  <input placeholder="Username" type="text" name="userid" size="20">
  <i style="margin-top:2px;"class="fa fa-user fa-lg fa-fw" aria-hidden="true"></i>
  </div>
  <br>
  <div class="inputWithIcon">
  <input  placeholder="Password" type="password" name="pwd" size="20">
  <i class="fa fa-eye fa-lg fa-fw" aria-hidden="true"></i>
  </div><br>

<input type="checkbox" name="rempwd">remember password<br>
<input type="submit" value="login"><br>

New User  <sub><a href=" Register.jsp"><img src="regicon.png" height="30"width="30"></sub> </a>

</div>
</div>
</div>
</div>

</section>

</form>

</body>

</html>