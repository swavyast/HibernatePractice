package hibernate_01;

public class Customer {
	private int cid;
	private String cname;
	private int age;
	private String email;
	private long phone;
	private String city;
	private double bal;
	
	public Customer() {
		System.out.println("Default Constructor in Customer Class");
	}
	
	public Customer(String cname, int age, String email, long phone, String city, double bal) {
		System.out.println("Parametrised Constructor in Customer Class");
		this.cname = cname;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
	public static void main(String[] args) {
		System.out.println("Main in Customer");
	}
}
