

class Student{    
 
	String FamilyName;
	String GivenName;
	int ID;
 
	
	public Student(int aID, String aGivenName, String aFamilyName) {
		this.GivenName = aGivenName;
		this.FamilyName = aFamilyName;
		this.ID = aID;		

	}

	public String getFamilyName() {
		
		return this.FamilyName;
	}
	
	public int getID() {
		return this.ID;
	}
}  