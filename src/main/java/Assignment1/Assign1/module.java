package Assignment1.Assign1;

public class module {
	private String moduleName;
	private String ID;
	private student studentList[];
	
	public module(String moduleName, String ID, student studentList[]){
		this.moduleName = moduleName;
		this.ID = ID;
		this.studentList= studentList;
	}
	
	public String getModuleName(){
		return moduleName;
	}
	
	public void setModuleName(String ModuleName){
		ModuleName = moduleName;
	}
	
	public String getID(){
		return  ID;
	}
	public void setID(String moduleID){
		moduleID = ID;
	}
	
	public student[] getStudentList(){
		return studentList;
	}
	public void setStudentList(student StudentList[]){
		StudentList = studentList;
	}
}