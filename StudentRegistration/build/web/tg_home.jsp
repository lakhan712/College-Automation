<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>

<%
  try{
      session = request.getSession(false);
 String id = session.getAttribute("tg_id").toString();
 if(id.equals("")){
     response.sendRedirect("tg_login.jsp");
 }
 else{
 String name = "";
 String bid = "";
 
 
 String sql2 = "select * from master_tg where id='"+id+"'";
    try{
        pst = connection.prepareStatement(sql2);
       rs = pst.executeQuery();
       if(rs.next()){
        name  = rs.getString("name");
         bid  = rs.getString("bid");

     session.setAttribute("bid", bid);
       }
    }
    catch(Exception e){
        System.out.print(e);
    }

// branch name
String dep="";
  String sql4 = "select * from master_branch where id='"+bid+"'";
    try{
       pst = connection.prepareStatement(sql4);
        rs = pst.executeQuery();
       if(rs.next()){
        dep = rs.getString("branch_name");
        
       
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
        <title>Home :: TG Dashboard</title>
        
    
        
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
            <a href="tg_home.jsp"> <button type="button" class="btn btn-info m-2 fa fa-home active">Home </button></a>
            
          </li>
          <li class="nav-item">
              <a href="ap_pending.jsp">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o"> Approve Pending </button> </a>
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
          <a href="/StudentRegistration/logout"> <button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button> </a>
      </div>
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron mt-5">
          <p class="fa fa-mortar-board"> <kbd><span class="text-primary">TG </span> <%=dep%> Department</kbd></p>
        <div class="container">
            <div class="row">
          <h1 class="display-3 "><%=name%></h1>
          <div class="fa fa-check-circle" style="color:blue; font-size: 20px" data-toggle="tooltip" data-placement="left" title="You are verified TG of DPCOE"></div>
            </div>
            <p> Welcome to DPCOE Registration TG Dashboard.</p>
          </div>
          
        
      </div>
      

      <div class="container">
              <p class="bg-info"><strong>NOTE:</strong> Be careful on clicking Email-Id data, it will Auto updated into database. Click outside of box anywhere to update.</p>
  <h2>Student Summary:</h2>
           
  <%
         String sql6 = "select * from student_login where tg_id='"+id+"' and allow='1'";
    try{
        pst = connection.prepareStatement(sql6);
       rs = pst.executeQuery();

    }
    catch(Exception e){
        System.out.print(e);
    }
      %>
  
  <table class="table table-striped">
    <thead>
      <tr>
         <th>Id</th>
        <th>Name</th>
        <th>Mobile</th>
        <th>Email</th>
        <th>Delete</th>
        <th>Status</th>
      </tr>
    </thead>
    <%! int a=1;%>
    <tbody>
        <%
            String email = "";
            while(rs.next()){
                String id1 = rs.getString("id");
               
            email = rs.getString("email");
            String query1 = "select * from students where sid='"+id1+"'";
          PreparedStatement pst1 = connection.prepareStatement(query1);
          ResultSet rs1 = pst1.executeQuery();
          if(rs1.next()){
            %>
      <tr>
          <td><% out.print(a); %></td>
          <td><a href='summary.jsp?id=<%=id1%>'><%=rs.getString("fname")%> <%=rs.getString("mname")%> <%=rs.getString("lname")%></a></td>
        <td><%=rs.getString("mobile")%></td>
        <td contenteditable id="<%=rs.getString("id")%>" onblur="update('#<%=rs.getString("id")%>','<%=rs.getString("id")%>')"><%=rs.getString("email")%></td>
        
        <td><button type="button" id="<%=rs.getString("id")%>" class="btn btn-danger fa fa-trash-o delete" style="font-size: 25px;"></button></td>
      <td><% if(Integer.parseInt(rs1.getString("status"))==2){
          out.print("<div class='p-3 mb-2 bg-success text-dark'>Yes</div>");
      }else if(Integer.parseInt(rs1.getString("status"))==1){
          out.print("<div class='p-3 mb-2 bg-primary text-dark'>Pending by Admin</div>");
      }else if(Integer.parseInt(rs1.getString("status"))==0){
          out.print("<div class='p-3 mb-2 bg-warning text-dark'>Pending by You</div>");
      }
      else if(rs1.getString("status")==null){
            out.print("No");  
      }  
              } %>
      </td>
      </tr>
    
      <% a++; }  %>
     
   <% a=1;%>
    </tbody>
  </table>
</div>

      

    </main>

        
      <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
     
    <script>
        
         function update(id,rid){
           var id = id;
           var email = $(id).html();
           $.ajax({
            type : "POST",
            url : "/StudentRegistration/Upd_email",
           // data : "name=" + name, "email=" + email, "mobile=" + mobile, "username=" + username, "password=" + password  
           data: {id: rid, email: email},
            success : function(data) {
                alert("You Successfully Updated Email-Id!! ");
            }
        });
       }
        
        
          $(".delete").click(function() {
        
       
      var id1 = $(this).attr('id');
             if(confirm("Are you sure want to delete all data permanently ?")){
       $.ajax({
            type : "POST",
            url : "/StudentRegistration/delete_st",
           
           data: {id: id1},
            success : function(data) {
                alert("You Deleted Student Successfully !! ");
                location.reload();
                         $.ajax({
                type : "POST",
                url : "/StudentRegistration/EmailSendingServlet",
           
            data: {email:"<%=email%>" , subject: "Your Registration Form is Deleted by TG. !", content: "Hey !! Your Registration Form is Deleted by TG. Contact TG and fill registration form again "},
            success : function(data) {
                console.log(data);
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
    response.sendRedirect("tg_login.jsp");
}
%>