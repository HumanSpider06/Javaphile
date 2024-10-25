package skl_oop_b3_odd;
/* 
 * AIM : to make arithmetic operation
 * Nmae: Hussain Shaikh
 * UIN: 231P039
 * Division: A
 */

import java.util.*;
public class Arithmetic_operation {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		do {
		System.out.println("MENU");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		System.out.println("6.Exit");
		
		
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
				
		switch(choice){
			case 1:System.out.println("Enter number 1:");
			       int num1 = sc.nextInt();
			
			       System.out.println("Enter number 2:");
			       int num2 = sc.nextInt(); 
			       
				   System.out.println("Addition:"+(num1+num2));
			       break;
			
			case 2: System.out.println("Enter number 1:");
			         num1 = sc.nextInt();
			
			        System.out.println("Enter number 2:");
			         num2 = sc.nextInt();
			        
				    System.out.println("Subtraction:"+(num1-num2));
			        break;
			
			case 3:System.out.println("Enter number 1:");
			        num1 = sc.nextInt();
			
			       System.out.println("Enter number 2:");
			       num2 = sc.nextInt(); 
				
				   System.out.println("Multiplication:"+(num1*num2));
			       break;
			
			case 4:System.out.println("Enter number 1:");
			        num1 = sc.nextInt();
			
			       System.out.println("Enter number 2:");
			        num2 = sc.nextInt(); 
				
				   System.out.println("Division:"+(num1/num2));
			       break;
			
			case 5:System.out.println("Enter number 1:");
			        num1 = sc.nextInt();
			
			       System.out.println("Enter number 2:");
			        num2 = sc.nextInt();
				
				   System.out.println("Modulus:"+(num1%num2));
			       break;
			
			case 6: System.out.println("Thank You!");
			        System.exit(0);
			
			default: System.out.println("Error");
		}
		}while(choice!=6);

	}

}

package skl_oop_b3_odd;
import java.util.*;
public class Arithmetic_operation_char {
	/* 
	 * AIM :arithmetic operation
	 * Name: Hussain Shaikh
	 * UIN: 231P039
	 * Division: A
	 */
	
			public static void main(String[] args) {
				char ch;
				Scanner sc = new Scanner(System.in);
				
				// TODO Auto-generated method stub
				do {
				System.out.println("MENU");
				System.out.println("1.Addition(+)");
				System.out.println("2.Subtraction(-)");
				System.out.println("3.Multiplication(*)");
				System.out.println("4.Division(/)");
				System.out.println("5.Modulus(%)");
				System.out.println("6.Exit(.)");
				
				
				System.out.println("Enter your choice:");
				ch = sc.next().charAt(0);
						
				switch(ch){
					case '+':System.out.println("Enter number 1:");
					       int num1 = sc.nextInt();
					
					       System.out.println("Enter number 2:");
					       int num2 = sc.nextInt(); 
					       
						   System.out.println("Addition:"+(num1+num2));
					       break;
					
					case '-': System.out.println("Enter number 1:");
					         num1 = sc.nextInt();
					
					        System.out.println("Enter number 2:");
					         num2 = sc.nextInt();
					        
						    System.out.println("Subtraction:"+(num1-num2));
					        break;
					
					case '*':System.out.println("Enter number 1:");
					        num1 = sc.nextInt();
					
					       System.out.println("Enter number 2:");
					       num2 = sc.nextInt(); 
						
						   System.out.println("Multiplication:"+(num1*num2));
					       break;
					
					case '/':System.out.println("Enter number 1:");
					        num1 = sc.nextInt();
					
					       System.out.println("Enter number 2:");
					        num2 = sc.nextInt(); 
						
						   System.out.println("Division:"+(num1/num2));
					       break;
					
					case '%':System.out.println("Enter number 1:");
					        num1 = sc.nextInt();
					
					       System.out.println("Enter number 2:");
					        num2 = sc.nextInt();
						
						   System.out.println("Modulus:"+(num1%num2));
					       break;
					
					case '.': System.out.println("Thank You!");
					        System.exit(0);
					
					default: System.out.println("Error");
				}
				}while(ch!=6);

			}

	Java-Switch case

package skl_1;
import java.util.Scanner;
public class skl_1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int month = a.nextInt();
		switch(month) {
		case 1:System.out.println("January");
		break;
		case 2:System.out.println("February");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("October");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;
		default:System.out.println("Not a valid month");
		}

	}

}

//Write a program to display a pattern using loops
package skl_1;
import java.util.Scanner;
public class nayaprogram {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of stars");
		int n = sc.nextInt();
		int i=1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}

Java to use print statement
package skl_1;
import java.util.Scanner;
public class branching {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int h = sc.nextInt();
		int i;
		for(i=1; i<=h;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}

	}

}

Number java program
package skl_1;
import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int i = 1;
		int count = 1;
		while(i<=n) {
			int j =1;
			while(j<=i) {
				System.out.print(j);
				count = count+1;
			    j=j+1;
		}
			System.out.println();
			i=i+1;
	}
   }
}

Java continue statement
package skl_1;
import java.util.Scanner;
public class newstatement {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number: ");
	int h = sc.nextInt();
	int i;
	for(i=1; i<=h;i++) {
		if(i==5) {
			continue;
		}
		System.out.println(i);
	}
    }
}

