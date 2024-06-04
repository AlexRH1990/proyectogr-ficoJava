/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 50687
 */
import java.util.Random;

public class Persona { // Se crea la superclase Persona
    private String id;
    private String nombre;
    private String apellido1;
    private String apellido2;

    // Constructor con parámetros
    public Persona(String nombre, String apellido1, String apellido2) {
        this.id = generarID();
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Constructor sin parámetros
    public Persona() {
        this.id = generarID();
        this.nombre = "";
        this.apellido1 = "";
        this.apellido2 = "";
    }

    // Generar ID aleatorio de 9 dígitos
    private String generarID() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            sb.append(rnd.nextInt(10));
        }
        return sb.toString();
    }

    // Getters y setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
    this.id = id;
}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
}
