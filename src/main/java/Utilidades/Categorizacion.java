
package Utilidades;

import static Utilidades.Tokens.*;
import java.util.ArrayList;

public class Categorizacion {
    private final String TextoA;
    private int ContadorF = 1;
    private int ContadorI = 0;
    private ArrayList<Tokens> ListaTokens = new ArrayList<>();
    public Categorizacion(String TextoA) {
        this.TextoA = TextoA;
    }
    public void Analisis(){
        boolean LlaveEntero = false;
        boolean Llave = true;
        boolean LLaveID = false;
        String Token = "";
        //lo que añade el numero
        do{
            String Contenido = TextoA.substring(ContadorI,ContadorF);
            System.out.println(ContadorI); 
                    if(Contenido.equals(" ")){
                        System.out.println("Entro a espacio");
                        Llave = false;
                    }else if(CompararSiEsNumero(Contenido)){
                        System.out.println("Entro a entero");
                        Token+=Contenido;
                        LlaveEntero= true;
                    }else if(Contenido.equals(",")){
                        System.out.println("Entro a coma");
                        Token+=Contenido;
                    }else{
                        System.out.println("xd");
                        Token+=Contenido;
                    }
                ContadorF++;
                ContadorI++;
            if(LlaveEntero){
                if(Contenido.contains(".")){
                    CrearDecimal(Contenido);
                }else{
                    CrearEntero(Contenido);
                }
                LlaveEntero = false;
            }
        }while(ContadorF==TextoA.length());
    }
    
    public void CrearEntero(String Contenido){
        Tokens Entero = ENTERO;
        Entero.setContenido(Contenido);
        ListaTokens.add(Entero);
    }
    public boolean CompararSiEsNumero(String no){
        for(int i = 0; i <= 10; i++){
            if(no.equals(String.valueOf(i))){
                return true;
            }
        }   
        return false;
    }

    public void CrearDecimal(String Contenido){
        Tokens Decimal = DECIMAL;
        Decimal.setContenido(Contenido);
        ListaTokens.add(Decimal);
    }
     
    public ArrayList<Tokens> getListaTokens() {
        return ListaTokens;
    }

    public void setListaTokens(ArrayList<Tokens> ListaTokens) {
        this.ListaTokens = ListaTokens;
    }
    
}
