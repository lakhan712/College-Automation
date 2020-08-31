<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "boost.jsp" %>
<%@include file = "connect.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Sign-Up</title>
        
   </head>
    
<body>
    <%@include  file="title.jsp" %>
    <div class="text-center">
     <div class="container mt-5">
      <div class="panel-body">
        <h2 class="shadow-none p-4 mb-4 bg-light">Student Sign-Up</h2>
        <i class="text-danger">If Sign-Up fail then this page will redirect you here and you have to Sign-Up again..</i>
        <i class="text-primary">if Sign-Up success then this page will redirect you to login page..</i>
        <p id="show"> </p>
        
<!--         form start of SignUp-->
        
<form class="form-horizontal" action="/StudentRegistration/Getdata" method="post">
            <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="text"></label>
              <div class="col-sm-5">
                  <input type="text" class="form-control" id="fname" placeholder="Enter First Name" name="fname" > <i id="f_name"> </i>
              </div>
              
            </div>
               <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="text"></label>
              <div class="col-sm-5">
                <input type="text" class="form-control" id="mname" placeholder="Enter Middle Name" name="mname" > <i id="m_name"> </i>
              </div>
                            

            </div>
               <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="text"></label>
              <div class="col-sm-5">
                <input type="text" class="form-control" id="lname" placeholder="Enter Last Name" name="lname" > <i id="l_name"> </i>
              </div>
              
            </div>
               <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="email"></label>
              <div class="col-sm-5">
                  <input type="text" class="form-control" id="email" placeholder="Enter Email-Id" name="email" > <i id="e_mail"></i>
              </div>
            </div>
               <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="text"></label>
              <div class="col-sm-5">
                <input type="number" class="form-control" id="mobile" pattern="^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$" placeholder="Enter Adhaar link Mobile Number" name="mobile" maxlength="10" >
              </div>
              <i id="mobile1"> </i>
            </div>
               <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="text"></label>
              <div class="col-sm-5">
                <input type="text" class="form-control" id="uname" placeholder="Enter User Name" name="uname" >
              </div>
              <p id="check_user"> </p>
            </div>

                <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="pwd"></label>
              <div class="col-sm-5">          
                <input type="password" class="form-control"  id="pwd" placeholder="Enter Password" name="password1" >
              </div>
            </div>
              <div class="form-group" align="center">
              <label class="control-label col-sm-2" for="pwd"></label>
              <div class="col-sm-5">          
                <input type="password" class="form-control"  id="c_pwd" placeholder="Confirm Password" name="password2" >
              </div>
              <i id="pass"> </i>
            </div>

               <div class="form-group" align="center">
              <label for="sel1">Select Your Department:</label>
              <select class="form-control col-sm-3"  id="branch" name="br">
                  <option value="">Select</option>
                  
                
                  <%
                                        String sql1 = "select * from master_branch";
                                        try {
                                            pst = connection.prepareStatement(sql1);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getInt("id") + "'>" + rs.getString("branch_name") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    %>
              </select>
              </div>
              <i id="dep1"> </i>
              <div class="form-group" align="center">
              <label for="sel1">Select Your TG :</label>
              <select class="form-control col-sm-3" id="tg" name="tg">
                  <option value="">Select</option>
                 
              </select>
              <i id="tg1"> </i>
              </div>
              <div class="form-group" >
                   Your Gender:
              <label class="radio-inline">
              <input type="radio" name="radio" value="Male">Male
            </label>
            <label class="radio-inline">
                <input type="radio" name="radio" value="Female">Female
            </label>
            </div>
              <i id="gender1"> </i>
            <div class="form-group" align="center">        
              <div class="col-sm-offset-2 col-sm-10">

                  <button type="submit"  id="signup" class="btn btn-success fa-registered" > SignUp </button>
              </div>


                </div>
          </form>
   
   </div>
</div>
              
<!--              script for ajax request-->

 <footer class="container mt-5 text-center" align="center">
      <p><i class="fa fa-copyright"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>
    </footer>

              <script>
                  
              
        $("#branch").click(function() {
        bid = $(this).val();
        console.log(bid);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/get_tg",
            data : "bid=" + bid,
            success : function(data) {
                $("#tg").html(data);
            }
        });
});  

$("#uname").keyup(function() {
        var uname = $(this).val();
        console.log(uname);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/CheckUsername",
            data : "uname=" + uname,
            success : function(data) {
                console.log(data);
                $("#check_user").html(data);
            }
        });
});

$("#fname").keyup(function() {
        fname = $(this).val();
        console.log(fname);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/validate",
            data : "fname=" + fname,
            success : function(data) {
                $("#f_name").html(data);
            }
        });
});

$("#mname").keyup(function() {
        mname = $(this).val();
        console.log(mname);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/validate1",
            data : "mname=" + mname,
            success : function(data) {
                $("#m_name").html(data);
            }
        });
});


$("#lname").keyup(function() {
        lname = $(this).val();
        console.log(lname);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/validate2",
            data : "lname=" + lname,
            success : function(data) {
                $("#l_name").html(data);
            }
        });
});
//
$("#email").keyup(function() {
        email = $(this).val();
        console.log(email);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/validate3",
            data : "email=" + email,
            success : function(data) {
                $("#e_mail").html(data);
            }
        });
});

$("#mobile").keyup(function() {
        mobile = $(this).val();
        console.log(mobile);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/validate4",
            data : "mobile=" + mobile,
            success : function(data) {
                $("#mobile1").html(data);
            }
        });
});
//
$("#c_pwd").keyup(function() {
        pass2 = $(this).val();
        var pass1 =document.getElementById("pwd").value;
       

        $.ajax({
            type : "POST",
            url : "/StudentRegistration/validate5",
            data : {pass1: pass1, pass2: pass2},
            success : function(data) {
                $("#pass").html(data);
            }
        });
});

                 
              </script>
</div>              
</body>
</html>
