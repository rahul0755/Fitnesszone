package GM_login.bean;


public class GM_contactus {

	private String fname;
	private String email;
	private String phone;
	private String subject;
	private String contact_date;
	
	
	
	public GM_contactus() {
		super();
		// TODO Auto-generated constructor stub
	}



	public GM_contactus(String fname, String email, String phone, String subject, String contact_date) {
		super();
		this.fname = fname;
		this.email = email;
		this.phone = phone;
		this.subject = subject;
		this.contact_date = contact_date;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getContact_date() {
		return contact_date;
	}



	public void setContact_date(String contact_date) {
		this.contact_date = contact_date;
	}



	@Override
	public String toString() {
		return "GM_contactus [fname=" + fname + ", email=" + email + ", phone=" + phone + ", subject=" + subject
				+ ", contact_date=" + contact_date + "]";
	}



	

}
