<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

</style>
<script>
</script>
</head>
<body>
<div style=text-align:center;>
<h1>C Programming Quiz Questions</h1></div>
<div >
<div >
<form action="DeleteServlet" method="post" >

<%
ResultSet rs=(ResultSet)request.getAttribute("obj");%>
<% while(rs.next()){%>
<%! int temp=1; %>


<div>
        <h3><input type="radio" name="question" required value="<%=rs.getString(1)%>"/> Question <%=temp %> : <%=rs.getString(1)%> </h3>
    </div>
    
<div>
       a) <%=rs.getString(2)%><br>
       b) <%=rs.getString(3)%><br>
       c) <%=rs.getString(4)%><br>
       d) <%=rs.getString(5)%><br><br>
     <b>Correct Answer</b> : <%=rs.getString(6)%>
       <%temp++; %>
       
    </div>
    
<%}%>
<br><center>
<input type="submit" value="DeleteQuestion" name="delete"></center>
</form>
</div>
</div>


</body>

</html>