package Interface_fonctionnelle;

public class B implements I,Calcul {

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
        System.out.println("BONJOUR");
	}
	@Override
	public int Calculer(int a,int b) {
		return a*b;
	}
}
