package day01;

public class StaticVariable {
    //static/class variable
    //it doesn't need to be initialized
    //if the method is static,it only understands variables which
    //have already been initialized
    //String is a reference data type

    static  String str="Test";
    //int is primitive data type
    static int num1= 12;

    public static void main(String[] args) {
        System.out.println(str);

        System.out.println(num1);
    }
}
