package EmployeType;

public abstract class Employe
{
    private String nom;
    private int age;
    private String dateEntree;

    public Employe(String nom, int age, String dateEntree)
    {
            this.nom = nom;
            this.age = age;
            this.dateEntree = dateEntree;
    }

    public String getNom() {return nom;}
    public int getAge() {return age;}
    public String getDateEntree() {return dateEntree;}

    public abstract double calculateSalary();
}
