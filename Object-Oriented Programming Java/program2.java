import javax.swing.plaf.synth.SynthSplitPaneUI;

class company{
    private int code;
    String name;
    int salary;

    company(){
        this.code = 0;
        this.name = "";
        this.salary = 2030;
    }

    void input(int c, String n, int s){
        this.code = c;
        this.name = n;
        this.salary = s;
    }

    void output(){
        System.out.println("Name : " + name);
        System.out.println("Code : " + code);
        System.out.println("Salary : " + salary);
    }

    //defining the setter 
    void inputCode(int c){
        this.code = c;
    }
    
    //defining the getter
    int getCode(){
        return(code);
    }
}
public class program2 {
    public static void main(String[] args) {
        company emp1 = new company();
        emp1.input(1234, "Aditya Patel", 200000);
        emp1.output();
        System.out.println("Code " + emp1.getCode());

        //making the second object and manually entering the details into it
        company emp2 = new company();
        emp2.name = "Kamleshkumar Patel";
        emp2.inputCode(9871364);
        emp2.salary = 111111;
        
        System.out.println("Printing the Code of the Employee : ");
        System.out.println(emp2.getCode());

        System.out.println("Printing the details of the employee : ");
        emp2.output();


    }
}
