package nl;

import java.util.HashMap;

/**
 */
class Problems {

    static HashMap<Integer, String> numberMap = new HashMap();
    static StringBuffer builder = new StringBuffer();
    static {
        numberMap.put(1, "one");
        numberMap.put(2, "two");
        numberMap.put(3, "three");
        numberMap.put(4, "four");
        numberMap.put(5, "five");
        numberMap.put(6, "six");
        numberMap.put(7, "seven");
        numberMap.put(8, "eight");
        numberMap.put(9, "nine");
        numberMap.put(10, "ten");
        numberMap.put(11, "eleven");
        numberMap.put(12, "twelve");
        numberMap.put(13, "thirteen");
        numberMap.put(14, "fourteen");
        numberMap.put(15, "fifteen");
        numberMap.put(16, "sixteen");
        numberMap.put(17, "seventeen");
        numberMap.put(18, "eighteen");
        numberMap.put(19, "nineteen");
        numberMap.put(20, "twenty");
        numberMap.put(30, "thirty");
        numberMap.put(40, "forty");
        numberMap.put(50, "fifty");
        numberMap.put(60, "sixty");
        numberMap.put(70, "seventy");
        numberMap.put(80, "eighty");
        numberMap.put(90, "ninety");
        numberMap.put(100, "hundred");
        numberMap.put(1000, "thousand");

    }

    private static String noToWordsNoSpaces(int number) {
        builder.delete(0, builder.capacity()-1);
        int rem = number;
        int quotient = 0;
        //small numbers
        if (number <= 20) {
            return numberMap.get(number);
        } else if (number < 100) {
            quotient = rem / 10;
            rem = rem % 10;
            return String.format("%s%s", numberMap.get(quotient * 10), ((rem > 0) ? numberMap.get(rem) : ""));
        }
        //larger numbers
        quotient = rem / 1000;
        rem = rem % 1000;
        if (quotient > 0) {
            builder.append(String.format("%s%s", numberMap.get(quotient), numberMap.get(1000)));
        }
        quotient = rem / 100;
        rem = rem % 100;
        if (quotient > 0) {
            builder.append(String.format("%s%s", numberMap.get(quotient), numberMap.get(100)));
        }
        if (rem == 0) {
            return builder.toString();
        } else {
            if (rem <= 20) {
                builder.append(String.format("and%s", numberMap.get(rem)));
            } else {
                quotient = rem / 10;
                rem = rem % 10;
                builder.append(String.format("and%s%s", numberMap.get(quotient * 10), ((rem > 0) ? numberMap.get(rem) : "")));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i <= 5; i++) {
            answer += noToWordsNoSpaces(i).length();
        }
        System.out.println(answer);
        answer = 0;
        for (int i = 1; i <= 1000; i++) {
            answer += noToWordsNoSpaces(i).length();
        }
        System.out.println(answer);
    }
}