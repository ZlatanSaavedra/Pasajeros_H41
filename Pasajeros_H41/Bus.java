public class Bus
{
    private String placa;
    private int numPuestos;
    private String tipo;
    private int numInterno;
    
    public Bus()
    {
        
    }
    
    public Bus(String placa, int numPuestos, String tipo, int numInterno)
    {
        this.placa = placa;
        this.numPuestos = numPuestos;
        this.tipo = tipo;
        this.numInterno = numInterno;
    }

    /**GET Method Propertie placa*/
    public String getPlaca(){
        return this.placa;
    }//end method getPlaca

    /**SET Method Propertie placa*/
    public void setPlaca(String placa){
        this.placa = placa;
    }//end method setPlaca

    /**GET Method Propertie numPuestos*/
    public int getNumPuestos(){
        return this.numPuestos;
    }//end method getNumPuestos

    /**SET Method Propertie numPuestos*/
    public void setNumPuestos(int numPuestos){
        this.numPuestos = numPuestos;
    }//end method setNumPuestos

    /**GET Method Propertie tipo*/
    public String getTipo(){
        return this.tipo;
    }//end method getTipo

    /**SET Method Propertie tipo*/
    public void setTipo(String tipo){
        this.tipo = tipo;
    }//end method setTipo

    /**GET Method Propertie numInterno*/
    public int getNumInterno(){
        return this.numInterno;
    }//end method getNumInterno

    /**SET Method Propertie numInterno*/
    public void setNumInterno(int numInterno){
        this.numInterno = numInterno;
    }//end method setNumInterno

//End GetterSetterExtension Source Code


}//End class