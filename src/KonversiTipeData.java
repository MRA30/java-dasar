public class KonversiTipeData {

    public static void main(String[] args) {
        // widening casting (otomatis) byte->short->int->long->float->double
        // narrowing casting (manual) double->float->long->int->short->byte

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 =(float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
        byte iniByte2 = (byte) iniShort2;
    }

}
