package com.synerzip.handler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.synerzip.implementation.StudentServiceImpl;
import com.synerzip.model.StudentModel;
import com.synerzip.view.StudentForm;;

public class ButtonHandler implements ActionListener {

	private StudentForm studentForm;

	public ButtonHandler(StudentForm studentForm) {
		// TODO Auto-generated constructor stub
		this.studentForm = studentForm;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == studentForm.buttonSave) {
			StudentModel student = new StudentModel();
			student.setRegistrationNumber(Integer.parseInt(studentForm.textFieldRegistrationNumber.getText()));
			student.setSalutation(studentForm.choiceSalutation.getSelectedItem());
			student.setFirstName(studentForm.textFieldFirstName.getText());
			student.setLastName(studentForm.textFieldLastName.getText());
			int date, months, year;
			date = Integer.parseInt(studentForm.choiceDate.getSelectedItem());
			months = Integer.parseInt(studentForm.choiceMonth.getSelectedItem());
			year = Integer.parseInt(studentForm.choiceYear.getSelectedItem());
			Date dob = new Date(year, months, date);
			java.sql.Date sqlDate = new java.sql.Date(dob.getTime());
			student.setDob(sqlDate);
			student.setGender(studentForm.checkBoxGender.getSelectedCheckbox().getLabel());
			student.setAddress(studentForm.textFieldAddress.getText());
			student.setCountry(studentForm.choiceCountry.getSelectedItem());
			student.setState(studentForm.choiceState.getSelectedItem());
			student.setCity(studentForm.textFieldCity.getText());
			student.setPincode(Integer.parseInt(studentForm.textFieldPincode.getText()));
			student.setEmail(studentForm.textFieldEmail.getText());
			student.setMobileNumber(Integer.parseInt(studentForm.textFieldMobileNumber.getText()));
			student.setCourseEnrolled(studentForm.choiceCourseEnrolled.getSelectedItem());
			student.setPreviousCourse(studentForm.choicePrevoiusCourse.getSelectedItem());
			student.setMarks(Float.parseFloat(studentForm.textFieldMarks.getText()));
			StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
			studentServiceImpl.insertData(student);

		} else if (e.getSource() == studentForm.buttonUpdate) {

			studentForm.setBackground(Color.CYAN);
		} else if (e.getSource() == studentForm.buttonDelete) {

			try {
				StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
				studentServiceImpl
						.deleteStudentData(Integer.parseInt(studentForm.textFieldRegistrationNumber.getText()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			studentForm.setBackground(Color.CYAN);
		} else if (e.getSource() == studentForm.buttonSearch) {

			try {

				StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
				StudentModel student = studentServiceImpl
						.getStudentData(Integer.parseInt(studentForm.textFieldRegistrationNumber.getText()));
				studentForm.textFieldRegistrationNumber.setText(String.valueOf(student.getRegistrationNumber()));
				studentForm.textFieldFirstName.setText(student.getFirstName());
				studentForm.textFieldLastName.setText(student.getLastName());
				studentForm.choiceDate.select(student.getDob().getDay());
				studentForm.choiceMonth.select(student.getDob().getMonth());
				studentForm.choiceYear.select(student.getDob().getYear());
				studentForm.textFieldAddress.setText(student.getAddress());
				studentForm.choiceCountry.select(student.getCountry());
				studentForm.choiceState.select(student.getState());
				studentForm.textFieldCity.setText(student.getCity());
				studentForm.textFieldPincode.setText(String.valueOf(student.getPincode()));
				studentForm.textFieldEmail.setText(student.getEmail());
				studentForm.textFieldMobileNumber.setText(String.valueOf(student.getMobileNumber()));
				studentForm.choiceCourseEnrolled.select(student.getCourseEnrolled());
				studentForm.choicePrevoiusCourse.select(student.getPreviousCourse());
				studentForm.textFieldMarks.setText(String.valueOf(student.getMarks()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			studentForm.setBackground(Color.CYAN);
		} else if (e.getSource() == studentForm.buttonFirst) {

			try {

				StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
				StudentModel student = studentServiceImpl.getFirstStudent();
				System.out.println("Student details as follows  *******" + student);
				studentForm.textFieldRegistrationNumber.setText(String.valueOf(student.getRegistrationNumber()));
				studentForm.textFieldFirstName.setText(student.getFirstName());
				studentForm.textFieldLastName.setText(student.getLastName());
				studentForm.choiceDate.select(student.getDob().getDay());
				studentForm.choiceMonth.select(student.getDob().getMonth());
				studentForm.choiceYear.select(student.getDob().getMonth());
				studentForm.textFieldAddress.setText(student.getAddress());
				studentForm.choiceCountry.select(student.getCountry());
				studentForm.choiceState.select(student.getState());
				studentForm.textFieldCity.setText(student.getCity());
				studentForm.textFieldPincode.setText(String.valueOf(student.getPincode()));
				studentForm.textFieldEmail.setText(student.getEmail());
				studentForm.textFieldMobileNumber.setText(String.valueOf(student.getMobileNumber()));
				studentForm.choiceCourseEnrolled.select(student.getCourseEnrolled());
				studentForm.choicePrevoiusCourse.select(student.getPreviousCourse());
				studentForm.textFieldMarks.setText(String.valueOf(student.getMarks()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			studentForm.setBackground(Color.CYAN);
		} else if (e.getSource() == studentForm.buttonLast) {
			try {

				StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
				StudentModel student = studentServiceImpl.getLastStudent();
				System.out.println("Student details as follows  *******" + student);
				studentForm.textFieldRegistrationNumber.setText(String.valueOf(student.getRegistrationNumber()));
				studentForm.textFieldFirstName.setText(student.getFirstName());
				studentForm.textFieldLastName.setText(student.getLastName());
				studentForm.choiceDate.select(student.getDob().getDay());
				studentForm.choiceMonth.select(student.getDob().getMonth());
				studentForm.choiceYear.select(student.getDob().getMonth());
				studentForm.textFieldAddress.setText(student.getAddress());
				studentForm.choiceCountry.select(student.getCountry());
				studentForm.choiceState.select(student.getState());
				studentForm.textFieldCity.setText(student.getCity());
				studentForm.textFieldPincode.setText(String.valueOf(student.getPincode()));
				studentForm.textFieldEmail.setText(student.getEmail());
				studentForm.textFieldMobileNumber.setText(String.valueOf(student.getMobileNumber()));
				studentForm.choiceCourseEnrolled.select(student.getCourseEnrolled());
				studentForm.choicePrevoiusCourse.select(student.getPreviousCourse());
				studentForm.textFieldMarks.setText(String.valueOf(student.getMarks()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			studentForm.setBackground(Color.CYAN);
		} else if (e.getSource() == studentForm.buttonNext) {

			try {
				int studentRegistrationNumber = Integer.parseInt(studentForm.textFieldRegistrationNumber.getText());
				StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
				StudentModel student = studentServiceImpl.getNextStudentData(studentRegistrationNumber);
				System.out.println("Student details as follows  *******" + student);
				studentForm.textFieldRegistrationNumber.setText(String.valueOf(student.getRegistrationNumber()));
				studentForm.textFieldFirstName.setText(student.getFirstName());
				studentForm.textFieldLastName.setText(student.getLastName());
				studentForm.choiceDate.select(student.getDob().getDay());
				studentForm.choiceMonth.select(student.getDob().getMonth());
				studentForm.choiceYear.select(student.getDob().getMonth());
				studentForm.textFieldAddress.setText(student.getAddress());
				studentForm.choiceCountry.select(student.getCountry());
				studentForm.choiceState.select(student.getState());
				studentForm.textFieldCity.setText(student.getCity());
				studentForm.textFieldPincode.setText(String.valueOf(student.getPincode()));
				studentForm.textFieldEmail.setText(student.getEmail());
				studentForm.textFieldMobileNumber.setText(String.valueOf(student.getMobileNumber()));
				studentForm.choiceCourseEnrolled.select(student.getCourseEnrolled());
				studentForm.choicePrevoiusCourse.select(student.getPreviousCourse());
				studentForm.textFieldMarks.setText(String.valueOf(student.getMarks()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			studentForm.setBackground(Color.CYAN);
		} else if (e.getSource() == studentForm.buttonPrevious) {

			try {
				int studentRegistrationNumber = Integer.parseInt(studentForm.textFieldRegistrationNumber.getText());
				StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
				StudentModel student = studentServiceImpl.getPreviousStudentData(studentRegistrationNumber);
				System.out.println("Student details as follows  *******" + student);
				studentForm.textFieldRegistrationNumber.setText(String.valueOf(student.getRegistrationNumber()));
				studentForm.textFieldFirstName.setText(student.getFirstName());
				studentForm.textFieldLastName.setText(student.getLastName());
				studentForm.choiceDate.select(student.getDob().getDay());
				studentForm.choiceMonth.select(student.getDob().getMonth());
				studentForm.choiceYear.select(student.getDob().getMonth());
				studentForm.textFieldAddress.setText(student.getAddress());
				studentForm.choiceCountry.select(student.getCountry());
				studentForm.choiceState.select(student.getState());
				studentForm.textFieldCity.setText(student.getCity());
				studentForm.textFieldPincode.setText(String.valueOf(student.getPincode()));
				studentForm.textFieldEmail.setText(student.getEmail());
				studentForm.textFieldMobileNumber.setText(String.valueOf(student.getMobileNumber()));
				studentForm.choiceCourseEnrolled.select(student.getCourseEnrolled());
				studentForm.choicePrevoiusCourse.select(student.getPreviousCourse());
				studentForm.textFieldMarks.setText(String.valueOf(student.getMarks()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			studentForm.setBackground(Color.CYAN);
		} else if (e.getSource() == studentForm.buttonExit) {
			studentForm.setBackground(Color.RED);
			System.exit(0);
		}
	}
}
