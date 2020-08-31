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
              <a href="admin_dash.jsp"><button type="button" class="btn btn-info m-2 fa fa-home active"> Home</button> </a>
            
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
            <p> Welcome to DPCOE Registration Admin DashBoard.</p>
          </div>
          
         
        </div>
      

      <div class="container">
          
         
  <h2>Summary</h2>
 
 
<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
<label for="year">Select Year:</label>
  <select name="branch" id="branch" style="display:inline-block;">
      <option value="">Select Branch:</option>
  <%
    String year = "select * from master_branch";
    pst = connection.prepareStatement(year);
    ResultSet rs1 = pst.executeQuery();
    while(rs1.next()){
    %>
    <option value="<%=rs1.getString("id")%>"><%=rs1.getString("branch_name")%></option>
    <%  
    }
  %>
  </select>
  <div class="pull-right" style=" padding: 10px;">
          <a href="#" onclick="$('.excel').tableExport({type:'excel',escape:'false'});">Export Excel</a>
  </div>
  <table id="myTable" class="excel">
 <thead>
    <th>Name</th>
    <th>Mobile</th>
    <th>Nationality</th>
    <th>DOB</th>
    <th>Category</th>
    <th>Year</th>
    <th>Blood Group</th>
    <th>Caste</th>
    <th>Religion</th>
    <th>Gender</th>
    <th>Birthplace</th>
    <th>Email-ID</th>
    <th>Admission Type</th>
    <th>Present Address</th>
    <th>Permanent Address</th>
    <th>Adhaar No</th>
    <th>Pan No</th>
    <th>Father Name</th>
    <th>Mother Name</th>
    <th>Parent Mobile</th>
    <th>Parent Email Id</th>
    <th>Education</th>
    <th>Occupation</th>
    <th>Designation</th>
    <th>Guardian Name</th>
    <th>Guardian Mobile No</th>
    <th>Relation with Guardian</th>
    <th>Guardian Address</th>
  </thead>
  <tbody id="data">   
      <%
       String sql3 = "SELECT sl.fname,sl.mname,sl.lname,sl.branch,cd.sid,cd.state,cd.city,cd.hometown,"
             + "cd.pin,g.sid,g.fname,g.mname,g.lname,g.mobile,g.relation,g.state,g.city,g.hometown,g.pin,"
             + "pd.sid,pd.state,pd.city,pd.hometown,pd.pin,s.category,s.year,s.blood,s.DOB,s.bplace,s.nationality,"
             + "s.caste,s.pan_no,s.adhar_no,s.status,s.admission,s.sid,sl.gender,sl.email,sl.mobile,sl.id,p.sid,p.fname,"
             + "p.mname,p.lname,p.mobile,p.mother_name,p.education ,p.occupation,p.designation,s.religion,p.email FROM student_login sl,"
             + "c_address cd,guardian g,p_address pd,students s,parent p where s.status='2' and s.sid = sl.id and cd.sid = sl.id "
             + "and g.sid = sl.id and pd.sid = sl.id and s.sid = sl.id and p.sid = sl.id";
    try{
        pst = connection.prepareStatement(sql3);
       rs = pst.executeQuery();
       
    
            while(rs.next()){
            String id = rs.getString("id");
            %>
  <tr>     
    <td> <a href="summary1.jsp?id=<%=id%>"><%=rs.getString("sl.fname")%> <%=rs.getString("sl.mname")%> <%=rs.getString("sl.lname")%></a></td>
    <td><%=rs.getString("sl.mobile")%></td>
    <td><%=rs.getString("s.nationality")%></td>
    <td><%=rs.getString("s.DOB")%></td>
    <td><%=rs.getString("s.category")%></td>
    <td><%=rs.getString("s.year")%></td>
    <td><%=rs.getString("s.blood")%></td>
    <td><%=rs.getString("s.caste")%></td>
    <td><%=rs.getString("s.religion")%></td>
    <td><%=rs.getString("sl.gender")%></td>
    <td><%=rs.getString("s.bplace")%></td>
    <td><%=rs.getString("sl.email")%></td>
    <td><%=rs.getString("s.admission")%></td>
    <td><%=rs.getString("cd.hometown")%>,<%=rs.getString("cd.city")%>,<%=rs.getString("cd.state")%>,Pin:<%=rs.getString("cd.pin")%></td>
    <td><%=rs.getString("pd.hometown")%>,<%=rs.getString("pd.city")%>,<%=rs.getString("pd.state")%>,Pin:<%=rs.getString("pd.pin")%></td>
    <td><%=rs.getString("s.adhar_no")%></td>
    <td><%=rs.getString("s.pan_no")%></td>
    <td><%=rs.getString("p.lname")%>&nbsp;<%=rs.getString("p.fname")%>&nbsp;<%=rs.getString("p.mname")%></td>
    <td><%=rs.getString("p.mother_name")%></td>
    <td><%=rs.getString("p.mobile")%></td>
    <td><%=rs.getString("p.email")%></td>
    <td><%=rs.getString("p.education")%></td>
    <td><%=rs.getString("p.occupation")%></td>
    <td><%=rs.getString("p.designation")%></td>
    <td><%=rs.getString("g.lname")%>&nbsp;<%=rs.getString("g.fname")%>&nbsp;<%=rs.getString("g.mname")%></td>
    <td><%=rs.getString("g.mobile")%></td>
    <td><%=rs.getString("g.relation")%></td>
    <td><%=rs.getString("g.hometown")%>,<%=rs.getString("g.city")%>,<%=rs.getString("g.state")%>,Pin:<%=rs.getString("g.pin")%></td>
  </tr>
  <%
      }
  %>
  </tbody>
  <%
  }
  catch(Exception e){
        System.out.print(e);
    }
  %>
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
$("#branch").change(function() {
           var id1 = $(this).val();    
       $.ajax({
            type : "POST",
            url : "/StudentRegistration/StudentBranch",
           
           data: {branch: id1},
            success : function(data) {
                console.log(data);
                $("#data").html(data);
            }
        });
     
});
</script>
</div>

    </main>

        
      <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
        
  
        
    </body>
    <script src="js/popper.min.js"></script>
</html>
<%
}
}
catch(Exception e){
    response.sendRedirect("admin_login.jsp");
}
%>