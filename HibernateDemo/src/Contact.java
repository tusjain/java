
public class Contact {
	private String fName;
	private String lName;
	private String eMail;
	private int id;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
		/*
		if (fName.length() < 45){
			this.fName = fName;
		}
		else{
			System.out.println("This is not a valid name");	
		}
		*/
		
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
