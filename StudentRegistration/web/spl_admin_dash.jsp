<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>
<%
    try{
        session = request.getSession(false);
  String id1 = session.getAttribute("ad_id").toString();
if(id1.equals("")) {
    response.sendRedirect("spl_admin_login.jsp");
    } else {
          
     String sql3 = "select * from student_login inner join students on student_login.id = students.sid where students.status='2'";
    try{
        pst = connection.prepareStatement(sql3);
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home :: Special Admin</title>
     
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
 </head>
 
<!--       Have to Edit from here.....-->
 
    <body>
        
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2">
      <a class="navbar-brand ml-3" href="#"><img src="pic/dpcoe.jpg" height="60" width="60" class="img-rounded" alt="dpcoe"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
              <a href="spl_admin_dash.jsp"><button type="button" class="btn btn-info m-2 fa fa-home active"> Home</button> </a>
            
          </li>
             <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Task</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="add_admin.jsp">Add Admin</a>
        </div>
          </li>
      </ul>
        <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button></a>
      </div>
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
     <div class="jumbotron mt-5">
          <p class="fa fa-mortar-board"><kbd><span class="text-primary">Spceial Admin </span> </kbd></p>
        <div class="container">
            <div class="row">
                <h1 class="display-3 ">Special Admin</h1>
          <div class="fa fa-check-circle" style="color:red; font-size: 20px" data-toggle="tooltip" data-placement="left" title="You are verified Special Admin of DPCOE"></div>
            </div>
            <p> Welcome to DPCOE Registration Spceial Admin DashBoard.</p>
          </div>
          
         
        </div>
      

      <div class="container">
          
         
  <h2>Summary</h2>
 
 
<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">

<table id="myTable">
  <tr class="header">
    <th style="width:35%;">Name</th>
    <th style="width:35%;">Mobile</th>
    <th style="width:30%;">Department</th>
  </tr>
  <%! int a=1;%>
   <%
            while(rs.next()){
                
            String id = rs.getString("id");
            %>
  <tr>     

      <td> <%=rs.getString("fname")%> <%=rs.getString("mname")%> <%=rs.getString("lname")%></td>
    <td><a href="summary.jsp?id=<%=id%>"><%=rs.getString("mobile")%></a></td>
    
    <%
  String bid= rs.getString("branch");
    
     String sqlbr="select * from master_branch where id="+bid;
     PreparedStatement pst1= connection.prepareStatement(sqlbr);
     ResultSet rs2 = pst1.executeQuery();
     while(rs2.next()){
   
  %>
   <td><%=rs2.getString("branch_name")%></td>
   <%
          }
          %>
  </tr>
   <% a++; }  %>
     
   <% a=1;%>

</table>

<script>
function myFunction() {
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>
</div>

    </main>

        
      <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
        
  
        
    </body>
</html>
<%
}
}
catch(Exception e){
    response.sendRedirect("spl_admin_login.jsp");
}
%>