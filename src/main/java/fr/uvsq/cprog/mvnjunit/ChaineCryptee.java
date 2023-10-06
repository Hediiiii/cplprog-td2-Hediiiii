package fr.uvsq.cprog.mvnjunit;

public class ChaineCryptee {


    public String msg;
    public int decalage;

    public ChaineCryptee(String msg,int decalage){
        this.msg = msg;
        this.decalage = decalage;
    }



    public String StringCrypte(){
        
    int taille = this.msg.length();
    char[] table = this.msg.toCharArray();
    for (int i = 0; i<taille; i++){
        char b = (char) (table[i] + this.decalage);
        table[i] = b;
    }
     
    this.msg = String.valueOf(table);
     return this.msg;}
             
    
    public String StringDecrypte() {
        
    int taille = this.msg.length();
    char[] table = this.msg.toCharArray();
    for (int i = 0; i<taille; i++){
        char b = (char) (table[i] - this.decalage);
        table[i] = b;
    }
         this.msg = String.valueOf(table);
     return this.msg;}

    public static void main( String[] args )
        {
            ChaineCryptee chaine = new ChaineCryptee("THOMAS",4);
            String cryptage  = chaine.StringCrypte();
            String decryptage = chaine.StringDecrypte();

        
            System.out.println("la chaine crypté  " + cryptage);
            System.out.println("la chaine decrypté est  " + decryptage);

            //System.out.println("la chaîne décrypté est " + decryptage);
        
        
        }
        



    }
    

