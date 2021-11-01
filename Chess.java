public class Chess {
    public static void main(String[] args) {

        if(args.length>0) {
            int Brett = Integer.parseInt(args[0]);
        if(Brett<0) {
            System.out.println("ERROR:Bitte Positive zahleingeben!");
            return;    
        }
        for(int i = 0; i < Brett;i++) {
            for(int j = 0; j < Brett; j++) {
                if((i+j) %2 == 0 ) {
                    System.out.print("*");
                } else{
                    Sytsem.out.print(" "); 
                }
            }
       System.out.println() ;
        }
        }else {
            System.out.println("ERROR:Bitte die Groesse des Felders als Argument uebergeben!");
        }
    }
}