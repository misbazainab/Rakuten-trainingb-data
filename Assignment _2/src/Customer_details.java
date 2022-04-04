
public class Customer_details {
	int id;
	String name;
	String adress;
	String email;
	int mobile;
	int counter;
	
	public Customer_details(int id, String name, String adress, String email, int mobile) {
		super();
		this.id=generateId();
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.mobile = mobile;
	}

	private int generateId() {
	
		return counter++;

	}
	}


