public class Rectangle {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide length and breadth ");
            return;
        }

        float length = Float.parseFloat(args[0]);
        float breadth = Float.parseFloat(args[1]);
        float area = length * breadth;
        float perimeter = (length + breadth) * 2;

        System.out.println("Length = " + length + ", Breadth = " + breadth +
                ", The area of the rectangle is = " + area +
                ", The perimeter of the rectangle is = " + perimeter);
    }
}