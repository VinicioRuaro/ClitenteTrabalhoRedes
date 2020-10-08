package client;

import java.util.ArrayList;

public class ArrumarArray {

    
    public static ArrayList<Integer> arrumarArray(String leitura){
        String velha = new String();
        velha=leitura;
        Integer help=0;

       
        int negativo=0;
        int zero=0;
        ArrayList<Integer> saida = new ArrayList();
        
        for(int j=0;velha.length()>j;j++){ 
           
              
            if(velha.charAt(j)=='-'&&help==0){
                negativo++;
                
            }
            
            else if(velha.charAt(j)=='0'){ 
                help = help*10;
                zero++;
                
            }     
            else if(velha.charAt(j)=='1'){ 
                help = help*10;
                help = help+1;
                
            }
            else if(velha.charAt(j)=='2'){ 
                help = help*10;
                help = help+2;
                
            }  
            else if(velha.charAt(j)=='3'){ 
                help = help*10;
                help = help+3;
                
            }
            else if(velha.charAt(j)=='4'){ 
               help = help*10;
                help = help+4;
                
            }
            else if(velha.charAt(j)=='5'){ 
                help = help*10;
                help = help+5;
                
            }
            else if(velha.charAt(j)=='6'){ 
                help = help*10;
                help = help+6;
                
            }   
            else if(velha.charAt(j)=='7'){ 
                help = help*10;
                help = help+7;
                
            }
            else if(velha.charAt(j)=='8'){ 
                help = help*10;
                help = help+8;
               
            }   
            else if(velha.charAt(j)=='9'){ 
                help = help*10;
                help = help+9;
                
            }
            
                
             if(velha.charAt(j)=='\n'||velha.charAt(j)==' '){
                if(negativo>0){
                   help = help *- 1; 
                   negativo--;
                }
              
                 
                if(zero!=0||help!= 0){
                saida.add(help);
                
                help = 0;
                zero = 0;
                }
            }
            
            
        }
            
        
        return saida;  
    }
      
       
}