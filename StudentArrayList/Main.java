import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//create ArrayList of type Student, add 10 students with random rollnos
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(364, "Alfred", "4369 Sesame Lane"));
		studentList.add(new Student(657, "Bob", "1865 Acorn Lane"));
		studentList.add(new Student(345, "Chris", "65 1st St"));
		studentList.add(new Student(670, "Dylan", "654 Red Lane"));
		studentList.add(new Student(956, "Ethan", "253 Blue Lane"));
		studentList.add(new Student(194, "Frank", "7547 Green Lane"));
		studentList.add(new Student(103, "Greg", "34 Yellow Lane"));
		studentList.add(new Student(553, "Hillary", "53 Purple Lane"));
		studentList.add(new Student(789, "Igor", "643 Christmas Lane"));
		studentList.add(new Student(421, "Kim", "23 Oak Lane"));
		
		//print unsorted list
		System.out.println("Unsorted List:");
		for(Student str: studentList){
			System.out.println(str);
		}
		//line break for visibility between unsorted/sorted lists
		System.out.println("-----------------------------------");
		
		//checks if out of order by rollno, switches if so
		for(int i=0;i<studentList.size();i++){
			for(int j=i+1;j<studentList.size();j++) {
				Student tempI=studentList.get(i);
		        Student tempJ=studentList.get(j);

		        if(tempI.getRollno()>tempJ.getRollno()){
		        	   	studentList.set(i, tempJ);
		        	   	studentList.set(j, tempI);
		           		}
		        }
		}
		//print sorted list
		System.out.println("Sorted List by Rollno:");
		for(Student str: studentList){
			System.out.println(str);
	   }
	}
}
