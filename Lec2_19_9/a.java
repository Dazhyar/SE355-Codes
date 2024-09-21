public class a {
    public static void main(String[] args) {
        Point p1 = null;
        int i = 0;
        for (;;) {
            if (i > 9){
                System.out.println(i);
                break;
            }
            p1 = new Point();
            p1.x = i;
            i++;
        }

        System.out.println(p1.x);
    }
}