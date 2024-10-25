//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}
//Mohammed Hussain Feroz Shaikh
//231P39,38
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
//Name:Mohammed Hussain Feroz Shaikh
//231P039,38
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }
//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application that implements a stack data structure
using an array*/
import java.util.Scanner;
class Stack {
 private int maxSize = 100;
 private int[] stackArray;
 private int top;
 public Stack() {
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 top++;
 stackArray[top] = value;
 System.out.println(value + " pushed to stack.");
 } else {
 System.out.println("Stack is full. Cannot push " + value);}
 }
 public int pop() {
 if (top >= 0) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty. Cannot pop.");
 return -1;}
 }
 public int peek() {
 if (top >= 0) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty. Cannot peek.");
 return -1;}
 }
 public boolean isEmpty() {
 return top == -1;}
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stackArray[i] + " ");
 }
 System.out.println();}
 }
}
public class StackApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Stack stack = new Stack();
 while (true) {
 System.out.println("\nStack Menu:");
 System.out.println("1. Push");
 System.out.println("2. Pop");
 System.out.println("3. Peek");
 System.out.println("4. Check if Empty");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 if (choice == 6) {
 break;}
 if (choice == 1) {
 System.out.print("Enter a number to push: ");
 int value = scanner.nextInt();
 stack.push(value);
 } else if (choice == 2) {
 int poppedValue = stack.pop();
 if (poppedValue != -1) {
 System.out.println("Popped: " + poppedValue);
 }
 } else if (choice == 3) {
 int topValue = stack.peek();
 if (topValue != -1) {
 System.out.println("Top element: " + topValue);
 }
 } else if (choice == 4) {
 if (stack.isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Stack is not empty.");
 }
 } else if (choice == 5) {
 stack.display();
 } else {
 System.out.println("Invalid option. Please try again.");}
 }
 }
}


//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}
//Mohammed Hussain Feroz Shaikh
//231P39,38
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
//Name:Mohammed Hussain Feroz Shaikh
//231P039,38
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }
//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application that implements a stack data structure
using an array*/
import java.util.Scanner;
class Stack {
 private int maxSize = 100;
 private int[] stackArray;
 private int top;
 public Stack() {
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 top++;
 stackArray[top] = value;
 System.out.println(value + " pushed to stack.");
 } else {
 System.out.println("Stack is full. Cannot push " + value);}
 }
 public int pop() {
 if (top >= 0) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty. Cannot pop.");
 return -1;}
 }
 public int peek() {
 if (top >= 0) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty. Cannot peek.");
 return -1;}
 }
 public boolean isEmpty() {
 return top == -1;}
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stackArray[i] + " ");
 }
 System.out.println();}
 }
}
public class StackApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Stack stack = new Stack();
 while (true) {
 System.out.println("\nStack Menu:");
 System.out.println("1. Push");
 System.out.println("2. Pop");
 System.out.println("3. Peek");
 System.out.println("4. Check if Empty");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 if (choice == 6) {
 break;}
 if (choice == 1) {
 System.out.print("Enter a number to push: ");
 int value = scanner.nextInt();
 stack.push(value);
 } else if (choice == 2) {
 int poppedValue = stack.pop();
 if (poppedValue != -1) {
 System.out.println("Popped: " + poppedValue);
 }
 } else if (choice == 3) {
 int topValue = stack.peek();
 if (topValue != -1) {
 System.out.println("Top element: " + topValue);
 }
 } else if (choice == 4) {
 if (stack.isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Stack is not empty.");
 }
 } else if (choice == 5) {
 stack.display();
 } else {
 System.out.println("Invalid option. Please try again.");}
 }
 }
}


//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}
//Mohammed Hussain Feroz Shaikh
//231P39,38
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
//Name:Mohammed Hussain Feroz Shaikh
//231P039,38
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }
//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application that implements a stack data structure
using an array*/
import java.util.Scanner;
class Stack {
 private int maxSize = 100;
 private int[] stackArray;
 private int top;
 public Stack() {
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 top++;
 stackArray[top] = value;
 System.out.println(value + " pushed to stack.");
 } else {
 System.out.println("Stack is full. Cannot push " + value);}
 }
 public int pop() {
 if (top >= 0) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty. Cannot pop.");
 return -1;}
 }
 public int peek() {
 if (top >= 0) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty. Cannot peek.");
 return -1;}
 }
 public boolean isEmpty() {
 return top == -1;}
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stackArray[i] + " ");
 }
 System.out.println();}
 }
}
public class StackApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Stack stack = new Stack();
 while (true) {
 System.out.println("\nStack Menu:");
 System.out.println("1. Push");
 System.out.println("2. Pop");
 System.out.println("3. Peek");
 System.out.println("4. Check if Empty");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 if (choice == 6) {
 break;}
 if (choice == 1) {
 System.out.print("Enter a number to push: ");
 int value = scanner.nextInt();
 stack.push(value);
 } else if (choice == 2) {
 int poppedValue = stack.pop();
 if (poppedValue != -1) {
 System.out.println("Popped: " + poppedValue);
 }
 } else if (choice == 3) {
 int topValue = stack.peek();
 if (topValue != -1) {
 System.out.println("Top element: " + topValue);
 }
 } else if (choice == 4) {
 if (stack.isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Stack is not empty.");
 }
 } else if (choice == 5) {
 stack.display();
 } else {
 System.out.println("Invalid option. Please try again.");}
 }
 }
}


