import java.util.ArrayList;

public abstract class Account {
	private User user;
	private ArrayList<Insurence> insurences;
	private AuthenticationStatus authenticationStatus;
	
	
	public final void showUserInfo() {
		System.out.println("Müşteri adı: "+user.getName());
		System.out.println("Müşteri Soyadı: "+user.getLastName());
		System.out.println("Müşteri Email: "+user.getEmail());
		System.out.println("Müşteri Yaşı: "+user.getAge());
		System.out.println("Müşteri Mesleği: "+user.getJob());
		System.out.println("Müşteri Adresi: "+user.getAdress());
	}
	
	public void login(String email,String password,User user) {
		if(email.equals(user.getEmail())&&password.equals(user.getPassword())) {
			System.out.println("Giriş Başarılı !!!"+authenticationStatus.SUCCES);
		}
		else {
			System.out.println("Kullanıc bilgileri veya parola hatalı!!"+authenticationStatus.FAİL);
		}
	}
	
	public abstract void addInsurence();
}
