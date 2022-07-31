package Simpli_Assignment;

public class StringBuffers{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("started java");
        System.out.println(sb.append("phasel"));
        System.out.println(sb.delete(2, 5));
        System.out.println(sb.replace(4, 10, "python"));
        System.out.println(sb.insert(4, "language"));
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(9));
}
}
