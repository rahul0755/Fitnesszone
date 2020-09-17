function validation()
{


	var checkbox1=document.getElementsByName("checkbox1");
	var spanquestion1=document.getElementById("spanquestion1");
	var checkbox1CNT=0;
	for(let i=0;i<checkbox1.length;i++)
	{
		if(checkbox1[i].checked==true)
		{
			checkbox1CNT++;
		}
	}

	var radio1=document.getElementsByName("radio1");
	var question2=document.getElementById("question2");


	var radio3=document.getElementsByName("radio3");
	var question3=document.getElementById("question3");

	var textarea4=document.getElementById("textarea4").value;
	var spanquestion4=document.getElementById("spanquestion4");

	var radio6=document.getElementsByName("radio6");
	var question5=document.getElementById("question5");

	var contact=document.getElementsByName("contact");
	var spancontact=document.getElementById("spancontact");

	var name=document.getElementById("name").value;
	var spanname=document.getElementById("spanname");

	var surname=document.getElementById("surname").value;
	var spansurname=document.getElementById("spansurname");

	var phone=document.getElementById("phone").value;
	var spanphone=document.getElementById("spanphone").value;

	var email=document.getElementById("email").value;
	var spanemail=document.getElementById("spanemail").value;

	var address=document.getElementById("address").value;
	var spanaddress=document.getElementById("spanaddress").value;



	if(checkbox1CNT==0)
	{
		spanquestion1.innerHTML="** You have to fill question number 1";
		return false;
	}
	else if(radio1[0].checked==false && radio1[1].checked==false && radio1[2].checked==false && radio1[3].checked==false)
	{
		question2.innerHTML="** You have to fill question number 2";
		return false;
	}
	else if(radio3[0].checked==false && radio3[1].checked==false && radio3[2].checked==false)
	{
		question3.innerHTML="** You have to fill question number 3";
		return false;
	}
	else if(textarea4.trim()==="")
	{
		spanquestion4.innerHTML="** fill textarea";
		return false;
	}
	else if(radio6[0].checked==false && radio6[1].checked==false && radio6[2].checked==false && radio6[3].checked==false && radio6[4].checked==false)
	{
		question5.innerHTML="** You have to fill question number 5";
		return false;
	}
	else if(contact[0].checked==false && contact[1].checked==false && contact[2].checked==false)
	{
		spancontact.innerHTML="** Please tell us how you want to be contacted for your comment";
		return false;
	}
	else if(name.trim()==="")
	{
		spanname.innerHTML="** Please Enter the User Name!!!";
		return false;
	}
	else if(name.length <=3 || name.length >=15 )
	{
		spanname.innerHTML="** Please Enter the valid User Name!!!";
		return false;
	}
	else if(!isNaN(name))
	{
		spanname.innerHTML="** Please Enter the valid first name!!!";
		return false;
	}
	else  if(surname.trim()==="")
	{
		spansurname.innerHTML="** Please Enter the  valid sur Name!!!";
		return false;
	}
	else if(surname.length <=3 || surname.length >=15 )
	{
		spansurname.innerHTML="** Please Enter the valid sur Name!!!";
		return false;
	}
	else if(!isNaN(surname))
	{
		spansurname.innerHTML="** Please Enter the valid sur  name!!!";
		return false;
	}
	else if(phone.length!=10)
	{
		spanphone.innerHTML=" please enter valid mobile number ";
		return false;
	}
	else if(email.trim==="")
	{
		spanemail.innerHTML="**please Enter valid  email id ";
		return false;
	}
	else if(email.startsWith("@",0))
	{
		spanemail.innerHTML="**please Enter valid  email id ";
			return false;
	}
	else if(email.length-4!=".")
	{
		spanemail.innerHTML="** Please Enter the Appropriate Email ID!!!";
        return false;
	}
	else  if(address.trim()==="")
	{
		document.getElementById("spanaddress").innerHTML="* Please Enter the Address!!!";
		return false;
	}
	else if(!isNaN(address))
	{
		document.getElementById("spanaddress").innerHTML="** Please Enter the valid Address!!!";
		return false;
	}
	else
	{
		return true;
	}


}










