package se_02;

public class Project {
	
	String[][] regeln;
	
	public Project(String[][] regeln) {
		this.regeln = regeln;
	}
	
	public boolean isWellSorted(String[] sequenz) {
		
		int j = 0;
		
		for(; j < regeln.length; j++) {
			
			int i = 0;
			
			for(; i < sequenz.length; i++) {
				if(regeln[j][0] == sequenz[i]) {
					break;
				}
			}
			for(i++; i < sequenz.length; i++) {
				if(regeln[j][1] == sequenz[i]) {
					break;
				}
			}
			if(i == sequenz.length) {
				return false;
			}
			
		}
		return true;
	}
}
