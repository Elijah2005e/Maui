import java.util.*;
class Anubis { 
	public static Scanner input = new Scanner(System.in);
	public static String response;
	public static String [][] product = new String[10][10];
	public static void main(String[] args ) {
		System.out.print("Welcome to the underworld! ");
		fill();
		print();
	}
	public static void fill() {
		System.out.print("Who did you bring? ");
		response = input.nextLine();
		for(int i = 0; i < product.length; i++){
			for(int j = 0; j < product[i].length; j++){
				product[i][j] =  response;
			}
		}
	}
	public static void print(){
		System.out.print("Here you go!");
		for(int i = 0; i < product.length; i++){
			for(int j = 0; j < product[i].length; j++){
				System.out.print( product[i][j]+" " );
			}
			System.out.println();
			System.out.println("Safe travels to you. ");
			}
		}
	}
