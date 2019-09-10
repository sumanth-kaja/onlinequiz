<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script> 
function validateForm()     

{ 
    var firstname = document.reg.firstname;
    var letters=/^[a-z]+$/;
    if(firstname.value.length>0)
    	{
  		  if (!firstname.value.match(letters))                                  
   			 { 
  			//document.getElementById("spnFirstName").innerHTML = "Please enter your firstname as only letters";
       			 alert("Please enter your firstname as only letters"); 
   			 } 
    	}
    else
    	{
    	alert("Please enter firstname");
    	}
    var securitycode=document.reg.seckey;
    if(!securitycode.value.length>0)
    	{
    
        alert("Please enter security code"); 
    } 
    
    var lastname = document.reg.lastname;
    if(lastname.value.length>0)
    	{
   		 if (!lastname.value.match(letters))                                  
     		 { 
       			 alert("Please enter your lastname as only letters"); 
    		 } 
    	}
    else
    	{
    	alert("please enter lastname");
    	}
    
    var regid =  document.reg.regid;
    var regnum=/^[0-9]+$/;
    if(regid.value.length==3 || regid.value.length==4)
    	{
    if (!regid.value.match(regnum))                               
    { 
        alert("Please enter your registration Id as only numbers"); 
    } 
    	}
    else
    	{
    	alert("Enter registration Id");
    	}
    
    if(!document.getElementById("accesstype1").checked)
    {
    if(!document.getElementById("accesstype").checked)
    {
   alert("select any of the access type");
    }
    }
          
}

</script> 


<title>Register</title>
<style>


body {
  margin: 10;
  font-family: Arial, Helvetica, sans-serif;
}



/* Style the content */
.content {
  
  padding: 10px;
  height: 520px; /* Should be removed. Only for demonstration */
}
body{
overflow:hidden;
background-image:url("http://redpithemes.com/Documentation/assets/img/page_bg/page_bg_blur02.jpg");
background-repeat:norepeat;
width:auto;
height:200%;
height:300vh;
}

input
{
width:150%;
padding:8px 8px;
margin:8px 0;
border:1px solid;
border-radius:15px;
box-sizing:border-box;
cursor:pointer;
}
fieldset{
height:40%;
width:40%;
}


</style>
</head>
<body>

<div class="content">
<div align="center">
<fieldset>
<h1>Registration form</h1><br>

<form name="reg" action="RegisterServlet" method="post" >

<table class="center">

	<tr>
	<td><label>First name</label><br></td>
	<td><input type="text" name="firstname" required ><br></td>
	</tr>

	<tr>
	<td><label>Last name</label><br></td>
	<td><input type="text" name="lastname"  required><br></td>
	</tr>
	
	<tr>
	<td><label>Register id</label><br></td>
	<td><input type="text" name="regid" placeholder="EmployeeID or StudentID" required ><br></td>
	</tr>
	
	<tr><td><label>Access type</label></td></tr>
	
	<tr>
    <td><input type="radio" name="Accesstype" id="accesstype1" value="professor" required></td>
    <td>Professor</td>
    <td><input type="radio" name="Accesstype" id="accesstype" value="student" ></td>
    <td>Student</td>
	</tr>
	
	<tr>
	<td><label>key</label><br></td>
	<td><input type="text" name="seckey"  title="If you are a professor enter security code else enter null" id="key" required><br></td>
	</tr>

	
	
	<tr>
	<td><label>Email</label><br></td>
	<td><input type="email" name="mail"required><br></td>
	</tr>
	
	<tr>
	<td><input type="submit" value="submit" name="get_pwd" onclick="validateForm()"></td>
	
	</tr>
	
</table>
</form>
</fieldset>
</div>
</div>
</div>


</body>
</html>