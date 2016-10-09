package Assignment1.Assign1;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class student_test {

	@Test
	public void test(){
			
		student s = new student ("Sesno", "01/04/1996", 20, 13467732);
		assertEquals("Sesno20", student.getUsername());
			System.out.println("Student are: " +student.getUsername() );
		
		}

	
	}