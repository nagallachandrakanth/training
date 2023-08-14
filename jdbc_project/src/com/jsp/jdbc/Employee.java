package com.jsp.jdbc;

public class Employee {

	private Integer slno;
	private String name;
	private String email;
	private String phonenumber;

	public Employee() {
		super();
	}

	public Employee(Integer slno, String name, String email, String phonenumber) {
		this.slno = slno;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}

	public Integer getSlno() {
		return slno;
	}

	public void setSlno(Integer slno) {
		this.slno = slno;
	}

	public String getname() {
		return name;
	}

	public void setSlno(String name) {
		this.name = name;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getphonenumber() {
		return phonenumber;
	}

	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phonenumber == null) ? 0 : phonenumber.hashCode());
		result = prime * result + ((slno == null) ? 0 : slno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phonenumber == null) {
			if (other.phonenumber != null)
				return false;
		} else if (!phonenumber.equals(other.phonenumber))
			return false;
		if (slno == null) {
			if (other.slno != null)
				return false;
		} else if (!slno.equals(other.slno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [slno=" + slno + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + "]";
	}
	
	

}
