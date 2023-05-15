package view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MainFrame extends JFrame {
    JPanel buttoPanel;
    JButton backward;
    JButton forward;
    JLabel current;
    JTextField input;
    JButton sub;
    InputPanel namePanel;
    InputPanel cityPanel;
    InputPanel addressPanel;
    InputPanel birthdayPanel;
    InputPanel salaryPanel;
    
    public MainFrame() {
        initComponent();
        setComponent();
        setFrame();
    }
    
    private void initComponent(){
        buttoPanel = new JPanel();
        backward = new JButton("<Back");
        forward = new JButton("Next>");
        current = new JLabel("Current");
        input = new JTextField();
        sub = new JButton("Sub");
        namePanel = new InputPanel();
        cityPanel = new InputPanel();
        addressPanel = new InputPanel();
        birthdayPanel = new InputPanel();
        salaryPanel = new InputPanel();
        
    }
    
    private void setComponent(){
        input.setSize(10, HEIGHT);
        buttoPanel.add(backward);
        buttoPanel.add(current);
        buttoPanel.add(input);
        buttoPanel.add(sub);
        buttoPanel.add(forward);
        namePanel.label.setText("Name: ");
        cityPanel.label.setText("City: ");
        addressPanel.label.setText("Address: ");
        birthdayPanel.label.setText("Birthday: ");
        salaryPanel.label.setText("Salary: ");
    }
    
    
    
    private void setFrame(){
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(namePanel);
        this.add(cityPanel);
        this.add(addressPanel);
        this.add(birthdayPanel);
        this.add(salaryPanel);
        this.add(buttoPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        // this.pack();
        this.setVisible(true);
        
    }
    
    
    public JButton getBackward() {
        return backward;
    }
    
    public JButton getForward() {
        return forward;
    }
    
    public InputPanel getNamePanel() {
        return namePanel;
    }
    
    public JButton getSub() {
        return sub;
    }

    public void setSub(JButton sub) {
        this.sub = sub;
    }
    
    
    public void setNamePanel(InputPanel namePanel) {
        this.namePanel = namePanel;
    }
    
    
    
    
    public InputPanel getCityPanel() {
        return cityPanel;
    }
    
    
    
    
    public void setCityPanel(InputPanel cityPanel) {
        this.cityPanel = cityPanel;
    }
    
    
    
    
    public InputPanel getAddressPanel() {
        return addressPanel;
    }
    
    
    
    
    public void setAddressPanel(InputPanel addressPanel) {
        this.addressPanel = addressPanel;
    }
    
    
    
    
    public InputPanel getBirthdayPanel() {
        return birthdayPanel;
    }
    
    
    
    
    public void setBirthdayPanel(InputPanel birthdayPanel) {
        this.birthdayPanel = birthdayPanel;
    }
    
    
    
    
    public InputPanel getSalaryPanel() {
        return salaryPanel;
    }
    
    
    
    
    public void setSalaryPanel(InputPanel salaryPanel) {
        this.salaryPanel = salaryPanel;
    }
    public JTextField getInput() {
        return input;
    }
    
    public void setInput(JTextField input) {
        this.input = input;
    }
}
