<%-- 
    Document   : Bonafide_Edit
    Created on : 27 Dec, 2018, 3:18:01 PM
    Author     : Lakhan Mnae
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>


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
          <li class="nav-item">
              <a href="request_lc.jsp">  <button type="button" class="btn btn-info m-2 fa fa-sticky-note-o active"> LC Request</button> </a>
          </li>
             <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Task</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="add_hod.jsp">Add HOD</a>
        </div>
          </li>
      </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button></a>
      </div>
    </nav>

    <main role="main">

      <div style="margin-top: 7%;">
      

<div class="container">
    <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card p-2">
                        <div class="header">
                            <h2><p class="text-center text-danger text-uppercase">Leaving Certificate</p></h2>
                        </div>
                        <div class="body">
                            <form id="form_validation" method="POST" action="getLc.jsp">
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Name:</label>
                                        <input type="text" class="form-control" name="name" value="" disabled>
                                        <input type="text" value="" name="id" hidden>
                                    </div>
                                </div>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Birth Date:</label>
                                        <input type="text" class="form-control" name="birth_date" value="" disabled>
                                    </div>
                                </div>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Birth in Words:</label>
                                        <input type="text" class="form-control" name="birth_words" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    Status:
                                    <input type="radio" name="status" id="pass" value="Passed" class="with-gap ml-2">
                                    <label for="pass" class="ml-2">Passed</label>

                                    <input type="radio" name="status" id="fail" value="Failed" class="with-gap ml-2">
                                    <label for="fail" class="ml-2">Failed</label>
                                </div>
                                 <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Examination:</label>
                                        <input type="text" class="form-control" name="exam" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    JULY to NOV Attendance:
                                    <input type="radio" name="july_attendance" id="july_sat" value="Satisfactory" class="with-gap ml-2">
                                    <label for="july_sat" class="ml-2">Satisfactory</label>

                                    <input type="radio" name="july_attendance" id="july_not_sat" value="Non-Satisfactory" class="with-gap ml-2">
                                    <label for="july_not_sat" class="ml-2">Non-Satisfactory</label>
                                </div>
                                <div class="form-group">
                                    JAN to MAY Attendance:
                                    <input type="radio" name="jan_attendance" id="jan_sat" value="Satisfactory" class="with-gap ml-2">
                                    <label for="jan_sat" class="ml-2">Satisfactory</label>

                                    <input type="radio" name="jan_attendance" id="jan_not_sat" value="Non-Satisfactory" class="with-gap ml-2">
                                    <label for="jan_not_sat" class="ml-2">Non-Satisfactory</label>
                                </div>
                                <h4><p class="text-center text-danger">University Examination Performance :</p></h4>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Examination Held:</label>
                                        <input type="text" class="form-control" name="exam_held" required>
                                    </div>
                                </div>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Passed Class:</label>
                                        <input type="text" class="form-control" name="passed_class" required>
                                    </div>
                                </div>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Seat No:</label>
                                        <input type="text" class="form-control" name="seat_no" required>
                                    </div>
                                </div>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Last College Attended:</label>
                                        <input type="text" class="form-control" name="last_college" required>
                                    </div>
                                </div>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Admission Date:</label>
                                        <input type="text" class="form-control" name="admission_date" required>
                                    </div>
                                </div>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Reason for leaving the college:</label>
                                        <input type="text" class="form-control" name="reason_leave" required>
                                    </div>
                                </div>
                                <div class="form-group form-float">
                                    <div class="form-line">
                                        <label class="form-label">Remarks:</label>
                                        <input type="text" class="form-control" name="remark" required>
                                    </div>
                                </div>
                                <div class="col-md-12 text-center">
                                <button class="btn btn-primary btn-lg btn-center" type="submit">SUBMIT</button>
                                </div>
                            </form>
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
    <script src="js/popper.min.js"></script>
</html>