Java label
package skl_1;
//import java.util.Scanner;
public class label {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		stop:{
			   nextRow:
				   int n;
				   for(int i=1; i<=n; i++) {
					   if(i==6) {
						   break stop;
						   System.out.println();
					   
						   for(int j=1; j<=n; j++) {
							   if(j>i) {
								   continue nextRow;
								   System.out.println("*");
							   }
						   }
					   }
				   }
		}
	
				   
		Name : Mohammed Hussain Feroz Shaikh
UIN : 231P039
Div : A

package skl_oop_b3;
import java.util.Scanner;
public class Objectandclasses {
    public static void main(String[] args) {
        int acc_no;
        String name;
        float amount;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter account number: ");
        acc_no = sc.nextInt();

        System.out.println("\n Enter Customer name: ");
        name = sc.next();

        System.out.println("\n Enter Customer account: ");
        amount = sc.nextFloat();

        AccountHelp obj1 = new AccountHelp();
        obj1.insert(acc_no, name, amount);
        obj1.display();
        obj1.checkBalance();

        System.out.println("\n Enter amount to be deposited: ");
        float dep_amount = sc.nextFloat();
        obj1.deposit(dep_amount);
        obj1.checkBalance();

        System.out.println("\n Amount to be withdrawn: ");
        float wit_amount = sc.nextFloat();
        obj1.wihtdraw(wit_amount);
        obj1.checkBalance();
        System.out.println("\n Thank you");

    }
}

class AccountHelp
{
    int acc_no;
    String name;
    float amount;
    void insert(int a, String n, float amt)
    {
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(float amt)
    {
        amount = amount+amt;
        System.out.println(amt+"deposited");
    }

    void wihtdraw(float amt)
    {
        if(amount<amt)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            amount = amount-amt;
            System.out.println(amt+"withdrawn");
        }
    }

    void display()
    {
        System.out.println("Account Number:"+acc_no);
        System.out.println("Customer Name:"+name);
        System.out.println("Customer Account"+amount);
    }

    void checkBalance()
    {
        System.out.println("Balance is:"+amount);
    }
}

import java.util.*;
public class FindAreaOverload_B3 {
Aim:WAP to find area of circle using method overloading.
* Name: Mohammed Hussain Feroz Shaikh
* UIN:231P039,38
public static void main(String[] args) {
double r1;
int r2;
Scanner sc = new Scanner(System.in);
AreaOfMethodOverload a = new AreaOfMethodOverload();
a.areaCircle();
System.out.println("Enter radius 1:");
r1 = sc.nextFloat();
AreaOfMethodOverload b = new AreaOfMethodOverload();
b.areaCircle(r1);
System.out.println("Enter radius 2:");
r2 = sc.nextInt();
AreaOfMethodOverload c = new AreaOfMethodOverload();
c.areaCircle(r2);
System.out.println("Area of circle of radius 5:");
a.display();
System.out.println("Area of circle of R1:");
b.display();
System.out.println("Area of circle of R2:");
c.display(); }
}
class AreaOfMethodOverload{
double r;
void areaCircle(){
r=5; }
void areaCircle(double radius){
r=radius; }
void areaCircle(int radius){
r=radius; }
void display(){
System.out.print
ln((3.14*r*r)); }

imort java.util.Scanner;
public class FindAreaOfRectangle_B3 {
* Aim:Write a program to find area of Rectangle, Triangle and circle using method overloading.
* Name: Mohammed Hussain Feroz Shaikh
* UIN:231P039,38
public static void main(String[] args){
double length,breadth,base,height,radius;
Scanner sc = new Scanner(System.in
);
FindOf a = new FindOf();
a.areaCircle();
a.areaRectangle();
a.areaTriangle();
System.out.print("Enter radius of circle:");
radius=sc.nextDouble();
FindOf b = new FindOf();
b.areaCircle(radius);
System.out.print("Enter length and breadth of rectangle:");
length=sc.nextDouble();
breadth=sc.nextDouble();
FindOf c = new FindOf();
c.areaRectangle(length,breadth);
System.out.print("Enter base and height of triangle:");
base=sc.nextDouble();
height=sc.nextDouble();
FindOf d = new FindOf();
d.areaRectangle(base,height);
System.out.println("Area of circle of radius 0:");
a.displayCircle();
System.out.println("Area of circle of user entered radius:");
b.displayCircle();
System.out.println("Area of rectangle of length=3 and breadth=4:");
a.displayRectangle();
System.out.println("Area of rectangle of user entered length and breadth:");
c.displayRectangle();
System.out.println("Area of triangle of base=4 and height=8:");a
displayTriangle();
System.out.println("Area of triangle of user entered base and length:");
d.displayRectangle(); }
}
class FindOf{
double length,breadth,base,height,radius;
void areaCircle(){
radius=0; }
void areaRectangle(){
length=3;
breadth=4; }
void areaTriangle(){
base=4;
height=8; }
void areaCircle(double r){
radius=r; }
void areaRectangle(double l, double b){
length=l;
breadth=b; }
void areaTriangle(double bse, double h){
base=bse;
height=h; }
void displayCircle(){
System.out.println(3.14*radius*radius); }
void displayRectangle(){
System.out.println(length
*breadth); }
void displayTriangle(){
System.out.println
(0.5*base*height); }

import java.util.Scanner;
* Aim:WAP to find area of circle using constructor overloading.
* Name: Mohammed Hussain Feroz Shaikh
* UIN:231P039 ,38
public class FindArea_B3 {
public static void main(String[] args) {
double r1;
int r2;
Scanner sc = new Scanner(System.in);
AreaOf a = new AreaOf();
System.out.println("Enter radius 1:");
r1=sc.nextDouble();
AreaOf b = new AreaOf(r1);
System.out.println("Enter radius 2:");
r2=sc.nextInt();
AreaOf c = new AreaOf(r2);
System.out.println("Area of circle of radius 0:");
a.display();
System.out.println("Area of circle of radius R1:");
b.display();
System.out.println("Area of circle of radius R2");
c.display();
sc.close(); }
}
class AreaOf{
double r;
AreaOf(){
r=0; }
AreaOf(double radius){
r=radius; }
AreaOf(int radius){
r=radius; }
void display(){
System.out.println((3.14*r*r)); }
}

import java.util.Scanner;
public class euclids_algorithm {
* Aim:Write a program that uses Euclid’s algorithm to display Greatest Common Divisor of two integers.
* Name: Mohammed Hussain Feroz Shaikh
* UIN:231P039 ,38
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num1,num2;
System.out.println("Enter two numbers");
num1 = sc.nextInt();
num2 = sc.nextInt();
euclid obj = new euclid(num1,num2);
obj.calculate();
obj.display();
sc.close(); }
}
class euclid{
int num1,num2,c;
euclid(int a, int b){
num1=a;
num2=b; }
void calculate(){
do{
if(num1>num2){
c=num1%num2; }
else{
c=num2%num1;}
num1=num2;
num2=c; }
while(num2!=0); }
void display(){
System.out.println("GCD is "+num1); }
}

import java.util.Scanner;
public class ConstructorOverloading_B3 {
* Aim:Write a program to find Area of Circle, Rectangle, Triangle using constructor overloading.
* Name: Mohammed Hussain Feroz Shaikh
* UIN:231P039 ,38
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double length,breadth,radius;
float base,height;
FindOf obj1 = new FindOf();
System.out.println("Enter radius of circle:");
radius = sc.nextDouble();
FindOf obj2 = new FindOf(radius);
System.out.println("Enter length and breadth of rectangle:");
length = sc.nextDouble();
breadth = sc.nextDouble();
FindOf obj3 = new FindOf(length,breadth);
System.out.println("Enter base and height of triangle:");
base = sc.nextFloat();
height = sc.nextFloat();
FindOf obj4 = new FindOf(base,height);
obj1.displayCircle();
obj1.displayRectangle();
obj1.displayTriangle();
obj2.displayCircle();
obj3.displayRectangle();
obj4.displayTriangle(); }
}
class FindOf{
double length,breadth,radius;
float base,height;
FindOf(){
radius=0;
length=3;
breadth=4;
base=4;
height=8;}
FindOf(double r){
radius=r; }
FindOf(double l, double b){
length=l;
breadth=b; }
FindOf(float bse, float h){
base=bse;
height=h; }
void displayCircle(){
System.out.println("Area of circle is "+(3.14*radius*radius));}
void displayRectangle(){
System.out.println("Area of rectangle is "+(length*breadth));}
void displayTriangle(){
System.out.println("Area of triangle
is "+(0.5*base*height)); }

* AIM:Write a program to add integer number and string using method overloading.
* NAME: Mohammed Hussain Feroz Shaikh
* UIN:231P039 ,38
package skl_oop_b3_odd;
import java.util.Scanner;
public class Add_b2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
System.out.println("Enter a string:");
String str = sc.next();
Addition obj = new Addition();
obj.addition(n, str);
Addition obj1 = new Addition();
obj1.addition(str,n);} }
class Addition{
void addition(int n,String str){
System.out.println(n+str); }
void addition(String str, int n){
System.out.
println(str+n); }
}

Name : Hussain
231P039
38 B2

package Matrix;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int i , j;
		int sum = 0;
		int set1[ ][ ] = new int[3][3]; 
		int set2[ ][ ] = new int[3][3];
		int add[ ][ ] = new int[3][3];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first 3X3 matrix is :\n"); 
		for (i=0 ; i<3 ; i++) 
		 { 
		 for (j=0 ; j<3 ; j++) 
		 set1[i][j]=input.nextInt(); 
		 } 
		 System.out.println("The 3X3 matrix is : "); 
			for (i=0 ; i<3 ; i++) 
			 { 
				 for (j=0 ; j<3 ; j++) 
					 System.out.print(set1[i][j]+"\t"); 
					 System.out.println(" "); 
					 } 
			
