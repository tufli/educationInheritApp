package educationInheritApp;

public class Student extends Pupil {
						//PROPERTIES//
	private String university_name;	
	private String speciality;
						//CONSTRUCTOR//
	public Student() {}
	public Student(String fullname, int age, double average_grade, int level, String school_name,String university_name, String speciality) {
		super(fullname,age,average_grade,level, school_name);
		this.university_name = university_name;
		this.speciality = speciality;
		setLevel(level);
		setAge(age);
	}	
						//Get-Set//
	public int getLevel() {
		return level;
}
	public void setLevel(int level) {
		super.setLevel(level,1,7);
	
	}
		
	public int getAge() {
		return age;
}
	public void setAge(int age) {
		super.setAge(age,19,39);
		}
	
							//INFO//
public void printInfo() {
	
super.printInfo();
	System.out.println("> university_name: " + university_name );
	System.out.println("> speciality: " + speciality );
	}

}
