public class GameDemo {

    public String divideByNumber(int firstNumber,int secondNumber){
        String reminder="0";
        try {
            reminder= String.valueOf(firstNumber/secondNumber);
        } catch (Exception e) {
            System.out.println(e);
        }
        return reminder;
    }

    public static void main(String[] args) {
        GameDemo g1=new GameDemo();
        int f1=10;
        int f2=0;
        int reminder= Integer.parseInt(g1.divideByNumber(f1,f2));
        System.out.println("reminder = "+reminder);
    }

}
