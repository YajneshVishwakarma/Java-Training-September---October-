package Java_September_October.src.Java_30_08_2022;

public class Program55_WhatsappDriver {
    public static void main(String[] args) {
        Program55_WhatsappV2 whatsappV2 = new Program55_WhatsappV2();

        whatsappV2.message();
        whatsappV2.voiceCall();

        Program55_WhatsappV1 v1 = new Program55_WhatsappV2();
        v1.message();

        Program55_WhatsappV2 whatsappv3 = new Program55_WhatsappV2();
        whatsappv3.message();
        whatsappv3.voiceCall();

    }
}
