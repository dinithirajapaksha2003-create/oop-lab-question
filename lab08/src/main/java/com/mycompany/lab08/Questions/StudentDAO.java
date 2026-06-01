
package com.mycompany.lab08.Questions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql =
        "INSERT INTO students(student_id,student_name,mark) VALUES(?,?,?)";

        try {

            Connection connection =
            StudentDatabaseConnection.getConnection();

            PreparedStatement statement =
            connection.prepareStatement(sql);

            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getStudentName());
            statement.setInt(3, student.getMark());

            statement.executeUpdate();

            System.out.println("Student added successfully.");

        } catch(SQLException e) {

            System.out.println("Database error: " + e.getMessage());
        }
    }

    public void displayAllStudents() {

        String sql =
        "SELECT student_id,student_name,mark FROM students";

        try {

            Connection connection =
            StudentDatabaseConnection.getConnection();

            PreparedStatement statement =
            connection.prepareStatement(sql);

            ResultSet resultSet =
            statement.executeQuery();

            while(resultSet.next()) {

                System.out.println("ID: " +resultSet.getInt("student_id"));

                System.out.println("Name: " +resultSet.getString("student_name"));

                System.out.println("Mark: " +resultSet.getInt("mark"));

                System.out.println();
            }

        } catch(SQLException e) {

            System.out.println(
            "Database error: " +
            e.getMessage());
        }
    }
}