package exercise1;

public class Main {
    public static void main(String[] args) {
         try {
              // EntierNaturel entierNaturel = new EntierNaturel(-1);
              EntierNaturel entierNaturel = new EntierNaturel();
                entierNaturel.setVal(3);

                for(int i = 0; i < 5; i++){
                    entierNaturel.decrementer();
                    System.out.println(entierNaturel.getVal());
                }

         } catch (NombreNegatifException e) {
              //System.out.println("Exception: " + e.getMessage());
              e.printStackTrace();
         }
   }
}
