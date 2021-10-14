
import controllers.ShopManager;
import controllers.UserManager;

public class Main {

	public static void main(String[] args) {
		
		UserManager.instance.setAdmin();
		ShopManager.instance.run();

	}

}
