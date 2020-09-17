function validation() 
{
	var fname=document.getElementById("fname").value;
	var lname=document.getElementById("lname").value;
	var address=document.getElementById("address").value;
	var emailid=document.getElementById("emailid").value;
	var contact=document.getElementById("contact").value;
	var password=document.getElementById("password").value;

	if(fname.trim()==="")
	{
		document.getElementById("fnamespan").innerHTML="** Please Enter the User Name!!!";
		return false;
	}
	else if(!isNaN(fname))
	{
		document.getElementById("fnamespan").innerHTML="** Please Enter the valid first name!!!";
		return false;
	}
	else  if(lname.trim()==="")
	{
		document.getElementById("lnamespan").innerHTML="** Please Enter the  valid Last Name!!!";
		return false;
	}
	else if(!isNaN(lname))
	{
		document.getElementById("lnamespan").innerHTML="** Please Enter the valid last  name!!!";
		return false;
	}
	else  if(address.trim()==="")
	{
		document.getElementById("addresspan").innerHTML="** Please Enter the Address!!!";
		return false;
	}
	else if(!isNaN(address))
	{
		document.getElementById("addresspan").innerHTML="** Please Enter the valid Address!!!";
		return false;
	}
	else if(emaild.trim==="")
	{
		document.getElementById("emailspan").innerHTML="please Enter valid  email id "
			return false;
	}
	else if(emailid.startsWith("@",0))
	{
		document.getElementById("emailspan").innerHTML="please Enter valid  email id "
			return false;
	}
	else if(emaild.length-4!='.')
	{
		document.getElementById("emailspan").innerHTML="please Enter valid  email id "
			return false;
	}
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
	else if(password.trim()==="")
	{
		document.getElementById("password").innerHTML=" please enter valid password "
			return false;
	}

	else
	{
		return true;
	}

}

