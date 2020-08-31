<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>
<%
 try{
        session = request.getSession(false);
        String id1 = session.getAttribute("id").toString();
    if(id1.equals("")){
        response.sendRedirect("admin_login.jsp");
    }
    else{
     String ad_id = session.getAttribute("id").toString();
    String sql2 = "select * from student_login inner join students on student_login.id = students.sid where students.status='1'";
    try{
        pst = connection.prepareStatement(sql2);
       rs = pst.executeQuery();
      
    }
    catch(Exception e){
        System.out.print(e);
    }
    
 %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home :: Admin Pending Request</title>
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
              <a href="admin_dash.jsp"> <button type="button" class="btn btn-info m-2 fa fa-home"> Home</button> </a>
            
          </li>
          
            <li class="nav-item">
              <a href="admin_pending.jsp">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o active"> Approve Pending</button> </a>
          </li>
             <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Task</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="add_hod.jsp">Add HOD</a>
             
        </div>
          </li>
      </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out">Logout</button></a>
      </div>
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
     <div class="jumbotron mt-5">
          <p class="fa fa-mortar-board"><kbd><span class="text-primary">Admin </span> Department</kbd></p>
        <div class="container">
            <div class="row">
                <h1 class="display-3 ">Admin</h1>
          <div class="fa fa-check-circle" style="color:red; font-size: 20px" data-toggle="tooltip" data-placement="left" title="You are verified Admin of DPCOE"></div>
            </div>
            <p> Welcome to DPCOE Registration Admin DashBoard.</p>
          </div>
          
         
        </div>
      
       <div class="container">
  <h2>Pending Request:</h2>
           
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Name</th>
        <th>Mobile</th>
        <th>Email</th>
        <th>Approve</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody class="data">
        <%
             String email = "";
            while(rs.next()){
         String id= rs.getString("id");
            email = rs.getString("email");
            %>
     <tr>
         <td><a href="summary1.jsp?id=<%=id%>"><%=rs.getString("fname")%> <%=rs.getString("mname")%> <%=rs.getString("lname")%></a></td>
        <td><%=rs.getString("mobile")%></td>
        <td><%=rs.getString("email")%></td>
         <td><button id="<%=rs.getString("id")%>" type="button" class="btn btn-primary fa fa-check accept" style="font-size: 25px;"></button></td>
        <td><button id="<%=rs.getString("id")%>del" type="button" class="btn btn-danger fa fa-trash-o delete" style="font-size: 25px;"></button></td>
   
        </tr>
      <% } %>
    </tbody>
  </table>
</div>

    

    </main>

        
      <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
        
     <script>
         
         
         
         
         
            $(".accept").click(function() {
    var id1 = $(this).attr('id');
            
       $.ajax({
            type : "POST",
            url : "/StudentRegistration/app_pending_admin",
           
           data: {ida: id1},
            success : function(data) {
                alert("You Accepted Student Register Pending Successfully !! ");
                location.reload();
                $.ajax({
                type : "POST",
                url : "/StudentRegistration/EmailSendingServlet",
           
            data: {email:"<%=email%>" , subject: "Your Registration Form is Approved !", content: "Hey !! NOW you can download registration form PDF.. Login to your profile to download PDF"},
            success : function(data) {
               // console.log(data);
               // location.reload();
            }
        });
            }
        });
     
}); 

    
              $(".delete").click(function() {
    var idd = $(this).attr('id');
        var id2 = parseInt(idd);
        console.log(id2);
        if(confirm("Are you sure want to delete this data permanently ?")){
       $.ajax({
            type : "POST",
            url : "/StudentRegistration/del_pending_admin",
           
           data: {id2: id2},
            success : function(data) {
                alert("You Deleted Student Register Request Successfully !! ");
                location.reload();
                     $.ajax({
                type : "POST",
                url : "/StudentRegistration/EmailSendingServlet",
           
            data: {email:"<%=email%>" , subject: "Your Registration Form is Deleted by Admin. !", content: "Hey !! Your Registration Form is Deleted by Admin. Contact Admin Department and fill registration form again "},
            success : function(data) {
               // console.log(data);
               // location.reload();
            }
        });
            }
        });
        }
     
}); 


 </script>
    
    </body>
</html>
<%
}
}
catch(Exception e){
    response.sendRedirect("admin_login.jsp");
}
%>