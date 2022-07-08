import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Viaje
{
    private String origen;
    private String destino;
    private GregorianCalendar horaSalida;
    private GregorianCalendar horaLlegada;
    private Pasajero[] pasajeros;
    private int cantPasajeros;
    private int cont;
    private Bus bus;
    
    public Viaje()
    {
        
    }
    
    public Viaje(String origen, String destino, GregorianCalendar horaSalida, GregorianCalendar horaLlegada, int cantPasajeros)
    {
        this.origen = origen;
        this.destino = destino;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.cantPasajeros = cantPasajeros;
        this.pasajeros = new Pasajero[cantPasajeros];
        this.cont = 0;
    }
    
    /**GET Method Propertie origen*/
    public String getOrigen(){
        return this.origen;
    }//end method getOrigen

    /**SET Method Propertie origen*/
    public void setOrigen(String origen){
        this.origen = origen;
    }//end method setOrigen

    /**GET Method Propertie destino*/
    public String getDestino(){
        return this.destino;
    }//end method getDestino

    /**SET Method Propertie destino*/
    public void setDestino(String destino){
        this.destino = destino;
    }//end method setDestino

    /**GET Method Propertie horaSalida*/
    public GregorianCalendar getHoraSalida(){
        return this.horaSalida;
    }//end method getHoraSalida

    /**SET Method Propertie horaSalida*/
    public void setHoraSalida(GregorianCalendar horaSalida){
        this.horaSalida = horaSalida;
    }//end method setHoraSalida

    /**GET Method Propertie horaLlegada*/
    public GregorianCalendar getHoraLlegada(){
        return this.horaLlegada;
    }//end method getHoraLlegada

    /**SET Method Propertie horaLlegada*/
    public void setHoraLlegada(GregorianCalendar horaLlegada){
        this.horaLlegada = horaLlegada;
    }//end method setHoraLlegada

    /**GET Method Propertie pasajeros*/
    public Pasajero[] getPasajeros(){
        return this.pasajeros;
    }//end method getPasajeros

    /**SET Method Propertie pasajeros*/
    public void setPasajeros(Pasajero[] pasajeros){
        this.pasajeros = pasajeros;
    }//end method setPasajeros

    /**GET Method Propertie bus*/
    public Bus getBus(){
        return this.bus;
    }//end method getBus

    /**SET Method Propertie bus*/
    public void setBus(Bus bus){
        this.bus = bus;
    }//end method setBus
    

    public int getCont()
    {
        return this.cont;
    }
    
    public void anadirPasajero(Pasajero p)
    {
        this.pasajeros[this.cont] = p;
        this.cont++;
    }
    
    public String toString()
    {
        SimpleDateFormat formato = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        String impresion = " Origen: "+this.origen+"\n"+
                           " Destino: "+this.destino+"\n"+
                           " Hora salida: "+formato.format(this.horaSalida.getTime())+"\n"+
                           " Hora llegada: "+formato.format(this.horaLlegada.getTime()) + "\n"+
                           " Cant. pasajeros max: "+this.cantPasajeros;
        return impresion;
    }

}



