
public class Program64_BusDriver extends Program64_KSRTC {
    public static void main(String[] args) {
        Program64_KSRTC ksrtc = new Program64_KSRTC();
        System.out.println("The number of wheels in a KSRTC bus is "+ksrtc.getNoOfWheels());
    }
}
