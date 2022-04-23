public class Varargs {
    public void addNumber(int...num){
        int sum=0;
        for (int i:num){
            sum =sum +i;
        }
        System.out.println("Sum of number is: "+sum);
    }
    public static void main(String[] args) {
        Varargs ojb=new Varargs();
        ojb.addNumber(10,30,20,40);
    }
}
