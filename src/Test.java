public class Test {
    public static void main(String args[])
    {
     FilePrio a ;//=new FilePrio("Hiba",2);
     FilePrio liste=new FilePrio();
     liste.creer();
     try {
         liste.enfiler("Hiba",3);
         liste.enfiler("Zola",2);
         liste.enfiler("dd",4);
         liste.enfiler("lin",5);
         liste.afficher();
         /*if(liste.tete()!=null)
         {
             System.out.println("premier elmnt est :"+liste.getFirst().getNom());
             System.out.println("suiv d 1er elmnt :"+liste.getFirst().getSuiv().getNom());
             System.out.println(liste.getFirst().getPreced());

             System.out.println("dernier elmnt :"+liste.getLast().getNom());
             System.out.println("precedent d dernier elmnt :"+liste.getLast().getPreced().getNom());
             System.out.println(liste.getLast().getSuiv());
         }*/
     }
     catch (FileException e)
     {
         System.out.println("parametre invalide");
     }
   // System.out.println("la taille de la file : "+liste.taille(liste));
   // System.out.println(liste.estVide());
    }
}
