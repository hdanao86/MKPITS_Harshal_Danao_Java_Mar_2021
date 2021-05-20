public class Display {
    public boolean status=false;
    public String setDisplay(boolean b){
        status = b;
        String  str=null;

        if (status==true)
        {
            str="on";
        }
        else if(status==false){
            str="off";
        }
        return str;
    }
}
