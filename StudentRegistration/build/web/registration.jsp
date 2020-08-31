
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="connect.jsp" %>
<!DOCTYPE html>
<%
    try{
    session = request.getSession(false);
    String id = session.getAttribute("st_id").toString();
    if(id.equals("")){
        response.sendRedirect("index.jsp");
    }
    else{ 
    String check = "select * from students where sid="+id;
    pst = connection.prepareStatement(check);
    rs = pst.executeQuery();
    if(rs.next()){
       %>
       <%@include file="boost.jsp" %>
       <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2">
      <a class="navbar-brand ml-3" href="#"><img src="pic/dpcoe.jpg" height="60" width="60" class="img-rounded" alt="dpcoe"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
              <a href="student_home.jsp">  <button type="button" class="btn btn-info m-2 fa fa-home"> Home</button> </a>
            
          </li>
          <li class="nav-item">
              <a href="registration.jsp">  <button type="button" class="btn btn-info m-2 fa fa-id-card-o active"> Registration</button> </a>
          </li>
          <li class="nav-item">
              <a href="requestForm.jsp"><button type="button" class="btn btn-info m-2 fa fa-download"> Download</button></a>          
          
          
        </ul>
          <a href="/StudentRegistration/logout"><button type="button" class="btn btn-danger float-right fa fa-sign-out"> Logout</button></a>
      </div>
    </nav>
       <div class="" style="margin-top: 7%;">
    <h1 class="text-success">You already filled form..</h1>
        <p class="text-info">Please wait or complete next process..</p>
    </div>
<%
    } else {
%>
<html lang="en" >
    <head>
        <meta charset="UTF-8">
        <title>Registration</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/jquery-ui.css">
        <link rel='stylesheet prefetch' href='css/boot.3.3.min.css'>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <form id="msform" action="/StudentRegistration/RegistrationStudent" method="post" class="form-register" role="form">
                    <!-- progressbar -->
                    <ul id="progressbar">
                        <li class="active">Personal Details</li>
                        <li>Contact Detail</li>
                        <li>Parents Detail</li>
                        <li>Guardian Detail</li>
                        <li>Academic Detail</li>
                    </ul>
                    <!-- fieldsets -->
                    <fieldset>
                        <h2 class="fs-title">Personal Details</h2>
                        <h3 class="fs-subtitle"> <span class='text-danger'>*</span> Fields are mandatory...</h3>
                        <h3 class="fs-subtitle">Please fill all details correctly..</h3>
                        <%
                            
                            String f="",m="",l="",gender="",email="",mobile="",branch="";
                           String sql_name = "select * from student_login where id='"+id+"'";
                               try {
                                   pst = connection.prepareStatement(sql_name);
                                    rs = pst.executeQuery();
                                   while (rs.next()) {
                                        f = rs.getString("fname");
                                        m = rs.getString("mname");
                                        l = rs.getString("lname");
                                        gender = rs.getString("gender");
                                        email = rs.getString("email");
                                        mobile = rs.getString("mobile");
                                        branch = rs.getString("branch");
                                   }
                               } catch (Exception e) {

                               }
                        %>
                        <input type="text" name="branch" value="<%=branch%>" hidden>
                        <input type="text" name="name" value="<%=f%>&nbsp;<%=m%>&nbsp;<%=l%>" readonly>
                        <div>
                        <label for="DOB">Enter Birth Date<span class='text-danger'>*</span>:-</lable>    
                        <input type="text" name="DOB" id="DOB"/>
                        <span class="DOB_error"></span>
                        </div>
                        <hr class="row">
                        <div>
                            <label for="nationality">Nationality<span class='text-danger'>*</span>:-</label>
                            <select class="form-control" id="nationality" name="nationality">
                                <option value="">Select Nationality</option>
                                <option value="Indian">Indian</option>
                                <option value="Other">Other</option>
                            </select>
                            <span class="nationality_error"></span>
                        </div>
                        <div>
                            <label for="category">Category<span class='text-danger'>*</span>:-</label>
                            <select class="form-control" id="category" name="category">
                                <option value="">Select Category</option>
                                <%
                                String sql = "select * from master_category";
                                try {
                                        pst = connection.prepareStatement(sql);
                                         rs = pst.executeQuery();
                                        while(rs.next()) {
                                            out.print("<option value='"+rs.getString("cat_name")+"'>"+rs.getString("cat_name")+"</option>");
                                        }
                                    } catch (Exception e) {

                                    }
                                %>
                            </select>
                            <span class="category_error"></span>
                        </div>
                        <div>
                            <label for="year">Year<span class='text-danger'>*</span>:-</label>
                            <select class="form-control" id="year" name="year">
                                <option value="">Select Year</option>
                                <%
                                String sql2 = "select * from master_year";
                                try {
                                        pst = connection.prepareStatement(sql2);
                                         rs = pst.executeQuery();
                                        while(rs.next()) {
                                            out.print("<option value='"+rs.getString("year")+"'>"+rs.getString("year")+"</option>");
                                        }
                                    } catch (Exception e) {

                                    }
                                %>
                            </select>
                            <span class="year_error"></span>
                        </div>
                        <div>
                            <label for="blood_group">Blood Group<span class='text-danger'>*</span>:-</label>
                            <select class="form-control" id="blood_group" name="blood_group">
                                <option value="">Blood Group</option>
                                <option value="O+">O+</option>
                                <option value="O-">O-</option>
                                <option value="AB+">AB+</option>
                                <option value="AB-">AB-</option>
                                <option value="B+">B+</option>
                                <option value="B-">B-</option>
                                <option value="A+">A+</option>
                                <option value="A-">A-</option>
                            </select>
                            <span class="blood_group_error"></span>
                        </div>
                        <div>
                            <label for="caste_lable">Caste<span class='text-danger'>*</span>:-</label>
                            <div id="caste_lable">
                                <input type="text" id="caste" name="caste">
                            </div>
                            <span class="caste_error"></span>
                        </div>
                        <div>
                            <label for="religion_lable">Religion<span class='text-danger'>*</span>:-</label>
                            <div id="religion_lable">
                                <input type="text" id="religion" name="religion">
                            </div>
                            <span class="religion_error"></span>
                        </div><br/>
                        
                        <label for="gender_lable">Gender<span class='text-danger'>*</span>:-</label>
                        <div class="form-group" id="gender_lable">
                            <input type="text" name="stu_gender" value="<%=gender%>" readonly/>
                        </div>
                        <lable for="birthplace_lable">Birthplace<span class='text-danger'>*</span>:-</lable>
                        <div id="birthplace_lable">
                            <input type="text" id="birth_place" name="birth_place">
                            <span class="birth_place_error"></span>
                        </div>
                        <br/>
                        <input type="button" name="next" id="p_next" class="next action-button" value="Next"/>
                    </fieldset>
                    <fieldset>
                        <h2 class="fs-title">Contact Detail</h2>
                        <h3 class="fs-subtitle"> <span class='text-danger'>*</span> Fields are mandatory...</h3>
                        <input type="email" name="email" value="<%=email%>" readonly>
                        <input type="text" name="mobile" value="<%=mobile%>" readonly>
                         <div class="form-group"><br/>
                        <label for="address"><b>Present Address</b></label>
                        <div id="address">
                        <div style="display:inline-block">
                            <label for="state_lable">State<span class='text-danger'>*</span>:-</label>
                            <div id="state_lable">
                                <select class="form-control" id="p_state" name="p_state">
                                    <option value="">Select State</option>
                                    <%
                                        String sql1 = "select * from master_state";
                                        try {
                                            pst = connection.prepareStatement(sql1);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getString("state") + "'>" + rs.getString("state") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    %>
                                </select>
                                <span class="p_state_error"></span>
                            </div>
                        </div>
                        <div>
                            <label for="city_lable">City<span class='text-danger'>*</span>:-</label>
                            <div id="city_lable">
                                <select class="form-control" id="p_city" name="p_city">
                                    <option value="">Select City</option>
                                    
                                </select>
                                <span class="p_city_error"></span>
                            </div>
                        </div>
                        <div>
                            <label for="city_lable">Pin Code<span class='text-danger'>*</span>:-</label>
                            <div id="city_lable">
                                <input type="text" id="p_pin" name="p_pin" maxlength="6">
                                <span class="p_pin_error"></span>
                            </div>
                        </div>
                            <label for="hometown">Hometown<span class='text-danger'>*</span>:-</label>
                            <div id="hometown">
                                <input type="text" id="p_hometown" name="p_hometown">
                                <span class="p_hometown_error"></span>
                            </div>
                        </div>    
                        </div>
                        <div class="form-group"><br/>
                        <label for="permnant_address"><b>Permnent Address</b></label>
                        <div id="permnant_address">
                        <div>
                            <label for="state_lable">State<span class='text-danger'>*</span>:-</label>
                            <div id="state_lable">
                                <select class="form-control" id="per_state" name="per_state">
                                    <option value="">Select State</option>
                                    <%
                                        try {
                                            pst = connection.prepareStatement(sql1);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getString("state") + "'>" + rs.getString("state") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    %>
                                </select>
                                <span class="per_state_error"></span>
                            </div>
                        </div>
                        <div>
                            <label for="city_lable">City<span class='text-danger'>*</span>:-</label>
                            <div id="city_lable">
                                <select class="form-control" id="per_city" name="per_city">
                                    <option value="">Select City</option>
                                </select>
                                <span class="per_city_error"></span>
                            </div>
                        </div>
                        <div>
                            <label for="city_lable">Pin Code<span class='text-danger'>*</span>:-</label>
                            <div id="city_lable">
                                <input type="text" id="per_pin" name="per_pin" maxlength="6">
                                <span class="per_pin_error"></span>
                            </div>
                        </div>
                            <label for="hometown">Hometown<span class='text-danger'>*</span>:-</label>
                            <div id="hometown">
                                <input type="text" id="per_hometown" name="per_hometown">
                                <span class="per_hometown_error"></span>
                            </div>
                        </div>    
                        </div>
                        <label for="adhaar_lable">Adhaar No<span class='text-danger'>*</span>:</label>
                        <div class="form-group" id="adhaar_lable">
                            <input type="text" data-type="adhaar-number" name="adhaar" id="adhaar" maxLength="14">
                            <span class="adhaar_error"></span>
                        </div>
                        <label for="pan_lable">Pan No:</label>
                        <div class="form-group" id="pan_lable">
                            <input type="text" name="pan" id="pan" >
                        </div>
                        <input type="button" name="previous" class="previous action-button-previous" value="Previous"/>
                        <input type="button" name="next" class="next action-button" id="c_next" value="Next"/>
                    </fieldset>
                    <fieldset>
                        <h2 class="fs-title">Parents Detail</h2>
                        <h3 class="fs-subtitle"> <span class='text-danger'>*</span> fields are mandatory...</h3>
                        <div class="form-group">
                            <label for="fname_lable">First Name<span class='text-danger'>*</span>:-</label>
                            <div id="fname_lable">
                                <input type="text" name="p_fname" id="p_fname">
                                <span class="p_fname_error"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="mname_lable">Middle Name<span class='text-danger'>*</span>:-</label>
                            <div id="mname_lable">
                                <input type="text" id="p_mname" name="p_mname">
                                <span class="p_mname_error"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lname_lable">Surname<span class='text-danger'>*</span>:-</label>
                            <div id="lname_lable">
                                <input type="text" id="p_sname" name="p_sname">
                                <span class="p_sname_error"></span>
                            </div>
                        </div>
                        <input type="text" name="mother_name" id="mother_name" placeholder="Enter Your Mother Name"/>
                        <label for="pmobile_lable">Mobile No<span class='text-danger'>*</span>:-</label>
                        <div id="pmobile_lable">
                            <input type="text" id="p_mobile" name="p_mobile" maxlength="10">
                            <span class="p_mobile_error"></span>
                        </div>
                        <label for="pemail_lable">Email Id:-</label>
                        <div id="pemail_lable">
                            <input type="text" id="p_email" name="p_email">
                            <span class="p_email_error"></span>
                        </div>
                        <label for="edu_lable">Education:-</label>
                        <div id="edu_lable">
                            <input type="text" name="p_edu"/>
                        </div>
                        <div class="form-group">
                            <label for="poccu_lable">Occupation:-</label>
                            <div id="poccu_lable">
                                <input type="text" name="p_occu">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="pdesig_lable">Designation:-</label>
                            <div id="pdesig_lable">
                                <input type="text" name="p_desig">
                            </div>
                        </div>
                        <input type="button" name="previous" class="previous action-button-previous" value="Previous"/>
                        <input type="button" name="next" class="next action-button" value="Next"/>
                    </fieldset>
                    <fieldset>
                        <h2 class="fs-title">Guardian Detail</h2>
                        <h3 class="fs-subtitle">If guardian is not then enter parent details..</h3>
                        <div class="form-group">
                            <label for="gfname_lable">First Name<span class='text-danger'>*</span>:-</label>
                            <div id="gfname_lable">
                                <input type="text" id="g_fname" name="g_fname">
                                <span class="g_fname_error"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="gmname_lable">Middle Name<span class='text-danger'>*</span>:-</label>
                            <div id="gmname_lable">
                                <input type="text" id="g_mname" name="g_mname">
                                <span class="g_mname_error"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="glname_lable">Surname<span class='text-danger'>*</span>:-</label>
                            <div id="glname_lable">
                                <input type="text" id="g_lname" name="g_lname">
                                <span class="g_lname_error"></span>
                            </div>
                        </div>
                        <label for="gmobile_lable">Mobile No<span class='text-danger'>*</span>:</label>
                        <div id="gmobile_lable">
                            <input type="text" id="gmobile" name="gmobile" maxlength="10">
                            <span class="gmobile_error"></span>
                        </div>
                        <label for="grelation_lable">Relation with Guardian<span class='text-danger'>*</span>:-</label>
                        <div id="grelation_lable">
                            <input type="text" id="relation" name="relation"/>
                            <span class="relation_error"></span>
                        </div>
                        <div class="form-group"><br/>
                        <label for="permnant_address"><b>Address<span class='text-danger'>*</span>:-</b></label>
                        <div id="permnant_address">
                        <div style="display:inline-block">
                            <label for="state_lable">State:-</label>
                            <div id="state_lable">
                                <select class="form-control" id="g_state" name="g_state">
                                    <option value="">Select State</option>
                                    <%
                                        try {
                                            pst = connection.prepareStatement(sql1);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getString("state") + "'>" + rs.getString("state") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    %>
                                </select>
                                <span class="g_state_error"></span>
                            </div>
                        </div>
                        <div>
                            <label for="city_lable">City:-</label>
                            <div id="city_lable">
                                <select class="form-control" id="g_city" name="g_city">
                                    <option value="">Select City</option>
                                </select>
                                <span class="g_city_error"></span>
                            </div>
                        </div>
                        <div>
                            <label for="city_lable">Pin Code:-</label>
                            <div id="city_lable">
                                <input type="text" id="g_pin" name="g_pin" maxlength="6">
                                <span class="g_pin_error"></span>
                            </div>
                        </div>
                            <label for="hometown">Hometown:-</label>
                            <div id="hometown">
                                <input type="text" id="g_hometown" name="g_hometown">
                                <span class="g_hometown_error"></span>
                            </div>
                        </div>
                        </div>
                        <input type="button" name="previous" class="previous action-button-previous" value="Previous"/>
                        <input type="button" name="next" class="next action-button" value="Next"/>
                    </fieldset>
                    <fieldset>
                        <h2 class="fs-title">Academic Detail</h2>
                        <h3 class="fs-subtitle">Enter Academic Detail</h3>
                        <div class="form-group" style="display:inline-block;width: 10%;">
                            <label for="exam_lable">Exam</label>
                            <div id="exam_lable">
                                <input type="text" name="fe_exam" value="FE" readonly>
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 32%;margin-left: 2%;">
                            <label for="year_lable">Month & Year</label>
                            <div id="year_lable">
                                <input type="month" name="fe_year">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 12%;margin-left: 2%;">
                            <label for="marks_lable">Marks Obtained</label>
                            <div id="marks_lable">
                                <input type="text" name="fe_marks_obtained">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 12%;margin-left: 2%;">
                            <label for="markst_lable">Marks Total</label>
                            <div id="markst_lable">
                                <input type="text" name="fe_marks_total">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 15%;margin-left: 2%;">
                            <label for="per_lable">Percentage/SGPA/Provisional</label>
                            <div id="per_lable">
                                <input type="text" name="fe_percentage">
                            </div>
                        </div>
                         <div class="form-group" style="display:inline-block;width: 10%;">
                            <div id="exam_lable">
                                <input type="text" name="se_exam" value="SE" readonly>
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 32%;margin-left: 2%;">
                            <div id="year_lable">
                                <input type="month" name="se_year">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 12%;margin-left: 2%;">
                            <div id="marks_lable">
                                <input type="text" name="se_marks_obtained">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 12%;margin-left: 2%;">
                            <div id="markst_lable">
                                <input type="text" name="se_marks_total">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 15%;margin-left: 2%;">
                            <div id="per_lable">
                                <input type="text" name="se_percentage">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 10%;">
                            <div id="exam_lable">
                                <input type="text" name="te_exam" value="TE" readonly>
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 32%;margin-left: 2%;">
                            <div id="year_lable">
                                <input type="month" name="te_year">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 12%;margin-left: 2%;">
                            <div id="marks_lable">
                                <input type="text" name="te_marks_obtained">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 12%;margin-left: 2%;">
                            <div id="markst_lable">
                                <input type="text" name="te_marks_total">
                            </div>
                        </div>
                        <div class="form-group" style="display:inline-block;width: 15%;margin-left: 2%;">
                            <div id="per_lable">
                                <input type="text" name="te_percentage">
                            </div>
                        </div>
                        <br/>
                        <div>
                            <label for="nation">Admission Type<span class='text-danger'>*</span>:-</label>
                            <select class="form-control" id="admission" name="admission">
                                <option value="">Select Admission</option>
                                <option value="CAP">CAP</option>
                                <option value="MANAGEMENT">MANAGEMENT</option>
                                <option value="TFWS">TFWS</option>
                            </select>
                            <span class="admission_error"></span>
                        </div>
                        <input type="button" name="previous" class="previous action-button-previous" value="Previous"/>
                        <input type="submit" name="submit" class="submit action-button" onclick="return check();" value="Submit"/>
                    </fieldset>
                        
                </form>
            </div>
        </div>
        <script src='js/jquey.2.1.min.js'></script>
        <script src="js/jquery-ui.js"></script>
        <script src='js/boot.3.3.min.js'></script>
        <script src='js/jquery.easing.1.3.js'></script>
        <script src="js/register.js"></script>
        <script src="js/index.js"></script>
    </body>
    <style>
        .highlight-error {
             border-color: red;
        }
    </style>
    <script>
        $('[data-type="adhaar-number"]').keyup(function() {
  var value = $(this).val();
  value = value.replace(/\D/g, "").split(/(?:([\d]{4}))/g).filter(s => s.length > 0).join("-");
  $(this).val(value);
});

$('[data-type="adhaar-number"]').on("change, blur", function() {
  var value = $(this).val();
  var maxLength = $(this).attr("maxLength");
  if (value.length != maxLength) {
    $(this).addClass("highlight-error");
  } else {
    $(this).removeClass("highlight-error");
  }
});
$("#p_state").change(function() {
        state = $(this).val();
        console.log(state);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/GetCity",
            data : "state=" + state,
            success : function(data) {
                $("#p_city").html(data);
            }
        });
});  
$("#per_state").change(function() {
        state = $(this).val();
        console.log(state);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/GetCity",
            data : "state=" + state,
            success : function(data) {
                $("#per_city").html(data);
            }
        });
});
$("#g_state").change(function() {
        state = $(this).val();
        console.log(state);
        $.ajax({
            type : "POST",
            url : "/StudentRegistration/GetCity",
            data : "state=" + state,
            success : function(data) {
                $("#g_city").html(data);
            }
        });
});   
$("#p_mobile").keyup(function(){
    var p_mobile = $("#p_mobile").val();
    len = p_mobile.length;
     var characterReg = "/^\d{10}$/";
    if(p_mobile.match(characterReg)){
        
    }
    else {
        console.log("error");
        $(".mobile_error").html("Please enter valid mobile no.");
    }
    if(len==10){
           $(".mobile_error").empty();   
    }
});
  $( function() {
    $( "#DOB" ).datepicker({ dateFormat: 'dd-mm-yy', minDate: -10395
,maxDate: -4745,changeMonth: true,changeYear:true });
  } );
    </script>
</html>
<%
    }
 }
}
catch(Exception e){
    response.sendRedirect("index.jsp");
}
%>
