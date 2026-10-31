package Employes;
import EmployeType.Employe;

public class Producteur extends Employe
{
    public int units;

    public Producteur(String nom, int age, String dateEntree, int units)
    {
        super(nom, age, dateEntree);
        this.units = units;
    }


    public String getNom()
    {
        return "Producteur: " + super.getNom();
    }

    @Override
    public double calculateSalary()
    {
        return units * 5;
    }
}