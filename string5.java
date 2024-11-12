public class string5 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 0; 
        
        if (index >= 0 && index < str.length()) 
{

            int codePoint = str.codePointAt(index);
            System.out.println("Unicode code point at index " + index + ": " + codePoint);
        } else {
            System.out.println("Index out of range.");
        }
    }
}
