public class TestObjectReferences {
    public static void main(String[] args) {
        RectangleTest ojbRec1 = new RectangleTest(10,20);
        RectangleTest ojbRec2;
        ojbRec2=ojbRec1;
        System.out.println("\nRectangle1 Details");
        System.out.println("===================");
        ojbRec1.displayDimensions();
        System.out.println("\nRectangle2 Details");
        System.out.println("===================");
        ojbRec2.displayDimensions();
    }
}
