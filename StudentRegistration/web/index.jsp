<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "connect.jsp" %>
<%@include file="title.jsp" %>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <%
            
            try{
        session = request.getSession(false);
     String signup = session.getAttribute("signup").toString();
    if(session != null && !session.isNew()) {
    } else {
    response.sendRedirect("/login.jsp");
    }
    if(signup == "1"){
       // response.sendRedirect("index.jsp");
    
    %>
                <script>
                    alert("Signup is successful, for TG approval go to your respective TG");
                    </script>
                <%
                    session.removeAttribute("signup");
            }
    }catch(Exception e){
    
    }
            %>
    </head>
    <body>
        
        <div class="text-center">
       <div class="container mt-5">
           <div class="panel-body">
               <h2 class="shadow-none p-4 mb-4 bg-light">Student Login</h2>
               <i class="text-primary">If you are new here, please Sign-Up first</i><br>
               <i class="text-danger">If you have already Signed-Up, please wait for approval from your respective TG.</i><br>
               <i class="text-danger">You will be notified by E-mail. If no notification has popped up, please check your spam folder too! </i>
        
<!--               form started-->
               
  <form class="form-horizontal" action="Login" method="post">
    <div class="form-group" align="center">
      <label class="control-label col-sm-2" for="email"></label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="email" placeholder="Enter UserName" name="username">
      </div>
    </div>
    <div class="form-group" align="center">
      <label class="control-label col-sm-2" for="pwd"></label>
      <div class="col-sm-5">          
        <input type="password" class="form-control"  id="pwd" placeholder="Enter Password" name="password">
      </div>
    </div>
    <div class="form-group" align="center">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-primary mr-5 fa fa-sign-in" name="login"> Login</button>
        
      </div>
      
        </div>
      <br>
  </form>
<%
    try{
   if(session.getAttribute("fail").toString().equals("2")){
       %>
       <p class="text-danger text-center" id="error">Username or Password is Invalid</p>  
<%
      session.removeAttribute("fail");
   }
  }
  catch(Exception e){
     
  }
%>
<div class="form-group" align="center">
<a href="forgot_pass.jsp" class="fa fa-lock mr-5"><u> Forgot Password</u></a>
<a href="SignUp.jsp"> <button type="submit" class="btn btn-danger fa-registered" name="signup"> SignUp</button> </a>
</div>
   </div>
</div>
        </div>   
         <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
</body>
<script>
    $("#email").click(function(){
        $("#error").empty();
        $("#error").hide();
    });
</script>
</html>