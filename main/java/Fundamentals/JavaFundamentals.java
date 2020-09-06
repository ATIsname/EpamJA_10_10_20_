package Fundamentals;

import java.util.*;

public class JavaFundamentals {

    public enum MonthNames{
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }

    private static void HelloUserName(String name){
        System.out.println("Hello, " + name);
    }

    public static void SetRandomValuesToIntArray(int[] ints){
        Random r = new Random();
        for (int i = 0; i < ints.length; i++) {
             ints[i] = r.nextInt(6 + 10);
        }
    }

    public static void OutInColumn(int[] ints){
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static void OutInString(int[] ints){
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

    public static void InputNumbersInDoubleList(ArrayList<Double> doubles){
        System.out.println("Input number, if you wont to end entering of numbers input NAN");
        Scanner in = new Scanner(System.in);
        while(in.hasNextDouble()){
            doubles.add(in.nextDouble());
        }
    }

    public static Double GetArrayListSum(ArrayList<Double> doubles){
        double sum = 0;
        for (Double aDouble : doubles) {
            sum+=aDouble;
        }
        return sum;
    }

    public static Double GetArrayListMultiplication(ArrayList<Double> doubles){
        double sum = doubles.isEmpty()  ? 0 : 1;
        for (Double aDouble : doubles) {
            sum*=aDouble;
        }
        return sum;
    }

    public static void OutputTheMostShortAndLongNumbers(ArrayList<Double> doubles){
        int maxLength = (String.valueOf(doubles.get(0))).replaceAll("\\.", "").length();;
        int minLength = (String.valueOf(doubles.get(0))).replaceAll("\\.", "").length();;
        int tempLength = (String.valueOf(doubles.get(0))).length();
        Double maxLengthNumber = doubles.get(0);
        Double minLengthNumber = doubles.get(0);
        for (Double aDouble:
             doubles) {

            tempLength = (String.valueOf(aDouble)).replaceAll("\\.", "").length();
            if(tempLength > maxLength){
                maxLength = tempLength;
                maxLengthNumber = aDouble;
            }
            if(tempLength < minLength){
                minLength = tempLength;
                minLengthNumber = aDouble;
            }
        }
        System.out.println("Max length of number = " + maxLength + "  and number = " + maxLengthNumber);
        System.out.println("Min length of number = " + minLength + "  and number = " + minLengthNumber);
        ArrayList<String> strings = new ArrayList<String>();
        for (double aDouble: doubles){
            strings.add(String.valueOf(aDouble));
        }
        Comparator c = Collections.reverseOrder((x,y) -> Integer.compare(x.toString().length(), y.toString().length()));
        strings.sort((x,y) -> Integer.compare(x.length(), y.length()));
        for (String string : strings) {
            System.out.println(string + " " + string.replaceAll("\\.", "").length());
        }
        System.out.println();
        Collections.sort(strings, c);
        for (String string : strings) {
            System.out.println(string + " " + string.replaceAll("\\.", "").length());
        }
    }

    public static void main (String [] args) {
        //Main task in turn
        System.out.println("Hello, what is your name?");
        Scanner in = new Scanner(System.in);
        HelloUserName(in.nextLine());
        System.out.println();

        System.out.println("Input some string to get reverse string");
        in = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(in.nextLine());
        System.out.println(stringBuilder.reverse());

        System.out.println("Input count of numbers");
        in = new Scanner(System.in);
        int countOfNumbers = in.nextInt();
        int[] ints;
        if(countOfNumbers>0){
            ints = new int[countOfNumbers];
            SetRandomValuesToIntArray(ints);
            OutInColumn(ints);
            OutInString(ints);
        }
        else{
            System.out.println("Count of numbers must be more then 0");
        }
        System.out.println();

        ArrayList<Double> doubles = new ArrayList<Double>(1);
        InputNumbersInDoubleList(doubles);
        System.out.println("Multiplication = " + GetArrayListMultiplication(doubles));
        System.out.println("Sum = " + GetArrayListSum(doubles));

        EnumMap<MonthNames,Integer> NameAndNumberOfMonths = new EnumMap<MonthNames, Integer>(MonthNames.class);
        NameAndNumberOfMonths.put(MonthNames.January,1);
        NameAndNumberOfMonths.put(MonthNames.February,2);
        NameAndNumberOfMonths.put(MonthNames.March,3);
        NameAndNumberOfMonths.put(MonthNames.April,4);
        NameAndNumberOfMonths.put(MonthNames.May,5);
        NameAndNumberOfMonths.put(MonthNames.June,6);
        NameAndNumberOfMonths.put(MonthNames.July,7);
        NameAndNumberOfMonths.put(MonthNames.August,8);
        NameAndNumberOfMonths.put(MonthNames.September,9);
        NameAndNumberOfMonths.put(MonthNames.October,10);
        NameAndNumberOfMonths.put(MonthNames.November,11);
        NameAndNumberOfMonths.put(MonthNames.December,12);

        Set<Map.Entry<MonthNames, Integer>> entrySet= NameAndNumberOfMonths.entrySet();
        System.out.println("Input number of month from 1 too 12");
        in = new Scanner(System.in);
        Integer numberOfMonth = in.nextInt();
        numberOfMonth = numberOfMonth > 0 && numberOfMonth < 13 ? numberOfMonth : 1;
        for (Map.Entry<MonthNames, Integer> pair : entrySet) {
            if (numberOfMonth.equals(pair.getValue())) {
                System.out.println(pair.getKey());
            }
        }

        // Optional task
        in = new Scanner(System.in);
        doubles = new ArrayList<Double>();
        InputNumbersInDoubleList(doubles);
        OutputTheMostShortAndLongNumbers(doubles);

    }
}
