package com.synerzip.view;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import com.synerzip.handler.ButtonHandler;

public class StudentForm extends Frame {
	
	public Label labelFormTitle = new Label("Student Registration Form",Label.CENTER);
	public Label labelRegistrationNumber = new Label("Registration Number",Label.LEFT);
	public Label labelSalutation = new Label("Title",Label.LEFT);
	public Label labelFirstName = new Label("First Name",Label.LEFT);
	public Label labelLastName = new Label("Last Name",Label.LEFT);
	public Label labelDob = new Label("Date of Birth  (dd/mm/yyyy)",Label.LEFT);
	public Label labelGender = new Label("Gender",Label.LEFT);
	public Label labelAddress = new Label("Adderss",Label.LEFT);
	public Label labelCountry = new Label("Country",Label.LEFT);
	public Label labelState = new Label("State",Label.LEFT);
	public Label labelCity = new Label("City",Label.LEFT);
	public Label labelPincode = new Label("Pincode",Label.LEFT);
	public Label labelEmail = new Label("Email id",Label.LEFT);
	public Label labelMobileNumber = new Label("Mobile",Label.LEFT);
	public Label labelCourseEnrolled = new Label("Course Enrolled",Label.LEFT);
	public Label labelPreviousCourse = new Label("Previous Examination",Label.LEFT);
	public Label labelMarks = new Label("Marks",Label.LEFT);
	public TextField textFieldRegistrationNumber = new TextField();
	public Choice choiceSalutation = new Choice();
	public TextField textFieldFirstName = new TextField();
	public TextField textFieldLastName = new TextField();
	public Choice choiceDate = new Choice();
	public Choice choiceMonth = new Choice();
	public Choice choiceYear = new Choice();
	public CheckboxGroup checkBoxGender = new CheckboxGroup();
	public Checkbox checkboxMale=new Checkbox("Male",false,checkBoxGender);
	public Checkbox checkboxFemale=new Checkbox("Female",false,checkBoxGender);
	public TextArea textFieldAddress = new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
	public Choice choiceCountry = new Choice();
	public Choice choiceState = new Choice();
	public TextField textFieldCity = new TextField();
	public TextField textFieldPincode = new TextField();
	public TextField textFieldEmail = new TextField();
	public TextField textFieldMobileNumber = new TextField();
	public Choice choiceCourseEnrolled = new Choice();
	public Choice choicePrevoiusCourse = new Choice();
	public TextField textFieldMarks = new TextField();
	//Save,Update,Delete,Search,First, Last ,Next ,Previous
	public Button buttonSave = new Button("Save");
	public Button buttonUpdate = new Button("Update");
	public Button buttonDelete = new Button("Delete");
	public Button buttonSearch = new Button("Search");
	public Button buttonFirst = new Button("First");
	public Button buttonLast = new Button("Last");
	public Button buttonNext = new Button("Next");
	public Button buttonPrevious = new Button("Previous");
	public Button buttonExit = new Button("Exit");
	
