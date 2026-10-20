package Employes;
import EmployeType.Employe;

public class Manutentionnaire extends Employe
{
    public int hours;

    public Manutentionnaire(String nom, int age, String dateEntree, int hours)
    {
        super(nom, age, dateEntree);
        this.hours = hours;
    }

    public String getNom()
    {
        return "Munutentionnaire" + super.getNom();
    }

    @Override
    public double calculateSalary()
    {
        return hours * 650;
    }
}