			System.out.print("Enter second 3X3 matrix is :\n"); 
			for (i=0 ; i<3 ; i++) 
			 { 
			 for (j=0 ; j<3 ; j++) 
			 set2[i][j]=input.nextInt(); 
			 } 
			 System.out.println("The 3X3 matrix is : "); 
				for (i=0 ; i<3 ; i++) 
				 { 
					 for (j=0 ; j<3 ; j++) 
						 System.out.print(set2[i][j]+"\t"); 
						 System.out.println(" "); 
						 } 
				
                    for(i = 0; i<3; i++) {
					for(j=0; j<3; j++) {
						add[i][j] = set1[i][j]+set2[i][j];
					}
                    }
						
						System.out.println("The addition of 3X3 matrix is : "); 
					for (i=0 ; i<3 ; i++) 
					 { 
						 for (j=0 ; j<3 ; j++) 
							 System.out.print(add[i][j]+"\t"); 
							 System.out.println(" "); 
							 } 
                                    System.out.println(" Hussain bro\r\n" + " 231P039  38\r\n" + " COMPS B2\r\n"); 
					
					}

}

package string;
import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		String str = new String();
		char ch = 'a';
		int len,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		str = sc.nextLine();
		
		System.out.print("Enter a character to be searched in string: ");
		ch = sc.next().charAt(0);
		System.out.println("String is: "+str);
		
		len = str.length();
		for(int i=0; i<=len-1; i++)
			if(ch==str.charAt(i))
				count++;
		System.out.println("Frequency of character '"+ch+"' in string is "+count);
		sc.close();
		
		System.out.println(" Hussain bro\r\n" + " 231P039  38\r\n" + " COMPS B2\r\n"); 
    }
 
}

package Matrix;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in matrix A:");
        int rowsInA = scanner.nextInt();

        System.out.println("Enter the number of columns in matrix A:");
        int colsInA = scanner.nextInt();

        System.out.println("Enter the number of rows in matrix B:");
        int rowsInB = scanner.nextInt();

        System.out.println("Enter the number of columns in matrix B:");
        int colsInB = scanner.nextInt();

        if (colsInA != rowsInB) {
            System.out.println("Matrices cannot be multiplied");
            System.out.println(" LIBAN ALI SYED\r\n" + " 231P069  45\r\n" + " COMPS B3\r\n"); 
            return;
        }

        int[][] matrixA = new int[rowsInA][colsInA];
        int[][] matrixB = new int[rowsInB][colsInB];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < colsInA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rowsInB; i++) {
            for (int j = 0; j < colsInB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);
        System.out.println("Result Matrix:");
        printMatrix(result);
    
        scanner.close();
        System.out.println(" Hussain bro\r\n" + " 231P039  38\r\n" + " COMPS B2\r\n"); 
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsInA = matrixA.length;
        int colsInA = matrixA[0].length;
        int rowsInB = matrixB.length;
        int colsInB = matrixB[0].length;

        int[][] result = new int[rowsInA][colsInB];

        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < colsInB; j++) {
                for (int k = 0; k < colsInA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

	}

}

