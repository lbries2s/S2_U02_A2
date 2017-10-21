package se_02;

public class Project {
	
	String[][] regeln;
	
	public Project(String[][] regeln) {
		this.regeln = regeln;

	}

	public boolean isWellSorted(String[] sequenz) {
		
		if(!noDuplicates(sequenz) || !isWellFormated(regeln) || sequenz.length < 2) {
			return false;
		}
	
		boolean[] checked = new boolean[regeln.length];

		
		int j = 0;
		
		for(; j < regeln.length; j++) {
			
			int i = 0;
			
			boolean found = false;
			for(; i < sequenz.length; i++) {
				if(regeln[j][0] == sequenz[i]) {
					found = true;
					break;
				}
			}
			
			if(found == false) {
				return false;
			}
			
			for(i++; i < sequenz.length; i++) {
				if(regeln[j][1] == sequenz[i]) {
					break;
				}
			}
			if(i == sequenz.length) {
				return false;
			} else {
				checked[j] = true;
			}
			
		}
		for(int k = 0; k < checked.length; k++) {
			if(checked[k]==false) {
				return false;
			}
		}
		return true;
	}
	
	private boolean noDuplicates(String[] sequenz) {
		
		for(int i = 0; i < sequenz.length; i++) {
			for(int j = i + 1; j < sequenz.length; j++) {
				if(sequenz[i]==sequenz[j]) {
					return false;
				}
			}
		}
		return true;
	}
	private boolean isWellFormated(String[][] regeln) {
		for(int i = 0; i < regeln.length; i++) {
			if(!(regeln[i].length == 2)) {
				return false;
			}
		}
		return true;
	}
}
