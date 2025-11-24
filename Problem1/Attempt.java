public class Javadayelevenone {
    public static boolean isPattern(int row,int col){
       for(int i=1;i<=row;i++){
        //This is for the inner loop
        for(int j=1;j<=col;j++){
            if(i==1||i==row||j==1||j==col){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        System.out.println(isPattern(4, 5));
    }


}
