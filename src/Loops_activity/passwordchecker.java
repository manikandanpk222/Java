package Loops_activity;

import java.util.Scanner;

public class passwordchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner=new Scanner(System.in);
		 String password;
		 boolean isStrong=false;
		 
		 do{
			 System.out.println("Enter Password"); 
			 password=scanner.nextLine();
			 boolean hasUppercase=false;
			 boolean hasLowercase=false;
			 boolean hasDigit=false;
			 boolean hasSpecialChar=false;
			 //manIkandan12@
			 int i=0;
			 
			 while(i<password.length()) {
				 char ch=password.charAt(i);
				 
				 
				 if(Character.isUpperCase(ch)){
					 hasUppercase=true;
				 }
				 else if(Character.isLowerCase(ch)) {
					 hasLowercase=true;
				 }
				 else if(Character.isDigit(ch)) {
					 hasDigit=true;
				 }
				 else {
					 hasSpecialChar=true;
				 }
				 
				 i++;
			 }
				 
			 if (password.length()>=8&&hasUppercase&&hasLowercase&&hasDigit&&hasSpecialChar) {
				 isStrong=true;
				 System.out.println("Password is strong and accepted"); 
			 }else {
				 System.out.println("Password is not strong.Try again"); 
			 }
		 }while(!isStrong);
		 
		 }

	}


