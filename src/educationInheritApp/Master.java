package educationInheritApp;

public class Master extends Student {

		public Master() {}
		
		public Master(String fullname, int age, double average_grade, int level, String school_name,String university_name, String speciality) {
			super(fullname,age, average_grade,level,school_name,university_name,speciality);
			setLevel(level);
			setAge(age);
			}
	
		public void setLevel (int level){
			super.setLevel(level,1,3);
	}
		
		public void setAge(int age) {
			super.setAge(age,22,33);
	}
}