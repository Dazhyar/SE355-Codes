public class main {
    public static void main(String[] args) {
        // linked list data structure using points
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();

        a.x = 2;
        a.y = 3;
        a.next = b;

        b.x = 20;
        b.y = 30;
        b.next = c;

        c.x = 200;
        c.y = 300;

        Point current = a;
        while(current != null) {
            System.out.println(current.x + ", " + current.y);
            current = current.next;
        }
    }
}
