public class SumOfNo {
    public static void main(String[] args) {
        int l = 5;
        int h = 10;
        int ls = 0;
        int hs = 0;
        for (int i = 1; i <= l; i++) {
            ls += i;
        }
        System.out.println("low sum is : " + ls);

        for (int j = 1; j <= h; j++) {
            hs += j;
        }
        System.out.println("High sum is : " + hs);

        int os = hs - ls;
        System.out.println("Result is : " + os);

    }
}
