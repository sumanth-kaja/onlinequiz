
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
<script type="text/javascript">

function noBack(){
	
	window.history.forward(1)};
	setTimeout("noBack()",0);
	window.onunload=function(){null};
	

</script>

<style>
body{
overflow:hidden;
background-image:url("background.jpg");
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
padding:10px;
text-align:center;
color:white;
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
div.transbox {
  top:1px;
  height:200px;
  width:433px;
  background-color:black;
  border: 1px solid black;
  border-radius:15px;
  opacity: 0.8;
  filter: alpha(opacity=80);
 
}
header
{
position:top;
top:0px;
left:0px;

color:white;
background:black;
padding:10px;
}


footer
{
bottom:0px;
 position:absolute;
 width:97%;
color:black;
background:black;
padding:10px;
}
section{
margin-top:1px;
height:550px;
}
input:focus{
border-color:dodgerBlue;
box-shadow:0 0 8px 0 dodgerBlue;
}
button
{
  background-color:orange;
  color: black;width:20%;
  padding: 8px;
  border: 1px solid;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  cursor:pointer;
}
</style>
</head>
<body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">
<form action="LogoutServlet" method="post">
<header>
    <div class=" b">
    <b>Welcome! please Login.</b>
    </div>
</header>

<section>
<div class="login_page">
<div class="form">
<div class="transbox">
<div class="a">
<p>Exit page?</p>


<button class="btn-lg btn-success" >yes</button><button class="btn-lg btn-success" formaction="welcometopic.html">no</button>
</div>


</div>
</div>
</div>
</div>
</section>
<footer>
<div class="c">
<b >copyrights@wipro</b>
</div>
</footer>
</form>
</body>
</html>
