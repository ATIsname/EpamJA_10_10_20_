package training.Collections.Optional;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Collectors;

public class Task {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void EntryReverseTextInFile(String fileName) {
        String reverseText = reverseString(GetStringFromFile(fileName));
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(reverseText);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }

    public static String GetStringFromFile(String NameOfFile) {
        String text = "";
        try (FileReader reader = new FileReader(NameOfFile)) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {

                text += (char) c;
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        return text;
    }

    public static void OutputReverseIntNumberByStack(int number) {
        Stack<Integer> stackIntNumber = new Stack<Integer>();
        double temp = 0;
        int size = String.valueOf(number).length();
        for (int i = 0; i < size; i++) {
            temp = number % 10;
            number /= 10;
            stackIntNumber.push((int) temp);
        }
        System.out.println(stackIntNumber);
    }

    public static void NegativeNumbersSwapToEndOfList(List<Integer> integerList) {
        List<Integer> result = integerList.stream().sorted((o1, o2) -> o2).collect(Collectors.toList());
        System.out.println(result);
    }

    public static List<Integer> createNewList() {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 15; i++) {
            int number = -15 + random.nextInt(16 + 15);
            integers.add(number);
        }
        return integers;
    }

    public static void main(String[] args) {
        String fileName = "X://Java project//maven-demo//src//someText.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        EntryReverseTextInFile(fileName);
        OutputReverseIntNumberByStack(12345678);
        String poem = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,";
        List<Integer> integerList = createNewList();
        System.out.println(integerList);
        NegativeNumbersSwapToEndOfList(integerList);
    }
}
