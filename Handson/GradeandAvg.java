package Handson;
import java.util.*;
class Student{
	private int id;
	private String name;
	private int[] marks;
	private float avg;
	private char grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void calculateAvg() {
		float ag=0.0F;
		for(int i=0;i<this.getMarks().length;i++) {
			ag=ag+this.marks[i];
		}
		this.setAvg(ag/this.getMarks().length);
	}
	
	public void findGrade() {
		
		if(this.getAvg()<=100&&this.getAvg()>=80)
			this.setGrade('O');
		else if(this.getAvg()<50)
			this.setAvg('F');
		else
			this.setAvg('A');
	}
}
public class GradeandAvg {
	public static Student getStudentDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stu id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name =sc.nextLine();
		System.out.println("Enter the no of subj");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter mark for subj "+(i+1));
			arr[i]=sc.nextInt();
		}
		Student s1=new Student(id,name,arr);
		s1.setId(id);
		s1.setName(name);
		return s1;
		}
	public static void main(String[] args) {
		Student st=getStudentDetails();
		st.calculateAvg();
		st.findGrade();
		System.out.println("Id is "+st.getId());
		System.out.println("Name is "+st.getName());
		System.out.println("Average is "+st.getAvg());
		System.out.println("Grade is "+st.getGrade());

	}

}
