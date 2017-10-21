package se_02;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectTester {
	Project leichteFolge;

	@Before
	
	public void setUp(){
		leichteFolge=new Project(new String[][] {"vorne", "mitte"},{"mitte","hinten"});
	}

	@Test
	public void test_leichteFolge_1() {
		assertTrue(leichteFolge.isWellSorted(new String[] { "vorne", "mitte", "hinten" }));
	}
}
