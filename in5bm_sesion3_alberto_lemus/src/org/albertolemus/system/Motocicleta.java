package org.albertolemus.system;

/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 3-3-2022
 * Carne: 2021062
 * Codigo: IN5BM
 */
public class Motocicleta {
    private String color;
    private String marca;
    private String modelo;
    private double cilindraje;
    private double precio;
    private double velocidad;
    private double gasolina;
    private String llave;
    private String volante;
    private double aceleracion;
    private double frenado;
    
    //Metodo Constructor Nulo
    public Motocicleta(){
        
    }
    
    //Constructor con parametros
    public Motocicleta(String color, String marca, String modelo, double cilindraje,double precio,
        double velocidad,double gasolina, String llave, String volante, double aceleracion,double frenado){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.cilindraje=cilindraje;
        this.precio=precio;
        this.velocidad=velocidad;
        this.gasolina=gasolina;
        this.llave=llave;
        this.volante=volante;
        this.aceleracion=aceleracion;
        this.frenado=frenado;
    }
    // ---------------ARRANCAR---------------
    public String arrancar(String llave){
        if(llave.equals("puesta")){
            System.out.println("Arrancando");
        }else{
            System.out.println("No arrancar");
    }
        return this.llave;
    }
 
    public String arrancar(){
        if(llave.equals("puesta")){
            System.out.println("Arrancando");
        }else{
            System.out.println("No arrancar");  
    }
        return llave;        
    }
    //--------------ACELERAR------------------------
    public double acelerar(double velocidad, double aceleracion){
        velocidad=velocidad+aceleracion;
        System.out.println("Tu velocidad actual es: " + velocidad);
        return this.velocidad;    
    }
        
    
    public double acelerar(){
       for(double i=this.velocidad;i<=velocidad;i++){
            velocidad=i;
            System.out.println("Aceleracion: "+ i);    
       }
        return velocidad;
    }
    //--------------------FRENAR----------------------
    public double frenar(){
        for(double i=velocidad;i>=frenado;i--){
            System.out.println("Desaceleracion: "+i);
        }
        return velocidad;
    }
    
     public double frenar(double velocidad, double frenado){
       velocidad=velocidad-frenado;
         System.out.println("Tu velocidad actual es: "+ velocidad);
        return velocidad;
    }
    // ---------------------GIRAR VOLANTE------------------
    public String girarVolante(String volante){
       if(volante.equals("derecha")){
            System.out.println("El volante giro a la derecha ");
        }else{
            if(volante.equals("izquierda")){
                System.out.println("El volante giro a la izquierda ");
            }
        }
        return volante;
    }
     
    public String girarVolante(){
       if(volante.equals("derecha")){
            System.out.println("El volante giro a la derecha ");
        }else{
            if(volante.equals("izquierda")){
                System.out.println("El volante giro a la izquierda ");
            }
        }
        return volante;        
    }

    
    
    //Getter's
    public String getColor(){
        return color;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getCilindraje(){
        return cilindraje;
    }
    public double getPrecio(){
        return precio;
    }
    public double getVelocidad(){
        return velocidad;
    }
    public double getGasolina(){
        return gasolina;
    }
    public String getLlave(){
        return llave;
    }
    public String getVolante(){
        return volante;
    }
    public double getAceleracion(){
        return aceleracion;
    }
    public double getFrenado(){
        return frenado;
    }    
    
    //Setter's
    public void setColor(String color){
        this.color=color;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setCilindraje(double cilindraje){
        this.cilindraje=cilindraje;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setVelocidad(double velocidad){
        this.velocidad=velocidad;
    }
    public void setGasolina(double gasolina){
        this.gasolina=gasolina;
    }
    public void setLlave(String llave){
        this.llave=llave;
    }
    public void setVolante(String volante){
        this.volante=volante;
    }
    public void setAceleracion(double aceleracion){
        this.aceleracion=aceleracion;
    }
    public void setFrenado(double frenado){
        this.frenado=frenado;
    }    
    
    
}
