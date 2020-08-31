  $(function(){
      $(".DOB_error").hide();
      $(".nationality_error").hide();
      $(".category_error").hide();
      $(".year_error").hide();
      $(".blood_group").hide();
      $(".caste_error").hide();
      $(".religion_error").hide();
      $(".birth_place_error").hide();
      $(".p_state_error").hide();
      $(".p_city_error").hide();
      $(".p_pin_error").hide();
      $(".p_hometown_error").hide();
      $(".per_state_error").hide();
      $(".per_city_error").hide();
      $(".per_pin_error").hide();
      $(".per_hometown_error").hide();
      $(".adhaar_error").hide();
      $(".p_fname_error").hide();
      $(".p_mname_error").hide();
      $(".p_sname_error").hide();
      $(".mother_name_error").hide();
      $(".p_mobile_error").hide();
      $(".g_fname_error").hide();
      $(".g_mname_error").hide();
      $(".g_lname_error").hide();
      $(".gmobile_error").hide();
      $(".relation_error").hide();
      $(".g_state_error").hide();
      $(".g_city_error").hide();
      $(".g_pin_error").hide();
      $(".g_hometown_error").hide();
      $(".admission_error").hide();

        var DOB_error  = false;
        var nationality_error = false;
        var category_error = false;
	var year_error = false;
        var blood_group_error = false;
        var caste_error = false; 
        var religion_error = false;
        var birth_place_error = false; 
        var p_state_error = false; 
        var p_city_error = false; 
        var p_pin_error = false; 
        var p_hometown_error = false; 
        var per_state_error = false; 
        var per_city_error = false; 
        var per_pin_error = false; 
        var per_hometown_error = false;
        var adhaar_error = false; 
        var p_fname_error = false;
        var p_mname_error = false;
        var p_sname_error = false;
        var mother_name_error = false;
        var p_mobile_error = false;
        var g_fname_error = false;
        var g_mname_error = false;
        var g_lname_error = false;
        var gmobile_error = false;
        var relation_error = false;
        var g_state_error = false;
        var g_city_error = false;
        var g_pin_error = false;
        var g_hometown_error = false;
        var admission_error = false;
        function checkDOB(){
            var DOB = $("#DOB").val();
            if(DOB===""){
                $(".DOB_error").html("<p class='text-danger'>This field is required</p>");
                $(".DOB_error").show();
                DOB_error = true;
            }
            else{
                $(".DOB_error").hide();
            }
        }
	$("#DOB").focusout(function(){
            checkDOB();
        });
        function checkNationality(){
           var nationality = $("#nationality").val();
           if(nationality===""){
               $(".nationality_error").html("<p class='text-danger'>This field is required</p>");
                $(".nationality_error").show();
                nationality_error = true;
           }
           else{
               $(".nationality_error").hide();
           }
        }
        $("#nationality").change(function(){
            checkNationality();
        });
        function checkCategory(){
           var category = $("#category").val();
           if(category===""){
               $(".category_error").html("<p class='text-danger'>This field is required</p>");
                $(".category_error").show();
                category_error = true;
           }
           else{
               $(".category_error").hide();
           }
        }
        $("#category").change(function(){
            checkCategory();
        });
        function checkYear(){
           var year = $("#year").val();
           if(year===""){
               $(".year_error").html("<p class='text-danger'>This field is required</p>");
                $(".year_error").show();
                year_error = true;
           }
           else{
               $(".year_error").hide();
           }
        }
        $("#year").change(function(){
            checkYear();
        });
        function checkblood_group(){
           var blood_group = $("#blood_group").val();
           if(blood_group===""){
               $(".blood_group_error").html("<p class='text-danger'>This field is required</p>");
                $(".blood_group_error").show();
                blood_group_error = true;
           }
           else{
               $(".blood_group_error").hide();
           }
        }
        $("#blood_group").change(function(){
            checkblood_group();
        });
        function checkp_state(){
           var p_state = $("#p_state").val();
           if(p_state===""){
               $(".p_state_error").html("<p class='text-danger'>This field is required</p>");
                $(".p_state_error").show();
                p_state_error = true;
           }
           else{
               $(".p_state_error").hide();
           }
        }
        $("#p_state").change(function(){
            checkp_state();
        });
        function checkp_city(){
           var p_city = $("#p_city").val();
           if(p_city===""){
               $(".p_city_error").html("<p class='text-danger'>This field is required</p>");
                $(".p_city_error").show();
                p_city_error = true;
           }
           else{
               $(".p_city_error").hide();
           }
        }
        $("#p_city").change(function(){
            checkp_city();
        });
        function checkper_state(){
           var per_state = $("#per_state").val();
           if(per_state===""){
               $(".per_state_error").html("<p class='text-danger'>This field is required</p>");
                $(".per_state_error").show();
                per_state_error = true;
           }
           else{
               $(".per_state_error").hide();
           }
        }
        $("#per_state").change(function(){
            checkper_state();
        });
        function checkper_city(){
           var per_city = $("#per_city").val();
           if(per_city===""){
               $(".per_city_error").html("<p class='text-danger'>This field is required</p>");
                $(".per_city_error").show();
                per_city_error = true;
           }
           else{
               $(".per_city_error").hide();
           }
        }
        $("#per_city").change(function(){
            checkper_city();
        });
        function checkg_state(){
           var g_state = $("#g_state").val();
           if(g_state===""){
               $(".g_state_error").html("<p class='text-danger'>This field is required</p>");
                $(".g_state_error").show();
                g_state_error = true;
           }
           else{
               $(".g_state_error").hide();
           }
        }
        $("#g_state").change(function(){
            checkg_state();
        });
        function checkcaste(){
           var caste = $("#caste").val();
           if(caste===""){
               $(".caste_error").html("<p class='text-danger'>This field is required</p>");
                $(".caste_error").show();
                caste_error = true;
           }
           else{
               $(".caste_error").hide();
           }
        }
        $("#caste").focusout(function(){
            checkcaste();
        });
        function checkreligion(){
           var religion = $("#religion").val();
           if(religion===""){
               $(".religion_error").html("<p class='text-danger'>This field is required</p>");
                $(".religion_error").show();
                religion_error = true;
           }
           else{
               $(".religion_error").hide();
           }
        }
        $("#religion").focusout(function(){
            checkreligion();
        });
        function checkbirth_place(){
           var birth_place = $("#birth_place").val();
           if(birth_place===""){
               $(".birth_place_error").html("<p class='text-danger'>This field is required</p>");
                $(".birth_place_error").show();
                birth_place_error = true;
           }
           else{
               $(".birth_place_error").hide();
           }
        }
        $("#birth_place").focusout(function(){
            checkbirth_place();
        });
        function checkp_pin(){
           var p_pin = $("#p_pin").val();
           if(p_pin===""){
               $(".p_pin_error").html("<p class='text-danger'>This field is required</p>");
                $(".p_pin_error").show();
                p_pin_error = true;
           }
           else{
               $(".p_pin_error").hide();
           }
        }
        $("#p_pin").focusout(function(){
            checkp_pin();
        });
        function checkp_hometown(){
           var p_hometown = $("#p_hometown").val();
           if(p_hometown===""){
               $(".p_hometown_error").html("<p class='text-danger'>This field is required</p>");
                $(".p_hometown_error").show();
                p_hometown_error = true;
           }
           else{
               $(".p_hometown_error").hide();
           }
        }
        $("#p_hometown").focusout(function(){
            checkp_hometown();
        });
        function checkper_hometown(){
           var per_hometown = $("#per_hometown").val();
           if(per_hometown===""){
               $(".per_hometown_error").html("<p class='text-danger'>This field is required</p>");
                $(".per_hometown_error").show();
                per_hometown_error = true;
           }
           else{
               $(".per_hometown_error").hide();
           }
        }
        $("#per_hometown").focusout(function(){
            checkper_hometown();
        });
        function checkper_pin(){
           var per_pin = $("#per_pin").val();
           if(per_pin===""){
               $(".per_pin_error").html("<p class='text-danger'>This field is required</p>");
                $(".per_pin_error").show();
                per_pin_error = true;
           }
           else{
               $(".per_pin_error").hide();
           }
        }
        $("#per_pin").focusout(function(){
            checkper_pin();
        });
        function checkadhaar(){
           var adhaar = $("#adhaar").val();
           if(adhaar===""){
               $(".adhaar_error").html("<p class='text-danger'>This field is required</p>");
                $(".adhaar_error").show();
                adhaar_error = true;
           }
           else{
               $(".adhaar_error").hide();
           }
        }
        $("#adhaar").focusout(function(){
            checkadhaar();
        });
        function checkp_fname(){
           var p_fname = $("#p_fname").val();
           if(p_fname===""){
               $(".p_fname_error").html("<p class='text-danger'>This field is required</p>");
                $(".p_fname_error").show();
                p_fname_error = true;
           }
           else{
               $(".p_fname_error").hide();
           }
        }
        $("#p_fname").focusout(function(){
            checkp_fname();
        });
        function checkp_mname(){
           var p_mname = $("#p_mname").val();
           if(p_mname===""){
               $(".p_mname_error").html("<p class='text-danger'>This field is required</p>");
                $(".p_mname_error").show();
                p_fname_error = true;
           }
           else{
               $(".p_mname_error").hide();
           }
        }
        $("#p_mname").focusout(function(){
            checkp_mname();
        });
        function checkp_sname(){
           var p_sname = $("#p_sname").val();
           if(p_sname===""){
               $(".p_sname_error").html("<p class='text-danger'>This field is required</p>");
                $(".p_sname_error").show();
                p_sname_error = true;
           }
           else{
               $(".p_sname_error").hide();
           }
        }
        $("#p_sname").focusout(function(){
            checkp_sname();
        });
        function checkmother_name(){
           var mother_name = $("#mother_name").val();
           if(mother_name===""){
               $(".mother_name_error").html("<p class='text-danger'>This field is required</p>");
                $(".mother_name_error").show();
                mother_name_error = true;
           }
           else{
               $(".mother_name_error").hide();
           }
        }
        $("#mother_name").focusout(function(){
            checkmother_name();
        });
        function checkp_mobile(){
           var p_mobile = $("#p_mobile").val();
           var filter = /^[0-9-+]+$/;
           if(filter.test(p_mobile)){
               $(".p_mobile_error").hide();
           }
           else{
               $(".p_mobile_error").html("<p class='text-danger'>This field is required</p>");
               $(".p_mobile_error").show();
               p_mobile_error = true;
           }
        }
        $("#p_mobile").focusout(function(){
            checkp_mobile();
        });
        function checkg_fname(){
           var g_fname = $("#g_fname").val();
           if(g_fname===""){
               $(".g_fname_error").html("<p class='text-danger'>This field is required</p>");
                $(".g_fname_error").show();
                g_fname_error = true;
           }
           else{
               $(".g_fname_error").hide();
           }
        }
        $("#g_fname").focusout(function(){
            checkg_fname();
        });
        function checkg_mname(){
           var g_mname = $("#g_mname").val();
           if(g_mname===""){
               $(".g_mname_error").html("<p class='text-danger'>This field is required</p>");
                $(".g_mname_error").show();
                g_mname_error = true;
           }
           else{
               $(".g_mname_error").hide();
           }
        }
        $("#g_mname").focusout(function(){
            checkg_mname();
        });
        function checkg_lname(){
           var g_lname = $("#g_lname").val();
           if(g_lname===""){
               $(".g_lname_error").html("<p class='text-danger'>This field is required</p>");
                $(".g_lname_error").show();
                g_mname_error = true;
           }
           else{
               $(".g_lname_error").hide();
           }
        }
        $("#g_lname").focusout(function(){
            checkg_lname();
        });
        function checkgmobile(){
           var gmobile = $("#gmobile").val();
           var filter = /^[0-9-+]+$/;
           if(filter.test(gmobile)){
               $(".gmobile_error").hide();
           }
           else{
               $(".gmobile_error").html("<p class='text-danger'>This field is required</p>");
               $(".gmobile_error").show();
               p_mobile_error = true;
           }
        }
        $("#gmobile").focusout(function(){
            checkgmobile();
        });
        function checkrelation(){
           var relation = $("#relation").val();
           if(relation===""){
               $(".relation_error").html("<p class='text-danger'>This field is required</p>");
                $(".relation_error").show();
                relation_error = true;
           }
           else{
               $(".relation_error").hide();
           }
        }
        $("#relation").focusout(function(){
            checkrelation();
        });
        function checkg_pin(){
           var g_pin = $("#g_pin").val();
           if(g_pin===""){
               $(".g_pin_error").html("<p class='text-danger'>This field is required</p>");
                $(".g_pin_error").show();
                g_pin_error = true;
           }
           else{
               $(".g_pin_error").hide();
           }
        }
        $("#g_pin").focusout(function(){
            checkg_pin();
        });
        function checkg_hometown(){
           var g_hometown = $("#g_hometown").val();
           if(g_hometown===""){
               $(".g_hometown_error").html("<p class='text-danger'>This field is required</p>");
                $(".g_hometown_error").show();
                g_hometown_error = true;
           }
           else{
               $(".g_hometown_error").hide();
           }
        }
        $("#g_hometown").focusout(function(){
            checkg_hometown();
        });
        $("#msform").submit(function(){
           DOB_error  = false;
           nationality_error = false;
           category_error = false;
	   year_error = false;
           blood_group_error = false;
           caste_error = false; 
           religion_error = false;
           Birthplace_error = false; 
           p_state_error = false; 
           p_city_error = false; 
           p_pin_error = false; 
           p_hometown_error = false; 
           per_state_error = false; 
           per_city_error = false; 
           per_pin_error = false; 
           per_hometown_error = false;
           adhaar_error = false; 
           p_fname_error = false;
           p_mname_error = false;
           p_sname_error = false; 
           mother_name_error = false;
           p_mobile_error = false;
           g_fname_error = false;
           g_mname_error = false;
           g_lname_error = false;
           gmobile_error = false;
           relation_error = false;
           g_state_error = false;
           g_city_error = false;
           g_pin_error = false;
           g_hometown_error = false;
           admission_error = false;
           
           checkDOB();
           checkNationality();
           checkCategory(); 
           checkYear();     
           checkblood_group();
           checkp_state();  
           checkp_city();   
           checkper_state();
           checkper_city(); 
           checkg_state();  
           checkcaste();    
           checkreligion(); 
           checkbirth_place();
           checkp_pin();    
           checkp_hometown();
           checkper_hometown();
           checkper_pin();  
           checkadhaar();   
           checkp_fname();  
           checkp_mname();  
           checkp_sname();  
           checkmother_name();
           checkp_mobile(); 
           checkg_fname();  
           checkg_mname();  
           checkg_lname();  
           checkgmobile();  
           checkrelation(); 
           checkg_pin(); 
           checkg_hometown();
           
           if(DOB_error == false && nationality_error == false && 
                   category_error == false && year_error == false && 
                   blood_group_error == false && caste_error == false && 
                   religion_error == false && birth_place_error == false && 
                   p_state_error == false && p_city_error == false && 
                   p_pin_error == false && p_hometown_error == false && 
                   per_state_error == false && per_city_error == false && 
                   per_pin_error == false && per_hometown_error == false && 
                   adhaar_error == false && p_fname_error == false && p_mname_error == false && 
                   p_sname_error == false && mother_name_error == false && p_mobile_error == false && 
                   g_fname_error == false && g_mname_error == false && g_lname_error == false && 
                   gmobile_error == false && relation_error == false && g_state_error == false && 
                   g_city_error == false && g_pin_error == false && g_hometown_error == false && admission_error == false)
           {
               if(confirm("All details are correct..?")){
                  return true;     
               }
               else{
                   return false;
               }   
           }
           else{
               alert("Something is remaining to fill!!!Please check");
               return false;
           }
        });
});