public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // tipe data bukan primitif bisa disebut juga object
        // tipe data bukan primitif punya function/method
        // default valuenya adalah null
        Integer iniInteger = 100;
        int iniInteger1 = iniInteger;

        // untuk convert dari tipe bukan primitif ke tipe data lain bisa menggunakan function sesuai dengan tipe datanya
        short iniShort = iniInteger.shortValue();
        byte iniByte = iniInteger.byteValue();
    }
}
