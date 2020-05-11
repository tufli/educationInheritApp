package educationInheritApp;

					//Properties//
class Educated{
	String fullname;     
	int   age;          
	double average_grade; 
	int level;
					
					//CONSTRUCTOR//
	public Educated() {}
public Educated(String fullname, int age, double average_grade, int level) {
	setFullname(fullname);
	setAge(age);
	setAverage_grade(average_grade);
	setLevel(level);
}

					//Get-Set//
	public String getFullname() {
		return fullname;
}
	public void setFullname(String fullname) {
		this.fullname = fullname;
}

	public int getAge() {
		return age;
}
	public void setAge(int age) {
		this.age = age;
}

	public double getAverage_grade() {
		return average_grade;
	}
	public void setAverage_grade(double average_grade) {
		if (average_grade>=1.0 && average_grade<=10.0)
			this.average_grade= average_grade;
		else System.err.println("Wrong average_grade");
}
	public int getLevel() {
		return level;
}
	public void setLevel(int level) {
		this.level = level;
	}

		//INFO//
	public void printInfo() {
				System.out.println();
				System.out.println("> fullname: "+fullname+" ( "+ age+ "years "+")");
				System.out.println("> class: " + level);
				System.out.println("> grade: " + average_grade);
				
}

}












