package com.omkar.StudentManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    public void addStudent(Student student) {

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getGrade());

            ps.executeUpdate();

            System.out.println("Student added successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {

        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM students";

            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println();
                System.out.println("\nSTUDENT LIST");
                System.out.println("================================================");
                System.out.printf("%-5s %-15s %-10s %-10s%n", "ID", "NAME", "AGE", "GRADE");
                System.out.println("================================================");

                while (rs.next()) {
                    System.out.printf("%-5d %-15s %-10d %-10s%n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("grade"));
                }

                System.out.println("-------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
            }
    }

    public void deleteStudent(int id) {
        
        try {
            Connection con = DBConnection.getConnection();

            String query = "DELETE FROM students WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("Student not found");
            }

            } catch (Exception e) {
                e.printStackTrace();
        }
    }

    public void searchStudentById(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM students WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

                java.sql.ResultSet rs = ps.executeQuery();
                 System.out.println();

            if (rs.next()) {

                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("grade")
                );
                // System.out.println("Student ID: " + rs.getInt("id"));
                // System.out.println("Student Name: " + rs.getString("name"));
                // System.out.println("Student Age: " + rs.getInt("age"));
                // System.out.println("Student Grade: " + rs.getString("grade"));

            } else {

                System.out.println("Student not found");

            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name, int age, String grade) {

        try {
            Connection con = DBConnection.getConnection();

            String query = "UPDATE students SET name = ?, age = ?, grade = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
             ps.setInt(2, age);
            ps.setString(3, grade);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully");
            } else {
                System.out.println("Student not found");
             }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getTotalStudents() {

        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT COUNT(*) AS total FROM students";

            PreparedStatement ps = con.prepareStatement(query);

            java.sql.ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                System.out.println("Total Students: " + total);
            }   

        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
}