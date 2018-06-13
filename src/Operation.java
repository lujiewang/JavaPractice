public class Operation {
    public static void main(String[] args) {
        int result=1+2;

        System.out.println("1+2= "  +result);

        int prevoiusResult= result;


        result=result *10;
        System.out.println(prevoiusResult+" * 10 =" + result);

        prevoiusResult=result;
        result=result/5;

        System.out.println(prevoiusResult +" /5 =" +result);


        prevoiusResult=result;

        result=result%3;

        System.out.println(prevoiusResult + "%3= "+ result);
    }
}
