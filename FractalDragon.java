public class FractalDragon {
    public static void main(String[] args) {
        int level = Integer.parseInt(args[0]);
        String temp = "F";
        String result = "F";
        for( int i = 0; i < level; i++ ){
            System.out.println(result);
            String str = result;
            result = result + "L" + temp;
            temp = str + "R" + temp;
        }
    }
}
