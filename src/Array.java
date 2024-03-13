public class Array {
    public static void main(String[] args) {
        // index array dimulai dari 0
        // index array terakhir dari jumlah panjang array dikurang 1;
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Munifatir";
        stringArray[1] = "Rizqi";
        stringArray[2] = "Aziz";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budi";

        System.out.println(stringArray[0]);

        String[] stringNama ={
                "Munifatir",
                "RIzqi",
                "Aziz"
        };

        int[] intArray = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] longArray = {
                1000000L,
                2000000L,
                3000000L
        };

        String[][] members = {
                {"Munifatir", "Rizqi"},
                {"Budi", "Sudarsono"},
                {"Toni"}
        };

        System.out.println(members[0][1]);
    }
}
