package control;

import java.util.ArrayList;

import model.Employee;
import model.LoadFile;
import view.MainFrame;

public class MainControl {
    MainFrame mainFrame;
    ArrayList<Employee> empList;
    int index = 0;
    public MainControl() {
        mainFrame = new MainFrame();
        empList = LoadFile.load();
        handleEvent();
        loadEmp(empList.get(index));
    }

    private void handleEvent(){
        mainFrame.getBackward().addActionListener(e -> {
            startBack();
        });
        mainFrame.getForward().addActionListener(e -> {
            startFor();
        });
        mainFrame.getSub().addActionListener(e -> {
            startS();
        });
    }
    
    private void startBack(){
        if (index < 1) {
            index = empList.size()-1;
        }else{
            index--;
        }
        loadEmp(empList.get(index));
        
    }
    
    private void startFor(){
        if (index < empList.size()-1) {
            index++;
        }else{
            index = 0;
        }
        loadEmp(empList.get(index));
        
        
    }
    private void startS(){
        String current = mainFrame.getInput().getText(); 
        if (current.matches("^[0-9]$")) {
            index = Integer.parseInt(current);
        }
        loadEmp(empList.get(index));

    }

    private void loadEmp(Employee emp){
        mainFrame.getNamePanel().setValue(emp.getName());
        mainFrame.getCityPanel().setValue(emp.getCity());
        mainFrame.getAddressPanel().setValue(emp.getAddress());
        mainFrame.getBirthdayPanel().setValue(emp.getBirthday().toString());
        mainFrame.getSalaryPanel().setValue(emp.getSalary().toString());
    }
}
