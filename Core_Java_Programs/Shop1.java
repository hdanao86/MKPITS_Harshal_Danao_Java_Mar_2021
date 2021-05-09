import java.security.acl.Owner;

public class Shop {
    private String shop_no;
    private String city;
    private String owner;
    private String address;
    public void setshop_no(String shop_no) {
        this.shop_no=shop_no;
    }
    public String getshop_no() {
        return  shop_no;
    }
    public void setcity(String city) {
        this.city=city;
    }
    public String getcity() {
        return  city;
    }
    public void setOwner(String owner) {
        this.owner=owner;
    }
    public String getowner() {
        return  owner;
    }
    public void setaddress(String address) {
        this.address=address;
    }
    public String getAddress() {
        return  address;
    }
    public String  addShop(String shop_no,String city,String owner,String address) {
        setshop_no(shop_no);
        setcity(city);
        setOwner(owner);
        setaddress(address);
        return   "shop added successfully";
    }
    public  String removeShop() {
        shop_no="";
        city="";
        owner="";
        address="";
        return   "shop removed successfully";
    }

}
