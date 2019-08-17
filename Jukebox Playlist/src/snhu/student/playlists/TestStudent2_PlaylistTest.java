package snhu.student.playlists;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStudent2_PlaylistTest {


	@Test
	public void testGetStudentNameList3() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent2", studentNames.get(2));							//test case to see if the second value contains the name we expect
	}

}
