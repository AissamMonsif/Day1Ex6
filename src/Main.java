// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(IPv4Validator.validate("192.168.1.1"));   // true
        System.out.println(IPv4Validator.validate("192.168.1.0"));   // false
        System.out.println(IPv4Validator.validate("192.168.1.255")); // false
        System.out.println(IPv4Validator.validate("256.168.1.1"));   // false
        System.out.println(IPv4Validator.validate("192.168.1"));     // false
        System.out.println(IPv4Validator.validate("192.168.1.1.1")); // false
        System.out.println(IPv4Validator.validate("192.168.a.1"));
        System.out.println(IPv4Validator.validate("19.8.1.12"));
    }
}