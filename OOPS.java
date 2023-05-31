public class OOPS {
    // public static void main(String args[]) {
    //     Pen p1 = new Pen();
    //     p1.setColor("Blue");
    //     // System.out.println(p1.getColor());
    //     p1.setTip(5);
    //     // System.out.println(p1.getTip());

    //     Student s1 = new Student();
    //     // Student s2 = new Student("prashant");
    //     // Student s3 = new Student(21);
    //     s1.name = "prashant";
    //     s1.roll = 23;
    //     s1.password = "abcd";
    //     s1.marks[0] = 100;
    //     s1.marks[1] = 90;
    //     s1.marks[2] = 80;

    //     Student s2 = new Student(s1);
    //     s2.password = "xyz";
    //     s1.marks[2]=100;
    //     for (int i = 0; i < 3; i++) {
    //         System.out.println(s2.marks[i]);
    //     }
    // }

    // // inheritance
    public static void main(String[]args){
        Fish shark = new Fish();
        shark.breath();
    }
}
//inheritance
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    } 
    void breath(){
        System.out.println("breath");
    }
} 
//derive class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
}




// constructor
class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // non parameter
    Student() {
        this.marks = new int[3];
        System.out.println("constructor is called.....");
    }

    // // parameter
    // Student(String name) {
    //     this.name = name;
    // }

    // Student(int roll) {
    //     this.roll = roll;
    // }

    // // shallow copy constructor
    // Student(Student s1) {
        //marks =new int[3];
    //     this.marks = s1.marks;
    //     this.name = s1.name;
    //     this.roll = s1.roll;

    // }


    //deep copy constructor
    Student(Student s1){
        marks =new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

