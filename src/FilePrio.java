public class FilePrio implements File {
    private String nom;
    private int prio;
    FilePrio suiv,preced,first=null,last=null;


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
          // System.out.println("insertion 1er elmnt");

       }
       else
           {
            FilePrio a=new FilePrio();
               a.nom=n;
               a.prio=p;
           if(last.prio<p)
           {// System.out.println("3");
               last.suiv=a;
               a.preced=last;
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
                   //System.out.println("insertion au milieu");
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
               //System.out.println("insertion au debut");
               a.suiv=first;
               first.preced=a;
               a.preced=null;
               first=a;
           }


           }
       }
    }


    @Override
    public FilePrio defiler() throws FileException {
        if(estVide())
            throw new FileException();
        FilePrio p=last;

        if(last!=first)
        {
            last=p.preced;
            p.preced=null;
            last.suiv=null;
        }
        else
         { last=null;
           first=null;
         }
        return p;

    }

    @Override
    public FilePrio tete() throws FileException
    {
       if(estVide())
           throw new FileException();
      return last;

    }

    @Override
    public boolean estVide()
    {
       return first==null;
    }


    @Override
    public int taille(FilePrio a)
    { if (last.suiv==null)
      return 0;
    else
        return 1+taille(first.suiv);
    }

    public String getNom() {
        return nom;
    }
    public void afficher(){
        FilePrio l=first;
        while(l!=null)
        {   if(l.suiv!=null && l.preced!=null)
            System.out.println("Nom :"+l.nom+"suivant:"+l.suiv.nom+"preced:"+l.preced.nom);
        else
            System.out.println("je ss le dernie ou le premier :"+l.nom);
            l=l.suiv;

        }
    }
}
