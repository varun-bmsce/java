public class string2 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello";

        if (str1.startsWith(str2)) {
            System.out.println("The string '" + str1 + "' starts with '" + str2 + "'.");
        } else {
            System.out.println("The string '" + str1 + "' does not start with '" + str2 + "'.");
        }
    }
}
