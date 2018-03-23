public class FilePrio implements File {
    private String nom;
    private int prio;
    FilePrio suiv,preced,first=null,last=null;

    /*Constructeur
    public FilePrio(String nom,int prio)
    {
        this.nom=nom;
        this.prio=prio;
        this.suiv=null;
        this.preced=null;
    }
*/
    @Override
    public FilePrio creer() {
        return null;
    }

    @Override
    public void enfiler(String n,int p) throws FileException{
        boolean insertion=false;
       if(p<1 || p>5)
           throw new FileException();

       if(first==null)
       {
           this.nom=n;
           this.prio=p;
           this.preced=null;
           first=this;
           last=this;
           System.out.println("insertion 1er elmnt");

       }
       else
           {
            FilePrio a=new FilePrio();
               a.nom=n;
               a.prio=p;
           if(last.prio<p)
           { System.out.println("3");
               last.suiv=a;
               a.preced=this;
               a.suiv=null;
               last=a;
           }
           else
           {
               FilePrio l,q;
               l=first;
           while (l!=null)
           {
               if(a.prio>l.prio && a.prio<l.suiv.prio)
               {
                   System.out.println("insertion au milieu");
                       q=l.suiv;
                       l.suiv=a;
                       a.suiv=q;
                       q.preced=a;
                       a.preced=l;
                       insertion=true;
               }
               l=l.suiv;
           }
         if(!insertion)
         {
               System.out.println("insertion au debut");
               a.suiv=first;
               first.preced=a;
               a.preced=null;
               first=a;
           }


           }
       }
    }

    public void afficher(){
        FilePrio l=first;
        while(l!=null)
        {
            System.out.println("Nom :"+l.nom);
            l=l.suiv;

        }
    }
    @Override
    public FilePrio defiler() throws FileException {
        if(estVide())
            throw new FileException();
        FilePrio p;
        p=last.preced;
        last.preced=null;
        last=p;
        last.suiv=null;
        return last;

    }

    @Override
    public FilePrio tete() throws FileException
    {
       if(estVide())
           throw new FileException();
      return last;

    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean estVide()
    {
       return first==null;
    }

    public int getPrio() {
        return prio;
    }

    public FilePrio getSuiv() {
        return suiv;
    }

    public FilePrio getPreced() {
        return preced;
    }

    public FilePrio getLast() {
        return last;
    }

    public FilePrio getFirst() {
        return first;
    }

    @Override
    public int taille(FilePrio a)
    { if (last.suiv==null)
      return 0;
    else
        return 1+taille(first.suiv);
    }
}
