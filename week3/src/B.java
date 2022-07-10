public class B {
    private int x; // they are initialised to 0
    private static int y; // //initialized to zero only when class is loaded not for each object created.

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incX() {
        x++;
    }

    public void incY() {
        y++;
    }
}
