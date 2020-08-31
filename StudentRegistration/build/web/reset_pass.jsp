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
        <title>Reset Password</title>
        
    </head>
    <% 
        session = request.getSession(false);
    String email= request.getParameter("email");
    String hash = request.getParameter("hash");
    session.setAttribute("email", email);
    session.setAttribute("hash", hash);
    String hash_db= "";
    String name="";
    String name_check = "select * from student_login where email='"+email+"'";
    try{
        pst = connection.prepareStatement(name_check);
        rs = pst.executeQuery();
        if(rs.next()){
            name = rs.getString("fname")+" "+rs.getString("lname");
            hash_db = rs.getString("hash");
            
        }
        session.setAttribute("hash_db", hash_db);
    }catch(Exception e){
        out.print(e);
    }
    
        %>
    
    <body>
        <%@include file="title.jsp" %>
        <div class="text-center">
       <div class="container mt-5">
           <div class="panel-body">
               <h2 class="shadow-none p-4 mb-4 bg-light">Reset Password</h2>
       <i class="text-success"><%=name%>  Enter new Password here." </i>
        
<!--               form started-->
               
  <form class="form-horizontal" action="/StudentRegistration/Reset" method="post">
    <div class="form-group" align="center">
      <label class="control-label col-sm-2" for="email"></label>
      <div class="col-sm-5">
        <input type="password" class="form-control" id="password" name="password">
      </div>
    </div>
   
    <div class="form-group" align="center">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" id="send" class="btn btn-primary mr-5" name="update">Update Password</button>
        
      </div>
      
        </div>
      <br>
  </form>
   </div>
</div>
        </div>  
       
       <%
//           int count =5;
//          String check1 ="select count(*) from student_login where hash=0 and email="+email;
//          
//          try{
//              PreparedStatement pst1 = connection.prepareStatement(check1);
//              ResultSet rs1 = pst1.executeQuery();
//             while(rs1.next()){
//                 count = rs1.getInt("count(*)");
//             }
//          }catch(Exception e){
//              out.print(e);
//          }
//         
//           out.print(count);
//           
//           if(count==0){
             
           
        
           
//           }
           
           %>
       
       
         <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
</body>
</html>