function validation() 
{
	var fname=document.getElementById("fname").value;
	var emaild =document.getElementById("emailid").value;
	var contact=document.getElementById("contact").value;


	if(fname.trim()==="")
	{
		document.getElementById("fnamespan").innerHTML="** Please Enter the User Name!!!";
		return false;
	}
	else if(!isNaN(fname))
	{
		document.getElementById("fnamespan").innerHTML="** Please Enter the valid User Name!!!";
		return false;
	}
	else if(emaild.trim==="")
	{
		document.getElementById("emailspan").innerHTML="please Enter valid  email id "
			return false;
	}
	else if(emaild.startsWith("@",0))
	{
		document.getElementById("emailspan").innerHTML="please Enter valid  email id "
			return false;
	}
	/*else if(emaild.length-4!='.')
	{
		document.getElementById("emailspan").innerHTML="please Enter valid  email id "
			return false;
	}*/
	else if(contact.length!=10)
	{
		document.getElementById("contactspan").innerHTML=" please enter valid mobile number "
			return false;
	}
	else if(isNaN(contact))
	{
		document.getElementById("contactspan").innerHTML=" please enter valid password"
			return false;
	}
	else 
	{
		return true;
	}
}