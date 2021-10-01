
public class Client {
	private String nom;
	Serveur tess;
	
	public Client(String newNom) {
		nom = new String ();
		nom = newNom;
	}
	
	public boolean connect(Serveur neufcube) {
		if(neufcube.connect(this) == false)
			return false;
		System.out.println("[" + this.nom +"] " + "has joined the chat");
		tess = neufcube;
		return true;
	}
	
	public boolean disconnect(Serveur neufcube) {
		if(neufcube.disconnect(this) == false)
			return false;
		System.out.println("[" + this.nom +"] " + "has left the chat");
		tess = null;
		return true;
	}
	
	public boolean talk(String guedro) {
		return tess.diffuse(this, guedro);
	}
	
	public void receive(String guedro) {
		System.out.println(guedro);
	}
	
	public String getnom() {
		return nom;
	}
}
