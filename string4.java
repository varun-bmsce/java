public class string4{
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7; 
        if (index >= 0 && index < str.length()) {
            char character = str.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Index out of range.");
        }
    }
}
