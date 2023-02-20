
public class Main {
	public static void main(String[] args) {
		User user=new User("Ali","Laçın","1alilacin0@gmail.com",21 ,"Software Engineer");
		Adress adress=new Adress("İstanbul","Fevzi Çakmak","11","Pendik");
		user.getAdress().add(adress);
		AdressManager adressManager=new AdressManager();
		adressManager.addAdress(user, adress);
	}
}
