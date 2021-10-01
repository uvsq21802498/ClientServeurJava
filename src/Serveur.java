import java.util.ArrayList;

public final class Serveur {
	ArrayList<Client> gang;
	
	public Serveur() {
		gang = new ArrayList<>();
	}
	
	public boolean connect(Client b2o) {
		if (gang.contains(b2o))
			return false;
		gang.add(b2o);
		return true;
	}
	
	public boolean disconnect(Client b2o) {
		if (gang.contains(b2o)) {
			gang.remove(b2o);
			return true;
		}
		return false;
	}
	
	public boolean diffuse(Client bicraveur, String s) {
		for (Client b2o : gang)
			b2o.receive("[" + bicraveur.getnom() +"] : " + s);
		return true;
	}
}
