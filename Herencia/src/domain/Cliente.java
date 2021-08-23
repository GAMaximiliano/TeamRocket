package domain;

import java.util.Date;

public class Cliente extends Persona {
    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int aContadorCliente) {
        contadorCliente = aContadorCliente;
    }
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean lineaCredito;
    
    private static int contadorCliente;
    
    public Cliente (String nombre, char genero, int edad, String direccion, boolean lineaCredito) {
        super(nombre, genero, edad, direccion);
        this.lineaCredito = lineaCredito;
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = new Date();
    }
    
    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(int ano, int mes, int dia ) {
        this.fechaRegistro = new Date(ano, mes, dia);
    }
    
    public boolean getLineaCredito() {
        return this.lineaCredito;
    }

    public void setLineaCredito(boolean lineaCredito) {
        this.lineaCredito = lineaCredito;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(this.idCliente);
        sb.append(", fechaRegistro=").append(this.fechaRegistro);
        sb.append(", lineaCredito=").append(this.lineaCredito);
        sb.append(", {").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
