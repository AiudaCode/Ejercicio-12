// se importa paquete "JOptionPane" para dibujar un cuadro de dialogo en pantalla
// que muestre información o para llenar información.
import javax.swing.JOptionPane; 

public class Main
{
    public static void main(String[] args)
    {
        // se crea un objeto de la clase Empleado (Instanciaciación)
        Empleado obj = new Empleado();
       // se muestra un mensaje de dialogo con el salario bruto.
        JOptionPane.showMessageDialog(null, "Salario bruto: $" + obj.salarioBruto());
        // se muestra un mensaje de dialogo con la retención en la fuente.
        JOptionPane.showMessageDialog(null, "Retención en la Fuente: $" + obj.retencionEnFuente());
        // se muestra un mensaje de dialogo con el salario neto.
        JOptionPane.showMessageDialog(null, "Salario Neto: $" + obj.salarioNeto());
    }

}