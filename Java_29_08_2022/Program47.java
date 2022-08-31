
import java.util.Scanner;

class Swiggy
{

    private String hotelName;
    private int gstNo;
    private String address;
    private String bill;

    Swiggy() {

    }

    @Override
    public String toString()
    {
        return "Hotel Name: "+hotelName+" GST number: "+gstNo+" Address: "+address+" Bill: "+bill;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getGstNo() {
        return gstNo;
    }

    public void setGstNo(int getNo) {
        this.gstNo = getNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public void details()
    {
        System.out.println(this);
    }

}


