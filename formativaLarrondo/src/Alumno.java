
/**
 *
 * @author macos
 */
public class Alumno {
    
    private String nombre, rut, id, nivelIngles, taller;
    private float promNotas;

    public Alumno() {
    }

    public Alumno(String nombre, String rut, String id, String nivelIngles, String taller, float promNotas) {
        setNombre(nombre);
        this.rut = rut;
        setId(id);
        this.nivelIngles = nivelIngles;
        this.taller = taller;
        this.promNotas = promNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (this.nombre.length()>=3) {
            this.nombre = nombre;
        }
        else{
            System.out.println("El nombre debe contener al menos 3 carácteres");
        }
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (this.id.length()>=8) {
            this.id = id;
        }
        else{
            System.out.println("La ID debe tener al menos 8 dígitos ");
        }
        
    }

    public String getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(String nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public String getTaller() {
        return taller;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public float getPromNotas() {
        return promNotas;
    }

    public void setPromNotas(float promNotas) {
        this.promNotas = promNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", rut=" + rut + ", id=" + id + ", nivelIngles=" + nivelIngles + ", taller=" + taller + ", promNotas=" + promNotas + '}';
    }
    
    
    public void editarPromedio(float promedio){
        setPromNotas(promNotas);
        System.out.println("Nuevo promedio"+ getPromNotas());
                
    }
       
}
