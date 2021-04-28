public class StrinhBufferCapacityex2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favorite langiage");
        System.out.println(sb.capacity());//now 34
        sb.ensureCapacity(10);//now no change
        System.out.println(sb.capacity());//now 34
        sb.ensureCapacity(50);//now (34*2)+2=70
        System.out.println(sb.capacity());//now 70
    }
}
