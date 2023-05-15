package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadFile {
    final static String FILE_NAME = "kontenerkft.txt";
    public LoadFile() {
        
    }

    public static ArrayList<Employee> load(){
        ArrayList<Employee> empList = null;
        try {
            empList = tryLoad();
        } catch (FileNotFoundException e){
            System.err.println("file not found" + e);
        } catch (Exception e) {
            
            System.err.println("error loading file" + e);
        }
        return empList;
    }

    public static ArrayList<Employee> tryLoad()throws FileNotFoundException{
        ArrayList<Employee> empList = new ArrayList<>();
        File file = new File(FILE_NAME);
        Scanner scanner = new Scanner(file, "utf-8");

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            
            String[] lineArray = line.split("#");
            
            LocalDate bday;
            String[] dateArray = lineArray[3].split("-");
            Integer year = Integer.parseInt(dateArray[0]);
            Integer month = Integer.parseInt(dateArray[1]);
            Integer day = Integer.parseInt(dateArray[2]);
            bday = LocalDate.of(year, month, day);

            Employee emp = new Employee(lineArray[0], lineArray[1], lineArray[2], bday, Double.parseDouble(lineArray[4]));
            empList.add(emp);

        }
        scanner.close();
        return empList;
    }

}