package Matrix;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		int i , j;
		int sum = 0;
		int set1[ ][ ] = new int[3][3]; 
		
		Scanner input=new Scanner(System.in); 
		  
		System.out.print("Enter first 3X3 matrix is :\n"); 
		 for (i=0 ; i<3 ; i++) 
		 { 
		 for (j=0 ; j<3 ; j++) 
		 set1[i][j]=input.nextInt(); 
		 } 
		
		 
		 System.out.println("The 3X3 matrix is : "); 
		for (i=0 ; i<3 ; i++) 
		 { 
			 for (j=0 ; j<3 ; j++) 
				 System.out.print(set1[i][j]+"\t"); 
				 System.out.println(" "); 
				 } 
				
				for(i = 0; i<3; i++) {
					
					for(j=0; j<3; j++) {
						if(i == j) {
							sum = sum + set1[i][j];
						}
					}
				}
				System.out.println(" \n The sum of diagonal elements of matrix is: " + sum );
				System.out.println(" Hussain bro\r\n" + " 231P039  38\r\n" + " COMPS B2\r\n"); 
	}

}

package string;
import java.util.Scanner;
public class vowelcount {

	public static void main(String[] args) {
		int vowels=0;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = sc.nextLine();
        for(int i=0; i<str.length();i++)
        {
        	if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') 
        		vowels++;
        	
        }
        System.out.print("Vowels are: "+vowels);
        System.out.println(" Hussain bro\r\n" + " 231P039  38\r\n" + " COMPS B2\r\n"); 
	}

}

Mohammed Hussain Feroz Shaikh
231P039, 38
import java.lang.*;
import java.io.*;
import java.util.*;
public class ShoppingItem {
public static void main(String args[]) {
Vector list = new Vector();
int len=args.length;
for(int i=0;i<len;i++) {
list.addElement(args[i]); }
int size=list.size();
String str[]= new String[size];
list.copyInto(str);
for(int i=0;i<size;i++) {
System.out.println ("Element of Vector at position "+i+":"+str[i]);} }

Mohammed Hussain Feroz Shaikh
231P039, 38
import java.util.*;
public class Palindrome {
public static void main(String args[]) {
String str, rev;
StringBuffer str1 = new StringBuffer();
Scanner sc= new Scanner(System.in);
System.out.print ("Enter a String :");
str=sc.nextLine();
str1.append(str);
str1.reverse();
rev=str1.toString();
if(str.equalsIgnoreCase(rev))
System.out.println ("\n Palindrome");
else
System.out.println (" \n Not a Palindrome"); }
}

Mohammed Hussain Feroz Shaikh
231P039, 38
import java.util.Scanner;
import java.util.Vector;
import java.util.Enumeration;
public class StudentVector {
private Vector<String> students = new Vector<>();
public void addStudent(String name) {
students.add(name);
System.out.println("Student " + name + " added."); }
public void removeStudent(String name) {
if (students.remove(name)) {
System.out.println("Student " + name + " removed.");
} else {
System.out.println("Student " + name + " not found."); }
}
// Method to display all students using Enumeration
public void displayStudents() {
if (students.isEmpty()) {
System.out.println("No students in the list.");
} else
Enumeration<String> e = students.elements();
System.out.println("Student List:");
while (e.hasMoreElements()) {
System.out.println(e.nextElement()); } }
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
StudentVector sv = new StudentVector();
int choice;
// Menu for user to choose operations
do {
System.out.println("\nChoose an operation:");
System.out.println("1. Add student name");
System.out.println("2. Remove student name");
System.out.println("3. Display student names");
System.out.println("4. Exit");
choice = sc.nextInt();
sc.nextLine(); // Consume newline
switch (choice) {
case 1: System.out.print("Enter student name to add: ");
String nameToAdd = sc.nextLine();
sv.addStudent(nameToAdd);
break;
case 2: System.out.print("Enter student name to remove: ");
String nameToRemove = sc.nextLine();
sv.removeStudent(nameToRemove);
break;
case 3: sv.displayStudents();
break;
case 4: System.out.println("Exiting the program.");
break;
default: System.out.println("Invalid choice. Try again."); }
} while (choice != 4);
sc.close(); }

Mohammed Hussain Feroz Shaikh
231P039, 38
import java.util.Scanner;
import java.util.Vector;
public class ShoppingListManager {
public static void main(String[] args) {
Vector<String> shoppingList = new Vector<>();
Scanner scanner = new Scanner(System.in);
int choice;
do {
System.out.println("\nShopping List Operations:");
System.out.println("1. Add an item at a specified location");
System.out.println("2. Delete an item");
System.out.println("3. Print the shopping list");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
scanner.nextLine(); // Consume newline left-over
switch (choice) {
case 1: System.out.print("Enter the item to add: ");
String item = scanner.nextLine();
System.out.print("Enter the position (starting from 0): ");
int position = scanner.nextInt();
if (position >= 0 && position <= shoppingList.size()) {
shoppingList.add(position, item);
System.out.println("Item added successfully.");
} else {
System.out.println("Invalid position."); }
break;
case 2: System.out.print("Enter the position of the item to delete (starting from 0): ");
int index = scanner.nextInt();
if (index >= 0 && index < shoppingList.size()) {
shoppingList.remove(index);
System.out.println("Item deleted successfully.");
} else {
System.out.println("Invalid position."); }
break;
case 3: System.out.println("Shopping List:");
if (shoppingList.isEmpty()) {
System.out.println("The list is empty."); } else {
for (int i = 0; i < shoppingList.size(); i++) {
System.out.println(i + ": " + shoppingList.get(i)); } }
break;
case 4: System.out.println("Exiting...");
break;
default: System.out.println("Invalid choice. Please try again.");
break; }
} while (choice != 4);
scanner.close(); }
}

Mohammed Hussain Feroz Shaikh
231P039, 38
public class StringBufferDeleteExample {
public static void main(String[] args) {
StringBuffer sb = new StringBuffer("Hello, World!");
System.out.println("Original StringBuffer: " + sb);
sb.delete(5, 12);
System.out.println("StringBuffer after deletion: " + sb); }
}

Mohammed Hussain Feroz Shaikh
231P039, 38
public class StringBufferReplaceExample {
public static void main(String[] args) {
StringBuffer sb = new StringBuffer("Hello, World!");
System.out.println("Original StringBuffer: " + sb);
sb.replace(7, 12, "Java");
System.out.println("StringBuffer after replace: " + sb);}
}

AIM:WAP to implement single and multilevel inheritance using super keyword.
NAME:Hussain Shaikh
UIN:231P039
ROLL NO:38
importjava.io.*;
importjava.util.Scanner;
class Account {
String cust_name;
int acc_no;
Account(String a, int b) {
cust_name=a;
acc_no=b; }
void display() {
System.out.println ("Customer Name: "+cust_name);
System.out.println ("Account No: "+acc_no); }
}
class Online extends Account{
Online(String a, int b)
{ super(a,b); }
void display() {
System.out.println ("Customer-Id: "+(cust_name+acc_no%10));
System.out.println ("Customer Password: "+(acc_no/10+8)); }
}
class Saving_Acc extends Account{
int min_bal,saving_bal;
Saving_Acc(String a, int b, int c, int d) {
super(a,b);
min_bal=c;
saving_bal=d; }
void display() {
super.display();
System.out.println ("Minimum Balance: "+min_bal);
System.out.println ("Saving Balance: "+saving_bal); }
}
class Acct_Details extends Saving_Acc {
int deposits, withdrawals;
Acct_Details(String a, int b, int c, int d, int e, intf) {
super(a,b,c,d);
deposits=e;
withdrawals=f; }
void display() {
super.display();
System.out.println ("Deposit: "+deposits);
System.out.println ("Withdrawals: "+withdrawals); }
}
public class inheritance_39 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println ("Account Number: ");
int a = sc.nextInt();
System.out.println ("Minumum balance: ");
int b = sc.nextInt();
System.out.println ("Saving balance: ");
int c = sc.nextInt();
System.out.println ("Deposit: ");
int d = sc.nextInt();
System.out.println ("Withdrawals: ");
int e = sc.nextInt();
Acct_Details A = new Acct_Details("customer",a,b,c,d,e); Online ol=new Online("customer",666);
A.display();
ol.display(); }

