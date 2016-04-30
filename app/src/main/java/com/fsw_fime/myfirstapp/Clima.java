package com.fsw_fime.myfirstapp;

/**
 * Created by Juan C. Acosta on 4/30/2016.
 * bbxmstudios
 * juan.acosta@bbxmstudios.com
 */
public class Clima {
    String temp, ciudad;

    public Clima(String temp, String ciudad) {
        this.temp = temp;
        this.ciudad = ciudad;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}