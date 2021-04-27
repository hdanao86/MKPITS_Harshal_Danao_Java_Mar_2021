//example of setter and getter method

class student{
    private int age;
    public void setAge(int age){
        if(age<=100){
            this.age=age;
        }
        else {
            System.out.println("age is greater than 100 ");
        }
    }
    public int getAge(){
        return age;
    }
}
public class EncapsulationEx2 {
    public static void main(String[] args) {
        student s=new student();
        //s1.age=25;
        s.setAge(100);
        System.out.println("age is " + s.getAge());
    }
}
