package task17;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**Task 1 */

        String bd = scanner.nextLine();
        LocalDate day = LocalDate.parse(bd);
        System.out.println(day.plusYears(100));

        /**Task 2 */

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        Predicate<Integer> isPositive = x -> x > 0;
        for (int i = 0; i < 5; i++) {
            if (isPositive.test(a[i])) {
                System.out.println(a[i]);
            }
        }

        /**Task 3 */

        String str = scanner.nextLine();
        Function<String, Double> dollars = x -> Double.valueOf(x.split(" ")[0])/3;
        System.out.println(dollars.apply(str) + "$");

        /**Task 4 */

        String summa = scanner.nextLine();
        Consumer<String> usd = x -> System.out.println(Double.valueOf(x.split(" ")[0])/3 + "$");
        usd.accept(summa);

        /**Task 5 */

        Supplier<StringBuilder> supplier = () -> new StringBuilder(scanner.nextLine()).reverse();
        System.out.println(supplier.get().toString());
    }
}
