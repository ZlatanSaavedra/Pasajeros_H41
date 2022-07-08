import javax.swing.JOptionPane;
import java.util.GregorianCalendar;

public class Inicio
{
    public static void main(String [] args)
    {
        int opcion;
        Viaje v = null;
        do
        {
            String opcionesMenu = "MENU PRINCIPAL \n"+
                                  "1. Crear viaje \n"+
                                  "2. Agregar pasajeros al viaje \n"+
                                  "3. Mostrar pasajeros del viaje \n"+
                                  "4. Asignar bus \n"+
                                  "0. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, opcionesMenu));
            switch(opcion)
            {
                case 1:
                    v = crearViaje();
                    break;
                case 2:
                    if (v != null)
                    {
                        Pasajero p = preguntarPasajero();
                        v.anadirPasajero(p);    
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Debe crear primero un viaje");    
                    }
                    break;
                case 3:
                    if (v != null)
                    {
                        for (int i = 0; i < v.getCont(); i++)
                        {
                            JOptionPane.showMessageDialog(null, v.getPasajeros()[i].toString());
                        }
                    }
                    break;
                case 4:
                    
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }
            
        }
        while(opcion != 0);
    }
    
    
    public static GregorianCalendar preguntarFecha(String pregunta)
    {
        String datoFecha = JOptionPane.showInputDialog(null, "Ingrese fecha "+pregunta+" (dd-mm-yyyy)");
        String [] datosFechaS = datoFecha.split("-");
        int dia = Integer.parseInt(datosFechaS[0]);
        int mes = Integer.parseInt(datosFechaS[1])-1;
        int anio = Integer.parseInt(datosFechaS[2]);
        String datoHora = JOptionPane.showInputDialog(null, "Ingrese hora "+pregunta+" (hh:mm)");
        String [] datosHoraS = datoHora.split(":");
        int hora = Integer.parseInt(datosHoraS[0]);
        int min = Integer.parseInt(datosHoraS[1]);
        GregorianCalendar fecha = new GregorianCalendar​(anio, mes, dia, hora, min); 
        return fecha;
    }
    
    
    public static Viaje crearViaje()
    {
        String origen = JOptionPane.showInputDialog(null, "Ingrese origen del viaje");
        String destino = JOptionPane.showInputDialog(null, "Ingrese destino del viaje");
        GregorianCalendar fechaSalida = preguntarFecha("de salida del viaje");
        GregorianCalendar fechaLlegada = preguntarFecha("de llegada del viaje");
        int cantPasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de pasajeros del viaje"));
        Viaje v = new Viaje(origen, destino, fechaSalida, fechaLlegada, cantPasajeros);
        JOptionPane.showMessageDialog(null, "Viaje creado: \n"+v.toString());
        return v;
    }
    
    
    public static Pasajero preguntarPasajero()
    {
        String nombre;
        String apellido;
        int numDocumento;
        
        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del pasajero");
        apellido = JOptionPane.showInputDialog(null, "Ingrese apellido del pasajero");
        numDocumento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese documento del pasajero"));
        String [] equipajes = new String[3];
        for (int i = 0; i<3; i++)
        {
            equipajes[i] = JOptionPane.showInputDialog(null, "Ingrese descripción del equipaje del pasajero");
        }
        
        Pasajero pas = new Pasajero(nombre, apellido, numDocumento, equipajes);
        return pas;
    }
}
