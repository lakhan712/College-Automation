<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "connect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        
    </head>
    <body>
        <%@include file="title.jsp" %>
        <div class="text-center">
       <div class="container mt-5">
           <div class="panel-body">
               <h2 class="shadow-none p-4 mb-4 bg-light">Forgot Password</h2>
       <i class="text-danger">You will receive password by E-mail. Please check your spam folder too! </i>
        
<!--               form started-->
               
  <form class="form-horizontal" action="/StudentRegistration/send_mail_pass" method="post">
    <div class="form-group" align="center">
      <label class="control-label col-sm-2" for="email"></label>
      <div class="col-sm-5">
        <input type="email" class="form-control" id="email" placeholder="Enter Your Valid E-Maild Id" name="mail">
      </div>
    </div>
   
    <div class="form-group" align="center">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" id="send" class="btn btn-primary mr-5" name="login">Send Request</button>
        
      </div>
      
        </div>
      <br>
  </form>
   </div>
</div>
        </div>  
         <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
</body>
</html>