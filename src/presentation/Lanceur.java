package presentation;

import service.ClientService;
import service.IClientService;
import service.IClientVIPService;

public class Lanceur {

	public static void main(String[] args) {
		// declaration de l'interface
		IClientService c = new ClientService();
		IClientVIPService cvip = new ClientService();
		
		// declaration de la classe
		ClientService cs = new ClientService();
		
		// utilisation de l'interface ClientService
		c.direBonjour();
		c.direAuRevoir();
		
		// utilisation de l'interface ClientVIPService
		cvip.direBonjour();
		cvip.jeSuisVIP();
		cvip.direAuRevoir();
		
		// utilisation de la classe
		cs.direBonjour();
		cs.jeSuisVIP();
		cs.direAuRevoir();
	}
}
