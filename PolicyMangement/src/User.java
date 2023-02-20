import java.util.ArrayList;
import java.util.Date;

public class User {
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public ArrayList<Adress> getAdress() {
		return adress;
	}


	public void setAdress(ArrayList<Adress> adress) {
		this.adress = adress;
	}


	public Date getDateNow() {
		return dateNow;
	}


	public void setDateNow(Date dateNow) {
		this.dateNow = dateNow;
	}


	private String name;
	private String lastName;
	private String email;
	private int age;
	private String password;
	private String job;
	private ArrayList<Adress> adress;
	private Date dateNow;
	
	
	public User(String name, String lastName, String email, int age, String job) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.job = job;
		this.adress=new ArrayList<>();
	}
}
