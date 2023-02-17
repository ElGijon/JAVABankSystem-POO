package bankSystem;

public class Client {
	
	private String name;
	private long idNumber;

	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

    public Client(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }
	
}
