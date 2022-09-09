public class Main {
    public static void main(String[] args) {
        //task1.1
        int deposit = 65535;
        int total = 0;
        for (int i = 0; total < 2_459_000; i++) {
            total = total + total / 100;
            total = total + deposit;
            //System.out.println("Месяц " + i + ", сумма накоплений равна - " + total);
        }

        //task1.2
        int u = 0;
        while (u < 10) {
            u++;
            System.out.print(u + " ");
        }
        System.out.println();
        for (; u > 0; u--) {
            System.out.print(u + " ");
        }
        System.out.println();

        //task1.3
        int people = 12_000_000;
        int up = 17;
        int down = -8;
        for (int y = 1; y < 11; y++) {
            people = people + (people / 1000 * (up + down));
            System.out.println("Год " + y + ", численность населения составляет - " + people);
        }

        //task2.1 + 2.2
        int depositVasiliy = 15000;
        int totalVasiliy = 0;
        for (int t = 0; totalVasiliy < 12_000_000; t++) {
            totalVasiliy = totalVasiliy + (totalVasiliy / 100 * 7);
            totalVasiliy = totalVasiliy + depositVasiliy;
            if (t % 6 == 0) {
                System.out.println("Месяц " + t + ", сумма на счету - " + totalVasiliy);
            }
        }

        //task 3
        int depositVasiliy1 = 15000;
        int totalVasiliy1 = 0;
        for (int a = 0; a < 109; a++) {
            totalVasiliy1 = totalVasiliy1 + (totalVasiliy1 / 100 * 7);
            totalVasiliy1 = totalVasiliy1 + depositVasiliy1;
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + " сумма на счету - " + totalVasiliy1);
            }
        }

        //task4.1
        int friday = 4;
        for (; friday < 32; friday = friday + 7) {
                System.out.println("Сегодня пятница - " + friday + " число, необходимо подготовить отчёт");
        }

        //task4.2
        int futureRange = 2122;
        int pastRange = 1822;
        for (int r = 0; r <= futureRange; r = r + 79) {
            if (r >= pastRange) {
                System.out.println(r);
            }
        }

        //task4.3
        int sum = 0;
        for (int e = 1; e < 11; e++) {
            sum = 2 * e;
            System.out.println("2*" + e + "=" + sum);
        }
    }
}