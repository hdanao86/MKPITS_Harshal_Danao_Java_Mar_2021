public class StringBuilderex1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        sb.append("java");//now original string is changed
        System.out.println(sb);//prints hello java
    }
}
