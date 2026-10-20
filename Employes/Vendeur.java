package Employes;
import EmployeType.EmployeeCA;

public class Vendeur extends EmployeeCA
{
    public Vendeur(String nom, int age, String dateEntree, double ca)
    {
        super(nom, age, dateEntree, ca);
    }

    public String getNom()
    {
        return "Vendeur: " + super.getNom();
    }

    @Override
    public double calculateSalary()
    {
        return (ca * 20 / 100) + 4000;
    }
}