AIM:WAP to calculate volume of sphere using multilevel inheritance.
NAME:Hussain Shaikh
UIN:231P039
ROLL NO:38
importjava.util.Scanner;
class BaseClass {
protected double radius;
public void acceptRadius() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enterthe radius: ");
radius = scanner.nextDouble(); }
}
class Circle extends BaseClass {
protected double area;
public void calculateArea() {
area = Math.PI * radius * radius; }
public void displayArea() {
System.out.println("Area ofthe circle: " + area); }
}
class Sphere extends Circle {
private double volume;
public void calculateVolume() {
volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); }
public void displayVolume() {
System.out.println("Volume ofthe sphere: " + volume); }
}
public class MultilevelInheritanceExample {
public static void main(String[] args) {
Sphere sphere = new Sphere();
sphere.acceptRadius();
sphere.calculateArea();
sphere.displayArea();
sphere.calculateVolume();
sphere.displayVolume(); }
}

AIM:WAP to calculate volume of sphere using multilevel inheritance demonstrating method overriding.
NAME:Hussain Shaikh
UIN:231P039
ROLL NO:38
importjava.util.Scanner;
class BaseClass {
protected double radius;
public void acceptData(){
Scanner scanner = new Scanner(System.in);
System.out.print("Enterthe radius: ");
radius = scanner.nextDouble();
System.out.println("Radius accepted in BaseClass: " + radius); }
}
class Circle extends BaseClass {
protected double area;
@Override
public void acceptData() {
super.acceptData();
System.out.println("Data accepted and passed to Circle class."); }
public void calculateArea() {
area = Math.PI * radius * radius; }
public void displayArea() {
System.out.println("Area ofthe circle: " + area); }
}
class Sphere extends Circle {
private double volume;
@Override
public void acceptData() {
super.acceptData();
System.out.println("Data accepted and passed to Sphere class."); }
public void calculateVolume() {
volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); }
public void displayVolume() {
System.out.println("Volume ofthe sphere: " + volume); }
}
public class MultilevelInheritanceWithOverriding {
public static void main(String[] args) {
Sphere sphere = new Sphere();
sphere.acceptData();
sphere.calculateArea();
sphere.displayArea();
sphere.calculateVolume();
sphere.displayVolume(); }
}

WAP to implement interface demonstrating the concept of multiple inheritance
Mohammed Hussain Feroz Shaikh
231P039,38
import java.util.*;
class Student {
int rollNumber;
void getNumber(int n) {
rollNumber=n; }
void printNumber() {
System.out.println("RollNo is " +rollNumber); }
}
class Test extends Student {
float part1,part2;
void getMarks(float a, float b) {
part1=a;
part2=b;
} void putMarks() {
System.out.println("Marks Part1 "+part1);
System.out.println("Marks Part2 "+part2); }
}
interface Sports {
float sportwt=6.0F;
void putwt(); }
class Results extends Test implements Sports {
float total;
public void putwt() {
System.out.println("Sports Marks "+ sportwt); }
void display() {
total=part1+part2+sportwt;
System.out.println("Total marks of " +rollNumber+" is "+total); }
}
public class MainClass
{
public static void main(String srgs[]){
Results a=new Results();
a.getNumber(10);
a.printNumber();
a.getMarks(10.0F,25.
5F);
a.putMarks();
a.putwt();
a.display(); }
}

