package Entities;

import org.bson.Document;

public class User {
    public User(int facebook_id, String email, String firstname, String lastname, String location, int age) {
	super();
	this.facebook_id = facebook_id;
	this.email = email;
	this.firstname = firstname;
	this.lastname = lastname;
	this.location = location;
	this.age = age;
    }
    
    public User(Document doc) {
    	this.id = doc.getInteger("_id");
    	this.facebook_id = doc.getInteger("facebook_id");
    	this.email = doc.getString("email");
    	this.firstname = doc.getString("firstname");
    	this.lastname = doc.getString("lastname");
    	this.location = doc.getString("location");
    	this.age = doc.getInteger("age");
    }

    @Override
    public String toString() {
	return "User [id=" + id + ", facebook_id=" + facebook_id + ", email=" + email + ", firstname=" + firstname
		+ ", lastname=" + lastname + ", location=" + location + ", age=" + age + "]";
    }

    private int id;
    private int facebook_id;
    private String email;
    private String firstname;
    private String lastname;
    private String location;
    private int age;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getFacebook_id() {
	return facebook_id;
    }

    public void setFacebook_id(int facebook_id) {
	this.facebook_id = facebook_id;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String getLocation() {
	return location;
    }

    public void setLocation(String location) {
	this.location = location;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (facebook_id != other.facebook_id)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id != other.id)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
    

}