package Employes;
import EmployeType.EmployeeCA;

public class Representant extends EmployeeCA
{

    public Representant(String nom, int age, String dateEntree, double ca)
    {
        super(nom, age, dateEntree, ca);
    }


    public String getNom()
    {
        return "Representant: " + super.getNom();
    }

    @Override
    public double calculateSalary()
    {
        return (ca * 20 / 100) + 8000;
    }
}