package Employes;
import EmployeTraitInterfaces.RPrime;

public class ManutARisque extends Manutentionnaire implements RPrime
{
    public ManutARisque(String nom, int age, String dateEntree, int hours)
    {
        super(nom, age, dateEntree, hours);
    }

    public String getNom()
    {
        return super.getNom().replace("Manutentionnaire", "ManutARisque");
    }

    @Override
    public double calculateSalary()
    {
        return super.calculateSalary() + PRIME;
    }
}