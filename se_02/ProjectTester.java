package se_02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectTester {
	Project leichteFolge;
	Project falscheFolge;

	@Before

	public void setUp() {
		leichteFolge = new Project(new String[][] { { "vorne", "mitte" }, { "mitte", "hinten" } });
	falscheFolge=new Project(new String[][] { { "Huhn", "Ei" },{"Ei","Huhn"}});
	}

	@Test
	public void test_leichteFolge_1() {
		assertTrue(leichteFolge.isWellSorted(new String[] { "vorne", "mitte", "hinten" }));
	}

	@Test
	public void test_leichteFolge_2() {
		assertFalse(leichteFolge.isWellSorted(new String[] { "hinten", "mitte", "vorne" }));
	}

	@Test
	public void test_leichteFolge_3() {
		assertFalse(leichteFolge.isWellSorted(new String[] { "mitte", "vorne", "hinten" }));
	}

	@Test
	public void test_leichteFolge_4() {
		assertFalse(leichteFolge.isWellSorted(new String[] { "mitte", "hinten" }));
	}

	@Test
	public void test_leichteFolge_5() {
		assertFalse(leichteFolge.isWellSorted(new String[] {}));
	}
	@Test
	public void falscheFolge_1() {
		assertFalse(leichteFolge.isWellSorted(new String[] {"Ei","Huhn" }));
	}
	@Test
	public void falscheFolge_2() {
		assertFalse(leichteFolge.isWellSorted(new String[] {"Huhn","Ei","Huhn" }));
	}
}