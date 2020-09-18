    function validation() {
	var fname=document.getElementById("fname").value;
	var email=document.getElementById("emailid").value;
	var contact=document.getElementById("contact").value;
	var subject=document.getElementById("subject").value;

	if(fname.trim()==="")
	{
		document.getElementById("fnamespan").innerHTML="** Please Enter the Full Name!!!";
		return false;
	}
	else if(!isNaN(fname))
	{
		document.getElementById("fnamespan").innerHTML="** Please Enter the valid Full Name!!!";
		return false;
	}
	else if(email.trim()==="")
	{
		document.getElementById("emailspan").innerHTML="** ** Please Enter the Email id  !!!";
		return false;
	}
	else if(email.startsWith("@",0))
	{
		document.getElementById("emailspan").innerHTML="** please Enter valid  email id "
			return false;
	}
	else if(email.length-4!='.')
	{
		document.getElementById("emailspan").innerHTML="** please Enter valid  Email id "
			return false;
	}
	else if(contact.trim()==="")
	{
		document.getElementById("phonespan").innerHTML="** Please Enter the  phone number!!!";
		return false;
	}
	else if(contact.length!=10)
	{
		document.getElementById("phonespan").innerHTML="** Phone length should be 10";
			return false;
	}
	else if(isNaN(contact))
	{
		document.getElementById("phonespan").innerHTML="** Please Enter the valid Phone number!!!";
		return false;
	}
	else  if(subject.trim()==="")
	{
		document.getElementById("subjectspan").innerHTML="** Please Enter the  Subject!!!";
		return false;
	}
	else 
	{
		return true;
	}
}