package Interface_fonctionnelle;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DEMO {

	public static void main(String[] args) {
		Supplier<String>consoleReader=()->{
	    	Scanner sc=new Scanner(System.in);
	    	String texte = sc.nextLine();
	    	return texte;
	    };
	    String resultat = consoleReader.get();
	    System.out.println("Tu as saisi: "+resultat);
        I obj1=new A();
        obj1.affiche();
        Calcul obj5=new A();
        System.out.println(obj5.Calculer(1,2));
        I obj2=new B();
        obj2.affiche();
        Calcul obj6=new B();
        System.out.println(obj6.Calculer(3, 2));
        I obj3=new I() {
        	@Override
			public void affiche() {
        		System.out.println("HOLA");
        	};
        };
        obj3.affiche();
        I obj4=()->System.out.println("NAMASTE");
        obj4.affiche();
        
        
        Function<String,Integer>obj7=s->s.length();
        String chaine = "Hello world";
        int result = obj7.apply(chaine);
        System.out.println("Chaine : "+ chaine);
        System.out.println("Longueur : "+ result);
        
        Predicate<Integer>positif=n->n>0;
        int a=5;
        int b=-3;
        System.out.println(a+ " est positive? " +positif.test(a));
        System.out.println(b+ " est positive? " +positif.test(b));

        Consumer<String>a1=pre->{
				System.out.println("Bienvenue "+pre);};
	    a1.accept("Amine");
	    
	}

}
