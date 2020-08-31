<%-- 
    Document   : paperChecking
    Created on : 30 May, 2019, 12:56:30 AM
    Author     : Lakhan Mnae
--%>

<%@page import="java.io.FileInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    try{
        session = request.getSession(false);
  String bid = session.getAttribute("bid").toString();
  String tg_id = session.getAttribute("tg_id").toString();
  String fileName = session.getAttribute("filename").toString();
  String filePath = "E:/villain/"+fileName;
  
  
  //FileInputStream fileInputStream = new FileInputStream(filePath);
 
  
if(tg_id.equals("")) {
    System.out.print("session id is not found");
    //response.sendRedirect("tg_login.jsp");
    } else {

   

%>



<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Online Paper Checking</title>

<!-- <link href = "/boost/css/bootstrap.min.css" rel="stylesheet">
      <script src = "/boost/js/jquery-3.2.1.min.js"></script>
      <script src = "/boost/js/bootstrap.min.js"></script> -->

<style type="text/css">
	
	#parent_div_1, #parent_div_2, #parent_div_3{
    width:100%;
    height:1120px;
    border:1px solid red;
   /* margin-right:10px;*/
    /*float:left;*/
}
.child_div_1{
	width:60%;
    float:left;
    margin-right:5px;
}

.child_div_2{
	width:38%;
    float:right;
    margin-left:5px;
}

</style>


</head>
<body>

<div id="parent_div_1">

<div  class="child_div_1">
	
    <embed src="C:\Users\Lakhan Mnae\Documents\NetBeansProjects\StudentRegistration\paper.pdf" type="application/pdf" width="100%" height="950px" />


</div>

<div class="child_div_2">



<FORM METHOD="POST" ACTION="GenerateMarksheet">

	<H3>Name: <input type="text" name="student name" size="50" placeholder="student name"> </H3>
	<h4>Roll No: <input type="text" name="roll" size="10" placeholder="student roll no"></h4>
        <h4>Subject: <input type="text" name="subject" size="30" placeholder="paper subject"></h4>
<TABLE BORDER="1">
	<p>Question 1:</p>
	<th>a</th>
	<th>b</th>
	<th>c</th>
	<th>Total</th>
  <TR>
    
    <TD><INPUT TYPE="TEXT" NAME="a1" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="b1" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="c1" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="t1" SIZE="10"></TD>
  </TR>
</TABLE>
        <p style="color:red;"><strong> OR </strong></p>

<TABLE BORDER="1">
	<p>Question 2:</p>
	<th>a</th>
	<th>b</th>
	<th>c</th>
	<th>Total</th>
  <TR>
    
    <TD><INPUT TYPE="TEXT" NAME="a2" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="b2" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="c2" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="t2" SIZE="10"></TD>
  </TR>
</TABLE>


<TABLE BORDER="1">
	<p>Question 3:</p>
	<th>a</th>
	<th>b</th>
	<th>c</th>
	<th>Total</th>
  <TR>
    
    <TD><INPUT TYPE="TEXT" NAME="a3" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="b3" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="c3" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="t3" SIZE="10"></TD>
  </TR>
</TABLE>

        <p style="color:red;"><strong> OR </strong></p>

<TABLE BORDER="1">
	<p>Question 4:</p>
	<th>a</th>
	<th>b</th>
	<th>c</th>
	<th>Total</th>
  <TR>
    
    <TD><INPUT TYPE="TEXT" NAME="a4" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="b4" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="c4" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="t4" SIZE="10"></TD>
  </TR>
</TABLE>

<TABLE BORDER="1">
	<p>Question 5:</p>
	<th>a</th>
	<th>b</th>
	<th>c</th>
	<th>Total</th>
  <TR>
    
    <TD><INPUT TYPE="TEXT" NAME="a5" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="b5" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="c5" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="t5" SIZE="10"></TD>
  </TR>
</TABLE>

        <p style="color:red;"><strong> OR </strong></p>

<TABLE BORDER="1">
	<p>Question 6:</p>
	<th>a</th>
	<th>b</th>
	<th>c</th>
	<th>Total</th>
  <TR>
    
    <TD><INPUT TYPE="TEXT" NAME="a6" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="b6" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="c6" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="t6" SIZE="10"></TD>
  </TR>
</TABLE>

<TABLE BORDER="1">
	<p>Question 7:</p>
	<th>a</th>
	<th>b</th>
	<th>c</th>
	<th>Total</th>
  <TR>
    
    <TD><INPUT TYPE="TEXT" NAME="a7" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="b7" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="c7" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="t7" SIZE="10"></TD>
  </TR>
</TABLE>

        <p style="color:red;"><strong> OR </strong></p>
        
<TABLE BORDER="1">
	<p>Question 8:</p>
	<th>a</th>
	<th>b</th>
	<th>c</th>
	<th>Total</th>
  <TR>
    
    <TD><INPUT TYPE="TEXT" NAME="a8" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="b8" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="c8" SIZE="10"></TD>
  	<TD><INPUT TYPE="TEXT" NAME="t8" SIZE="10"></TD>
  </TR>
</TABLE>

<br>
<P><INPUT TYPE="SUBMIT" VALUE="Submit" NAME="submit"></P>
</FORM>


</div>
</div>
</body>
</html>



<%
}
}
catch(Exception e){

    System.out.println("exception"+e);
    //response.sendRedirect("tg_login.jsp");
}
%>