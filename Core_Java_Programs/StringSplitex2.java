public class StringSplitex2 {
    public static void main(String[] args) {
        String fname="harshal,akash,ajay";
        String[] arr=fname.split(",",2);
        for (String s:arr)
            System.out.println(s);
    }
}
