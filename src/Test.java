public class Test {
    public static void main(String args[])
    {
     FilePrio a ;//=new FilePrio("Hiba",2);
     FilePrio liste=new FilePrio();
     liste.creer();
     try {
         System.out.println(liste.estVide());
         liste.enfiler("Hiba",3);
         //liste.enfiler("Zola",2);
         //liste.enfiler("dd",4);
         //liste.enfiler("lin",5);
         System.out.println(liste.estVide());
         liste.afficher();
         a=liste.defiler();
         System.out.println("********************");
         System.out.println("elemnt suprimer est :"+a.getNom());
         System.out.println(liste.estVide());


     }
     catch (FileException e)
     {
         System.out.println("parametre invalide");
     }
   // System.out.println("la taille de la file : "+liste.taille(liste));

    }
}
