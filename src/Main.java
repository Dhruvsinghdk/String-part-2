


public class Main {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello world");
//s.append("world");
//        System.out.println(s);
//        System.out.println(s.capacity());

        System.out.println(s.charAt(2));
//        System.out.println(s.reverse());
        s.insert(1,"p");
        System.out.println(s);

        System.out.println(s.delete(1,3));
        System.out.println(s.replace(2,4,"happy"));
    }
}