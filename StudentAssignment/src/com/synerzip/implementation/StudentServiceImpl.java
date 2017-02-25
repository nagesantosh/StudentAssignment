package com.synerzip.implementation;

import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;

import com.synerzip.common.DBHelper;
import com.synerzip.model.StudentModel;
import com.synerzip.service.StudentService;

public class StudentServiceImpl implements StudentService {
	public Boolean insertData(StudentModel student) {
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into studentDetails values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, student.getRegistrationNumber());
			preparedStatement.setString(2, student.getSalutation());
			preparedStatement.setString(3, student.getFirstName());
			preparedStatement.setString(4, student.getLastName());
			preparedStatement.setDate(5, (Date) student.getDob());
			preparedStatement.setString(6, student.getGender());
			preparedStatement.setString(7, student.getAddress());
			preparedStatement.setString(8, student.getCountry());
			preparedStatement.setString(9, student.getState());
			preparedStatement.setString(10, student.getCity());
			preparedStatement.setInt(11, student.getPincode());
			preparedStatement.setString(12, student.getEmail());
			preparedStatement.setInt(13, student.getMobileNumber());
			preparedStatement.setString(14, student.getCourseEnrolled());
			preparedStatement.setString(15, student.getPreviousCourse());
			preparedStatement.setDouble(16, student.getMarks());
			preparedStatement.execute();
		} catch (SQLIntegrityConstraintViolationException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public Boolean updateStudentData(StudentModel student) {
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConnection();
		String query = "Update studentDetails set salutation = ?,firstName = ?,lastName = ?,dob = ?,gender = ?,address = ?,country = ?,"
				+ "state = ?,city = ?,pincode = ?,email = ?,mobileNumber = ?,courseEnrolled = ?,previousCourse = ?,"
				+ "marks = ? WHERE registrationNumber =" + student.getRegistrationNumber();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, student.getSalutation());
			preparedStatement.setString(2, student.getFirstName());
			preparedStatement.setString(3, student.getLastName());
			preparedStatement.setDate(4, (Date) student.getDob());
			preparedStatement.setString(5, student.getGender());
			preparedStatement.setString(6, student.getAddress());
			preparedStatement.setString(7, student.getCountry());
			preparedStatement.setString(8, student.getState());
			preparedStatement.setString(9, student.getCity());
			preparedStatement.setInt(10, student.getPincode());
			preparedStatement.setString(11, student.getEmail());
			preparedStatement.setInt(12, student.getMobileNumber());
			preparedStatement.setString(13, student.getCourseEnrolled());
			preparedStatement.setString(14, student.getPreviousCourse());
			preparedStatement.setDouble(15, student.getMarks());
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLIntegrityConstraintViolationException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public Boolean deleteStudentData(int studentRegistrationNumber) {
		String query = "DELETE  FROM studentDetails WHERE registrationNumber=" + studentRegistrationNumber;
		Statement statement;
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConnection();
		try {
			statement = connection.createStatement();
			statement.executeUpdate(query);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return true;

	}

	public StudentModel getStudentData(int studentRegistrationNumber) {
		String query = "SELECT * FROM studentDetails WHERE registrationNumber=" + studentRegistrationNumber;
		ResultSet rs = null;
		StudentModel student = null;
		Statement statement;
		{
			DBHelper dbHelper = new DBHelper();
			Connection connection = dbHelper.getConnection();
			try {
				statement = connection.createStatement();

				rs = statement.executeQuery(query);
				if (rs.next()) {
					student = new StudentModel();
					student.setRegistrationNumber(rs.getInt("registrationNumber"));
					student.setSalutation(rs.getString("salutation"));
					student.setFirstName(rs.getString("firstName"));
					student.setLastName(rs.getString("lastName"));
					student.setDob(rs.getDate("dob"));
					student.setGender(rs.getString("gender"));
					student.setAddress(rs.getString("address"));
					student.setCountry(rs.getString("country"));
					student.setState(rs.getString("state"));
					student.setCity(rs.getString("city"));
					student.setPincode(rs.getInt("pincode"));
					student.setEmail(rs.getString("email"));
					student.setMobileNumber(rs.getInt("mobileNumber"));
					student.setCourseEnrolled(rs.getString("courseEnrolled"));
					student.setPreviousCourse(rs.getString("previousCourse"));
					student.setMarks(rs.getFloat("marks"));

				}
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return student;

	}

	public StudentModel getFirstStudent() {
		String query = "SELECT * FROM studentDetails";
		ResultSet rs = null;
		Statement statement;
		StudentModel student = null;
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConnection();
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				student = new StudentModel();
				student.setRegistrationNumber(rs.getInt("registrationNumber"));
				student.setSalutation(rs.getString("salutation"));
				student.setFirstName(rs.getString("firstName"));
				student.setLastName(rs.getString("lastName"));
				student.setDob(rs.getDate("dob"));
				student.setGender(rs.getString("gender"));
				student.setAddress(rs.getString("address"));
				student.setCountry(rs.getString("country"));
				student.setState(rs.getString("state"));
				student.setCity(rs.getString("city"));
				student.setPincode(rs.getInt("pincode"));
				student.setEmail(rs.getString("email"));
				student.setMobileNumber(rs.getInt("mobileNumber"));
				student.setCourseEnrolled(rs.getString("courseEnrolled"));
				student.setPreviousCourse(rs.getString("previousCourse"));
				student.setMarks(rs.getFloat("marks"));
				return student;
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public StudentModel getLastStudent() {
		String query = "SELECT * FROM studentDetails";
		ResultSet rs = null;
		StudentModel student = null;
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConnection();
		try {
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = statement.executeQuery(query);
			if (rs.last()) {
				student = new StudentModel();
				student.setRegistrationNumber(rs.getInt("registrationNumber"));
				student.setSalutation(rs.getString("salutation"));
				student.setFirstName(rs.getString("firstName"));
				student.setLastName(rs.getString("lastName"));
				student.setDob(rs.getDate("dob"));
				student.setGender(rs.getString("gender"));
				student.setAddress(rs.getString("address"));
				student.setCountry(rs.getString("country"));
				student.setState(rs.getString("state"));
				student.setCity(rs.getString("city"));
				student.setPincode(rs.getInt("pincode"));
				student.setEmail(rs.getString("email"));
				student.setMobileNumber(rs.getInt("mobileNumber"));
				student.setCourseEnrolled(rs.getString("courseEnrolled"));
				student.setPreviousCourse(rs.getString("previousCourse"));
				student.setMarks(rs.getFloat("marks"));
				return student;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public StudentModel getNextStudentData(int studentRegistrationNumber) {
		String query = "SELECT * FROM studentDetails";
		ResultSet rs = null;
		StudentModel student = null;
		int indexOfStudent = 0;
		ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();
		Statement statement;
		{
			DBHelper dbHelper = new DBHelper();
			Connection connection = dbHelper.getConnection();
			try {
				statement = connection.createStatement();

				rs = statement.executeQuery(query);

				while (rs.next()) {
					student = new StudentModel();
					student.setRegistrationNumber(rs.getInt("registrationNumber"));
					student.setSalutation(rs.getString("salutation"));
					student.setFirstName(rs.getString("firstName"));
					student.setLastName(rs.getString("lastName"));
					student.setDob(rs.getDate("dob"));
					student.setGender(rs.getString("gender"));
					student.setAddress(rs.getString("address"));
					student.setCountry(rs.getString("country"));
					student.setState(rs.getString("state"));
					student.setCity(rs.getString("city"));
					student.setPincode(rs.getInt("pincode"));
					student.setEmail(rs.getString("email"));
					student.setMobileNumber(rs.getInt("mobileNumber"));
					student.setCourseEnrolled(rs.getString("courseEnrolled"));
					student.setPreviousCourse(rs.getString("previousCourse"));
					student.setMarks(rs.getFloat("marks"));
					studentList.add(student);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			for (StudentModel studentModel : studentList) {
				if (studentModel.getRegistrationNumber() == studentRegistrationNumber) {
					indexOfStudent = studentList.indexOf(studentModel);

					return studentList.get(++indexOfStudent);
				}
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.synerzip.service.StudentService#getPreviousStudentData(int)
	 */
	public StudentModel getPreviousStudentData(int studentRegistrationNumber) {
		String query = "SELECT * FROM studentDetails";
		ResultSet rs = null;
		StudentModel student = null;
		int indexOfStudent = 0;
		ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();
		Statement statement;
		{
			DBHelper dbHelper = new DBHelper();
			Connection connection = dbHelper.getConnection();
			try {
				statement = connection.createStatement();

				rs = statement.executeQuery(query);

				while (rs.next()) {
					student = new StudentModel();
					student.setRegistrationNumber(rs.getInt("registrationNumber"));
					student.setSalutation(rs.getString("salutation"));
					student.setFirstName(rs.getString("firstName"));
					student.setLastName(rs.getString("lastName"));
					student.setDob(rs.getDate("dob"));
					student.setGender(rs.getString("gender"));
					student.setAddress(rs.getString("address"));
					student.setCountry(rs.getString("country"));
					student.setState(rs.getString("state"));
					student.setCity(rs.getString("city"));
					student.setPincode(rs.getInt("pincode"));
					student.setEmail(rs.getString("email"));
					student.setMobileNumber(rs.getInt("mobileNumber"));
					student.setCourseEnrolled(rs.getString("courseEnrolled"));
					student.setPreviousCourse(rs.getString("previousCourse"));
					student.setMarks(rs.getFloat("marks"));
					studentList.add(student);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (StudentModel studentModel : studentList) {
				if (studentModel.getRegistrationNumber() == studentRegistrationNumber) {
					indexOfStudent = studentList.indexOf(studentModel);

					return studentList.get(--indexOfStudent);
				}
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}
}
