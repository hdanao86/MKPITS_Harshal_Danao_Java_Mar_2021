public class Emp implements Cloneable {
    int empno;
    String empname;
    Emp(int empno,String empname){
        this.empno=empno;
        this.empname=empname;
    }
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Emp e1 = new Emp(111, "amit");
            Emp e2 = (Emp) e1.clone();
            System.out.println(e1.empno + " : " + e1.empname);
            System.out.println(e2.empno + " : " + e2.empname);
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.toString());
        }
    }
}