WAP to implement sum of matrix using interface concept
Mohammed Hussain Feroz Shaikh
231P039,38
import java.util.Scanner;
Interface Matrix {
final static int M = 5, N = 5;
void readMatrix();
void displayMatrix();
void addMatrix(MatrixImplementation m2); }
class MatrixImplementation implements Matrix {
int[][] matrix = new int[M][N];
public void readMatrix() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements for a " + M + "x" + N + " matrix:");
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) {
matrix[i][j] = sc.nextInt(); } }
}
public void displayMatrix() {
System.out.println("Matrix:");
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) {
System.out.print(matrix[i][j] + " "); }
System.out.println(); }
}
public void addMatrix(MatrixImplementation m2) {
int[][] result = new int[M][N];
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) {
result[i][j] = this.matrix[i][j] + m2.matrix[i][j]; }
}
System.out.println("Sum of matric2es:");
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) {
System.out.print(result[i][j] + " "); }
System.out.println(); } }
}
public class inter_mat1 {
public static void main(String[] args) {
MatrixImplementation m1 = new MatrixImplementation();
MatrixImplementation m2 = new MatrixImplementation();
System.out.println("Matrix 1:");
m1.readMatrix();
System.out.println("Matrix 2:");
m2.readMatrix();
System.out.println("Matrix 1:");
m1.displayMatrix();
System.out.println("Matrix 2:");
m2.displayMatrix();
m1.addMatrix(m2); }

WAP to implement sum of diagonals using interface concept
Mohammed Hussain Feroz Shaikh
231P039,38
import java.util.*;
interface Matrix1 {
final static int M = 5, N = 5;
void readMatrix();
void displayMatrix();
void sum_Diagonal_Matrix(); }
class MatrixImplementation1 implements Matrix1 {
int[][] matrix = new int[M][N];
public void readMatrix() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements for a " + M + "x" + N + " matrix:");
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) {
matrix[i][j] = sc.nextInt(); } }
}
public void displayMatrix() {
System.out.println("Matrix:");
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) {
System.out.print(matrix[i][j] + " "); }
System.out.println(); }}
public void sum_Diagonal_Matrix() {
int sum = 0;
for (int i = 0; i < M; i++) {
sum += matrix[i][i]; }
System.out.println("Sum of diagonal elements: " + sum); }
}
public class inher_mat2 {
public static void main(String[] args) {
MatrixImplementation1 matrix = new MatrixImplementation1();
matrix.readMatrix();
matrix.displayMatrix();
matrix.sum_Diagonal_Matrix(); }

//Mohammed Hussain Feroz Shaikh
//231P039,38

import java.io.*;
abstract class Shape
{
abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape
{ int l,w;
Rectangle() throws IOException
{ DataInputStream in=new DataInputStream(System.in);
System.out.println("\n\n\n\n\n\n");
System.out.println("******Rectangle******");
System.out.println("Enter Length and width of Rectangle");
l=Integer.parseInt(in.readLine());
w=Integer.parseInt(in.readLine());
}

void draw()
{
System.out.println("Area of Rectangle = "+(l*w));
}
}

class Circle extends Shape
{ double r;
Circle() throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("******Circle******");
System.out.println("Enter Radius of a Circle");
r=Double.parseDouble(in.readLine());
}
void draw()
{
System.out.println("Area of Circle = "+(0.5*r*r));
}
}
public class Area_Abstraction
{
public static void main(String args[]) throws IOException
{
Circle c=new Circle();
c.draw();
Rectangle d=new Rectangle();

d.draw();
}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38

import java.util.*;
abstract class Shape{
abstract void draw();}
class Rectangle extends Shape
{ Double r1;
Rectangle()
{ Scanner sc= new Scanner(System.in);
System.out.println("\n\n\n\n\n\n");
System.out.println("******SPHERE******");
System.out.println("Enter radius of sphere: ");
r1=sc.nextDouble();}
void draw(){
System.out.println("volume of sphere = "+(1.33*3.14*r1*r1*r1));}
}
class Circle extends Shape
{ double r;
Circle() {
Scanner sc= new Scanner(System.in);
System.out.println("******Hemisphere******");
System.out.println("Enter Radius of a hemisphere");
r=sc.nextDouble();}
void draw(){
System.out.println("Area of Circle = "+(0.66*3.14*r*r*r));}
}
public class Shapes2 {
public static void main(String[] args) {
Circle c=new Circle();
c.draw();
Rectangle d=new Rectangle();
d.draw();}
}

//Mohammed Hussain Feroz Shaikh
//231P039,38

import java.util.*;
abstract class Shape{
abstract void draw();}
class Rectangle extends Shape
{ Double l,w;
Rectangle(){
Scanner sc= new Scanner(System.in);
System.out.println("\n\n\n\n\n\n");
System.out.println("***Rectangle***");
System.out.println("Enter Length and width of Rectangle");
l=sc.nextDouble();
w=sc.nextDouble();}
void draw(){
System.out.println("Area of Rectangle = "+(l*w));}
}
class Circle extends Shape
{ double r;
Circle() {
Scanner sc= new Scanner(System.in);
System.out.println("***Circle***");
System.out.println("Enter Radius of a Circle");
r=sc.nextDouble();}
void draw(){
System.out.println("Area of Circle = "+(3.14*r*r));}
}
public class Shapes2 {
public static void main(String[] args) {
Circle c=new Circle();
c.draw();
Rectangle d=new Rectangle();
d.draw();}
}

Exp-10
//Name: Mohammed Hussain Feroz Shaikh
//UIN:231P039, Roll no:38
//WAP: Write a Program to implement user
defined Exception in java.
import java.util.*;
public class Month  {
public static void main(String args[]) {
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month number:");
n=sc.nextInt();
try {
if(n>12||n<1)
throw new ArithmeticException();
System.out.println("Month number entered is="+n);
}
catch(ArithmeticException ae) {
System.out.println("Invalid Number!"); }
}
}
 
//Name: Hussain Shaikh
//UIN:231P039, Roll no:38
//WAP: Write a program to perform division of two numbers accepted from user. 
Handle the  IOException, NumberFormatException and also handle the divide by exception using multiple try  catch block.
import java.util.Scanner;
public class DivisionProgram {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter the first number: ");
String num1 = scanner.nextLine();
int dividend = Integer.parseInt(num1);
System.out.print("Enter the second number: ");
String num2 = scanner.nextLine();
int divisor = Integer.parseInt(num2);
try {
int result = dividend / divisor;
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.out.println("Error: Division by zero is not allowed."); }
} catch (NumberFormatException e) {
System.out.println("Error: Invalid number format. Please enter valid integers.");
} finally {
scanner.close();  }
}
}
 
 
//Name: Hussain Shaikh
//UIN:231P039,Roll No:38
//WAP:Write a program to perform division of two numbers accepted from user. 
Handle the  NumberFormatException and also handle the divide by exception using nested try catch block.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DivisionProgram {
public static void main(String[] args) {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try {
System.out.print("Enter the first number: ");
String num1 = reader.readLine();
System.out.print("Enter the second number: ");
String num2 = reader.readLine();
try {
int dividend = Integer.parseInt(num1);
int divisor = Integer.parseInt(num2);
try {
int result = dividend / divisor;
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.out.println("Error: Division by zero is not allowed.");  }
} catch (NumberFormatException e) {
System.out.println("Error: Invalid number format. Please enter valid integers."); }
} catch (IOException e) {
System.out.println("Error: An I/O error occurred while reading input."); }
}
}
 
