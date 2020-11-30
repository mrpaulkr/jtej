package JavaCollections;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class CollectionalOptionalTask {


    public static void main(String[] args) {
//        task_1("optionalTask_1.txt");
        task_6("task_6.txt");



}
    public static void task_4(String fileWithPoem){
        Comparator c = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        ArrayList<String> poem = new ArrayList();
        poem.add("You may write me down in history");
        poem.add("With your bitter, twisted");
        poem.add("You may tread me in the very dirt");
        poem.add("But still");
        poem.sort(c);
        ListIterator<String> iterator = poem.listIterator();
        while(iterator.hasNext()){ System.out.println(iterator.next()); }
    }

    public static void task_6(String fileWithPoem){
    Comparator c = new Comparator<String>()
    {
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    };
    ArrayList<String> poem = new ArrayList();
    try (BufferedReader br = new BufferedReader(new FileReader(fileWithPoem))) {
        String s;
        while ((s = br.readLine()) != null) {
            poem.add(s);

        }
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
    poem.sort(c);
    ListIterator<String> iterator = poem.listIterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}

    public static void task_1(String filename) {
        ArrayList<String> list = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String s;
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Collections.reverse(list);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            Files.write(Paths.get(filename), list, StandardOpenOption.CREATE);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}




