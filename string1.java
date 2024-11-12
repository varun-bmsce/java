public class string1{

    public static void main(String[] args) {

        String str = "Hello,im Varun!";

        char[] charArray = str.toCharArray();
   
        System.out.println("Character Array: ");
        for (char c : charArray) 
{

            System.out.print(c + " ");
        }
    }
}
