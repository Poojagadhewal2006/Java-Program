public class Check_Upper_Lower {
    public static void main(String[] args) {
        char ch = 'A';
        if(ch >= 'A' && ch <= 'Z')
        System.out.println("Uppercase");
        else if(ch >= 'a' && ch <= 'z')
        System.out.println("Lowercase");
        else
        System.out.println("Not an alphabet");
    }
}
