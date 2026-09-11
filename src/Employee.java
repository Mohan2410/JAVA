class Employee{
    private int eno;
    private String ename;
    private double sal;
    private String dept;

    void setEno(int eno){
        this.eno = eno;
    }
    void setEname(String ename){
        this.ename = ename;
    }
    void setSalary(double sal){
        this.sal = sal;
    }
    void setDept(String dept){
        this.dept = dept;
    }

    int getEno(){
        return eno;
    }
    String getEname(){
        return ename;
    }
    double getSalary(){
        return sal;
    }
    String getDept(){
        return dept;
    }

    void increaseSalary(){
        sal = sal + (sal * 20/100);
    }

    void display(){
        System.out.println("Employee number: "+eno);
        System.out.println("Emp name: "+ename);
        System.out.println("Salary: "+sal);
        System.out.println("Dept: "+dept);
        System.out.println();
    }

}
class Demo{
    public static void main(String[] args){
        Employee e1 = new Employee();

        e1.setEno(101);
        e1.setEname("Mohan");
        e1.setSalary(2400000.00);
        e1.setDept("MANAGER");

        e1.display();
        e1.increaseSalary();
        e1.display();


    }

}