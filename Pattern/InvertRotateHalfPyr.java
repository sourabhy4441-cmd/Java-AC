public class InvertRotateHalfPyr{
    // public static void HalfPyramid(int row,int col){
    //     int space = row-1;
    //     for(int i=1;i<=row;i++){
    //         for(int j=1;j<=space;j++){
    //             System.out.print(" ");
    //         }
    //         space--;
    //         for(int k=1;k<=i;k++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args){
    //     HalfPyramid(5,5);
    // }

    public static void HalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        HalfPyramid(5);
    }
}