//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}
//Mohammed Hussain Feroz Shaikh
//231P39,38
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
//Name:Mohammed Hussain Feroz Shaikh
//231P039,38
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }
//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application that implements a stack data structure
using an array*/
import java.util.Scanner;
class Stack {
 private int maxSize = 100;
 private int[] stackArray;
 private int top;
 public Stack() {
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 top++;
 stackArray[top] = value;
 System.out.println(value + " pushed to stack.");
 } else {
 System.out.println("Stack is full. Cannot push " + value);}
 }
 public int pop() {
 if (top >= 0) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty. Cannot pop.");
 return -1;}
 }
 public int peek() {
 if (top >= 0) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty. Cannot peek.");
 return -1;}
 }
 public boolean isEmpty() {
 return top == -1;}
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stackArray[i] + " ");
 }
 System.out.println();}
 }
}
public class StackApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Stack stack = new Stack();
 while (true) {
 System.out.println("\nStack Menu:");
 System.out.println("1. Push");
 System.out.println("2. Pop");
 System.out.println("3. Peek");
 System.out.println("4. Check if Empty");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 if (choice == 6) {
 break;}
 if (choice == 1) {
 System.out.print("Enter a number to push: ");
 int value = scanner.nextInt();
 stack.push(value);
 } else if (choice == 2) {
 int poppedValue = stack.pop();
 if (poppedValue != -1) {
 System.out.println("Popped: " + poppedValue);
 }
 } else if (choice == 3) {
 int topValue = stack.peek();
 if (topValue != -1) {
 System.out.println("Top element: " + topValue);
 }
 } else if (choice == 4) {
 if (stack.isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Stack is not empty.");
 }
 } else if (choice == 5) {
 stack.display();
 } else {
 System.out.println("Invalid option. Please try again.");}
 }
 }
}


//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}
//Mohammed Hussain Feroz Shaikh
//231P39,38
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
//Name:Mohammed Hussain Feroz Shaikh
//231P039,38
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }
//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application that implements a stack data structure
using an array*/
import java.util.Scanner;
class Stack {
 private int maxSize = 100;
 private int[] stackArray;
 private int top;
 public Stack() {
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 top++;
 stackArray[top] = value;
 System.out.println(value + " pushed to stack.");
 } else {
 System.out.println("Stack is full. Cannot push " + value);}
 }
 public int pop() {
 if (top >= 0) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty. Cannot pop.");
 return -1;}
 }
 public int peek() {
 if (top >= 0) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty. Cannot peek.");
 return -1;}
 }
 public boolean isEmpty() {
 return top == -1;}
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stackArray[i] + " ");
 }
 System.out.println();}
 }
}
public class StackApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Stack stack = new Stack();
 while (true) {
 System.out.println("\nStack Menu:");
 System.out.println("1. Push");
 System.out.println("2. Pop");
 System.out.println("3. Peek");
 System.out.println("4. Check if Empty");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 if (choice == 6) {
 break;}
 if (choice == 1) {
 System.out.print("Enter a number to push: ");
 int value = scanner.nextInt();
 stack.push(value);
 } else if (choice == 2) {
 int poppedValue = stack.pop();
 if (poppedValue != -1) {
 System.out.println("Popped: " + poppedValue);
 }
 } else if (choice == 3) {
 int topValue = stack.peek();
 if (topValue != -1) {
 System.out.println("Top element: " + topValue);
 }
 } else if (choice == 4) {
 if (stack.isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Stack is not empty.");
 }
 } else if (choice == 5) {
 stack.display();
 } else {
 System.out.println("Invalid option. Please try again.");}
 }
 }
}


