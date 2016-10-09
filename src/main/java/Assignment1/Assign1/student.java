package Assignment1.Assign1;

public class student {
	private static String name;
	private static int age;
	private int idNumber;
	private String DOB;
	
	public student(String name, String DOB, int age, int idNumber){
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		this.DOB = DOB;
	}
	
	
	public String getName(){
		return name;
	}
	public void setName(String Name){
		this.name=Name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int Age){
		this.age=Age;
	}
	public static String getUsername(){
		return (name + age);
	}


	
	
}
