/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helado;

/**
 *
 * @author B12
 */
public class HeladoAtributos {

    String nombre = "oreo";
    String lugar_de_venta = "Popsy";
    boolean rico = true;
    String color = "negro con blanco";
    int numero_de_bolas = 2;
    
    public HeladoAtributos(){}
    
    public String getnombre(){
        return nombre;
    }
     public int getnumero_de_bolas(){
      return  numero_de_bolas;
    }
   
       public String getlugar_de_venta(){
        return lugar_de_venta;
    }
        public boolean getrico(){
        return rico;
    }    
         public String getcolor(){
        return color;
    }
         //Set's
         
        public void setnombre(String h){
        this.nombre= h;
    }
     public void setnumero_de_bolas(int h){
      this.numero_de_bolas = h; 
     }    
       public void setlugar_de_venta(String h){
        this.lugar_de_venta = h;
    }
       public void setcolor(String h){
        this.color= h;
    }  
       public void setrico(Boolean h){
        this.rico= h;}
       
        //Funciones adicionales
        
        public void añadir_sabor(String h){
        this.nombre =  nombre + h;}
       
        public void setañadir_bola(int h){
        this.numero_de_bolas = numero_de_bolas + 1;}
         public void setcambiar_lugar_de_venta(String h){
        this.lugar_de_venta= h;}
    
         public void setya_no_es_rico(Boolean h){
        this.rico= h;}
     
        public void setelegir_otro_color_distinto(String h){
        this.color = h;}
}   
                 
       
    
    

