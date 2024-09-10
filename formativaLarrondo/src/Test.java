
import java.util.Scanner;
/**
 *
 * @author macos
 */
public class Test {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opc;
        float nuevoPromedio;
        
        Alumno alumno1 = new Alumno("HERNÁN","15766399","12345678","AVANZADO","PÁDEL",3.9f);
        Apoderado apoderado1 = new Apoderado("PEPONSIO","20830555","12345678","PAC",150_000, 2, alumno1);
        
        do {                
            System.out.println("(1)VALIDAR ID\n (2)VER DATOS\n (3)OBTENER DESCUENTO\n (4)TOTAL A PAGAR\n (5)EDITAR PROMEDIO \n (0)SALIR");                        
            System.out.println("SELECCIONE UNA OPCIÓN: ");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    apoderado1.validarID();                    
                    break;
                case 2:    
                    apoderado1.mostrarDatos();
                    break;                    
                case 3:   
                    System.out.println(apoderado1.obtenerDescuento());
                    break;
                case 4:
                    apoderado1.totalPagar();
                    break;
                case 5:
                    System.out.println("Ingrese el nuevo promedio: ");
                    nuevoPromedio = leer.nextFloat();
                    alumno1.editarPromedio(nuevoPromedio);
                    break;                                    
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida"); 
                   
            }
            
            
            
            
            
            
        } while (opc!=0);
    }
    
}
