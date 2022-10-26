package ss16_io_text_file.practice;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.List;

public class FindMaxValue {
    //    public static int findMax(List<Integer> numbers) {
//        int max = numbers.get(0);
//        for (int i = 0; i < numbers.size(); i++) {
//            if (max < numbers.get(i)) {
//                max = numbers.get(i);
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
//        int maxValue = findMax(numbers);
//        readAndWriteFile.writeFile("result.txt", maxValue);
//    }
    public static void main(String[] args) {
        String obj = "abcdef";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 0, 3);
        int i;
        try {
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
