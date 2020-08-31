

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "connect.jsp" %>
<%@include file="title.jsp"%>
<!DOCTYPE html>
<html>
<head><title>TG : Login</title>
  <meta charset="utf-8">
  <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    
    <div class="text-center">
       <div class="container mt-5">
           <div class="panel-body">
               <h2 class="shadow-none p-4 mb-4 bg-light">TG Login</h2>
               
<!--               form started-->
               
  <form class="form-horizontal" action="" method="post">
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
</div>
</div>
</div>
     <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
</body>

<%
    HttpSession session1= request.getSession();
    String username = (String) request.getParameter("username");
    String password = (String) request.getParameter("password");

    String sql = "select * from master_tg where username='"+username+"' and password='"+password+"'";
    try{
       pst = connection.prepareStatement(sql);
        rs = pst.executeQuery();
       
       if(rs.next()){
           session.setAttribute("tg_id", rs.getString("id"));
           
          response.sendRedirect("tg_home.jsp");
           out.print("login");
       }
       else{
           
          //out.println("<p class='text-danger'>Username or password is invalid</p>");
       }
    }
    catch(Exception e){
       out.print(e);
    }
%>
</html>
