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

String sql2 = "select * from student_login inner join students on student_login.id = students.sid where students.status='0' and student_login.tg_id='"+tg_id+"'";
    try{
        pst = connection.prepareStatement(sql2);
       rs = pst.executeQuery();
     System.out.println(rs.getString("fname"));  
    }
    catch(Exception e){
        System.out.print(e);
    }
    

// branch name
String dep="";
  String sql4 = "select * from master_branch where id='"+bid+"'";
    try{
       pst = connection.prepareStatement(sql4);
       ResultSet rs1 = pst.executeQuery();
       if(rs1.next()){
        dep = rs1.getString("branch_name");
        
       
//      session.setAttribute("fname", fname);
       }
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TG :: Approve Pending </title>
        
    
        
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
        </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button></a>
      </div>
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron mt-5">
          <p class="fa fa-mortar-board"> <kbd><span class="text-primary">TG </span> <%=dep%> Department</kbd></p>
        <div class="container">
            
            <p> Approve Students Registration form or Delete it.</p>
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
    <tbody>
        <%
            while(rs.next()){
            String id1 = rs.getString("id");

            
            %>
     <tr>
         <td><div class="btn-default"><a href='summary.jsp?id=<%=id1%>'><%=rs.getString("fname")%> <%=rs.getString("mname")%> <%=rs.getString("lname")%></a></div></td>
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
            url : "/StudentRegistration/a_pending",
           
           data: {ida: id1},
            success : function(data) {
                alert("You Accepted Student Register Pending Successfully !! ");
                location.reload();
            }
        });
     
}); 

    
              $(".delete").click(function() {
    var idd = $(this).attr('id');
        var id2 = parseInt(idd);
        console.log(id2);
       $.ajax({
            type : "POST",
            url : "/StudentRegistration/d_pending",
           
           data: {id2: id2},
            success : function(data) {
                alert("You Deleted Student Register Request Successfully !! ");
                location.reload();
            }
        });
     
}); 


 </script>
    
    </body>
</html>
<%
}
}
catch(Exception e){
    response.sendRedirect("tg_login.jsp");
}
%>