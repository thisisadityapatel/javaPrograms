class people{
    String name;
    int age;

    people(){
        this.name = "";
        this.age = 0;
    }
    
    void input(String n, int a){
        this.name = n;
        this.age = a;
    }

    void output(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}

class students extends people{
    int code;
    students(){
        this.code = 0;
    }

    void results(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.code);
    }
}

public class program3 {
    public static void main(String[] args) {
        students s1 = new student();
        s1.input("Aditya", "19");
        s1.results();
    }
}
