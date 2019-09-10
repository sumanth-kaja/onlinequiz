<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>credentials</title>
<style>

.form

{

position:relative;

z-index: 1;

margin: 0 auto 100px;

padding: 45px;

text-align:center;

}
.login_page

{

width: 360px;

padding: 10% 0 0;

margin:auto;

}
input[type=text]
 {

  width: 80%;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
}
input[type=password]
 {
  width: 80%;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
}
input[type=submit] {
  background-color:powderblue;
  color: black;width: 80%;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
}
div.solid
{

margin:auto;
width:500px;
height:400px;
border-color:green;
border-style:solid;
border-width:2px;

}


</style>
</head>
<body>

<form>

<div class="solid">
<div class="form">
<div class="login_page">
Username <br>
<input type="text" name="userid"><br><br>

Password<br>
 <input type="password" name="pswd"><br><br>
<input  type="submit" value="ok"><br><br>

</div>
</div>
</div>




</form>

</body>
</html>