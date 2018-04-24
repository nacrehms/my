/**
 * 
 * Getting all country , state , city...by banti
 */
 
 



 $("document").ready(function(){
	 
	 

 	$.get("getCountryList" , function(country){
 		var option="<option value=''>Select Country</option>";
 		$.each(country , function(key , value){
 		option+="<option value='"+value.countryId+"'>"+value.countryName+"</option>";
 		});
 	$("#country").append(option);
 		
 });

 	
 	$("#country").change(function(){
 	   
 	    var countryId=$("#country").val();
 	  
 		$.get("getAllStateListAction?countryId="+countryId, function(state){
 			
 			var option1="<option value=''>Select state</option>";
 		
 			$.each(JSON.parse(state) , function(key , value){
 				
 				
 				option1+="<option value="+value.stateId+">"+value.stateName+"</option>";
 				});
 			$("#state").append(option1);
 		});
 		
 		
 		
 		$("#state").change(function(){
 			   
 		    var stateId=$("#state").val();
 		
 			$.get("getAllCityListAction?stateId="+stateId, function(city){
 			
 				var option2="<option value=''>Select city</option>";
 			
 				$.each(JSON.parse(city) , function(key , value){
 					
 				
 					option2+="<option value="+value.cityId+">"+value.cityName+"</option>";
 					});
 				$("#city").append(option2);
 			});
 		
 		
 	});

 	});
 });

 