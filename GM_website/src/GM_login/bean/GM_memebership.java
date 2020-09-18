package GM_login.bean;

import java.util.Date;

public class GM_memebership {

	
	private  String fname;
	private  String lname;
	private  String address;
	private  String dob;
	private  String email;
	private String conatct;
	private  String password;
	private String date;
	public GM_memebership() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GM_memebership(String fname, String lname, String address, String dob, String email, String conatct, String password, String date) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.conatct = conatct;
		this.password=password;
		this.date=date;
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConatct() {
		return conatct;
	}
	public void setConatct(String conatct) {
		this.conatct = conatct;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "GM_memebership [fname=" + fname + ", lname=" + lname + ", address=" + address + ", dob=" + dob
				+ ", email=" + email + ", conatct=" + conatct + ", password=" + password + ", date=" + date + "]";
	}
	
}
