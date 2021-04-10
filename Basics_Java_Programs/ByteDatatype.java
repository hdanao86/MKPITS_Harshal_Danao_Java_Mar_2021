//wap to accept number of byte datatype
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;
public class ByteDatatype {
    public static void main(String[] args){
        byte b = 10;
        System.out.println("b ="+b);
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        b=s.nextByte();
        System.out.println("number =" +b);
    }
}
