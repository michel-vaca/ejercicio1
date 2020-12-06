package com.example.ejercicio1.modelo;

import java.io.Serializable;

public class Alumno implements Serializable {
    private String nombre;
    private String apellidos;
    private String numCuenta;
    private String fechaNaciDia;
    private String fechaNaciMes;
    private String fechaNaciAno;
    private String carrera;

    public Alumno(String nombre, String apellidos, String numCuenta, String fechaNaciDia, String fechaNaciMes, String fechaNaciAno, String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numCuenta = numCuenta;
        this.fechaNaciDia = fechaNaciDia;
        this.fechaNaciMes = fechaNaciMes;
        this.fechaNaciAno = fechaNaciAno;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getFechaNaciDia() {
        return fechaNaciDia;
    }

    public void setFechaNaciDia(String fechaNaciDia) {
        this.fechaNaciDia = fechaNaciDia;
    }

    public String getFechaNaciMes() {
        return fechaNaciMes;
    }

    public void setFechaNaciMes(String fechaNaciMes) {
        this.fechaNaciMes = fechaNaciMes;
    }

    public String getFechaNaciAno() {
        return fechaNaciAno;
    }

    public void setFechaNaciAno(String fechaNaciAno) {
        this.fechaNaciAno = fechaNaciAno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}