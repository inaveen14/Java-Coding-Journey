public class Javadayone{
    public static void drawPattern(int row, int col) { // Changed to 'void'
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // No return needed now!
    }

    public static void main(String[] args) {
        drawPattern(4, 5); // No System.out.println here!
    }
}
