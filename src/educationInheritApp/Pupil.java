package educationInheritApp;

public class Pupil extends Educated {
	
	private String school_name;
		
					//CONSTRUCTOR//
	
	Pupil(){}
	
	public Pupil(String fullname, int age, double average_grade, int level, String school_name) {
		super(fullname,age,average_grade,level);
		setSchool_name(school_name);
		setLevel(level);
	}
	
					//Get-Set//
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	
	public void setLevel() {
		setLevel(level,1,12);
}
	public void setLevel(int level, int minLevel, int maxLevel ) {
		if (level>=minLevel && level<=maxLevel)
		this.level = level;
		else {System.err.println("Wrong LEVEL"+minLevel+" , "+maxLevel);
		}
}          
	
	public void setAge() {
		setAge (age,6,20);
}
	public void setAge(int age, int minAge, int maxAge) {
		if (age>=minAge && age<=maxAge)
		this.age = age;
		else {System.err.println("Wrong AGE. Possible value 1-20");
		}
}
	
					//INFO//
	public void printInfo() {
				
			super.printInfo();
				System.out.println("> school_name: " + school_name );
	}
	
}
