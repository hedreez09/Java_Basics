package Arrays;

public class StringManiputations {
    public static void main(String[] args) {

        //Using string literal
        String str1 = "hello ";
        System.out.println(str1);

        //Using string Object
        String str2 = new String(" World");
        String str3 = str1 + str2;
        //string methods
        System.out.println(str3.length());
        System.out.println(str1.concat(str2));
        System.out.println(str3.charAt(1));
        System.out.println(str3.substring(0, 5));
        System.out.println(str3.contains("saddle"));
    }
}
