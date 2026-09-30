public class Main {
    public static void main(String[] args) {


        // ЗАДАЧА 1: Объявление и вывод переменных

        System.out.println("--- Задача 1 ---");
        int integerNumber = 40000;
        byte byteNumber = 22;
        short shortNumber = 1500;
        long longNumber = 9223372036854775807L;
        float floatNumber = 3.75f;
        double doubleNumber = 5.99;

        System.out.println("Значение переменной integerNumber с типом int равно " + integerNumber);
        System.out.println("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);
        System.out.println(); // Пустая строка для разделения задач



        // ЗАДАЧА 2: Инициализация разных значений

        System.out.println("--- Задача 2 ---");
        double val1 = 27.12;
        long val2 = 987678965549L;
        double val3 = 2.786;
        int val4 = 569;
        short val5 = -159;
        int val6 = 27897;
        byte val7 = 67;

        System.out.println("Все переменные задачи 2 успешно инициализированы.");
        System.out.println();



        // ЗАДАЧА 3: Расчет бумаги для учеников

        System.out.println("--- Задача 3 ---");
        int lyudmilaPupils = 23;
        int annaPupils = 27;
        int ekaterinaPupils = 30;
        int totalSheets = 480;

        int totalPupils = lyudmilaPupils + annaPupils + ekaterinaPupils;
        int sheetsPerPupil = totalSheets / totalPupils;

        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги");
        System.out.println();



        // ЗАДАЧА 4: Производительность машины

        System.out.println("--- Задача 4 ---");
        int bottlesPerTwoMinutes = 16;
        int baseMinutes = 2;
        int bottlesPerMinute = bottlesPerTwoMinutes / baseMinutes;
        int minutesInDay = 24 * 60;

        // 1. За 20 минут
        int period1 = 20;
        int result1 = bottlesPerMinute * period1;
        System.out.println("За " + period1 + " минут машина произвела " + result1 + " штук бутылок");

        // 2. В сутки
        int result2 = bottlesPerMinute * minutesInDay;
        System.out.println("За сутки машина произвела " + result2 + " штук бутылок");

        // 3. За 3 дня
        int period3 = 3;
        int result3 = result2 * period3;
        System.out.println("За " + period3 + " дня машина произвела " + result3 + " штук бутылок");

        // 4. За 1 месяц (30 дней)
        int period4 = 1;
        int result4 = result2 * 30;
        System.out.println("За " + period4 + " месяц machine произвела " + result4 + " штук бутылок");
        System.out.println();



        // ЗАДАЧА 5: Расчет банок краски

        System.out.println("--- Задача 5 ---");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalCansPerClass = whiteCansPerClass + brownCansPerClass;
        int totalClasses = totalCans / totalCansPerClass;
        int totalWhiteCans = whiteCansPerClass * totalClasses;
        int totalBrownCans = brownCansPerClass * totalClasses;

        System.out.println("В школе, где " + totalClasses + " классов, нужно "
                + totalWhiteCans + " банок белой краски и "
                + totalBrownCans + " банок коричневой краски");
        System.out.println();



        // ЗАДАЧА 6: Вес спортзавтрака

        System.out.println("--- Задача 6 ---");
        int bananaCount = 5;
        int bananaWeight = 80;
        int milkVolume = 200;
        int milkBaseVolume = 100;
        int milkBaseWeight = 105;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int eggCount = 4;
        int eggWeight = 70;

        int totalBananaWeight = bananaCount * bananaWeight;
        int totalMilkWeight = (milkVolume / milkBaseVolume) * milkBaseWeight;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        int totalEggWeight = eggCount * eggWeight;

        int totalWeightGram = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        double totalWeightKilo = totalWeightGram / 1000.0;

        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGram + " г");
        System.out.println("Вес спортзавтрака в килограммах: " + totalWeightKilo + " кг");
        System.out.println();



        // ЗАДАЧА 7: Расчёт дней на похудение

        System.out.println("--- Задача 7 ---");
        int lossKilos = 7;
        int lossGrams = lossKilos * 1000;
        int minLossPerDay = 250;
        int maxLossPerDay = 500;

        int maxDays = lossGrams / minLossPerDay;
        int minDays = lossGrams / maxLossPerDay;
        int averageDays = (maxDays + minDays) / 2;

        System.out.println("Количество дней при потере 250 г в день: " + maxDays);
        System.out.println("Количество дней при потере 500 г в день: " + minDays);
        System.out.println("Среднее количество дней для достижения результата: " + averageDays);
        System.out.println();



        // ЗАДАЧА 8: Автоматизация повышения зарплаты

        System.out.println("--- Задача 8 ---");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double raisePercentage = 0.10;
        int monthsInYear = 12;

        // Маша
        int mashaRaise = (int) (mashaSalary * raisePercentage);
        int mashaNewSalary = mashaSalary + mashaRaise;
        int mashaAnnualIncrease = mashaRaise * monthsInYear;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualIncrease + " рублей.");

        // Денис
        int denisRaise = (int) (denisSalary * raisePercentage);
        int denisNewSalary = denisSalary + denisRaise;
        int denisAnnualIncrease = denisRaise * monthsInYear;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualIncrease + " рублей.");

        // Кристина
        int kristinaRaise = (int) (kristinaSalary * raisePercentage);
        int kristinaNewSalary = kristinaSalary + kristinaRaise;
        int kristinaAnnualIncrease = kristinaRaise * monthsInYear;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualIncrease + " рублей.");
    }
}








