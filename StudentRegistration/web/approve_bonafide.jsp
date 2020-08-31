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
          session.setAttribute("ad_id", ad_id);
          String name="";
           
    String B_approve = "select * from bonafide_data, student_login where student_login.id=bonafide_data.sid and bonafide_data.status='1'";
    try{
        pst = connection.prepareStatement(B_approve);
       rs = pst.executeQuery();
      
    }
    catch(Exception e){
        System.out.print(e);
    }

 %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home :: Admin Dashboard</title>
        
        <style>
* {
  box-sizing: border-box;
}

#myInput {
  background-image: url('/css/searchicon.png');
  background-position: 10px 10px;
  background-repeat: no-repeat;
  width: 100%;
  font-size: 16px;
  padding: 12px 20px 12px 40px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
}

#myTable {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid #ddd;
  font-size: 18px;
}

#myTable th, #myTable td {
  text-align: left;
  padding: 12px;
}

#myTable tr {
  border-bottom: 1px solid #ddd;
}

#myTable tr.header, #myTable tr:hover {
  background-color: #f1f1f1;
}
</style>
<script src="js/tableExport.js"></script>
<script src="js/jquery.base64.js"></script>
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
              <a href="admin_dash.jsp"><button type="button" class="btn btn-info m-2 fa fa-home"> Home</button> </a>
            
          </li>
          
            <li class="nav-item">
              <a href="admin_pending.jsp">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o"> Approve Pending</button> </a>
          </li>
             <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Task</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="add_hod.jsp">Add HOD</a>
        
              <a class="dropdown-item" href="approve_bonafide.jsp">Approve Bonafide</a>
        </div>
          </li>
      </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button></a>
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
            <p> Welcome to DPCOE Registration Admin Bonafide Approval DashBoard.</p>
          </div>
          
         
        </div>
      

      <div class="container">
          
 
              <div class="container">
  <h2>Pending Request:</h2>
           
  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Student Id</th>
        <th>Approve</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody class="data">
        <%
             int i=1;
            while(rs.next()){
         String id= rs.getString("sid");
           name = rs.getString("fname")+" "+ rs.getString("lname");
            %>
     <tr>
         <td> <%=i%> </td>
         <td><a href="bonafide_data.jsp?id=<%=id%>"><%=name%></a></td>
        
         <td><a href="getBonafide.jsp?id=<%=rs.getString("sid")%>&name=<%=name%>" class="btn btn-primary fa fa-check accept" style="font-size: 25px;"></a></td>
        <td><button id="<%=rs.getString("sid")%>del" type="button" class="btn btn-danger fa fa-trash-o delete" style="font-size: 25px;"></button></td>
   
        </tr>
      <% i++; } %>
    </tbody>
  </table>
</div>
 

    </main>
  
      <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
        
     <script>
         
         
         
         
         
//            $(".accept").click(function() {
//    var id1 = $(this).attr('id');
//            
//       $.ajax({
//            type : "POST",
//            url : "/StudentRegistration/app_bonafide",
//           
//           data: {ida: id1},
//            success : function(data) {
//                alert("You Approved Student Bonafide Pending Successfully !! ");
//                location.reload();
////                $.ajax({
////                type : "POST",
////                url : "/StudentRegistration/EmailSendingServlet",
////           
////            data: {email:"" , subject: "Your Registration Form is Approved !", content: "Hey !! NOW you can download registration form PDF.. Login to your profile to download PDF"},
////            success : function(data) {
////               // console.log(data);
////               // location.reload();
////            }
////        });
//            }
//        });
//     
//}); 

    
              $(".delete").click(function() {
    var idd = $(this).attr('id');
        var id2 = parseInt(idd);
        console.log(id2);
        if(confirm("Are you sure want to delete this data permanently ?")){
       $.ajax({
            type : "POST",
            url : "/StudentRegistration/del_bonafide",
           
           data: {id2: id2},
            success : function(data) {
                alert("You Deleted Student Bonafide Request Successfully !! ");
                location.reload();
//                     $.ajax({
//                type : "POST",
//                url : "/StudentRegistration/EmailSendingServlet",
//           
//            data: {email:"" , subject: "Your Registration Form is Deleted by Admin. !", content: "Hey !! Your Registration Form is Deleted by Admin. Contact Admin Department and fill registration form again "},
//            success : function(data) {
//               // console.log(data);
//               // location.reload();
//            }
//        });
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