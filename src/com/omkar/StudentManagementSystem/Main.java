package com.omkar.StudentManagementSystem;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        System.out.println("\n\nStarting Student Management System...");
       long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 3000) {
            // do nothing, just wait
        }


        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        
        while (true) {
            System.out.println();
            System.out.println("======================================");
            System.out.println(" WELCOME TO STUDENT MANAGEMENT SYSTEM ");
            System.out.println("======================================");
            
            System.out.println("\n----------------------------------------------");
            System.out.println("1  Add Student");
            System.out.println("2  View Students");
            System.out.println("3  Delete Student");
            System.out.println("4  Search Student");
            System.out.println("5  Update Student");
            System.out.println("6  Total Students");
            System.out.println("7  Exit");
            System.out.println("------------------------------------------------");
            System.out.print("Enter your choice ");
            System.out.println();

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

//This for Add students:

            if (choice == 1) {

                Student student = new Student();
                
//Input for Name:
                String name;
                while (true) {
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    if (!name.trim().isEmpty()) {
                        break;
                    }else {
                        System.out.println("Name cannot be empty. Try again.");
                    }   
                }
                student.setName(name);

//Input for Age:
                int age;
                while (true) {
                    System.out.print("Enter Age: ");
                    age = sc.nextInt();

                    if (age > 0) {
                        break;
                    } else {
                        System.out.println("Age must be greater than 0.");
                    }
                }
                sc.nextLine();
                student.setAge(age);

 //Input for Grade:         
                String grade;
                while (true) {
                    System.out.print("Enter Grade: ");
                    grade = sc.nextLine();

                    if (grade.length() == 1) {
                    break;
                    } else {
                        System.out.println("Grade must be a single character.");
                    }
                }
                student.setGrade(grade);

            dao.addStudent(student);
            System.out.println("\nPress Enter to continue...");
            sc.nextLine();
            }


//This is for View students:

            else if (choice == 2) {
                dao.viewStudents();
                System.out.println("\nPress Enter to continue...");
                sc.nextLine();
            } 


//This is for Delete srudents:

            else if (choice == 3) {
                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume leftover newline

                System.out.print("Confirm delete (y/n): ");
                String confirm = sc.nextLine();

                if (confirm.equalsIgnoreCase("y")) {
                    dao.deleteStudent(id);
                } else {
                    System.out.println("Delete cancelled.");
                }
                System.out.println("\nPress Enter to continue...");
                sc.nextLine();
            }


//This is for Search students:

            else if (choice == 4) {
                System.out.print("Enter Student ID to search: ");
                int id = sc.nextInt();
                dao.searchStudentById(id);
                System.out.println("\nPress Enter to continue...");
                sc.nextLine();
            }


//This is for Update students:
            else if(choice == 5) {
                System.out.print("Enter Student ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new Name: ");
                String name = sc.nextLine();

                System.out.print("Enter new Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new Grade: ");
                String grade = sc.nextLine();

                dao.updateStudent(id, name, age, grade);

            }


//This is for Total students:
            else if (choice == 6) {
                dao.getTotalStudents();
                System.out.println("\nPress Enter to continue...");
                sc.nextLine();
            }

            
//This is for Exit:
            
            else if (choice == 7) {
                System.out.println();
                System.out.println("Exiting program...");
                long end = System.currentTimeMillis();
                while (System.currentTimeMillis() - end < 2000) {
                // do nothing, just wait
                }
                System.out.println("\nThank you for using Student Management System");
                break;
            } 

            
            else {

                System.out.println("Invalid choice");

            }
        }

        sc.close();
    }
}