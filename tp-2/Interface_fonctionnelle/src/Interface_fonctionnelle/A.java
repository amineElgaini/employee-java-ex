package Interface_fonctionnelle;

public class A implements I,Calcul {

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
        System.out.println("HELLO");
	}
	@Override
	public int Calculer(int a,int b) {
		return a+b;
	}

}
