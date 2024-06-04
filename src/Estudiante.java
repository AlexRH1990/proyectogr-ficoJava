/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 50687
 */
public class Estudiante extends Persona {// Se crea la clase Estudiante
    private String carrera;
    private int proyecto1;
    private int proyecto2;
    private int encuesta;
    private int foro;
    private int juego;

    // Constructor con parámetros
    public Estudiante(String nombre, String apellido1, String apellido2, String carrera, int proyecto1, int proyecto2, int encuesta, int foro, int juego) {
        super(nombre, apellido1, apellido2);
        this.carrera = carrera;
        this.proyecto1 = proyecto1;
        this.proyecto2 = proyecto2;
        this.encuesta = encuesta;
        this.foro = foro;
        this.juego = juego;
    }

    // Constructor sin parámetros
    public Estudiante() {
        super();
        this.carrera = "";
        this.proyecto1 = 0;
        this.proyecto2 = 0;
        this.encuesta = 0;
        this.foro = 0;
        this.juego = 0; 
    }

    // Getters y setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getProyecto1() {
        return proyecto1;
    }

    public void setProyecto1(int proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public int getProyecto2() {
        return proyecto2;
    }

    public void setProyecto2(int proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public int getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(int encuesta) {
        this.encuesta = encuesta;
    }

    public int getForo() {
        return foro;
    }

    public void setForo(int foro) {
        this.foro = foro;
    }
    public int getJuego() {
        return juego;
    }

    public void setJuego(int juego) {
        this.juego = juego;
    }

  
}
