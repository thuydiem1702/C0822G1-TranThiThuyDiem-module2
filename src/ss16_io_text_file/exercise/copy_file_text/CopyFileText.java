package ss16_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\exercise\\copy_file_text\\source.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> list = new ArrayList<>();
        String line;
        String[] array;
        int sum=0;
        while ((line = bufferedReader.readLine()) != null) {
            array = line.split("");
            sum += array.length;
            list.add(line);
        }
        System.out.println("Số kí tự trong tệp: " + sum);
        bufferedReader.close();

        File file1 = new File("src\\ss16_io_text_file\\exercise\\copy_file_text\\target.txt");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String c : list) {
            bufferedWriter.write(c);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
