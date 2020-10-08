package client;

public class TipoOdernamento {
    
    public static int tipoOdernamento(String velha){
       
        for(int j=0;velha.length()>j&&velha.charAt(j)!='\n';j++){
            if(velha.charAt(j)=='1'){
                return 1;
            }
            if(velha.charAt(j)=='2'){
                return 2;
            }
            else if(velha.charAt(j)=='3'){
                return 3;
            }
        }    
        return 0;
    }
}
