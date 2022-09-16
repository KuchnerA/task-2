import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int W = Integer.parseInt(scanner.next());
        int H = Integer.parseInt(scanner.next());
        int w = Integer.parseInt(scanner.next());
        int h = Integer.parseInt(scanner.next());


        if (0 <= W && W <= 1_000_000_000) {
            if (0 <= H && H <= 1_000_000_000) {
                if (0 <= w && w <= 1_000_000_000) {
                    if (0 <= h && h <= 1_000_000_000) {
                        if ((h <= H || h <= W) && (w <= H || w <= W)) {
                            if (h == H && w <= W) {
                                int i;
                                for (i = 1; i < W; i++) {
                                    if (W <= (int) Math.pow(w, i)) {
                                        System.out.println(i - 1);
                                        System.exit(0);
                                    }
                                }
                            } else if (w == H && h <= W) {
                                int i;
                                for (i = 1; i < W; i++) {
                                    if (W <= (int) Math.pow(h, i)) {
                                        System.out.println(i - 1);
                                        System.exit(0);
                                    }
                                }
                            } else if (w == W && h <= H) {
                                int i;
                                for (i = 1; i < H; i++) {
                                    if (H <= (int) Math.pow(h, i)) {
                                        System.out.println(i - 1);
                                        System.exit(0);
                                    }
                                }
                            } else if (h == W && w <= H) {
                                int i;
                                for (i = 1; i < H; i++) {
                                    if (H <= (int) Math.pow(w, i)) {
                                        System.out.println(i - 1);
                                        System.exit(0);
                                    }
                                }
                            } else {
                                if (h <= H && w <= W && h <= W && w <= H) {
                                    int i;
                                    for (i = 1; i < W; i++) {
                                        if (W <= (int) Math.pow(w, i)) {
                                            int j;
                                            for (j = 1; j < H; j++) {
                                                if (H <= (int) Math.pow(h, j)) {
                                                    int x = i + j - 2;
                                                    int r;
                                                    int y = 0;
                                                    for (r = 1; r < H; r++) {
                                                        if (H <= (int) Math.pow(w, r)) {
                                                            int t;
                                                            for (t = 1; t < W; t++) {
                                                                if (W <= (int) Math.pow(h, t)) {
                                                                    y = r + t - 2;
                                                                    if (x > y) {
                                                                        System.out.println(x);
                                                                        System.exit(0);
                                                                    } else System.out.println(y);
                                                                    System.exit(0);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (h <= H && w <= W) {
                                    int i;
                                    for (i = 1; i < W; i++) {
                                        if (W <= (int) Math.pow(w, i)) {
                                            int j;
                                            for (j = 1; j < H; j++) {
                                                if (H <= (int) Math.pow(h, j)) {
                                                    int x = i + j - 2;
                                                    System.out.println(x);
                                                    System.exit(0);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int r;
                                    for (r = 1; r < W; r++) {
                                        if (W <= (int) Math.pow(h, r)) {
                                            int t;
                                            for (t = 1; t < H; t++) {
                                                if (H <= (int) Math.pow(w, t)) {
                                                    int y = r + t - 2;
                                                    System.out.println(y);
                                                    System.exit(0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                        } else
                            System.out.println("-1");
                    } else
                        System.out.println("Ошибка ввода. Значения сторон должны быть в пределах от 0 до 1_000_000_000.");
                } else
                    System.out.println("Ошибка ввода. Значения сторон должны быть в пределах от 0 до 1_000_000_000.");
            } else
                System.out.println("Ошибка ввода. Значения сторон должны быть в пределах от 0 до 1_000_000_000.");
        } else
            System.out.println("Ошибка ввода. Значения сторон должны быть в пределах от 0 до 1_000_000_000.");
    }
}
