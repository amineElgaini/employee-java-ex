package Employes;
import EmployeTraitInterfaces.RPrime;

public class ProdARisque extends Producteur implements RPrime
{
    public ProdARisque(String nom, int age, String dateEntree, int units)
    {
        super(nom, age, dateEntree, units);
    }

    public String getNom()
    {
        return super.getNom().replace("Producteur", "ProdARisque");
    }

    @Override
    public double calculateSalary()
    {
        return super.calculateSalary() + PRIME;
    }
}