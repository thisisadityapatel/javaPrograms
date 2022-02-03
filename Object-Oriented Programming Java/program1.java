//Object Oriented Programming Java Program 1
class students{

    //attributes
    int code;
    String name;
    int marks;

    //constructor
    students(){
        this.name = "";
        this.code = 0;
        this.marks = 0;
    }

    //function to take the input into the obejct of the class
    void input(int c, String n, int m){
        this.code = c;
        this.name = n;
        this.marks = m;
    }
    //function to show the output of the object stored data
    void output(){
        System.out.println("Name  : " + name);
        System.out.println("Code  : " + code);
        System.out.println("Marks : " + marks);
    }
}
public class program1 {
    public static void main(String[] args) {
        //making the object refference
        students stud1 = new students();
        stud1.input(2112, "Aditya Patel", 98);
        stud1.output();

        students stud2 = new students();
        stud2.output();

        //accessing the objects directly 
        students stud3 = new students();
        stud3.code = 23444;
        stud3.name = "Ayushi Pragya";
        stud3.marks = 100;

        //manually printing the outputs directly by reaching out to the objects
        System.out.println("Name : " + stud3.name);
        System.out.println("Code : " + stud3.code);
        System.out.println("Marks : " + stud3.marks);
    }
}