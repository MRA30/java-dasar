public class Variable {

    public static void main(String[] args) {

        // variable adalah tempat menyiman data
        // karena java adalah static type maka sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama
        // untuk penamaan tidak bisa menggunakan whote space atau seleuruhnya menggunakan angka
        String name;
        name = "Munifatir Rizqi Aziz";

        int age = 26;
        String address = "jakarta";
        name = "Budi Sudarsono";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // sejak java 10 bisa menggunakan var, yaitu bisa menampung semua tipe data tapi harus diinisiasi lansung;
        var firstName = "Munifatir";
        var middleName = "Rizqi";
        var lastName = "Aziz";

        // untuk membuat variable tidak boleh diubah valuenya setelah pertama kali dibuat makan menggunakan kata kunci final
        final String application = "Belajar Java";

    }

}
