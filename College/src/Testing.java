
public class Testing {

	public static void main(String[] args) {
		College college1=new College("GECA","Bhalchandra",5000,true,6);
		College college2=new College("WIT","Kharat",8000,true,7);
		College college3=new College("Orchid College, Solapur","Karajgi",3000,false,5);
		
		college1.printMethod();
		college2.printMethod();
		college3.printMethod();
		System.out.println(college1.getDepartments());
		college2.changePrincipal("Kahalekar");
		System.out.println(college3.addStudents(500));
}
}
class College{
	private String name;
	private String principalName;
	private int noOfStudents;
	private boolean isAutonomous;
	private int departments;
	
	public College(String name, String principalName,int noOfStudents, boolean isAutonomous, int departments) {
		this.noOfStudents = noOfStudents;
		this.name = name;
		this.principalName = principalName;
		this.isAutonomous = isAutonomous;
		this.departments = departments;
	}
	
	public College(String principalName,int noOfStudents, boolean isAutonomous, int departments) {
		this.noOfStudents = noOfStudents;
		//this.name = name;
		this.principalName = principalName;
		this.isAutonomous = isAutonomous;
		this.departments = departments;
	}
	
	public void printMethod() {
		System.out.println("College name is "+ name);
		System.out.println("Name of principal is "+principalName);
		System.out.println("There are "+departments+" in this college");
		System.out.println("This college is autonomous : "+isAutonomous);
		System.out.println("There are "+noOfStudents+" students in this college \n");
	}
	
	public int getDepartments() {
		System.out.print("Number of departments in "+name+" college :");
		return departments;
	}
	
	public void changePrincipal(String principal) {
		this.principalName=principal;
		System.out.println("New principal of "+name+" college is :"+principalName);
	}
	
	public int addStudents(int additionalStudents) {
		System.out.print("Number of students in "+name+" college after new admissions is:");
		return noOfStudents+additionalStudents;
	}
	
}
