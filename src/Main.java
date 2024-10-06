public class Main {
    public static void main(String[] args) {

        int salary = 15000;
        int total = 0;
        int mounth = 0;
        while (total <= 2459000) {
            mounth ++;
            total = total + salary;
        }
        System.out.println("Месяц " + mounth + " сумма накоплений равна " + total + " рублей.");

        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print (a + " ");
        }
        System.out.println();
        for (a = 10; a > 0; a --) {
            System.out.print(a + " ");
        }
        System.out.println();
        int y = 12_000_000;
        int e = y / 1000 * (17 - 8);
        int year = 0;
        while (year < 10) {
            y = y + e;
            year ++;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }

        int all = 15000;
        int m = 0;
        while (all <= 12_000_000) {
            all = all + all/100*7;
            m ++;
            if (m % 6 ==0) {
            System.out.println("Месяц " + m + " сумма накоплений равна " + all + " рублей");
            }
        }
        while (m <= 108) {
            all = all + all/100*7;
            m ++;
            if (m % 6 ==0) {
                System.out.println("Месяц " + m + " сумма накоплений равна " + all + " рублей");
            }
        }

        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчет");
            friday += 7;
        }

        int begin = 2024 - 200;
        int finish = 2024 + 100;
        int p = 0;
        for (p = p + begin; p < finish; p ++) {
            if (p % 79 == 0) {
                System.out.println(p);
            }
        }

    }
}