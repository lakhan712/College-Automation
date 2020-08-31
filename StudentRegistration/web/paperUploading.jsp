<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>

<%
    try{
        session = request.getSession(false);
  String bid = session.getAttribute("bid").toString();

 String tg_id = session.getAttribute("tg_id").toString();
if(tg_id.equals("")) {
    response.sendRedirect("tg_login.jsp");
    } else {
   

%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TG :: Paper Uploading</title>
        
    
        
    </head>
    <body>
        
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2">
      <a class="navbar-brand ml-3" href="#"><img src="pic/dpcoe.jpg" height="60" width="60" class="img-rounded" alt="dpcoe"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item ">
              <a href="tg_home.jsp">  <button type="button" class="btn btn-info m-2 fa fa-home"> Home</button> </a>
            
          </li>
          <li class="nav-item">
              <a href="ap_pending.jsp"> <button type="button" class="btn btn-info m-2 fa fa-id-card-o active"> Approve Pending </button></a>
          </li>
          <li class="nav-item">
              <a href="s_pending.jsp"><button type="button" class="btn btn-info m-2 fa fa-user-plus"> SignUp Approve Pending </button></a>
          </li>
            <li class="nav-item">
              <a href="student_transfer.jsp">  <button type="button" class="btn btn-info m-2 fa fa-info-circle"> Transfer Students</button> </a>
          </li>
          <li class="nav-item">
              <a href="paperUploading.jsp">  <button type="button" class="btn btn-info m-2 ">Paper Checking</button> </a>
          </li>
        </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button></a>
      </div>
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron mt-5">
          <p class="fa fa-mortar-board"> <kbd><span class="text-primary">TG </span> <%=tg_id%> and branch id <%=bid%> Department</kbd></p>
        <div class="container">
            
            <p> Upload paper pdf for checking .</p>
          </div> 
      </div>
        
<!--        Changes-->
        
        <div class="container">
            <a>PDF Upload:</a>
            Select PDF: <br />
<form action="file_upload.jsp" method="post"
                        enctype="multipart/form-data">
<input type="file" name="file"/>
<br /><br />
<input type="submit" value="Upload File" />
</form>
      </div>


    </body>
</html>
<%
}
}
catch(Exception e){
    response.sendRedirect("tg_login.jsp");
}
%>
