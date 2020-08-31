<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("pragma", "no-cache");
response.setHeader("Expires", "0");
     session=request.getSession(false);
if(session.getAttribute("st_id") == null){
    response.sendRedirect("index.jsp");
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>

<%

    
 String st_id = session.getAttribute("st_id").toString();
 String username = session.getAttribute("username").toString();
 String id = "";
      System.out.println(st_id);
      String sql = "select * from students where sid='"+st_id+"'";
      try{
      pst = connection.prepareStatement(sql);
      rs = pst.executeQuery();
      
      while(rs.next()){
         id = rs.getString("status");
      }
      }catch(Exception e){
          System.out.println(e);
      }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Download</title>
    </head>
    <body>
             <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2">
      <a class="navbar-brand ml-3" href="#"><img src="pic/dpcoe.jpg" height="60" width="60" class="img-rounded" alt="dpcoe"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
              <a href="student_home.jsp"> <button type="button" class="btn btn-info m-2 fa fa-home"> Home</button></a>
            
          </li>
          <li class="nav-item">
              <a href="registration.jsp">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o"> Registration</button> </a>
          </li>
          <li class="nav-item">
              <a href="requestForm.jsp"><button type="button" class="btn btn-info m-2 fa fa-download active"> Download</button></a>
          </li>          
        </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout </button></a>
      </div>
    </nav><br/>
    <%
        if(id.equals("")){
    %>
    <div class="" style="margin-top: 7%;">
    <h1 class="text-success">Please fill up form...</h1>
        <p class="text-info">You don't have fill up any form....</p>
    </div>
    <%  
       } else if(id.equals("0")){
    %>
<!--        <main role="main">-->
<div class="" style="margin-top: 7%;">
    <h1 class="text-success">Your form has been submitted...</h1>
        <p class="text-info">Please wait for TG approval</p>
    </div>
<%  }
    else if(id.equals("1")){
    %>
<!--        <main role="main">-->
<div class="" style="margin-top: 7%;">
    <h1 class="text-success">Your TG approval done......</h1>
        <p class="text-info">Please wait for Registrar approval</p>
    </div>
    <%
        }
else if(id.equals("2")){
    %>  
    <div style="margin-top: 7%;">
    <%String path = request.getContextPath();%>
        <a href="<%=path%>/getForm.jsp?id=<%=st_id%>&user_name=<%=username%>">Click here</a> To download registration form...
</div>
<%
    }
%>
<!--        </main>-->
    </body>
</html>
