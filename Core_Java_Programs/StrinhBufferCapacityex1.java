public class StrinhBufferCapacityex1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favorite language");
        System.out.println(sb.capacity());//now(16*2)+2=34
    }
}
