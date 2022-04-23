public class RectangleTest {
    int width;
    int height;
    RectangleTest() {
        System.out.println("Constructor Invoked.....");
        width=10;
        height=10;
    }
    RectangleTest(int wid, int heig){
        System.out.println("Parameterized Constructor");
        wid=width;
        heig=height;
    }
    void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
