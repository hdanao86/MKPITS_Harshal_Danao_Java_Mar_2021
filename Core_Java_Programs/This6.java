//to refer to current class method class dog

class dog
{
    String dogname;
    String dogbreed;
    void getdata(String dogname,String dogbreed)
    {
        this.dogname=dogname;
        this.dogbreed=dogbreed;
        this.displaydata();

    }
    void displaydata()
    {
        System.out.println(dogname + dogbreed);
    }
}
public class This6 {
    public static void main(String[] args) {
        dog d=new dog();
        d.getdata(" tommy "," labrador ");

    }
}
