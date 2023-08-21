package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.lang.Math;

public class DataHelper {
    public static CardClass getApprovedCard() {
        return new CardClass("4444444444444441", "12", "25", "ANGELINA GRIGORIAN", "123");
    }

    public static CardClass getDeclinedCard() {
        return new CardClass("4444444444444442", "12", "25", "ANGELINA GRIGORIAN", "123");
    }

    public static CardClass getEmptyCard() {
        return new CardClass("", "", "", "", "");
    }
    public static CardClass getCardNumberEmpty() {
        return new CardClass("", "12", "25", "ANGELINA GRIGORIAN", "123");
    }
    public static CardClass getMonthEmpty() {
        return new CardClass("4444444444444441", "", "25", "ANGELINA GRIGORIAN", "123");
    }

    public static CardClass getYearEmpty() {
        return new CardClass("4444444444444441", "12", "", "ANGELINA GRIGORIAN", "123");
    }

    public static CardClass getCardHolderEmpty() {
        return new CardClass("4444444444444441", "12", "25", "", "123");
    }


    public static CardClass getCVCEmpty() {
        return new CardClass("4444444444444441", "12", "25", "ANGELINA GRIGORIAN", "");
    }

    public static String getShiftedMonth() {
        int shift = (int) (Math.random() * 10);
        return LocalDate.now().plusMonths(shift).format(DateTimeFormatter.ofPattern("MM"));
    }

    public static String getShiftedYear(int yearCount) {
        return LocalDate.now().plusYears(yearCount).format(DateTimeFormatter.ofPattern("YY"));
    }

    public static CardClass getNumberCard15Symbols() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(3);
        String number = faker.number().digits(15);
        return new CardClass(number, month, year, holder, cvc);
    }



    public static CardClass getCardMonth1Symbol() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = faker.number().digit();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardMonthOver12() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", "13", year, holder, cvc);
    }

    public static CardClass getCardMonth00ThisYear() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String year = getShiftedYear(0);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", "00", year, holder, cvc);
    }



    public static CardClass getCardYear1Symbol() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String year = faker.number().digit();
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardYearOver() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String year = getShiftedYear(10);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardYearUnder() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String year = getShiftedYear(-5);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardYear00() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, "00", holder, cvc);
    }

    public static CardClass getCvс1Symbol() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(1);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCvс2Symbols() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(2);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardHolder1Word() {
        Faker faker = new Faker();
        String holder = faker.name().firstName();
        String month = getShiftedMonth();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardHolderCyrillic() {
        Faker faker = new Faker(new Locale("ru"));
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardHolderNumeric() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.number().digit();
        String month = getShiftedMonth();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardHolderWithSymbols() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " %$ * &";
        String month = getShiftedMonth();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(3);
        return new CardClass("4444444444444441", month, year, holder, cvc);
    }

    public static CardClass getCardNotInDatabase() {
        Faker faker = new Faker();
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth();
        String year = getShiftedYear(1);
        String cvc = faker.number().digits(3);
        return new CardClass("1444444444444444", month, year, holder, cvc);
    }
}
