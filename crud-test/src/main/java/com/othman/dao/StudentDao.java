package com.othman.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import com.othman.connection.GetConnection;
import com.othman.model.Student;

public class StudentDao {
	private  ResultSet rs;
	private  PreparedStatement ps;
	 public boolean createStudent(Student student) {
		 try {
		 String command="insert into student values (?,?,?,?,?,?,?)";
		  ps=GetConnection.getConnection().prepareStatement(command);
		 
		 //Wrong?? isnt closed to modification (add more atributes to student)
		 ps.setString(2,student.getName());
		 ps.setString(7,student.getGender());
		 ps.setInt(3,student.getAge());
		 ps.setString(4,student.getCountry());
		 ps.setInt(1,student.getSid());
		 ps.setDouble(5,student.getGpa());
		 ps.setString(6,student.getUni_Abb());
		 
		  return ps.executeUpdate()>0; 
		  }
		 
		 
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return false;
		 
		 
		 
	 }
	 public Student readStudent(int sid) {
		 String command="select Name, Age, Gender,Country, Sid, Gpa, Uni_Abb where sid=?";
	     try {
			 ps=GetConnection.getConnection().prepareStatement(command);
			 ps.setInt(1,sid);
			 
			 
			rs=ps.executeQuery();
			if(rs.next()) {
				Student student =new Student(10,rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDouble(6),rs.getString(7));
				return student;
			}
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		 return null;
	 }
	 public boolean updateStudent(int sid ,String Name,int Age,String Country,Double Gpa,String Uni_Abb, String Gender) {
		 String command="update  student set Name=?, Age=?, Country=?, Gpa=?, Uni_Abb=?, Gender=? where sid=?";
		 try {
			 ps=GetConnection.getConnection().prepareStatement(command);
			 ps.setString(1,Name);
			 ps.setInt(2,Age);
			 ps.setString(3,Country);
			 ps.setDouble(4,Gpa);
			 ps.setString(5,Uni_Abb);
			 ps.setString(6,Gender);
			 ps.setInt(7,sid);
			 return ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return false;
	 }
	 public boolean deleteStudent(int sid) {
		  String command="delete from student where sid=?";
		  try {
			 ps=GetConnection.getConnection().prepareStatement(command);
			  
			  ps.setInt(1,sid);
			  return ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return false;
	 }
	 public ArrayList<Student> readStudents(){
		 ArrayList<Student> list= new ArrayList<Student>();
		 String command="select Name, Age, Gender,Country, Sid, Gpa, Uni_Abb from student";
		  try {
			ps=GetConnection.getConnection().prepareStatement(command);
			  rs=ps.executeQuery();
				while(rs.next()) {
					Student student =new Student(10,rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDouble(6),rs.getString(7));
			 list.add(student);
			 
			 
 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return list;
}
	 

}
