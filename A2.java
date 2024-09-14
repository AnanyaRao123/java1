/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void raiseSalary(double percent){
        if(percent>0){
            double increment=salary*percent/100;
            salary=salary+increment;
        System.out.println("New Salary: "+salary);
        }
        else{
            System.out.println("Salary: "+salary);
        }
    }
    public void getEmpDetails(){
        System.out.println(name+" "+id+" "+salary);
    }
}
public class A2 {
    public static void main(String[] args){
        Employee emp1=new Employee(1,"Kuthyar",5000);
        emp1.getEmpDetails();
        emp1.raiseSalary(10);
        emp1.getEmpDetails();
    }
}
