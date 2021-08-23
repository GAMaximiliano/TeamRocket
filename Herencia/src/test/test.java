
package test;
import domain.Empleado;
import domain.Cliente;
public class test {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Andres", 'M', 21, "Panorama" ,true);
        System.out.println("Empleado1 = "+cliente);
    }
}
