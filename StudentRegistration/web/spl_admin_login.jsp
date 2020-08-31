<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "connect.jsp" %>
<%@ include file = "boost.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Special Admin Login</title>
    </head>
    <body class="text-center">
       <div class="container mt-5">
           <div class="panel-body">
               <h2 class="shadow-none p-4 mb-4 bg-light">Special Admin Login</h2>
               
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
         <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
</body>
<%
    String username = (String) request.getParameter("username");
    String password = (String) request.getParameter("password");

    String sql = "select * from spl_admin where username='"+username+"' and password='"+password+"'";
    try{
       pst = connection.prepareStatement(sql);
       rs = pst.executeQuery();
       
       if(rs.next()){
           session.setAttribute("ad_id", rs.getString("id"));
            response.sendRedirect("spl_admin_dash.jsp");
           
       }
       else if(rs.next() == false){
           
          //out.println("<p class='text-danger'>Username or password is invalid</p>");
       }
    }
    catch(Exception e){
       
    }
%>
</html>
