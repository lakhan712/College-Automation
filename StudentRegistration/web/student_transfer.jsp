<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file="connect.jsp" %>
<!DOCTYPE html>
<%
try{
        session = request.getSession(false);
  String bid = session.getAttribute("bid").toString();

 String tg_id = session.getAttribute("tg_id").toString();
if(tg_id.equals("")) {
    response.sendRedirect("tg_login.jsp");
    } else {
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TG :: Transfer Student</title>
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
              <a href="student_transfer.jsp">  <button type="button" class="btn btn-info m-2 fa fa-info-circle active"> Transfer Students</button> </a>
          </li>
        </ul>
          <a href="/StudentRegistration/logout"> <button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button> </a>
      </div>
    </nav>
        
        
         <div class="jumbotron mt-5">
          
        <div class="container">
            
            <p> Transfer Student to another TG..</p>
          </div>
          
      </div>
        
        
        <form class="form-horizontal" action="/StudentRegistration/transfer" method="post">
            <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="text"></label>
              
            </div>
            
               <div class="form-group" align="center">
              <label for="sel1">Select Student:</label>
              <select class="form-control col-sm-3"  id="student" name="std_id">
                  <option value="">Select</option>
                <%
                                        String sql7 = "select * from student_login where tg_id='"+tg_id+"' and allow='1'";
                                        try {
                                            pst = connection.prepareStatement(sql7);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getInt("id") + "'>" + rs.getString("fname")  +" "+ rs.getString("mname") + " " + rs.getString("lname") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    %>
              </select>
              </div>

                  <div class="form-group" align="center">
              <label for="sel1">Select TG:</label>
              <select class="form-control col-sm-3"  id="student" name="tg_id">
                  <option value="">Select</option>
                <%
                    
                                 
                                        String sql8 = "select * from  master_tg where bid='"+bid+"'";
                                        try {
                                            pst = connection.prepareStatement(sql8);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getInt("id") + "'>" + rs.getString("name") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    %>
              </select>
              </div>
          
            <div class="form-group" align="center">        
              <div class="col-sm-offset-2 col-sm-10">

                 <button type="submit" id="transefer" class="btn btn-success fa-registered"> Transfer</button> 
              </div>


                </div>
          </form>
        
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