\\Mohammed Hussain Feroz Shaikh
\\231P039,38
\\WAP: Write a program to implement  Multithreading in java 
package Multithreading; 
public class Mythread1 extends Thread {
 public static void main(String args[])  { 
Mythread1 ex=new Mythread1(); 
ex.create(); 
System.out.println("this is the main thread!"); 
} 
public void create(){ 
Thread t=new Thread(this);   
t.start(); 
} 
public void run()
{ 
while(true) { 
try { 
System.out.println("this is the child thread!"); 
 Thread.sleep(500);  } 
 catch (InterruptedException e) { } 
 } 
} 
}

\\Mohammed Hussain Feroz Shaikh
\\231P039,38
\\Write a program to print /*/*/*/*/* using two child thread. 
public class Mythread1 extends Thread {
 public static void main(String args[])  { 
Mythread1 ex=new Mythread1(); 
ex.create(); 
System.out.println("this is the main thread!"); 
} 
public void create(){ 
Thread t=new Thread(this);   
t.start(); 
} 
public void run()
{ 
while(true) { 
try { 
System.out.println(" /*/*/*/*/*"); 
 Thread.sleep(500);  } 
 catch (InterruptedException e) { } 
 } 
} 
}

\\Mohammed Hussain Feroz Shaikh
\\231P039,38
\\WAP: Write a program to print alphabets and numbers using two threads.
public class ThreadsExample {
	public static void main(String[] args) {
	    Runnable r = new Runnable1();
	    Thread t = new Thread(r);
	    Runnable r2 = new Runnable2();
	    Thread t2 = new Thread(r2);
	    t.start();
	    t2.start();
	}
}
class Runnable2 implements Runnable{
	  public void run(){
	    for(char i='a';i<='z';i++) {
	        System.out.print(i+",");
	    }
	  }
	}

	 class Runnable1 implements Runnable{
	  public void run(){
	    for(int i=1;i<=26;i++) {
	       System.out.print(i+",");
	    }
	 }
	}

/*WAP: Write a program in java to find
Largest between two number using
packages.*/
//HussainShaikh
//231P039,38

package compare;

public class Largest {
    public int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

//The file using the above package
import compare.Largest;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Create an object of the Largest class from the compare package
        Largest largest = new Largest();

        // Find and print the largest number
        int result = largest.findLargest(num1, num2);
        System.out.println("The largest number is: " + result);
    }
}

//WAP: Write a program in java to add two number using packages.
//Hussain Shaikh
//231P39,38

package addNumber;

public class Add {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
}

//Code which uses this package
import addNumber.Add;
import java.util.Scanner;

public class addNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        // Create an instance of the Add class
        Add adder = new Add(); // Corrected this line

        // Call the add method to get the sum
        int result = adder.add(num1, num2); // Corrected this line

        System.out.println("The result is: " + result);
    }
}

//WAP:Write a program in java to compute factorial of a number using package.
//Hussain Shaikh
//231P039,38
package factorialCalculator;

public class Factorial {
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
//File using the above package
import factorialCalculator.Factorial;
import java.util.Scanner;
public class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Create an instance of the Factorial class
        Factorial factorialCalculator = new Factorial();

        // Calculate and display the factorial
        try {
            long result = factorialCalculator.calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Hussain Shaikh
//231P039,38
//Write a program to display Human Face using applet.
import javax.swing.*;
import java.awt.*;

public class HumanFaceFrame extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the color for the face
        g.setColor(Color.YELLOW);

        // Draw the face (Oval)
        g.fillOval(100, 100, 200, 200); // x, y, width, height

        // Set the color for the eyes
        g.setColor(Color.BLACK);

        // Draw the eyes (Ovals)
        g.fillOval(150, 150, 30, 30); // Left eye
        g.fillOval(220, 150, 30, 30); // Right eye

        // Draw the nose (Line)
        g.drawLine(200, 180, 200, 220); // Nose

        // Set the color for the mouth
        g.setColor(Color.RED);

        // Draw the mouth (Arc)
        g.drawArc(150, 230, 100, 50, 0, -180); // x, y, width, height, startAngle, arcAngle
    }

