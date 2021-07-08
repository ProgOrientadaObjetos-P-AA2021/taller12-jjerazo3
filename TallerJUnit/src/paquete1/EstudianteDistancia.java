
package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante{
       
    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;
    
    public void establecerNotas(ArrayList<Nota> ns){
        notas = ns;
    }
    
    public void establecerMejorNota(){
        double mayor = 0;
        for(int i = 0; i < obtenerNotas().size(); i++){
            if(obtenerNotas().get(i).obtenerValor() > mayor){
                mayor = obtenerNotas().get(i).obtenerValor();
            }
        }
        mejorNota = mayor;
    }
    
    public void establecerPeorNota(){
        double menor = 10;
        for(int i = 0; i < obtenerNotas().size(); i++){
            if(obtenerNotas().get(i).obtenerValor() < menor){
                menor = obtenerNotas().get(i).obtenerValor();
            }
        }
        peorNota = menor;
    }
    
    public void establecerPromedio(){
        double suma = 0;
        for(int i = 0; i < obtenerNotas().size(); i++){
            suma = suma + obtenerNotas().get(i).obtenerValor();
        }
        promedio = suma / obtenerNotas().size();
    }
    
    public ArrayList<Nota> obtenerNotas(){
        return notas;
    }
    
    public double obtenerMejorNota(){
        return mejorNota;
    }
    
    public double obtenerPeorNota(){
        return peorNota;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Nombre Estudiante: Andrea Vela\n"
                + "Cédula: 98981234"
                + "Notas: \n"
                + "10.0"
                + "5.0"
                + "6.0"
                + "Proemdio: 7.0"
                + "Mejor Nota: 10.0"
                + "Peor Nota: 5.0");
        return cadena;
    }         
}