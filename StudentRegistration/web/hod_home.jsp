<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>
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
        <title>Home :: HOD Dashboard</title>
        
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
    <body>
        
             <%
      String name="";
      String bid="";
      String branch="";
//        out.print(id);
        
        PrintWriter out1=response.getWriter();
        
        String sql2 = "select * from master_hod where id='"+id+"'";
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
    
//    new for getting bid

String sql3 = "select * from master_branch where id='"+bid+"'";
 try{
     pst=connection.prepareStatement(sql3);
     rs=pst.executeQuery();
     if(rs.next()){
         branch = rs.getString("branch_name");
          session.setAttribute("branch", rs.getString("branch_name"));
     }
 }catch(Exception e){
     System.out.print(e);
 }
        
//    new for getting all students of department....

String sql5 = "select * from student_login where branch ='"+bid+"'";
 try{
     pst=connection.prepareStatement(sql5);
     rs=pst.executeQuery();
    
 }catch(Exception e){
     System.out.print(e);
 }

 %>
        
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2">
      <a class="navbar-brand ml-3" href="#"><img src="pic/dpcoe.jpg" height="60" width="60" class="img-rounded" alt="dpcoe"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

     <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item ">
              <a href="hod_home.jsp">  <button type="button" class="btn btn-info m-2 fa fa-home active"> Home</button></a>
            
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
          <p class="fa fa-mortar-board"><kbd><span class="text-primary">HOD </span><%=branch%> Department</kbd></p>
        <div class="container">
            <div class="row">
                <h1 class="display-3 "><%=name%></h1>
          <div class="fa fa-check-circle" style="color:red; font-size: 20px" data-toggle="tooltip" data-placement="left" title="You are verified HOD of DPCOE"></div>
            </div>
            <p> Welcome to DPCOE Registration HOD DashBoard.</p>
          </div>
          
         
        </div>
      

     <div class="container">
         
  <h2>All Students Summary:</h2>
          
  <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
  <label for="year">Select Year:</label>
  <select name="year" id="year" style="display:inline-block;">
      <option value="">Select Year</option>
  <%
    String year = "select * from master_year";
    pst = connection.prepareStatement(year);
    ResultSet rs1 = pst.executeQuery();
    while(rs1.next()){
    %>
    <option value="<%=rs1.getString("year")%>"><%=rs1.getString("year")%></option>
    <%  
    }
  %>
  </select>
  <table id="myTable">
  <tr class="header">
      
    <th style="width:35%;">Name</th>
    <th style="width:35%;">Mobile</th>
    <th style="width:30%;">Department</th>
  </tr>
  <tbody id="data">
      <%! int a=1;%>
   <%
            while(rs.next()){
                
            String st_id = rs.getString("id");
            
            %>
  <tr>
      
      <td><%=rs.getString("fname")%> <%=rs.getString("mname")%> <%=rs.getString("lname")%></td>
    <td><%=rs.getString("mobile")%></td>
    
    <%
  String bid1= rs.getString("branch");
    
     String sqlbr="select * from master_branch where id="+bid1;
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
  </tbody>
</table>
</div>

    </main>

        
      <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
        
    </body>
</html>









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
$("#year").change(function() {
           var id1 = $(this).val();
        console.log(id1);
        
       $.ajax({
            type : "POST",
            url : "/StudentRegistration/StudentYear",
           
           data: {year: id1},
            success : function(data) {
                console.log(data);
                $("#data").html(data);
            }
        });
     
});
</script>
<%
}
}
catch(Exception e){
    response.sendRedirect("hod_login.jsp");
}
%>