    public static void main(String[] args) {
        // Create a frame to display the face
        JFrame frame = new JFrame("Human Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create an instance of the JPanel subclass (where the face is drawn)
        HumanFaceFrame facePanel = new HumanFaceFrame();

        // Add the panel to the frame
        frame.add(facePanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}

//Hussain Shaikh
//231P039,38
//WAP:Write an applet to all four types of rectangle (normal rectangle, filled rectangle, round rectangle,
round corner rectangle and filled round corner rectangle).
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class RectangleApplet extends Applet {

    public void paint(Graphics g) {
        // Normal Rectangle (Outlined)
        g.drawRect(50, 50, 100, 60);  // x, y, width, height
        g.drawString("Normal Rectangle", 50, 130);  // Label

        // Filled Rectangle
        g.setColor(Color.BLUE);  // Set color to blue
        g.fillRect(200, 50, 100, 60);  // x, y, width, height
        g.setColor(Color.BLACK);  // Reset color to black
        g.drawString("Filled Rectangle", 200, 130);  // Label

        // Round Rectangle (Outlined)
        g.drawRoundRect(50, 150, 100, 60, 30, 30);  // x, y, width, height, arcWidth, arcHeight
        g.drawString("Round Rectangle", 50, 230);  // Label

        // Filled Round-Corner Rectangle
        g.setColor(Color.RED);  // Set color to red
        g.fillRoundRect(200, 150, 100, 60, 30, 30);  // x, y, width, height, arcWidth, arcHeight
        g.setColor(Color.BLACK);  // Reset color to black
        g.drawString("Filled Round-Corner Rectangle", 200, 230);  // Label
    }

    // Main method to run applet as a Java application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Applet");
        RectangleApplet applet = new RectangleApplet();

        // Initialize the applet (same as if it were run in a browser)
        applet.init();
        applet.start();

        // Add the applet to the frame
        frame.add(applet);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

//Hussain Shaikh
//231P039,38
//Write a program to display circle and filled circle using Applet
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class CircleApplet extends Applet {

    public void paint(Graphics g) {
        // Outlined Circle
        g.drawOval(50, 50, 100, 100);  // x, y, width, height
        g.drawString("Outlined Circle", 70, 170);  // Label

        // Filled Circle
        g.setColor(Color.RED);  // Set color to red
        g.fillOval(150, 50, 100, 100);  // x, y, width, height
        g.setColor(Color.BLACK);  // Reset color to black
        g.drawString("Filled Circle", 180, 170);  // Label
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Applet");
        CircleApplet applet = new CircleApplet();

        // Initialize the applet (same as if it were run in a browser)
        applet.init();
        applet.start();

        // Add the applet to the frame
        frame.add(applet);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

//Hussain Shaikh
//231P039,38
//Write a program to find square of a
given number using applet.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SquareApplet extends JApplet implements ActionListener {
    // Declaring components
    private Label label;
    private TextField inputField;
    private Button squareButton;
    private String result = "";

    @Override
    public void init() {
        // Setting layout and adding components
        setLayout(new FlowLayout());

        label = new Label("Enter a number: ");
        add(label);

        inputField = new TextField(10);
        add(inputField);

        squareButton = new Button("Find Square");
        add(squareButton);

        // Adding action listener to the button
        squareButton.addActionListener(this);
    }

    // Action performed when the button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get the input from the text field and calculate the square
            int number = Integer.parseInt(inputField.getText());
            int square = number * number;
            result = "Square of " + number + " is " + square;
        } catch (NumberFormatException ex) {
            // Handle invalid input
            result = "Please enter a valid number.";
        }

        // Repaint the applet to display the result
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        // Display the result
        g.drawString(result, 50, 150);
    }

    public static void main(String[] args) {
        // Create a JFrame to hold the applet
        JFrame frame = new JFrame("Square Applet");
        SquareApplet applet = new SquareApplet();

        // Initialize the applet (same as if it were run in a browser)
        applet.init();
        applet.start();

        // Add the applet to the frame
        frame.add(applet);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

//Hussain Shaikh
//231P039,38
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField display;
    JButton[] numberButtons;
    JButton addButton, subButton, mulButton, divButton, equButton, delButton, clrButton;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator() {
        // Frame settings
        frame = new JFrame("Calculator");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Display panel
        display = new JTextField();
        display.setBounds(50, 25, 300, 50);
        display.setFont(new Font("Arial", Font.BOLD, 24)); // Increased font size
        display.setBackground(Color.LIGHT_GRAY); // Background color
        display.setEditable(false);
        frame.add(display);

        // Number buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 24));
            numberButtons[i].addActionListener(this);
        }

        // Operation buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        // Set button fonts
        addButton.setFont(new Font("Arial", Font.BOLD, 24));
        subButton.setFont(new Font("Arial", Font.BOLD, 24));
        mulButton.setFont(new Font("Arial", Font.BOLD, 24));
        divButton.setFont(new Font("Arial", Font.BOLD, 24));
        equButton.setFont(new Font("Arial", Font.BOLD, 24));
        delButton.setFont(new Font("Arial", Font.BOLD, 24));
        clrButton.setFont(new Font("Arial", Font.BOLD, 24));

        // Add action listeners to operation buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equButton.addActionListener(this);
        delButton.addActionListener(this);
        clrButton.addActionListener(this);

        // Panel settings
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 400);
        panel.setLayout(new GridLayout(4, 4, 10, 10)); // Adjusted gaps
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
        panel.add(clrButton);
        panel.add(numberButtons[0]);
        panel.add(delButton);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }

        // Check if display is not empty before parsing
        if (e.getSource() == addButton) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = '+';
                display.setText("");
            }
        }
        if (e.getSource() == subButton) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = '-';
                display.setText("");
            }
        }
        if (e.getSource() == mulButton) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = '*';
                display.setText("");
            }
        }
        if (e.getSource() == divButton) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = '/';
                display.setText("");
            }
        }
        if (e.getSource() == equButton) {
            if (!display.getText().isEmpty()) {
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
                        if (num2 != 0) { // Prevent division by zero
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
        }
        if (e.getSource() == delButton) {
            String str = display.getText();
            display.setText(str.length() > 0 ? str.substring(0, str.length() - 1) : "");
        }
        if (e.getSource() == clrButton) {
            display.setText("");
            num1 = num2 = result = 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

//Hussain Shaikh
//231P039,38
//Write an applet using ActionEvent and textfield to find largest between three numbers.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LargestNumberCalculator extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, num3Field, resultField;
    private JButton findLargestButton;

    public LargestNumberCalculator() {
        // Set up the frame
        setTitle("Largest Number Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create text fields
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        num3Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Result field is not editable

        // Create button
        findLargestButton = new JButton("Find Largest");
        findLargestButton.addActionListener(this);

        // Add components to the frame
        add(new JLabel("Number 1:"));
        add(num1Field);
        add(new JLabel("Number 2:"));
        add(num2Field);
        add(new JLabel("Number 3:"));
        add(num3Field);
        add(findLargestButton);
        add(new JLabel("Largest Number:"));
        add(resultField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get numbers from text fields
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double num3 = Double.parseDouble(num3Field.getText());

            // Find the largest number
            double largest = Math.max(num1, Math.max(num2, num3));
            resultField.setText(String.valueOf(largest));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        // Create the GUI
        SwingUtilities.invokeLater(() -> {
            LargestNumberCalculator calculator = new LargestNumberCalculator();
            calculator.setVisible(true);
        });
    }
}	
			
		
	




