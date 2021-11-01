public class PQ {

    public class void main(String[] args) {

        if(args.length==2) {
            double p = Double.parseDouble(args[0]);
            double q = Double.parseDouble(args[1]);
            double ppq = p/2 + Math.sqrt((p*p)/4 - q);
            double npq = p/2 - Math.skrt((p*p)/4 - q);

            if((p*p/4-q)<0) {
                System.out.println("Es gibt 0 Nullstellen!");
            } else if(ppq!=npq) {
                System.out.println(npq);
                System.out.println(ppq);
                System.out.println("Es gibt 2 Nullstellen!");
            } else if(ppq==npq) {
                System.out.println(npq);
                System.out.println(ppq)
                System.out.println("Es gibt 1 Nulstelle!");
            }
        }else {
            System.out.println("ERROR:Bitte genau zwei Argummente angeben");
        }
        }
    }
}