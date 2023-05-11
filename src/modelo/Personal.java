package modelo;

import java.util.Date;

public class Personal {
    private int id;
    private String nombre;
    private Date hora_llegada;

    public Personal(String nombre){
        this.nombre = nombre;
    }

    public Personal (String nombre, int id, Date hora_llegada){
        this.nombre = nombre;
        this.id = id;
        this.hora_llegada = hora_llegada;
    }
    public Date getHora_llegada() {
        return hora_llegada;
    }
    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }
    public void setHora_llegada(Date hora_llegada) {
        this.hora_llegada = hora_llegada;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
