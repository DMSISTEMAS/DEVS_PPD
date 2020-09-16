package mx.model;
// Generated 15/09/2020 12:16:51 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Deposito generated by hbm2java
 */
public class Deposito  implements java.io.Serializable {


     private int id;
     private String banco;
     private String nocuenta;
     private String clabe;
     private String titular;
     private String archivo;
     private String rfc;
     private String solicitante;
     private String correo;
     private Date fecha;

    public Deposito() {
    }

	
    public Deposito(int id) {
        this.id = id;
    }
    public Deposito(int id, String banco, String nocuenta, String clabe, String titular, String archivo, String rfc, String solicitante, String correo, Date fecha) {
       this.id = id;
       this.banco = banco;
       this.nocuenta = nocuenta;
       this.clabe = clabe;
       this.titular = titular;
       this.archivo = archivo;
       this.rfc = rfc;
       this.solicitante = solicitante;
       this.correo = correo;
       this.fecha = fecha;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getBanco() {
        return this.banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getNocuenta() {
        return this.nocuenta;
    }
    
    public void setNocuenta(String nocuenta) {
        this.nocuenta = nocuenta;
    }
    public String getClabe() {
        return this.clabe;
    }
    
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getArchivo() {
        return this.archivo;
    }
    
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getSolicitante() {
        return this.solicitante;
    }
    
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


