/* AIM:Create a Vehicle Management System using Java
inheritance
NAME:Hussain Shaikh
UIN:231P039
ROLL NO:38
*/ // Base class Vehicle class Vehicle {
protected String make;
protected String model;
protected int year;
protected String fuelType;
// Constructor
public Vehicle(String make, String model, int year, String fuelType) {
this.make = make;
this.model = model;
this.year = year;
this.fuelType = fuelType;
}
// Method to start the vehicle
public void start() {
System.out.println("Vehicle is starting.");
}
// Method to stop the vehicle
public void stop() {
System.out.println("Vehicle is stopping.");
}
// Method to display vehicle information
public void displayInfo() {
System.out.println("Make: " + make);
System.out.println("Model: " + model);
System.out.println("Year: " + year);
System.out.println("Fuel Type: " + fuelType);
}
}
// Derived class Car
class Car extends Vehicle {
private int numberOfDoors;
// Constructor
public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
super(make, model, year, fuelType); // Calling parent class constructor
this.numberOfDoors = numberOfDoors;
}
// Overriding start method
@Override
public void start() {
System.out.println("Car is starting with a key.");
}
// Overriding stop method
@Override
public void stop() {
System.out.println("Car is stopping with brakes.");
}
// Method to display car-specific information
@Override
public void displayInfo() {
super.displayInfo(); // Call the parent class method
System.out.println("Number of Doors: " + numberOfDoors);
}
}
// Derived class Motorcycle
class Motorcycle extends Vehicle {
private boolean isSportsBike;
// Constructor
public Motorcycle(String make, String model, int year, String fuelType, boolean isSportsBike)
{
super(make, model, year, fuelType); // Calling parent class constructor
this.isSportsBike = isSportsBike;
}
// Overriding start method
@Override
public void start() {
System.out.println("Motorcycle is starting with an electric ignition.");
}
// Overriding stop method
@Override
public void stop() {
System.out.println("Motorcycle is stopping with hand brakes.");
}
// Method to display motorcycle-specific information
@Override
public void displayInfo() {
super.displayInfo(); // Call the parent class method
System.out.println("Is Sports Bike: " + (isSportsBike ? "Yes" : "No"));
}
}
// Main class to demonstrate the Vehicle Management System
public class VehicleManagementSystem {
public static void main(String[] args) {
// Creating a Car object
Car car = new Car("Toyota", "Camry", 2020, "Gasoline", 4);
car.displayInfo();
car.start();
car.stop();
/* AIM:Create a User Registration System in
Java
NAME:Hussain Shaikh
UIN:231P055 ROLL NO:38 */
import java.util.Scanner;
// Custom exception for invalid age
System.out.println("\n--------------------------------\n");
// Creating a Motorcycle object
Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 2019, "Gasoline", true);
motorcycle.displayInfo();
motorcycle.start();
motorcycle.stop();
}
}
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}
// Custom exception for invalid email format
class InvalidEmailFormatException extends Exception {
public InvalidEmailFormatException(String message) {
super(message);
}
}
// Custom exception for invalid password
class InvalidPasswordException extends Exception {
public InvalidPasswordException(String message) {
super(message);
}
}
// User Registration System class
class UserRegistrationSystem {
// Method to register a user
public void registerUser(String name, int age, String email, String password)
throws InvalidAgeException, InvalidEmailFormatException, InvalidPasswordException {
// Check for valid age (must be at least 18)
if (age < 18) {
throw new InvalidAgeException("Age must be 18 or above to register.");
}
// Check for valid email format (must contain '@')
if (!email.contains("@")) {
throw new InvalidEmailFormatException("Invalid email format. Email must
contain '@'.");
}
// Check for valid password length (must be at least 6 characters)
if (password.length() < 6) {
throw new InvalidPasswordException("Password must be at least 6
characters long.");
}
// If no exceptions, registration is successful
System.out.println("User registered successfully!");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Email: " + email);
}
}
// Main class to test the registration system
public class ExceptionHandlingDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
UserRegistrationSystem userSystem = new UserRegistrationSystem();
try {
// User input for registration details
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.print("Enter your age: ");
int age = scanner.nextInt();
/*
AIM:Design a Multithreaded Bank Transaction System in Java
NAME:Hussain Shaikh
UIN:231P039
ROLL NO:38
*/
scanner.nextLine(); // Consume the newline left by nextInt()
System.out.print("Enter your email: ");
String email = scanner.nextLine();
System.out.print("Enter your password: ");
String password = scanner.nextLine();
// Attempt to register the user with the provided details
userSystem.registerUser(name, age, email, password);
} catch (InvalidAgeException | InvalidEmailFormatException |
InvalidPasswordException e) {
// Catch any custom exceptions and display error messages
System.out.println("Registration failed: " + e.getMessage());
} finally {
// Close the scanner resource
scanner.close();
}
}
}
// BankAccount class that handles deposits and withdrawals
class BankAccount {
private int balance;
// Constructor to initialize the balance
public BankAccount(int initialBalance) {
this.balance = initialBalance;
}
// Synchronized method to deposit money
public synchronized void deposit(int amount) {
balance += amount;
System.out.println(Thread.currentThread().getName() + " deposited " + amount + ".
New balance: " + balance);
}
// Synchronized method to withdraw money
public synchronized void withdraw(int amount) {
if (balance >= amount) {
balance -= amount;
System.out.println(Thread.currentThread().getName() + " withdrew " +
amount + ". New balance: " + balance);
} else {
System.out.println(Thread.currentThread().getName() + " tried to withdraw "
+ amount + " but insufficient balance.");
}
}
// Method to get the current balance
public int getBalance() {
return balance;
}
}
// A runnable task for depositing money
class DepositTask implements Runnable {
private BankAccount account;
private int amount;
// Constructor to initialize the bank account and deposit amount
public DepositTask(BankAccount account, int amount) {
this.account = account;
this.amount = amount;
}
@Override
public void run() {
account.deposit(amount);
}
}
// A runnable task for withdrawing money
class WithdrawTask implements Runnable {
private BankAccount account;
private int amount;
// Constructor to initialize the bank account and withdrawal amount
public WithdrawTask(BankAccount account, int amount) {
this.account = account;
this.amount = amount;
}
@Override
public void run() {
account.withdraw(amount);
}
}
// Main class to demonstrate the multithreading bank transaction system
public class MultithreadingBankDemo {
public static void main(String[] args) {
// Create a shared bank account with an initial balance of 1000
BankAccount account = new BankAccount(1000);
/*
AIM:Create a Simple Calculator GUI in Java using Swing
// Create threads for depositing and withdrawing money
Thread depositThread1 = new Thread(new DepositTask(account, 500), "Thread-1");
Thread depositThread2 = new Thread(new DepositTask(account, 300), "Thread-2");
Thread withdrawThread1 = new Thread(new WithdrawTask(account, 400), "Thread3");
Thread withdrawThread2 = new Thread(new WithdrawTask(account, 800), "Thread4");
// Start all threads
depositThread1.start();
depositThread2.start();
withdrawThread1.start();
withdrawThread2.start();
// Ensure all threads complete before showing the final balance
try {
depositThread1.join();
depositThread2.join();
withdrawThread1.join();
withdrawThread2.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
// Display the final balance after all transactions
System.out.println("Final balance: " + account.getBalance());
}
}
NAME:Hussain Shaikh
UIN:231P039 ROLL NO:38
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Calculator class extending JFrame
public class CalculatorGUI extends JFrame implements ActionListener {
// Components of the calculator
private JTextField display;
private JButton[] numberButtons;
private JButton[] functionButtons;
private JButton addButton, subButton, mulButton, divButton;
private JButton decButton, eqButton, clrButton, delButton;
private JPanel panel;
private Font font = new Font("Arial", Font.PLAIN, 20);
private double num1 = 0, num2 = 0, result = 0;
private char operator;
// Constructor to set up the calculator GUI
public CalculatorGUI() {
// Set up the frame
setTitle("Simple Calculator");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(420, 550);
setLayout(null);
// Create display field
display = new JTextField();
display.setBounds(50, 25, 300, 50);
display.setFont(font);
display.setEditable(false);
add(display);
// Initialize number buttons
numberButtons = new JButton[10];
for (int i = 0; i < 10; i++) {
numberButtons[i] = new JButton(String.valueOf(i));
numberButtons[i].addActionListener(this);
numberButtons[i].setFont(font);
numberButtons[i].setFocusable(false);
}
// Initialize function buttons
addButton = new JButton("+");
subButton = new JButton("-");
mulButton = new JButton("*");
divButton = new JButton("/");
decButton = new JButton(".");
eqButton = new JButton("=");
clrButton = new JButton("C");
delButton = new JButton("Del");
functionButtons = new JButton[] {addButton, subButton, mulButton, divButton,
decButton, eqButton, clrButton, delButton};
// Add action listeners to function buttons
for (JButton button : functionButtons) {
button.addActionListener(this);
button.setFont(font);
button.setFocusable(false);
}
// Create panel to add buttons in grid layout
panel = new JPanel();
panel.setBounds(50, 100, 300, 400);
panel.setLayout(new GridLayout(4, 4, 10, 10));
// Add buttons to panel
panel.add(numberButtons[1]);
panel.add(numberButtons[2]);
panel.add(numberButtons[3]);
panel.add(addButton);
panel.add(numberButtons[4]);
panel.add(numberButtons[5]);
panel.add(numberButtons[6]);
panel.add(subButton);
panel.add(numberButtons[7]);
panel.add(numberButtons[8]);
panel.add(numberButtons[9]);
panel.add(mulButton);
panel.add(decButton);
panel.add(numberButtons[0]);
panel.add(eqButton);
panel.add(divButton);
// Add components to the frame
add(panel);
clrButton.setBounds(150, 500, 100, 50);
delButton.setBounds(250, 500, 100, 50);
add(clrButton);
add(delButton);
setVisible(true);
}
// Method to handle button actions
@Override
public void actionPerformed(ActionEvent e) {
for (int i = 0; i < 10; i++) {
if (e.getSource() == numberButtons[i]) {
display.setText(display.getText() + i);
}
}
if (e.getSource() == decButton) {
display.setText(display.getText() + ".");
}
if (e.getSource() == addButton) {
num1 = Double.parseDouble(display.getText());
operator = '+';
display.setText("");
}
if (e.getSource() == subButton) {
num1 = Double.parseDouble(display.getText());
operator = '-';
display.setText("");
}
if (e.getSource() == mulButton) {
num1 = Double.parseDouble(display.getText());
operator = '*';
display.setText("");
}
if (e.getSource() == divButton) {
num1 = Double.parseDouble(display.getText());
operator = '/';
display.setText("");
}
if (e.getSource() == eqButton) {
}
num2 = Double.parseDouble(display.getText());
switch (operator) {
case '+':
result = num1 + num2;
break;
case '-':
result = num1 - num2;
break;
case '*':
result = num1 * num2;
break;
case '/':
if (num2 != 0) {
result = num1 / num2;
} else {
display.setText("Error");
return;
}
break;
}
display.setText(String.valueOf(result));
num1 = result;
}
if (e.getSource() == clrButton) {
display.setText("");
}
if (e.getSource() == delButton) {
String text = display.getText();
display.setText(text.substring(0, text.length() - 1));
}
// Main method to launch the calculator
public static void main(String[] args) {
new CalculatorGUI();
}
}

import java.io.Serializable;

public class Expense implements Serializable {
    private String description;
    private double amount;
    private int quantity;
    private String date;

    public Expense(String description, double amount, int quantity, String date) {
        this.description = description;
        this.amount = amount;
        this.quantity = quantity;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }}

Class-2 BackgroundPanel.java
           
           import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel() {
        // Load your background image
        backgroundImage = new ImageIcon("path/to/your/background.jpg").getImage(); // Change this to your image path
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 400);
    }
}


        Class-3 RoundedButton.java

import javax.swing.*;
import java.awt.*;

public class RoundedButton extends JButton {
    public RoundedButton(String label) {
        super(label);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setBackground(new Color(70, 130, 180));
        setFont(new Font("Arial", Font.BOLD, 14));
        setPreferredSize(new Dimension(150, 40));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150, 40);
    }
}


Class -4 ExpenseTrackerGUI.java

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class ExpenseTrackerGUI extends JFrame {
    private JTextField descriptionField;
    private JTextField amountField;
    private JTextField quantityField;
    private JTextField dateField;
    private JTable expenseTable;
    private DefaultTableModel tableModel;
    private ArrayList<Expense> expenses;
    private JLabel totalLabel;
    private boolean isDarkTheme;

    public ExpenseTrackerGUI() {
        setTitle("Expense Tracker");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setContentPane(new BackgroundPanel());

        expenses = new ArrayList<>();

        // Set layout
        setLayout(new BorderLayout());

        // Create input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        inputPanel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;

        descriptionField = new JTextField(15);
        amountField = new JTextField(10);
        quantityField = new JTextField(5);
        dateField = new JTextField(10);

        RoundedButton addButton = new RoundedButton("Add Expense");
        RoundedButton editButton = new RoundedButton("Edit Expense");
        RoundedButton deleteButton = new RoundedButton("Delete Expense");
        RoundedButton saveButton = new RoundedButton("Save Expenses");
        RoundedButton themeToggleButton = new RoundedButton("Toggle Theme");

        gbc.gridx = 0; gbc.gridy = 0;
        inputPanel.add(new JLabel("Description: "), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        inputPanel.add(descriptionField, gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        inputPanel.add(new JLabel("Amount: "), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        inputPanel.add(amountField, gbc);
        gbc.gridx = 0; gbc.gridy = 2;
        inputPanel.add(new JLabel("Quantity: "), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        inputPanel.add(quantityField, gbc);
        gbc.gridx = 0; gbc.gridy = 3;
        inputPanel.add(new JLabel("Date (YYYY-MM-DD): "), gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        inputPanel.add(dateField, gbc);

        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        inputPanel.add(addButton, gbc);
        gbc.gridy = 5;
        inputPanel.add(editButton, gbc);
        gbc.gridy = 6;
       
        inputPanel.add(deleteButton, gbc);
        gbc.gridy = 7;
        inputPanel.add(saveButton, gbc);
        gbc.gridy = 8;
        inputPanel.add(themeToggleButton, gbc);

        String[] columnNames = {"Description", "Amount (₹)", "Quantity", "Date"};
        tableModel = new DefaultTableModel(columnNames, 0);
        expenseTable = new JTable(tableModel);
        expenseTable.setFillsViewportHeight(true);
        expenseTable.setOpaque(false);
        expenseTable.setBackground(new Color(0, 0, 0, 0));
        expenseTable.setShowGrid(true);
        expenseTable.setGridColor(Color.LIGHT_GRAY);
        expenseTable.setRowHeight(30);

        // Add header customizations
        JTableHeader header = expenseTable.getTableHeader();
        header.setBackground(new Color(70, 130, 180));
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 14));

        totalLabel = new JLabel("Total: ₹0.00");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 24));
        totalLabel.setForeground(Color.WHITE);
        totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalLabel.setPreferredSize(new Dimension(0, 60));

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(expenseTable), BorderLayout.CENTER);
        add(totalLabel, BorderLayout.SOUTH);

        loadExpenses();

        addButton.addActionListener(new AddExpenseAction());
        editButton.addActionListener(new EditExpenseAction());
        deleteButton.addActionListener(new DeleteExpenseAction());
        saveButton.addActionListener(new SaveExpenseAction());
        themeToggleButton.addActionListener(new ThemeToggleAction());

        isDarkTheme = true; // Start with dark theme
        applyTheme();
    }

   
  private void applyTheme() {
        Color backgroundColor;
        Color textColor;

        if (isDarkTheme) {
            backgroundColor = Color.DARK_GRAY;
            textColor = Color.WHITE;
        } else {
            backgroundColor = Color.LIGHT_GRAY;
            textColor = Color.BLACK;
        }

        // Set background color
        getContentPane().setBackground(backgroundColor);
        expenseTable.setBackground(backgroundColor);
        expenseTable.setForeground(textColor);
        totalLabel.setForeground(textColor);

        for (Component component : getContentPane().getComponents()) {
            if (component instanceof JPanel) {
                component.setBackground(backgroundColor);
                for (Component c : ((JPanel) component).getComponents()) {
                    c.setForeground(textColor);
                    // If the component is a JTextField, set its background and foreground
                    if (c instanceof JTextField) {
                        c.setBackground(isDarkTheme ? Color.GRAY : Color.WHITE);
                        c.setForeground(textColor);
                    }
                }
            }
        }

        // Update button colors
        for (Component component : getContentPane().getComponents()) {
            if (component instanceof JButton) {
                component.setBackground(isDarkTheme ? new Color(70, 130, 180) : Color.LIGHT_GRAY);
                component.setForeground(textColor);
            }
        }

        revalidate();
        repaint();
        updateTableColors(); // Update table colors
    
}

    private void updateTableColors() {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                expenseTable.setValueAt(expenseTable.getValueAt(i, j), i, j);
            }
        }
    }

    private class AddExpenseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String description = descriptionField.getText();
            double amount;
            int quantity;
            String date = dateField.getText();

            try {
                amount = Double.parseDouble(amountField.getText());
                quantity = Integer.parseInt(quantityField.getText());
            } catch (NumberFormatException ex) {
                showError("Invalid amount or quantity. Please enter numbers.");
                return;
            }

            Expense expense = new Expense(description, amount, quantity, date);
            expenses.add(expense);
            tableModel.addRow(new Object[]{description, amount, quantity, date});
            updateTotal();
            clearFields();
        }
    }

    private class EditExpenseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = expenseTable.getSelectedRow();
            if (selectedRow >= 0) {
                String newDescription = JOptionPane.showInputDialog("Enter new description", tableModel.getValueAt(selectedRow, 0));
                String newAmountStr = JOptionPane.showInputDialog("Enter new amount", tableModel.getValueAt(selectedRow, 1));
                String newQuantityStr = JOptionPane.showInputDialog("Enter new quantity", 

tableModel.getValueAt(selectedRow, 2));
                String newDateStr = JOptionPane.showInputDialog("Enter new date (YYYY-MM-DD)", tableModel.getValueAt(selectedRow, 3));

                try {
                    double newAmount = Double.parseDouble(newAmountStr);
                    int newQuantity = Integer.parseInt(newQuantityStr);
                    expenses.get(selectedRow).setDescription(newDescription);
                    expenses.get(selectedRow).setAmount(newAmount);
                    expenses.get(selectedRow).setQuantity(newQuantity);
                    expenses.get(selectedRow).setDate(newDateStr);
                    tableModel.setValueAt(newDescription, selectedRow, 0);
                    tableModel.setValueAt(newAmount, selectedRow, 1);
                    tableModel.setValueAt(newQuantity, selectedRow, 2);
                    tableModel.setValueAt(newDateStr, selectedRow, 3);
                    updateTotal();
                } catch (NumberFormatException ex) {
                    showError("Invalid amount or quantity. Please enter numbers.");
                }
            } else {
                showError("Please select an expense to edit.");
            }
        }
    }

    private class DeleteExpenseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = expenseTable.getSelectedRow();
            if (selectedRow >= 0) {
                expenses.remove(selectedRow);
                tableModel.removeRow(selectedRow);
                updateTotal();
            } else {
                showError("Please select an expense to delete.");
            }
        }
    }

    private class SaveExpenseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveExpenses();
        }
    
}

    private class ThemeToggleAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            isDarkTheme = !isDarkTheme;
            applyTheme();
        }
    }

    private void updateTotal() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount() * expense.getQuantity();
        }
        totalLabel.setText(String.format("Total: ₹%.2f", total));
    }

    private void clearFields() {
        descriptionField.setText("");
        amountField.setText("");
        quantityField.setText("");
        dateField.setText("");
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void loadExpenses() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("expenses.dat"))) {
            expenses = (ArrayList<Expense>) ois.readObject();
            for (Expense expense : expenses) {
                tableModel.addRow(new Object[]{expense.getDescription(), expense.getAmount(), expense.getQuantity(), expense.getDate()});
            }
            updateTotal();
        } catch (FileNotFoundException e) {
            // File not found, starting fresh
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

   
 private void saveExpenses() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("expenses.dat"))) {
            oos.writeObject(expenses);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExpenseTrackerGUI gui = new ExpenseTrackerGUI();
            gui.setVisible(true);
        });
    }

    // Inner class for Expense
    static class Expense implements Serializable {
        private String description;
        private double amount;
        private int quantity;
        private String date;

        public Expense(String description, double amount, int quantity, String date) {
            this.description = description;
            this.amount = amount;
            this.quantity = quantity;
            this.date = date;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
       
 }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    // Custom JPanel for background
    static class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }
}

Class-5 ExpenseTracker.java

import javax.swing.*;

public class ExpenseTracker {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExpenseTrackerGUI gui = new ExpenseTrackerGUI();
            gui.setVisible(true);
        });
    }
}
