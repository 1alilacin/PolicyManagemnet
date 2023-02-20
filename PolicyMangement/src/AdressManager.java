import java.util.Iterator;
import java.util.Scanner;
public class AdressManager  {
	static Scanner scan =new Scanner(System.in);
	private User user;
	public static void addAdress(User user,Adress adress) {
		user.getAdress().add(adress);
		System.out.println("Adres eklendi");
		for(Adress adr:user.getAdress()) {
			System.out.println(adr.getCity()+adr.getTown()+adr.getStreet()+adr.getNumber());
		}
	}
	public static void deleteAdress(User user,Adress adress) {
		System.out.println("Adres silmek için 0 'a basın");
		int n=scan.nextInt();
		user.getAdress().remove(n);
	}
}
