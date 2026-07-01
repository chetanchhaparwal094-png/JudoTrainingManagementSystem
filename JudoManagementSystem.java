import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class JudoManagementSystem {
	 static Scanner sc = new Scanner(System.in);

	    static int[] studentId = new int[100];
	    static String[] name = new String[100];
	    static int[] age = new int[100];
	    static double[] weight = new double[100];
	    static String[] beltLevel = new String[100];

	    static int count = 0;
	    static int[] attendanceStudentId = new int[100];
	    static String[] attendanceStatus = new String[100];
	    static int attendanceCount = 0;
	    static int[] tournamentStudentId = new int[100];
	    static String[] tournamentName = new String[100];
	    static int tournamentCount = 0;
	    static int[] performanceStudentId = new int[100];
	    static double[] score = new double[100];
	    static String[] remarks = new String[100];
	    static int performanceCount = 0;

	public static void main(String[] args) {
		 int choice;	 
do {
		    System.out.println("===== JUDO MANAGEMENT SYSTEM =====");
		    System.out.println("1. Add Student");
		    System.out.println("2. View Students");
		    System.out.println("3. Search Student");
		    System.out.println("4. Update Student");
		    System.out.println("5. Delete Student");
		    System.out.println("6. Mark Attendance");
		    System.out.println("7. View Attendance");
		    System.out.println("8. Register Tournament");
		    System.out.println("9. View Tournament Participants");		
		    System.out.println("10. Add Performance");
		    System.out.println("11. View Performance Report");
		    System.out.println("12. Top Performer");
		    System.out.println("13. Save Students");
		    System.out.println("14. Exit");

		    System.out.print("Enter Choice: ");
		    choice = sc.nextInt();
		    
		    if(choice == 1) {
		        addStudent();
		    }
		    if(choice == 2) {
		        viewStudents();
		    }
		    if(choice == 3) {
		        searchStudent();
		    }
		    if(choice == 4) {
		        updateStudent();
		    }
		    if(choice == 5) {
		        deleteStudent();
		    }
		    if(choice == 6) {
		        markAttendance();
		    }

		    if(choice == 7) {
		        viewAttendance();
		    }
		    if(choice == 8) {
		        registerTournament();
		    }

		    if(choice == 9) {
		        viewTournamentParticipants();
		    }  
		    if(choice == 10) {
		        addPerformance();
		    }

		    if(choice == 11) {
		        viewPerformance();
		    }

		    if(choice == 12) {
		        topPerformer();
		    }
		    if(choice == 13) {
		        saveStudents();
		    }
}while(choice != 14);

	    System.out.println("Program Closed");
}
	   
	 public static void addStudent() {

	        System.out.print("Enter Student ID: ");
	        studentId[count] = sc.nextInt();

	        sc.nextLine();

	        System.out.print("Enter Name: ");
	        name[count] = sc.nextLine();

	        System.out.print("Enter Age: ");
	        age[count] = sc.nextInt();

	        System.out.print("Enter Weight: ");
	        weight[count] = sc.nextDouble();

	        sc.nextLine();

	        System.out.print("Enter Belt Level: ");
	        beltLevel[count] = sc.nextLine();

	        count++;

	        System.out.println("Student Added Successfully");
	    }
	 public static void viewStudents() {

		    if(count == 0) {
		        System.out.println("No Students Found");
		        return;
		    }

		    for(int i = 0; i < count; i++) {

		        System.out.println("---------------");
		        System.out.println("Student ID : " + studentId[i]);
		        System.out.println("Name       : " + name[i]);
		        System.out.println("Age        : " + age[i]);
		        System.out.println("Weight     : " + weight[i]);
		        System.out.println("Belt Level : " + beltLevel[i]);
		    }
		  
		    }
	 public static void searchStudent() {

		    System.out.print("Enter Student ID: ");
		    int id = sc.nextInt();

		    boolean found = false;

		    for(int i = 0; i < count; i++) {

		        if(studentId[i] == id) {

		            System.out.println("Student Found");
		            System.out.println("ID : " + studentId[i]);
		            System.out.println("Name : " + name[i]);
		            System.out.println("Age : " + age[i]);
		            System.out.println("Weight : " + weight[i]);
		            System.out.println("Belt Level : " + beltLevel[i]);

		            found = true;
		            break;
		        }
		    }

		    if(found == false) {
		        System.out.println("Student Not Found");
		    }
	 }
	 public static void updateStudent() {

		    System.out.print("Enter Student ID to Update: ");
		    int id = sc.nextInt();

		    boolean found = false;

		    for(int i = 0; i < count; i++) {

		        if(studentId[i] == id) {

		            found = true;

		            sc.nextLine();

		            System.out.print("Enter New Name: ");
		            name[i] = sc.nextLine();

		            System.out.print("Enter New Age: ");
		            age[i] = sc.nextInt();

		            System.out.print("Enter New Weight: ");
		            weight[i] = sc.nextDouble();

		            sc.nextLine();

		            System.out.print("Enter New Belt Level: ");
		            beltLevel[i] = sc.nextLine();

		            System.out.println("Student Updated Successfully");

		            break;
		        }
		    }

		    if(found == false) {
		        System.out.println("Student Not Found");
		    }
		}
	 public static void deleteStudent() {

		    System.out.print("Enter Student ID to Delete: ");
		    int id = sc.nextInt();

		    boolean found = false;

		    for(int i = 0; i < count; i++) {

		        if(studentId[i] == id) {

		            found = true;

		            for(int j = i; j < count - 1; j++) {

		                studentId[j] = studentId[j + 1];
		                name[j] = name[j + 1];
		                age[j] = age[j + 1];
		                weight[j] = weight[j + 1];
		                beltLevel[j] = beltLevel[j + 1];
		            }

		            count--;

		            System.out.println("Student Deleted Successfully");
		            break;
		        }
		    }

		    if(found == false) {
		        System.out.println("Student Not Found");
		    }
		}
	 public static void markAttendance() {

		    System.out.print("Enter Student ID: ");
		    int id = sc.nextInt();

		    sc.nextLine();

		    System.out.print("Enter Status (Present/Absent): ");
		    attendanceStatus[attendanceCount] = sc.nextLine();

		    attendanceStudentId[attendanceCount] = id;

		    attendanceCount++;

		    System.out.println("Attendance Marked Successfully");
		}
	 public static void viewAttendance() {

		    if(attendanceCount == 0) {
		        System.out.println("No Attendance Records Found");
		        return;
		    }

		    for(int i = 0; i < attendanceCount; i++) {

		        System.out.println("----------------");
		        System.out.println("Student ID : " + attendanceStudentId[i]);
		        System.out.println("Status : " + attendanceStatus[i]);
		    }
		}
	 public static void registerTournament() {

		    System.out.print("Enter Student ID: ");
		    int id = sc.nextInt();

		    sc.nextLine();

		    System.out.print("Enter Tournament Name: ");
		    tournamentName[tournamentCount] = sc.nextLine();

		    tournamentStudentId[tournamentCount] = id;

		    tournamentCount++;

		    System.out.println("Tournament Registration Successful");
		}
	 public static void viewTournamentParticipants() {

		    if(tournamentCount == 0) {
		        System.out.println("No Tournament Registrations Found");
		        return;
		    }

		    for(int i = 0; i < tournamentCount; i++) {

		        System.out.println("--------------------");
		        System.out.println("Student ID : " + tournamentStudentId[i]);
		        System.out.println("Tournament : " + tournamentName[i]);
		    }
		}
	 public static void addPerformance() {

		    System.out.print("Enter Student ID: ");
		    int id = sc.nextInt();

		    System.out.print("Enter Score: ");
		    score[performanceCount] = sc.nextDouble();

		    sc.nextLine();

		    System.out.print("Enter Remarks: ");
		    remarks[performanceCount] = sc.nextLine();

		    performanceStudentId[performanceCount] = id;

		    performanceCount++;

		    System.out.println("Performance Added Successfully");
		}
	 public static void viewPerformance() {

		    if(performanceCount == 0) {
		        System.out.println("No Performance Records Found");
		        return;
		    }

		    for(int i = 0; i < performanceCount; i++) {

		        System.out.println("-------------------");
		        System.out.println("Student ID : " + performanceStudentId[i]);
		        System.out.println("Score : " + score[i]);
		        System.out.println("Remarks : " + remarks[i]);
		    }
		}
	 public static void topPerformer() {

		    if(performanceCount == 0) {
		        System.out.println("No Performance Data");
		        return;
		    }

		    int topIndex = 0;

		    for(int i = 1; i < performanceCount; i++) {

		        if(score[i] > score[topIndex]) {
		            topIndex = i;
		        }
		    }

		    System.out.println("===== TOP PERFORMER =====");
		    System.out.println("Student ID : " + performanceStudentId[topIndex]);
		    System.out.println("Score : " + score[topIndex]);
		    System.out.println("Remarks : " + remarks[topIndex]);
		}
	 public static void saveStudents() {

		    try {

		        FileWriter writer = new FileWriter("students.txt");

		        for(int i = 0; i < count; i++) {

		            writer.write(
		                studentId[i] + "," +
		                name[i] + "," +
		                age[i] + "," +
		                weight[i] + "," +
		                beltLevel[i] + "\n"
		            );
		        }

		        writer.close();

		        System.out.println("Students Saved Successfully");

		    } catch(IOException e) {

		        System.out.println("Error Saving File");
		    }
		}
}
		
	