//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}
//Mohammed Hussain Feroz Shaikh
//231P39,38
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
//Name:Mohammed Hussain Feroz Shaikh
//231P039,38
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }
//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application that implements a stack data structure
using an array*/
import java.util.Scanner;
class Stack {
 private int maxSize = 100;
 private int[] stackArray;
 private int top;
 public Stack() {
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 top++;
 stackArray[top] = value;
 System.out.println(value + " pushed to stack.");
 } else {
 System.out.println("Stack is full. Cannot push " + value);}
 }
 public int pop() {
 if (top >= 0) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty. Cannot pop.");
 return -1;}
 }
 public int peek() {
 if (top >= 0) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty. Cannot peek.");
 return -1;}
 }
 public boolean isEmpty() {
 return top == -1;}
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stackArray[i] + " ");
 }
 System.out.println();}
 }
}
public class StackApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Stack stack = new Stack();
 while (true) {
 System.out.println("\nStack Menu:");
 System.out.println("1. Push");
 System.out.println("2. Pop");
 System.out.println("3. Peek");
 System.out.println("4. Check if Empty");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 if (choice == 6) {
 break;}
 if (choice == 1) {
 System.out.print("Enter a number to push: ");
 int value = scanner.nextInt();
 stack.push(value);
 } else if (choice == 2) {
 int poppedValue = stack.pop();
 if (poppedValue != -1) {
 System.out.println("Popped: " + poppedValue);
 }
 } else if (choice == 3) {
 int topValue = stack.peek();
 if (topValue != -1) {
 System.out.println("Top element: " + topValue);
 }
 } else if (choice == 4) {
 if (stack.isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Stack is not empty.");
 }
 } else if (choice == 5) {
 stack.display();
 } else {
 System.out.println("Invalid option. Please try again.");}
 }
 }
}


//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}
//Mohammed Hussain Feroz Shaikh
//231P39,38
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
//Name:Mohammed Hussain Feroz Shaikh
//231P039,38
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }
//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application that implements a stack data structure
using an array*/
import java.util.Scanner;
class Stack {
 private int maxSize = 100;
 private int[] stackArray;
 private int top;
 public Stack() {
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 top++;
 stackArray[top] = value;
 System.out.println(value + " pushed to stack.");
 } else {
 System.out.println("Stack is full. Cannot push " + value);}
 }
 public int pop() {
 if (top >= 0) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty. Cannot pop.");
 return -1;}
 }
 public int peek() {
 if (top >= 0) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty. Cannot peek.");
 return -1;}
 }
 public boolean isEmpty() {
 return top == -1;}
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stackArray[i] + " ");
 }
 System.out.println();}
 }
}
public class StackApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Stack stack = new Stack();
 while (true) {
 System.out.println("\nStack Menu:");
 System.out.println("1. Push");
 System.out.println("2. Pop");
 System.out.println("3. Peek");
 System.out.println("4. Check if Empty");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 if (choice == 6) {
 break;}
 if (choice == 1) {
 System.out.print("Enter a number to push: ");
 int value = scanner.nextInt();
 stack.push(value);
 } else if (choice == 2) {
 int poppedValue = stack.pop();
 if (poppedValue != -1) {
 System.out.println("Popped: " + poppedValue);
 }
 } else if (choice == 3) {
 int topValue = stack.peek();
 if (topValue != -1) {
 System.out.println("Top element: " + topValue);
 }
 } else if (choice == 4) {
 if (stack.isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Stack is not empty.");
 }
 } else if (choice == 5) {
 stack.display();
 } else {
 System.out.println("Invalid option. Please try again.");}
 }
 }
}


//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}
//Mohammed Hussain Feroz Shaikh
//231P39,38
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
//Name:Mohammed Hussain Feroz Shaikh
//231P039,38
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }
//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application that implements a stack data structure
using an array*/
import java.util.Scanner;
class Stack {
 private int maxSize = 100;
 private int[] stackArray;
 private int top;
 public Stack() {
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 top++;
 stackArray[top] = value;
 System.out.println(value + " pushed to stack.");
 } else {
 System.out.println("Stack is full. Cannot push " + value);}
 }
 public int pop() {
 if (top >= 0) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty. Cannot pop.");
 return -1;}
 }
 public int peek() {
 if (top >= 0) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty. Cannot peek.");
 return -1;}
 }
 public boolean isEmpty() {
 return top == -1;}
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stackArray[i] + " ");
 }
 System.out.println();}
 }
}
public class StackApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Stack stack = new Stack();
 while (true) {
 System.out.println("\nStack Menu:");
 System.out.println("1. Push");
 System.out.println("2. Pop");
 System.out.println("3. Peek");
 System.out.println("4. Check if Empty");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 if (choice == 6) {
 break;}
 if (choice == 1) {
 System.out.print("Enter a number to push: ");
 int value = scanner.nextInt();
 stack.push(value);
 } else if (choice == 2) {
 int poppedValue = stack.pop();
 if (poppedValue != -1) {
 System.out.println("Popped: " + poppedValue);
 }
 } else if (choice == 3) {
 int topValue = stack.peek();
 if (topValue != -1) {
 System.out.println("Top element: " + topValue);
 }
 } else if (choice == 4) {
 if (stack.isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Stack is not empty.");
 }
 } else if (choice == 5) {
 stack.display();
 } else {
 System.out.println("Invalid option. Please try again.");}
 }
 }
}


//Mohammed Hussain Feroz Shaikh
//231P039,38
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}

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