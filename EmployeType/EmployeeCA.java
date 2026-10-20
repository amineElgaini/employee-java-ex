package EmployeType;

public abstract class EmployeeCA extends Employe
{
    public double ca;

    public EmployeeCA(String nom, int age, String dateEntree, double ca)
    {
        super(nom, age, dateEntree);
        this.ca = ca;
    }
}
