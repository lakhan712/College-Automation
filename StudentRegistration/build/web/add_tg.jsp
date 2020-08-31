<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@ include file = "connect.jsp" %>
<%
   try{
        session = request.getSession(false);
  String id = session.getAttribute("id").toString();
if(id.equals("")) {
    response.sendRedirect("hod_login.jsp");
    } else {
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOD :: Add TG </title>
        

     
    </head>
    <body>
        
        <%
        String branch=session.getAttribute("branch").toString();
        String bid=session.getAttribute("bid").toString();

        %>
        
        
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2">
      <a class="navbar-brand ml-3" href="#"><img src="pic/dpcoe.jpg" height="60" width="60" class="img-rounded" alt="dpcoe"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item ">
              <a href="hod_home.jsp">  <button type="button" class="btn btn-info m-2 fa fa-home"> Home</button></a>
            
          </li>
            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Task</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="add_tg.jsp">Add TG</a>
              
            </div>
          </li>
        </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button></a>
      </div>
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron mt-5">
          <p class="fa fa-mortar-board"> <kbd><span class="text-primary">HOD </span><%=branch%> Department</kbd></p>
           <h2 class="shadow-none p-4 mb-4" align="center">Add TG of your department.</h2>
        
      </div>
  
       <div align="center">  <h1>Add TG</h1></div><br><br>
<div class="container">
    
  <div class="row">
     
    <table class="table" id="t1">
      <thead>
        <tr>
       
          <th>Name</th>
          <th>Email</th>
          <th>Mobile</th>
          <th>Username</th>
          <th>Password</th>
          <th>Department</th>
          <th></th>

          
        </tr>
      </thead>
      
      <tbody>
          
        <tr>
          
          <td> 
            <input type="text" class="form-control" id="name" name="name" value="">
          </td>
         <td>
             <input type="mail" class="form-control" id="email" name="email"  value="">
          </td>
          <td>
            <input type="number" class="form-control" id="mobile" name="mobile" size="10" value="">
          </td>
          <td>
            <input type="text" class="form-control" id="username" name="username">
          </td>
          <td>
            <input type="text" class="form-control" id="password" name="password">
          </td>
          <td>
              <input type="text" class="form-control" name="department" value="<%=branch%>"  disabled>
          </td>
          <td><button type="button" id="add" class="btn btn-info m-2 fa fa-plus"> Add</button>
             
        </tr> 
   </tbody>
   
    </table>
     
  </div>
   
</div>
      
 
      
      
<!-- show all tg summary-->

<%  String id2="";
    String name2="";
    String email2="";
    String mobile2="";
    String username2="";
    String password2="";
    
    String sql6 = "select * from master_tg where bid='"+bid+"'";
    try{
        pst = connection.prepareStatement(sql6);
       rs = pst.executeQuery();

    }
    catch(Exception e){
        System.out.print(e);
    }

    %>

<%! int a=1;%>

      <div align="center">  <h1>TG Summary</h1></div><br><br>
      
<div class="container">
    <p class="bg-info"><strong>NOTE:</strong> Be careful on clicking summary data, it will Auto updated in database. Click outside of box anywhere to update.</p>
  <div class="row">
     
          <table class="table" id="t2">
        
      <thead>
        <tr>
            <th>No.</th>
          <th>Name</th>
          <th>Email</th>
          <th>Mobile</th>
          <th>Username</th>
          <th>Password</th>
          <th>Department</th>
          
        </tr>
      </thead>
      <tbody>
          <%
            while(rs.next()){
                
            
            %>
        <tr id="<%=rs.getString("name")%>">
      
            <td><% out.print(a); %></td>
     <td contenteditable id="<%=rs.getString("id")%>" onblur="update('#<%=rs.getString("id")%>','<%=rs.getString("id")%>')"><%=rs.getString("name")%></td>
         
     <td contenteditable id="1<%=rs.getString("id")%>" onblur="update1('#1<%=rs.getString("id")%>','<%=rs.getString("id")%>')"><%=rs.getString("email")%></td>

     <td contenteditable id="2<%=rs.getString("id")%>" onblur="update2('#2<%=rs.getString("id")%>','<%=rs.getString("id")%>')"><%=rs.getString("mobile")%></td>

     <td contenteditable id="3<%=rs.getString("id")%>" onblur="update3('#3<%=rs.getString("id")%>','<%=rs.getString("id")%>')"><%=rs.getString("username")%></td>

     <td contenteditable id="4<%=rs.getString("id")%>" onblur="update4('#4<%=rs.getString("id")%>','<%=rs.getString("id")%>')"><%=rs.getString("password")%></td>

          <td>
            <input type="text"  class="form-control"  value="<%=branch%>"  disabled>
          </td>
      </tr>
     
   <% a++; } %>
   <% a=1;%>
      </tbody>
    </table>
    
  </div>
 
</div>
   
      
    </main>

        
        
        
        
      <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
        
      
   <script type="text/javascript">
       
       function update(id,rid){
           var id = id;
           var name = $(id).html();
           $.ajax({
            type : "POST",
            url : "/StudentRegistration/upd_tg",
           // data : "name=" + name, "email=" + email, "mobile=" + mobile, "username=" + username, "password=" + password  
           data: {id: rid, name: name},
            success : function(data) {
                alert("You Successfully Edited TG DATA !! ");
            }
        });
       }
       
          function update1(id,rid){
           var id = id;
           var email = $(id).html();
           $.ajax({
            type : "POST",
            url : "/StudentRegistration/upd_tg",
           // data : "name=" + name, "email=" + email, "mobile=" + mobile, "username=" + username, "password=" + password  
           data: {id: rid, email: email},
            success : function(data) {
                alert("You Successfully Edited TG DATA !! ");
            }
        });
       }
       
          function update2(id,rid){
           var id = id;
           var mobile = $(id).html();
           $.ajax({
            type : "POST",
            url : "/StudentRegistration/upd_tg",
           // data : "name=" + name, "email=" + email, "mobile=" + mobile, "username=" + username, "password=" + password  
           data: {id: rid, mobile: mobile},
            success : function(data) {
                alert("You Successfully Edited TG DATA !! ");
            }
        });
       }
       
          function update3(id,rid){
           var id = id;
           var username = $(id).html();
           $.ajax({
            type : "POST",
            url : "/StudentRegistration/upd_tg",
           // data : "name=" + name, "email=" + email, "mobile=" + mobile, "username=" + username, "password=" + password  
           data: {id: rid, username: username},
            success : function(data) {
                alert("You Successfully Edited TG DATA !! ");
            }
        });
       }
       
       
          function update4(id,rid){
           var id = id;
           var password = $(id).html();
           $.ajax({
            type : "POST",
            url : "/StudentRegistration/upd_tg",
           // data : "name=" + name, "email=" + email, "mobile=" + mobile, "username=" + username, "password=" + password  
           data: {id: rid, password: password},
            success : function(data) {
                alert("You Successfully Edited TG DATA !!  ");
            }
        });
       }
       
$('#add').click(function(){
    //declare
    var name = $('input[name="name"]').val();
    var email = $('input[name="email"]').val();
    var mobile = $('input[name="mobile"]').val();
    var username = $('input[name="username"]').val();
    var password = $('input[name="password"]').val();
   
   if(name == "" || email == "" || mobile == "" || username == "" || password == ""){ 
   
   alert("Please Fill all fields !!");
        }
        else{
      $.ajax({
            type : "POST",
            url : "/StudentRegistration/addt",
           // data : "name=" + name, "email=" + email, "mobile=" + mobile, "username=" + username, "password=" + password  
           data: {name: name, email: email, mobile: mobile, username: username, password: password},
            success : function(data) {
                alert("You Add TG Successfully !! ");
                location.reload();
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
    System.out.println(e);
    response.sendRedirect("hod_login.jsp?error");
}
%>