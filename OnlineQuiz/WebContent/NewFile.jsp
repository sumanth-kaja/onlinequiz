<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Code By WebDevTrick ( https://webdevtrick.com ) -->
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
<style>
{
  box-sizing: border-box;
  font-family: Arial, Helvetica, sans-serif;
}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

input
{
width:50%;
padding:6px 10px;
margin:10px 0;
display:inline-block;
border:1px solid;
border-radius:60px;
box-sizing:border-box;
cursor:pointer;
}
.content {
  background-color: gray;
  padding: 50px;
  height: 480px;
}

</style>

	
</head>
<body>
<fieldset>
  <div class="content">
<div align="center">
  
<div class="center" >
       <h2>Registration form</h2>
 <form method="post" > 
</div>
 
  <table class="center">

	<tr>
	<td><label>First name</label><br></td>
	<td><input type="text" name="firstname" required ><br><br></td>
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
      </fieldset>
    
</div>
  </div>
</form> 
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
  <br>
  <br>
  <br>
  <br>
  <br>
<div>
<div>
<div>

 </div>
</div>
</div>
</body>
 </html>