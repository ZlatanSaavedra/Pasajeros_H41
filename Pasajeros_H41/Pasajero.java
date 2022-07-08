public class Pasajero
{
    private String nombre;
    private String apellido;
    private int numDocumento;
    private String [] equipajes;
    
    public Pasajero()
    {
        this.nombre = "";
        this.apellido = "";
        this.numDocumento = 0;
        this.equipajes = new String[3];
    }
    
    public Pasajero(String nombre, String apellido, int numDocumento, String [] equipajes)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDocumento = numDocumento;
        this.equipajes = equipajes;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public void setNumDocumento(int numDocumento)
    {
        this.numDocumento = numDocumento;
    }
    
    public void setEquipajes(String [] equipajes)
    {
        this.equipajes = equipajes;
    }
        
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public int getNumDocumento()
    {
        return this.numDocumento;
    }
    
    public String [] getEquipajes()
    {
        return this.equipajes;
    }
        
    public String toString()
    {
        String impresion = "Pasajero:\n"+
                           "Nombre: "+this.nombre+"\n"+
                           "Apellido: "+this.apellido+"\n"+
                           "Documento: "+this.numDocumento+"\n"+
                           "Equipaje: "+this.equipajes[0]+" , "+this.equipajes[1]+" , "+this.equipajes[2]+"\n";
        return impresion;
    }
}







