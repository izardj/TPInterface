package service;

public class ClientService implements IClientService, IClientServiceVip {
	private int id;
	@Override
	public void direBonjour() {
			System.out.println("BONJOUR");
	}

	@Override
	public void direAuRevoir() {
		System.out.println("AU REVOIR");
	}

	@Override
	public void jeSuisVIP() {
		System.out.println("JE SUIS VIP");
	}
	
	@Override
	public String toString() {
		return "ClientService [id=" + id + "]";
	}
}
