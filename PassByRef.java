class Circle {
    public double getPI(){
        return 3.14;
    }
}
public class PassByRef{
    public void calcArea(Circle ojbPI, double rad){
        double area= ojbPI.getPI()*rad*rad;
        System.out.println("Area of the circle is: "+area);
    }
    public static void main(String[] args) {
        PassByRef d1=new PassByRef();
        d1.calcArea(new Circle(), 2);
    }
}
