public class FloydsTriangle{
    public static void FloydsTriangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args){
        
        FloydsTriangle(7);
    }
}