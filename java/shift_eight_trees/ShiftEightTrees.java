public class ShiftEightTrees {
    public static void main(String[] args) {
        System.out.println("shift_eight_trees v.1.0:\n");

        int size = 27;

        for (int i = size; i >= 1; i--) {
            for (int j = 0; j <= size; j++ ) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++ ) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

    }
}
