package se_02;

public class Project {

	String[][] rules;

	public Project(String[][] rules) {
		this.rules = rules;
	}

	public boolean isWellSorted(String[] reihe) {
		if (reihe.length <=2) {
			return false;
		}
		int regel;
		for (int i = 0; i < reihe.length - 1; ++i) {
			regel = 0;
			for ( int j = 0; j < rules.length; ++j) {
				if (rules[j][0].equals(reihe[i]) && rules[j][1].equals(reihe[i + 1])) {
					regel = 1;
				}
			}
			if (regel == 0) {
				return false;
			}
		}
		return true;
	}

}
