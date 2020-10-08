package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    
    
    public static void main(String[] args) throws ClassNotFoundException {
     
        
        try {
            Socket socket = new Socket("localhost",55455);
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());            
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            
            /*Leitura arquivo*/
            String leitura = new  String(LeitorArquivo.leitorArquivo());
            System.out.println("Digite:\n1 para Insertion Sort\n2 para Selection sort\n3 para bubble sort\n");
            Scanner entradaTeclado = new Scanner(System.in);
            int ordenamento;
            ordenamento  = entradaTeclado.nextInt();
            
            
            //Enviar o tipo de ordenamento
            
            
            output.writeInt(ordenamento);
            output.flush();
            
            
            
            //Enviar array
            ArrayList<Integer> arrayList = new ArrayList(ArrumarArray.arrumarArray(leitura));   
            System.out.println("\nArray Enviado:\n" +arrayList );
            output.writeObject(arrayList);
            output.flush();
            
            
            //Retorno Array Servidor
            arrayList = (ArrayList<Integer>) input.readObject();
            System.out.println("\nArray respondido do servidor:\n"+ arrayList);
            
            
            input.close();
            output.close();
            socket.close();
            
        } catch (IOException ex) {
            System.out.println("Erro no cliente"+ex);
            
        }
        
    }
    
}
