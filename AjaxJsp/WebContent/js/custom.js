$(document).ready( function(){
	$("#submit").click( function(){
		var fullName=$("#fullName").val();
		
		$.ajax({
			type:"POST",
			url:'AjaxController',
			data:{ fullName: fullName},
			success: function(data){
				$("#result").html(data);
				
			}
		});
			
		 $.post("AjaxController", { fullName:fullName }, function(result){
		    $("#result1").html(result);
		  }); 
		
	});

	$("#accPrePaymentFinalizationDiv").hide();
	$("#buildLockDiv").hide();
	$("#lockButtonDiv").hide();
	
	$("#finalTopupButton").click(function(){
		$("#accPrePaymentFinalizationDiv").show();
		
	});
	$("#finalPostButton").click(function(){
		$("#buildLockDiv").show();
		
	});
	
	$("#finalBuildLockButton").click(function(){
		$("#lockButtonDiv").show();
		
	});
	
	
	
});

