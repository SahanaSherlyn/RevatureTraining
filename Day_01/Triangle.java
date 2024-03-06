/*Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments.*/

public class Triangle {
	public static void main(String[] args) {
		int side_A = Integer.parseInt(args[0]);
		int side_B = Integer.parseInt(args[1]);
		int side_C = Integer.parseInt(args[2]);
		int perimeter = side_A + side_B + side_C;
		System.out.println("Perimeter of the triangle is =" +perimeter);
	}
}