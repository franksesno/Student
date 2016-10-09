package Assignment1.Assign1;

import org.joda.time.LocalDate;



public class course {
	private String courseName;
	private LocalDate startDate;
	private LocalDate endDate;
	private module modulesList[];
	
	public course(String courseName, module modulesList[], LocalDate startDate, LocalDate endDate ){
		this.courseName = courseName;
		this.modulesList = modulesList;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void setCourseName(String CourseName){
		CourseName = courseName;
	}
	
	public LocalDate getStartDate(){
		return startDate;
	}
	public void setStartDate(LocalDate StartDate){
		StartDate = startDate;
	}
	
	public LocalDate getEndDate(){
		return endDate;
	}
	public void setEndDate(LocalDate EndDate){
		EndDate = endDate;
	}
	
	public module[] getModuleList(){
		return modulesList;
	}
	
	public void setModuleList(module ModuleList[]){
		ModuleList = modulesList;
	}
}