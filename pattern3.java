public class pattern3 {
    public static void main(String[]args){
            int n=5;
        
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int k=1;k<=n;k++){
                for(int l=4;l>=k;l--){
                    System.out.print("*");

                }
                System.out.println();  
            } 
    }
    }

    // Answer
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *