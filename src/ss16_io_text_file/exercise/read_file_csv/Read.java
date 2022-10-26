package ss16_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\exercise\\read_file_csv\\countries.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Country> list = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Country country = new Country(Integer.parseInt(arr[0]), arr[1], arr[2]);
            list.add(country);
        }
        for (Country s : list) {
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
