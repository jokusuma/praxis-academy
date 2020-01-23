public class Human2 {
    String maleName = "Andy";
    String femaleName = "Desy";
    int age = 10;

    public static void main(String[] args) {
        //create new male & female human object (tdk perlu 2 kali bikin object)
        Human2 gender = new Human2();
        //printing
        System.out.println("Nama : " + gender.maleName + ". Umur : " + gender.age);
        System.out.println("Nama : " + gender.femaleName + ". Umur : " + gender.age);
    }
}