	/**
	 * Instantiates a new student form.
	 */
	public StudentForm() {
		
		setBounds(100, 100, 740, 650);
	    setVisible(true);
	    setTitle("Student Registration Form");
	    setLayout(null);
	    setBackground(Color.LIGHT_GRAY);
		add(labelFormTitle);
		add(labelRegistrationNumber);
		add(labelSalutation);
		add(labelFirstName);
		add(labelLastName);
		add(labelDob);
		add(labelGender);
		add(labelAddress);
		add(labelCountry);
		add(labelState);
		add(labelCity);
		add(labelPincode);
		add(labelEmail);
		add(labelMobileNumber);
		add(labelCourseEnrolled);
		add(labelPreviousCourse);
		add(labelMarks);
		add(textFieldRegistrationNumber);
		add(choiceSalutation);
		add(textFieldFirstName);
		add(textFieldLastName);
		add(choiceDate);
		add(choiceMonth);
		add(choiceYear);
		add(checkboxMale);
		add(checkboxFemale);
		add(textFieldAddress);
		add(choiceCountry);
		add(choiceState);
		add(textFieldCity);
		add(textFieldPincode);
		add(textFieldEmail);
		add(textFieldMobileNumber);
		add(choiceCourseEnrolled);
		add(choicePrevoiusCourse);
		add(textFieldMarks);
		add(buttonSave);
		buttonSave.addActionListener(new ButtonHandler(this));
		this.add(buttonUpdate);
		buttonSave.addActionListener(new ButtonHandler(this));
		this.add(buttonDelete);
		buttonDelete.addActionListener(new ButtonHandler(this));
		this.add(buttonSearch);
		buttonSearch.addActionListener(new ButtonHandler(this));
		this.add(buttonFirst);
		buttonFirst.addActionListener(new ButtonHandler(this));
		this.add(buttonLast);
		buttonLast.addActionListener(new ButtonHandler(this));
		this.add(buttonNext);
		buttonNext.addActionListener(new ButtonHandler(this));
		this.add(buttonPrevious);
		buttonPrevious.addActionListener(new ButtonHandler(this));
		this.add(buttonExit);
		buttonExit.addActionListener(new ButtonHandler(this));
		choiceSalutation.add("Mr. ");
		choiceSalutation.add("Mrs. ");
		choiceSalutation.add("Miss. ");
		choiceDate.add("1");
		choiceDate.add("2");
		choiceDate.add("3");
		choiceDate.add("4");
		choiceDate.add("5");
		choiceDate.add("6");
		choiceDate.add("7");
		choiceDate.add("8");
		choiceDate.add("9");
		choiceDate.add("10");
		choiceDate.add("11");
		choiceDate.add("12");
		choiceDate.add("13");
		choiceDate.add("14");
		choiceDate.add("15");
		choiceDate.add("16");
		choiceDate.add("17");
		choiceDate.add("18");
		choiceDate.add("19");
		choiceDate.add("20");
		choiceDate.add("21");
		choiceDate.add("22");
		choiceDate.add("23");
		choiceDate.add("24");
		choiceDate.add("25");
		choiceDate.add("26");
		choiceDate.add("27");
		choiceDate.add("28");
		choiceDate.add("29");
		choiceDate.add("30");
		choiceDate.add("31");
		choiceMonth.add("1");
		choiceMonth.add("2");
		choiceMonth.add("3");
		choiceMonth.add("4");
		choiceMonth.add("5");
		choiceMonth.add("6");
		choiceMonth.add("7");
		choiceMonth.add("8");
		choiceMonth.add("9");
		choiceMonth.add("10");
		choiceMonth.add("11");
		choiceMonth.add("12");
		choiceYear.add("1980");
		choiceYear.add("1981");
		choiceYear.add("1982");
		choiceYear.add("1983");
		choiceYear.add("1984");
		choiceYear.add("1985");
		choiceYear.add("1986");
		choiceYear.add("1987");
		choiceYear.add("1988");
		choiceYear.add("1989");
		choiceYear.add("1990");
		choiceYear.add("1991");
		choiceYear.add("1992");
		choiceYear.add("1993");
		choiceYear.add("1994");
		choiceYear.add("1995");
		choiceYear.add("1996");
		choiceYear.add("1997");
		choiceYear.add("1998");
		choiceYear.add("1999");
		choiceYear.add("2000");
		choiceYear.add("2001");
		choiceYear.add("2002");
		choiceYear.add("2003");
		choiceYear.add("2004");
		choiceYear.add("2005");
		choiceYear.add("2006");
		choiceYear.add("2007");
		choiceYear.add("2008");
		choiceYear.add("2009");
		choiceYear.add("2010");
		choiceYear.add("2011");
		choiceYear.add("2012");
		choiceYear.add("2013");
		choiceYear.add("2014");
		choiceYear.add("2015");
		choiceYear.add("2016");
		choiceYear.add("2017");
		choiceYear.add("2018");
		choiceYear.add("2019");
		choiceYear.add("2020");
		choiceYear.add("2021");
		choiceYear.add("2022");
		choiceYear.add("2023");
		choiceYear.add("2024");
		choiceYear.add("2025");
		choiceYear.add("2026");
		choiceYear.add("2027");
		choiceYear.add("2028");
		choiceYear.add("2029");
		choiceYear.add("2030");
		choiceYear.add("2031");
		choiceYear.add("2032");
		choiceYear.add("2033");
		choiceYear.add("2034");
		choiceYear.add("2035");
		choiceYear.add("2036");
		choiceYear.add("2037");
		choiceYear.add("2038");
		choiceYear.add("2039");
		choiceYear.add("2040");
		
		choiceCountry.add("India");
		choiceCountry.add("United States");
		choiceCountry.add("Australia");
		choiceCountry.add("Switzerland");
		choiceCountry.add("Sweden");
		choiceCountry.add("Japan");
		choiceCountry.add("United Kingdom");
		choiceCountry.add("France");
		choiceCountry.add("South Africa");
		choiceCountry.add("Singapore");
		choiceState.add("Andhra Pradesh ");
		choiceState.add("Arunachal Pradesh ");
		choiceState.add("Assam ");
		choiceState.add("Bihar");
		choiceState.add("Chhattisgarh");
		choiceState.add("Goa");
		choiceState.add("Gujarat");
		choiceState.add("Haryana ");
		choiceState.add("Himachal Pradesh ");
		choiceState.add("Jammu and Kashmir");
		choiceState.add("Jharkhand ");
		choiceState.add("Karnataka ");
		choiceState.add("Kerala ");
		choiceState.add("Madhya Pradesh");
		choiceState.add("Maharashtra");
		choiceState.add("Manipur ");
		choiceState.add("Meghalaya");
		choiceState.add("Mizoram ");
		choiceState.add("Nagaland");
		choiceState.add("Odisha");
		choiceState.add("Punjab ");
		choiceState.add("Rajasthan ");
		choiceState.add("Sikkim");
		choiceState.add("Tamil Nadu ");
		choiceState.add("Telangana");
		choiceState.add("Tripura ");
		choiceState.add("Uttar Pradesh ");
		choiceState.add("Uttarakhand");
		choiceState.add("West Bengal ");
		choiceState.add("Alaska");
		choiceState.add("Arizona");
		choiceState.add("California");
		choiceState.add("Colorado");
		choiceState.add("Florida");
		choiceState.add("Georgia");
		choiceState.add("Mississippi");
		choiceState.add("New York");
		choiceState.add("Texas");
		choiceState.add("Washington");
		choiceState.add("Victoria");
		choiceState.add("Tasmania");
		choiceState.add("Queensland");
		choiceState.add("New South Wales");
		choiceState.add("England(C)");
		choiceState.add("Northern Ireland(C)");
		choiceState.add("Scotland(C)");
		choiceState.add("Wales(C)");
		
		//adding courses
		choiceCourseEnrolled.add("ME(Computer Engineering)");
		choiceCourseEnrolled.add("ME(Information Technology)");
		choiceCourseEnrolled.add("ME(Electronics Engineering)");
		choiceCourseEnrolled.add("ME(Civil Engineering)");
		choiceCourseEnrolled.add("ME(Electrical Engineering)");
		choiceCourseEnrolled.add("MCA");
		
		choicePrevoiusCourse.add("BE/B-Tech(Computer Engineering)");
		choicePrevoiusCourse.add("BE/B-Tech(Information Technology)");
		choicePrevoiusCourse.add("BE/B-Tech(Electronics Engineering)");
		choicePrevoiusCourse.add("BE/B-Tech(Civil Engineering)");
		choicePrevoiusCourse.add("BE/B-Tech(Electrical Engineering)");
		choicePrevoiusCourse.add("BCA");
		choicePrevoiusCourse.add("BSc(Computer/IT)");
		
		//setting label positions
		   labelFormTitle.setBounds(300,60,200,20);
		   labelRegistrationNumber.setBounds(25,95,135,20);
		   labelSalutation.setBounds(25,125,50,20);
		   labelFirstName.setBounds(190,125,70,20);
		   labelLastName.setBounds(440,125,70,20);
		   labelDob.setBounds(25,155,175,20);
		   labelGender.setBounds(25,185,70,20);
		   labelAddress.setBounds(25,215,70,20);
		   labelCountry.setBounds(25,295,70,20);
		   labelState.setBounds(25,325,50,20);
		   labelCity.setBounds(25,355,50,20);
		   labelPincode.setBounds(25,385,70,20);
		   labelEmail.setBounds(25,415,60,20);
		   labelMobileNumber.setBounds(25,445,90,20);
		   labelCourseEnrolled.setBounds(25,475,120,20);
		   labelPreviousCourse.setBounds(25,505,135,20);
		   labelMarks.setBounds(25,535,50,20);
		   
		//setting field positions
		   textFieldRegistrationNumber.setBounds(170,95,135,20);
		   choiceSalutation.setBounds(90,125,70,20);
		   textFieldFirstName.setBounds(270,125,135,20);
		   textFieldLastName.setBounds(520,125,135,20);
		   choiceDate.setBounds(210,155,50,20);
		   choiceMonth.setBounds(270,155,70,20);
		   choiceYear.setBounds(350,155,80,20);
		   checkboxMale.setBounds(120,185,70,20);
		   checkboxFemale.setBounds(195,185,70,20);
		   textFieldAddress.setBounds(120,215,160,70);
		   choiceCountry.setBounds(120,295,140,20);
		   choiceState.setBounds(120,325,140,20);
		   textFieldCity.setBounds(120,355,140,20);
		   textFieldPincode.setBounds(120,385,140,20);
		   textFieldEmail.setBounds(120,415,140,20);
		   textFieldMobileNumber.setBounds(120,445,140,20);
		   choiceCourseEnrolled.setBounds(140,475,180,20);
		   choicePrevoiusCourse.setBounds(180,505,185,20);
		   textFieldMarks.setBounds(75,535,70,20);
		   buttonSave.setBounds(70, 585, 70, 30);
		   buttonUpdate.setBounds(140, 585, 70, 30);
		   buttonDelete.setBounds(210, 585, 70, 30);
		   buttonSearch.setBounds(280, 585, 70, 30);
		   buttonFirst.setBounds(350, 585, 70, 30);
		   buttonLast.setBounds(420, 585, 70, 30);
		   buttonNext.setBounds(490, 585, 70, 30);
		   buttonPrevious.setBounds(560, 585, 70, 30);
		   buttonExit.setBounds(630, 585, 70, 30);
	}
}