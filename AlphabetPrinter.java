
public class Employee {
    int emp_code;
    String name;
    String designation;
    double salary;
    
Employee(){
emp_code=001;
name="Hamza";
designation="manager";
salary=10000;
}
Employee(int ec,String n,String d){
    emp_code=ec;
    name=n;
    designation=d;
    if(designation.equalsIgnoreCase("clerk")){
        salary=5000;
    }
    else if(designation.equalsIgnoreCase("peon")){
        salary=2000;
    }
     else if(designation.equalsIgnoreCase("manager")){
        salary=10000;
    }
     else{
         salary=1000;
     }
}
Employee(int c,String n,String d,double s){
    emp_code=c;
    name=n;
    designation=d;
    salary=s;
}
void E(){
    System.out.println("Employee details");
    System.out.println("emp_code= "+emp_code);
    System.out.println("name= "+name);
    System.out.println("designation= "+designation);
    System.out.println("salary= "+salary);
}

    void setValues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
