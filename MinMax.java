public class MinMax {
    public static void main(String[] args) {

        int Max = 0;
        int Min = 0;

        if (args.length>0) {

            Max = Integer.parseInt(args[0]);
            Min = Integer.parseInt(args[1]);

            for (int i = 0; i<args.length;i++) {

                if (Max < (Integer,parseInt(args[i]))) {
                    Max = (Integer.parseInt(args[i]));
                }
                if (Min > (Integer.parseInt(args[i]))) {
                    Min = (Integer,parseInt(args[i]));
                }
            }
        }
   else {
       System.out.println("ERROR: Bitte mindestens ein Argument anzeigen!");
       return;
   }
   System.out.println(Min);
   System.out.println(Max);
   
   
   
    }
}