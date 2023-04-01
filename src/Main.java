import java.util.Arrays;

public class Main {
//    public static void main(String[] args) {
//        int value = 33;
//        changeValue(value);
//        System.out.println("В main значение " + value);
//    }
//
//    static void changeValue(int value) {
//        value = 22;
//        System.out.println("В методе значение " + value);
//    }

//    public static void main(String[] args) {
//        Integer value = 33; // Integer - это обертка/класс для int
//        changeValue(value);
//        System.out.println("В main значение " + value);
//    }
//
//    static void changeValue(Integer value) {
//        value = 22;
//        System.out.println("В методе значение " + value);
//    }

//    public static void main(String[] args) {
//        Integer[] arr = new Integer[]{1, 2};
//        changeValue(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void changeValue(Integer[] arr) {
//        arr = new Integer[]{3, 4};
//    }

//    public static void main(String[] args) {
//        Integer[] arr = new Integer[]{1, 2};
//        changeValue(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void changeValue(Integer[] arr) {
//        arr[0] = 99;
//    }

//    public static void main(String[] args) {
//        Person person = new Person("Lyapis", "Trubetskoy");
//        changePerson(person);
//        System.out.println(person);
//    }
//
//    static void changePerson(Person person) {
//        person = new Person("Ilya", "Lagutenko");
//    }

    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
    }

    static void changePerson(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}