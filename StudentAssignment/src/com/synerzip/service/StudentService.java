package com.synerzip.service;

import com.synerzip.model.StudentModel;

// TODO: Auto-generated Javadoc
/**
 * The Interface StudentService.
 */
public interface StudentService {

	/**
	 * Insert data.
	 *
	 * @param student the student
	 * @return the boolean
	 */
	public Boolean insertData(StudentModel student);

	/**
	 * Update student data.
	 *
	 * @param student the student
	 * @return the boolean
	 */
	public Boolean updateStudentData(StudentModel student);

	/**
	 * Delete student data.
	 *
	 * @param studentRegistrationNumber the student registration number
	 * @return the boolean
	 */
	public Boolean deleteStudentData(int studentRegistrationNumber);

	/**
	 * Gets the student data.
	 *
	 * @param studentRegistrationNumber the student registration number
	 * @return the student data
	 */
	public StudentModel getStudentData(int studentRegistrationNumber);

	/**
	 * Gets the first student.
	 *
	 * @return the first student
	 */
	public StudentModel getFirstStudent();

	/**
	 * Gets the last student.
	 *
	 * @return the last student
	 */
	public StudentModel getLastStudent();

	/**
	 * Gets the next student data.
	 *
	 * @return the next student data
	 */
	public StudentModel getNextStudentData(int studentRegistrationNumber);

	/**
	 * Gets the previous student data.
	 *
	 * @return the previous student data
	 */
	public StudentModel getPreviousStudentData(int studentRegistrationNumber);

}
