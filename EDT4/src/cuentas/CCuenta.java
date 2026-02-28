/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/** 
 * Clase que representa una cuenta bancaria y versión del código creado
 * @author melga
 * @version 1.0
 * @since 1.0
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }

/**
 * Devuelve el saldo despues del ingreso o retirada
 * @return saldo actualizado
 */
    public double estado()
    {
        return saldo;
    }

/**
 * La cantidad debe ser mayor que 0.
 * @param cantidad
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    public String obtenerCuenta()
    {
        return cuenta;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInterés() {
        return tipoInteres;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInteres = tipoInterés;
    }
}
