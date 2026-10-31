import java.util.*;


import EmployeType.Employe;

import Employes.Vendeur;
import Employes.Representant;
import Employes.Producteur;
import Employes.Manutentionnaire;
import Employes.ProdARisque;
import Employes.ManutARisque;

public class Salaires {
    public static void main(String[] args) {
        List<Employe> employes = new ArrayList<>();
        employes.add(new Vendeur("Mourad", 45, "1995", 30000));
        employes.add(new Representant("Mohamed", 25, "2001", 20000));
        employes.add(new Producteur("Yves", 28, "1998", 1000));
        employes.add(new Manutentionnaire("Jeanne", 32, "1998", 45));
        employes.add(new ProdARisque("Jean", 28, "2000", 1000));
        employes.add(new ManutARisque("Ali", 30, "2001", 45));
        for (Employe e : employes) {
            System.out.println(e.getNom() + " gagne " + e.calculateSalary() + " Dhs.");
        }
    }
}