public class Student {
    private int rno=22;
    class address
    {
        public void showdata()
        {
            System.out.println("rno = " + rno);
        }
    }
}
class testinner
{
    public static void main(String[] args) {
        Student s=new Student();
        Student.address sa=s.new address();
        sa.showdata();
    }
}
