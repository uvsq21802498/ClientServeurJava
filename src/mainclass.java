
public class mainclass {

	public static void main(String[] args) {
		Serveur Dealer = new Serveur();
		Client b2o = new Client("B2O");
		Client k2a = new Client("K2A");
		
		b2o.connect(Dealer);
		b2o.talk("Le réchauffement climatique c'est dû à ** ****** a ** ****\navec l'effet de serre");
		k2a.connect(Dealer);
		k2a.talk("Aquaplanning à l'entrée de ** *******");
		b2o.talk("** **** la wizigoth");
		b2o.disconnect(Dealer);
		k2a.disconnect(Dealer);
		b2o.connect(Dealer);
		b2o.talk("j'lui ai ******* les ***** c'est *** ****** qui applaudissent");
		b2o.disconnect(Dealer);
	}

}
