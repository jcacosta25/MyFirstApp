package com.fsw_fime.myfirstapp;

/**
 * Created by Juan C. Acosta on 4/30/2016.
 * bbxmstudios
 * juan.acosta@bbxmstudios.com
 */
public class Clima {
    String temp, humedad,ciudad,prob,imagen,dia;

    public Clima(String temp, String humedad, String ciudad, String prob, String imagen, String dia) {
        this.temp = temp;
        this.humedad = humedad;
        this.ciudad = ciudad;
        this.prob = prob;
        this.imagen = imagen;
        this.dia = dia;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProb() {
        return prob;
    }

    public void setProb(String prob) {
        this.prob = prob;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
