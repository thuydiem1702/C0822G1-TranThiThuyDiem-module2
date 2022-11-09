package weekkkk;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static void main(String[] args) {
        List<Posts> postsList = new ArrayList<>();
        postsList.add(new Posts(1, "Đà Nẵng", "đi đâu", "Biển", 2000));
        postsList.add(new Posts(2, "Quảng Nam", "đi đâu", "Phố cổ", 50000));
        writeFile("src\\weekkkk\\posts.csv", postsList);
        for (String c : readFile()) {
            System.out.println(c);
        }
    }

    public static void writeFile(String path, List<Posts> list) {

        try {
            File file1 = new File(path);
            FileWriter fileWriter = new FileWriter(file1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Posts item : list) {
                bufferedWriter.write(String.valueOf(item));
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile() {
        List<String> list = new ArrayList<>();
        try {
            File file = new File("src\\weekkkk\\posts.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
