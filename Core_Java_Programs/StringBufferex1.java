public class StringBufferex1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        sb.append(" java");//now original string is changed
        System.out.println(sb);//prints hello java
    }
}
