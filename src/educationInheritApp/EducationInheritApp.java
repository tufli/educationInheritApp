package educationInheritApp;

public class EducationInheritApp {

	public static void main(String[] args) {
		
		// Educated
		Educated JohnDoeJr= new Educated("John Doe Jr.", 17, 9.75, 10);
		JohnDoeJr.printInfo();
		//Pupil
		Pupil PutinVV= new Pupil("Putin Vladimir", 19, 8.55, 12, "Hogwarts School of Witchcraft and Wizardry");
		PutinVV.printInfo();
		//Student
		Student DodonI= new Student("Igor Dodon",35, 1.55, 5,"Scoala Nr4", "Comunhozul Nr14","President");
		DodonI.printInfo();
		//Master
		Master Flamaster= new Master ("Master-Flamaster", 30, 9.99, 3, "Liceul M.Eminescu", "USM","Java Developer");
		Flamaster.printInfo();
		}
	}
	
	
	
	
	

	
