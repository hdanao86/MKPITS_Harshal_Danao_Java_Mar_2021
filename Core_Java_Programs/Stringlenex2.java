public class Stringlenex2 {
    public static void main(String[] args) {
        String s=new String("example");//creating java string by new keyword
        int c=s.length();
        for(int i=0;i<c;i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
