public class Test {
    public static void main(String args[])
    {
     FilePrio a ;//=new FilePrio("Hiba",2);
     FilePrio liste=new FilePrio();
     liste.creer();
     try {
         liste.enfiler("Hiba",3);
        // liste.enfiler("Zola",2);
        // liste.enfiler("dd",4);
        // liste.enfiler("lin",5);

         liste.afficher();




     }
     catch (FileException e)
     {
         System.out.println("parametres invalides");
     }
     try {
         a = liste.defiler();
         System.out.println("la taille :"+liste.taille());
         System.out.println("elemnt suprimer est :"+a.getNom());
         System.out.println(liste.estVide());
         // System.out.println("la taille de la file : "+liste.taille(liste));
     }  catch (FileException e)
     {
         System.out.println("File vide !");
     }
    }
}
