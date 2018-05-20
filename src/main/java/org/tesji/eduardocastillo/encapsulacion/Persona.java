package org.tesji.eduardocastillo.encapsulacion;

import java.util.logging.Logger;

public class Persona {
	private static Logger LOG = Logger.getLogger(Persona.class.getName());
    
    private String nombre;
    private String sexo;
    
    private Persona madre;
    private Persona padre;
    
    
    public Persona reproducirse(Persona persona){
        Persona hijo = null;
        
        if(persona != null && this.sexo!=persona.sexo){
            hijo = new Persona();
            hijo.nombre = "Jorge";
            
            if(sexo.equals("F")){
                hijo.madre = this;
                hijo.padre = persona;
            }else if (sexo.equals("M")){
                hijo.padre = this;
                hijo.madre = persona;
            }
            
        }else{
        
            LOG.info("No pueden tener hijos");
        }
        
        return hijo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }
    
    
    
}
