package com.synerzip.model;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */
public class StudentModel {

	/** The registration number. */
	private int registrationNumber;
	
	/** The salutation. */
	private String salutation;
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The dob. */
	private Date dob;
	
	/** The gender. */
	private String gender;
	
	/** The address. */
	private String address;
	
	/** The country. */
	private String country;
	
	/** The state. */
	private String state;
	
	/** The city. */
	private String city;
	
	/** The pincode. */
	private int pincode;
	
	/** The email. */
	private String email;
	
	/** The mobile number. */
	private int mobileNumber;
	
	/** The course enrolled. */
	private String courseEnrolled;
	
	/** The previous course. */
	private String previousCourse;
	
	/** The marks. */
	private float marks;
	
	
	
	/**
	 * Instantiates a new student.
	 */
	public StudentModel() {
		System.out.println("In default constructor");
	}

	/**
	 * Instantiates a new student.
	 *
	 * @param registrationNumber the registration number
	 * @param salutation the salutation
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param dob the dob
	 * @param gender the gender
	 * @param address the address
	 * @param country the country
	 * @param state the state
	 * @param city the city
	 * @param pincode the pincode
	 * @param email the email
	 * @param mobileNumber the mobile number
	 * @param courseEnrolled the course enrolled
	 * @param previousCourse the previous course
	 * @param marks the marks
	 */
	public StudentModel(int registrationNumber, String salutation, String firstName, String lastName, Date dob,
			String gender, String address, String country, String state, String city, int pincode, String email,
			int mobileNumber, String courseEnrolled, String previousCourse, float marks) {
		super();
		this.registrationNumber = registrationNumber;
		this.salutation = salutation;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.courseEnrolled = courseEnrolled;
		this.previousCourse = previousCourse;
		this.marks = marks;
		
		
	}

	/**
	 * Gets the registration number.
	 *
	 * @return the registration number
	 */
	public int getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * Sets the registration number.
	 *
	 * @param registrationNumber the new registration number
	 */
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * Gets the salutation.
	 *
	 * @return the salutation
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * Sets the salutation.
	 *
	 * @param salutation the new salutation
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param checkbox the new gender
	 */
	public void setGender(String checkbox) {
		this.gender = checkbox;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the pincode.
	 *
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}

	/**
	 * Sets the pincode.
	 *
	 * @param pincode the new pincode
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the mobile number.
	 *
	 * @return the mobile number
	 */
	public int getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * Sets the mobile number.
	 *
	 * @param mobileNumber the new mobile number
	 */
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * Gets the course enrolled.
	 *
	 * @return the course enrolled
	 */
	public String getCourseEnrolled() {
		return courseEnrolled;
	}

	/**
	 * Sets the course enrolled.
	 *
	 * @param courseEnrolled the new course enrolled
	 */
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	/**
	 * Gets the previous course.
	 *
	 * @return the previous course
	 */
	public String getPreviousCourse() {
		return previousCourse;
	}

	/**
	 * Sets the previous course.
	 *
	 * @param previousCourse the new previous course
	 */
	public void setPreviousCourse(String previousCourse) {
		this.previousCourse = previousCourse;
	}

	/**
	 * Gets the marks.
	 *
	 * @return the marks
	 */
	public float getMarks() {
		return marks;
	}

	/**
	 * Sets the marks.
	 *
	 * @param marks the new marks
	 */
	public void setMarks(float marks) {
		this.marks = marks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [registrationNumber=" + registrationNumber + ", salutation=" + salutation + ", firstName="
				+ firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + ", address=" + address
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", pincode=" + pincode + ", email="
				+ email + ", mobileNumber=" + mobileNumber + ", courseEnrolled=" + courseEnrolled + ", previousCourse="
				+ previousCourse + ", marks=" + marks + "]";
	}
	
}