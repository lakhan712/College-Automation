<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("pragma", "no-cache");
response.setHeader("Expires", "0");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>

<%
    try{
        session = request.getSession(false);
    String id = session.getAttribute("st_id").toString();
    if(session != null && !session.isNew()) {
    } else {
    response.sendRedirect("/login.jsp");
    }
    if(id.equals("")){
        response.sendRedirect("index.jsp");
    }
    else{
 %>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home :: Student Dashboard</title>
        
        <style>
      .dropdown:hover .dropdown-menu {
    display: block;
    margin-top: 0; 
 }
            
        </style>
        
    </head>
    <body>
        <%
        session = request.getSession(false);
        //String id=session.getAttribute("st_id").toString();
        String fname="";
        String mname="";
        String lname="";
        String mobile="";
        String email="";
        String gender="";
        String tg_id="";
        String name1="";
        String email1="";
        String mobile1="";
        String b_id="";
        String dep="";
        out.print(id);
        
        
        
        String sql = "select * from student_login where id='"+id+"'";
    try{
       pst = connection.prepareStatement(sql);
        rs = pst.executeQuery();
       if(rs.next()){
        fname = rs.getString("fname");
        mname = rs.getString("mname");
        lname = rs.getString("lname");
        mobile = rs.getString("mobile");
        email = rs.getString("email");
        gender = rs.getString("gender");
       tg_id = rs.getString("tg_id");
       b_id = rs.getString("branch");
//      session.setAttribute("fname", fname);
       }
    }
    catch(Exception e){
        System.out.print(e);
    }
    
// tg info

       String sql2 = "select * from master_tg where id='"+tg_id+"'";
    try{
       pst = connection.prepareStatement(sql2);
        rs = pst.executeQuery();
       if(rs.next()){
        name1 = rs.getString("name");
        email1 = rs.getString("email");
        mobile1 = rs.getString("mobile");
     
//      session.setAttribute("fname", fname);
       }
    }
    catch(Exception e){
        System.out.print(e);
    }
    
// department info

       String sql3 = "select * from master_branch where id='"+b_id+"'";
    try{
       pst = connection.prepareStatement(sql3);
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
            
           
        
        
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2">
      <a class="navbar-brand ml-3" href="#"><img src="pic/dpcoe.jpg" height="60" width="60" class="img-rounded" alt="dpcoe"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
              <button type="button" class="btn btn-info m-2 fa fa-home active"> Home</button>
            
          </li>
          
<!--          Original code
          <li class="nav-item">
              <a href="registration.jsp">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o"> Registration</button> </a>
          </li>
          <li class="nav-item">
              <a href="requestForm.jsp"><button type="button" class="btn btn-info m-2 fa fa-download"> Download</button></a>
          </li>
          <li class="nav-item">
              end-->
              
              
<!--             <div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Task button
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="#">Apply for Bonafide</a>
    <button type="button" class="btn btn-primary dropdown-item" data-toggle="modal" data-target="#exampleModal">
  Apply for Bonafide
</button>
    <a class="dropdown-item" href="#">Apply for LC</a>
    
  </div>
</div>-->

        <!--          Edited-->
               <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Registration</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
             
        <a class="dropdown-item" href="registration.jsp">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o"> Apply for Registration form</button> </a>
              
                <a class="dropdown-item" href="requestForm.jsp"><button type="button" class="btn btn-info m-2 fa fa-download"> Download Registration form</button></a>
        </div>
          </li>
<!--          End Edited-->


          </li>
<!--          Edited-->
               <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Actions</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
            <a class="dropdown-item" href="#">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o" data-toggle="modal" data-target="#exampleModal"> Apply for Bonafide</button> </a>
            <a class="dropdown-item" href="#">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o"> Apply for LC</button> </a>
 
        
        </div>
          </li>
<!--          End Edited-->
        </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout </button></a>
      </div>
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron mt-5">
          <p class="fa fa-mortar-board"> <kbd><%=dep%> Department</kbd></p>
        <div class="container">
            <div class="row">
                <h1 class="display-3 "><%=fname%> </h1>
                <script>
                    
                </script>
          <div class="fa fa-check-circle" style="color:green; font-size: 20px" data-toggle="tooltip" data-placement="left" title="You are verified Student of DPCOE"></div>
            </div>
            <p> Welcome to DPCOE Registration.</p>
          </div>
          
        </div>
      

      <div class="container">
        <!-- Example row of columns -->
        <div class="row">
          <div class="col-md-4">
            <h2>Your Data:</h2>
            <p>Name: <%=fname%> <%=mname%> <%=lname%> </p>
            <p>Email-ID: <%=email%> </p>
            <p>Mobile: <%=mobile%> </p>
            <p>Gender: <%=gender%> </p>
            <p>Department: <%=dep%> </p>
          </div>
          <div class="col-md-4">
            <h2>TG Data:</h2>
            <p>Name: <%=name1%> </p>
            <p>Email-ID: <%=email1%> </p>
            <p>Mobile: <%=mobile1%> </p>
            
           
          </div>
         
        </div>

        <hr>

      </div> <!-- /container -->

    </main>

        
     <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>
            
<!--            Modal form for Bonafide Start -->
            
  <!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Please Enter data.</h5>
       

      </div>
      <div class="modal-body">         
          <form onsubmit="return msg();" action="Request_Bonafide" method="post">
  <div class="form-group">
      <div class="input-group mb-3">
  <div class="input-group-prepend">
    <label class="input-group-text" for="inputGroupSelect01">Select Current year type</label>
  </div>
          
  <select class="custom-select" id="c_year_type" name="c_year_type">
    <option value="First Year">First Year</option>
  <option value="Second Year">Second Year</option>
  <option value="Third Year">Third Year</option>
  <option value="Fourth Year">Fourth Year</option>
  </select>
</div>
      <div class="input-group mb-3">
  <div class="input-group-prepend">
    <label class="input-group-text" for="inputGroupSelect01">Select Admission year type</label>
  </div>
  <select class="custom-select" id="admission_year_type" name="admission_year_type">
      <option value="First Year">First Year</option>
  <option value="Direct Second Year">Direct Second Year</option>
  <option value="M.E.">M.E.</option>
  <option value="M.B.A.">M.B.A.</option>
  </select>
</div>
    <input type="text" class="form-control" name="A_year" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Year of Admission eg. 2018">
    <div class="row"><br></div>
    <input type="text" class="form-control" name="purpose" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter purpose/subject for bonafide.">
    <input type="text" name="id" value="<%=id%>" hidden>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
    </body>
    
    <script>
function msg() {

    alert("Go to Admin Department to Collect your Bonafide");

}
</script>
    
</html>
<%
}
}
catch(Exception e){
    response.sendRedirect("index.jsp");
}
%>
