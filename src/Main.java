//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println();
        int vklad = 15000;
        int summ = 0;
        int day = 0;
        while (summ < 2459000) {
            summ = summ + vklad;
            day++;
            System.out.println("день " + day + " Итого " + summ);

        }

        // Задание 2
        System.out.println();
        int b = 0;
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println();
        // Задание 3
        System.out.println();
        int y = 12000000;
        float birth = 0.017f;
        float death = 0.008f;
        for (int year = 1; year <= 10; year++) {
            System.out.println("За " + year + " год родится " + (int) (y * birth) + " Человек");
            System.out.println("За " + year + " год  погибнет " + (int) (y * death) + " Человек");
            System.out.println("Численность населения увеличится на " + (int) (y * birth - y * death) + " Человек");
            y = (int) (y + y * (birth - death));
            System.out.println("Год " + year + " Численность населения составляет " + y);
        }
        // Задание 4
        System.out.println();
        {
            int pVklad = 15000;
            int summm = 0;
            int mounth = 0;
            for (; summm <= 12000000; ) {
                summm += (summm / 100 * 7);
                summm = pVklad + summm;
                System.out.println("За " + mounth + " месяцев, он накопит " + summm + " Рублей");
                mounth++;
            }
        }
        // Задание 5
        System.out.println();
        {
            int pVklad = 15000;
            int summm = 0;
            int mounth = 0;
            for (; summm <= 12000000; ) {
                summm = (summm + summm / 100 * 7);
                summm = pVklad + summm;

                if (mounth % 6 == 0) {
                    System.out.println("За " + mounth + " месяцев, он накопит " + summm + " Рублей");
                }
                mounth++;
            }
        }
        System.out.println();
        // Задание 6
        int pVklad = 15000;
        int summm = 0;
        int mounth = 0;
        int yearr = 9;
        yearr = yearr * 12;
        for (; mounth <= yearr; ) {
            summm = summm + (summm * 7 / 100);
            summm = pVklad + summm;

            if (mounth % 6 == 0) {
                System.out.println("За " + mounth + " месяцев, он накопит " + summm + " Рублей");
            }
            mounth++;
        }
        // Задание 7
        int dayy = 7;
        for (dayy = 1; dayy <= 31; dayy++) {
            if (dayy % 7 == 0)
                System.out.println("Сегодня пятница, " + dayy + "-е число. Необходимо подготовить отчет");
        }
        int yaerP = 2024 - 200;
        int yearB = 2024 + 100;

        for (int yyear = yaerP; yyear < yearB; yyear++) {
            if (yyear % 79 == 0) {
                System.out.println(yyear);
            }
        }


    }


}