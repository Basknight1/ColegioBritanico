
/**
 *
 * @author macos
 */
public class Apoderado {
    
    private String nombre, rut,id,formaPago;
    private int pagoTotal, hijosMatriculados;
    private Alumno alumno;

    public Apoderado() {
    }

    public Apoderado(String nombre, String rut, String id, String formaPago, int pagoTotal, int hijosMatriculados, Alumno alumno) {
        setNombre(nombre);
        this.rut = rut;
        setId(id);
        this.formaPago = formaPago;
        this.pagoTotal = pagoTotal;
        setHijosMatriculados(hijosMatriculados);
        this.alumno = alumno;
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

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(int pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public int getHijosMatriculados() {
        return hijosMatriculados;
    }

    public void setHijosMatriculados(int hijosMatriculados) {
        if (hijosMatriculados>=1 && hijosMatriculados<=8) {
            this.hijosMatriculados = hijosMatriculados;
        }
        else{
            System.out.println("No puede tener menos de 1 o más de 8 hijos matriculados");
        }
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Apoderado{" + "nombre=" + nombre + ", rut=" + rut + ", id=" + id + ", formaPago=" + formaPago + ", pagoTotal=" + pagoTotal + ", hijosMatriculados=" + hijosMatriculados + ", alumno=" + alumno + '}';
    }
    
    //customers
    public void mostrarDatos(){
        System.out.println("VER DATOS");
        System.out.println(toString());
    }
    
    public void validarID(){
        if (alumno.getId().equalsIgnoreCase(this.getId())) { 
            System.out.println("ID validado con éxito");           
            
        }
        else{}System.out.println("Los ID no son iguales");
    }
    
    public float obtenerDescuento(){
        float descuento = 0;
        if (getFormaPago().equalsIgnoreCase("PAC")) {
            descuento = 0.1f;
            if (getHijosMatriculados()>1) {
                descuento = 0.15f;                
            }
            else if (getFormaPago().equalsIgnoreCase("CHEQUE"))
                descuento = 0.05f;
            if (getHijosMatriculados()>1) {
                descuento = 0.1f;
                
            }
        }
        return descuento;
    }
    public void totalPagar(){
        float totalBruto = 0;
        int totalFinal = 0;
        int descuentoCash = 0;
        totalBruto= (150_000*10)*getHijosMatriculados();
        descuentoCash=(int) (totalBruto*obtenerDescuento());
        totalFinal= (int)totalBruto-descuentoCash;
        setPagoTotal(pagoTotal);
        System.out.println("Total a pagar: "+getPagoTotal());
        
    } 


}
