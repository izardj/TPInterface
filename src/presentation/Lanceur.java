package presentation;

import service.ClientService;
import service.IClientService;
import service.IClientServiceVip;

public class Lanceur {

	public static void main(String[] args) {
		// declaration de l'interface
		IClientService c = new ClientService();
		IClientServiceVip cvip = new ClientService();
		
		// declaration de la classe
		ClientService cs = new ClientService();
		
		// utilisation de l'interface ClientService
		System.out.println("---------------CLIENT NORMAL--------------");
		c.direBonjour();
		c.direAuRevoir();
		
		// utilisation de l'interface ClientVIPService
		System.out.println("---------------CLIENT VIP--------------");
		cvip.direBonjour();
		cvip.jeSuisVIP();
		cvip.direAuRevoir();
		
		// utilisation de la classe
		cs.direBonjour();
		cs.jeSuisVIP();
		cs.direAuRevoir();
		
		//hjgdsfkjfgds
	}
}
