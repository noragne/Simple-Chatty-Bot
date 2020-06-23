import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean orderedAsc = true;
        boolean oredredDsc = true;

        int num = sc.nextInt();

        while (sc.hasNextInt()) {
            int old = num;
            num = sc.nextInt();
            
            if (num  == 0) {
                break;
            }
             
            if (old > num && oredredDsc) {
                orderedAsc = false;
            } 
            
            if (old < num && orderedAsc) {
                oredredDsc = false;
            } 
            if(!orderedAsc && !oredredDsc) {
                break;
            }
            
        }
        
        System.out.println(oredredDsc || orderedAsc);

    }
}
