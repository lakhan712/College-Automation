<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="boost.jsp" %>
<%@include  file="connect.jsp" %>

<%
  try{
      session = request.getSession(false);
 String tg_id = session.getAttribute("tg_id").toString();
 
 if(tg_id.equals("")){
     response.sendRedirect("tg_login.jsp");
 }
 else{
%>

<%
   String id = request.getParameter("id");
    //String id = "3";
    String sql = "SELECT sl.fname,sl.mname,sl.lname,sl.branch,cd.sid,cd.state,cd.city"
            + ",cd.hometown,cd.pin,g.sid,g.fname,g.mname,g.lname,g.mobile,g.relation,g.state,g.city,"
            + "g.hometown,g.pin,pd.sid,pd.state,pd.city,pd.hometown,pd.pin,s.category,s.branch,s.year,"
            + "s.blood,s.DOB,s.bplace,s.nationality,s.caste,s.pan_no,s.adhar_no,s.status,s.sid,sl.gender,"
            + "sl.email,sl.mobile,sl.id,p.sid,p.fname,p.mname,p.lname,p.mobile,p.mother_name,p.education ,"
            + "p.occupation,p.designation,s.religion,p.email ,master_branch.id,"
            + "master_branch.branch_name FROM student_login sl INNER JOIN master_branch master_branch ON "
            + "sl.branch = master_branch.id,c_address cd,guardian g,p_address pd,students s,parent p "
            + "WHERE sl.id = '"+id+"' and cd.sid = '"+id+"' and g.sid = '"+id+"' and pd.sid = '"+id+"' and s.sid = '"+id+"' and p.sid = '"+id+"' and sl.branch = master_branch.id";
    try{
    pst = connection.prepareStatement(sql);
    rs = pst.executeQuery();
    if(rs.next()){
         // = rs.getString("branch_name");
    //System.out.print(rs.getString("sl.fname"));
%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Student Detail</title>
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
            <a href="tg_home.jsp"> <button type="button" class="btn btn-info m-2 fa fa-home">Home </button></a>
            
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
        </ul>
          <a href="/StudentRegistration/logout"> <button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button> </a>
      </div>
    </nav>

    <main role="main"> 
        <div style="margin-top: 7%;">
             <div class="container">
  <h2>Student Details:</h2>
  <div id="accordion">
    <div class="card">
      <div class="card-header">
        <a class="card-link" data-toggle="collapse" href="#collapseOne">
          Personal Details :
        </a>
      </div>
      <div id="collapseOne" class="collapse" data-parent="#accordion">
        <div class="card-body">
            <h6 style="display: inline-block">Name:</h6> &nbsp;<div style="display: inline-block"><%=rs.getString("sl.lname")%>&nbsp;<%=rs.getString("sl.fname")%>&nbsp;<%=rs.getString("sl.mname")%></div>
        
            <h6 class="ml-5" style="display: inline-block">DOB: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.DOB")%></div>
        
            <h6 class="ml-5" style="display: inline-block">Nationality: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.nationality")%></div>
       
            <h6 class="ml-5" style="display: inline-block">Category: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.category")%></div><br/>
        </div>
        
<!--        break -->
        
        <div class="card-body">
            <h6 style="display: inline-block">Year: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.year")%></div>
        
            <h6  class="ml-5" style="display: inline-block">Blood Group: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.blood")%></div>
        
            <h6 class="ml-5" style="display: inline-block">Caste: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.caste")%></div>
       
            <h6 class="ml-5"  style="display: inline-block">Religion: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.religion")%></div><br/>
        </div>
        
<!--        break-->
        
        <div class="card-body">
            <h6 style="display: inline-block">Gender: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("sl.gender")%></div>
       
            <h6 class="ml-5" style="display: inline-block">Birthplace: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.bplace")%></div>
        </div>
      </div>
        </div>    
        
<!--         Next Page  -->
            
    
    <div class="card">
      <div class="card-header">
        <a class="collapsed card-link" data-toggle="collapse" href="#collapseTwo">
        Contact Details:
      </a>
      </div>
      <div id="collapseTwo" class="collapse" data-parent="#accordion">
        <div class="card-body">
            <h6 style="display: inline-block">Email-ID:</h6> &nbsp;<div style="display: inline-block"><%=rs.getString("sl.email")%></div>
        
            <h6 class="ml-5" style="display: inline-block">Mobile: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("sl.mobile")%></div><br>
        </div>
        <div class="card-body">
            <h6  style="display: inline-block">Present Address: </h6><br>
            <h6  style="display: inline-block"> State: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("cd.state")%></div>
       
            <h6 class="ml-5" style="display: inline-block">City: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("cd.city")%></div>
            <h6 class="ml-5" style="display: inline-block">Hometown: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("cd.hometown")%></div>
            <h6 class="ml-5" style="display: inline-block">Pin Code: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("cd.pin")%></div><br>
        </div>
        
<!--        break -->
        
        <div class="card-body">
            <h6  style="display: inline-block">Permanent Address: </h6><br>
              <h6  style="display: inline-block"> State: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("pd.state")%></div>
       
            <h6 class="ml-5" style="display: inline-block">City: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("pd.city")%></div>
            <h6 class="ml-5" style="display: inline-block">Hometown: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("pd.hometown")%></div>
            <h6 class="ml-5" style="display: inline-block">Pin Code: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("pd.pin")%></div><br>
        </div>
        
<!--        break-->
        
        <div class="card-body">
            <h6 style="display: inline-block">Adhaar No: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.adhar_no")%></div>
       
            <h6 class="ml-5" style="display: inline-block">Pan No: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("s.pan_no")%></div>
        </div>
      </div>
    </div>

        <!--         Next Page  -->


    <div class="card">
      <div class="card-header">
        <a class="collapsed card-link" data-toggle="collapse" href="#collapseThree">
          Parent Details:
        </a>
      </div>
      <div id="collapseThree" class="collapse" data-parent="#accordion">
        <div class="card-body">
            <h6 style="display: inline-block">Name:</h6> &nbsp;<div style="display: inline-block"><%=rs.getString("p.lname")%>&nbsp;<%=rs.getString("p.fname")%>&nbsp;<%=rs.getString("p.mname")%></div>
        
            <h6 class="ml-5" style="display: inline-block">Mother Name: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("p.mother_name")%></div>
        
            <h6 class="ml-5" style="display: inline-block">Mobile No: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("p.mobile")%></div><br>
       
            <h6 class="" style="display: inline-block">Email Id: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("p.email")%></div><br/>
        </div>
        
<!--        break-->
        
        <div class="card-body">
            <h6 style="display: inline-block">Education:</h6> &nbsp;<div style="display: inline-block"><%=rs.getString("p.education")%></div>
        
            <h6 class="ml-5" style="display: inline-block">Occupation: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("p.occupation")%></div>
        
            <h6 class="ml-5" style="display: inline-block">Designation: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("p.designation")%></div>
          </div>
      </div>
    </div>
        
        <!--         Next Page  -->
        
      <div class="card">
      <div class="card-header">
        <a class="collapsed card-link" data-toggle="collapse" href="#collapseFour">
          Guardian Details:
        </a>
      </div>
      <div id="collapseFour" class="collapse" data-parent="#accordion">
         <div class="card-body">
            <h6 style="display: inline-block">Name:</h6> &nbsp;<div style="display: inline-block"><%=rs.getString("g.lname")%>&nbsp;<%=rs.getString("g.fname")%>&nbsp;<%=rs.getString("g.mname")%></div>
               
            <h6 class="ml-5" style="display: inline-block">Mobile No: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("g.mobile")%></div>
       
            <h6 class="ml-5" style="display: inline-block">Relation with Gardian: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("g.relation")%></div><br/>
        </div>
        
<!--        break-->
        
        <div class="card-body">
                        <h6  style="display: inline-block">Address: </h6><br>
            <h6  style="display: inline-block"> State: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("g.state")%></div>
            <h6 class="ml-5" style="display: inline-block">City: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("g.city")%></div>
            <h6 class="ml-5" style="display: inline-block">Hometown: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("g.hometown")%></div>
            <h6 class="ml-5" style="display: inline-block">Pin Code: </h6> &nbsp;<div style="display: inline-block"><%=rs.getString("g.pin")%></div><br>
         </div>
      </div>
    </div>
      <% }
      }catch(Exception e){
         System.out.println(e);
      }
      %>
      
     
      
      <div class="card">
      <div class="card-header">
        <a class="collapsed card-link" data-toggle="collapse" href="#collapseFive">
          Academic Details:
        </a>
      </div>
      <div id="collapseFive" class="collapse" data-parent="#accordion">
       <div class="container">
              
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Exam</th>
        <th>Month & Year</th>
        <th>Marks Obtained</th>
        <th>Marks Total</th>
        <th>Percentage/ATKT/Provisional</th>
      </tr>
    </thead>
    <tbody>
         <%
           String sq2 = "select * from academic_record where sid='"+id+"'";
    try{
    pst = connection.prepareStatement(sq2);
    ResultSet rs1 = pst.executeQuery();
    while(rs1.next()){
          
          %>
      <tr>
        <td><%=rs1.getString("exam")%></td>
        <td><%=rs1.getString("year")%></td>
        <td><%=rs1.getString("marks_ob")%></td>
        <td><%=rs1.getString("marks_total")%></td>
        <td><%=rs1.getString("percentage")%></td>
      </tr>
       <% }
      }catch(Exception e){
         System.out.println(e);
      }
      %>
      </tbody>
  </table>
</div>
      </div>
    </div>
     
  </div>
</div>
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
    response.sendRedirect("tg_login.jsp");
}  
%>