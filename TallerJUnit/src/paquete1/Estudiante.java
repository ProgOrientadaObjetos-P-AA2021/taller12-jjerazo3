
package paquete1;

public class Estudiante {    
    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;
    
    public void establecerNombresEstudiante(String n){
        nombresEstudiante = n;    
    }
    
    public String obtenerNombresEstudiante(){
        return nombresEstudiante;    
    }
    
    public void establecerApellidoEstudiante(String n){
        apellidosEstudiante = n;    
    }
    
    public String obtenerApellidosEstudiante(){
        return apellidosEstudiante;    
    }
    
    public void establecerIdentificacionEstudiante(String n){
        identificacionEstudiante = n;    
    }
    
    public String obtenerIdentificacionEstudiante(){
        return identificacionEstudiante;    
    }
}
