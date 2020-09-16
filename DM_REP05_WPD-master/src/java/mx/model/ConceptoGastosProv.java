package mx.model;
// Generated 15/09/2020 12:16:51 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ConceptoGastosProv generated by hbm2java
 */
public class ConceptoGastosProv  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private String uuid;
     private BigDecimal precioUnitario;
     private String cantidad;
     private String unidad;
     private String claveUnidad;
     private BigDecimal importe;
     private String claveProd;

    public ConceptoGastosProv() {
    }

	
    public ConceptoGastosProv(int id) {
        this.id = id;
    }
    public ConceptoGastosProv(int id, String descripcion, String uuid, BigDecimal precioUnitario, String cantidad, String unidad, String claveUnidad, BigDecimal importe, String claveProd) {
       this.id = id;
       this.descripcion = descripcion;
       this.uuid = uuid;
       this.precioUnitario = precioUnitario;
       this.cantidad = cantidad;
       this.unidad = unidad;
       this.claveUnidad = claveUnidad;
       this.importe = importe;
       this.claveProd = claveProd;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public BigDecimal getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public String getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public String getClaveUnidad() {
        return this.claveUnidad;
    }
    
    public void setClaveUnidad(String claveUnidad) {
        this.claveUnidad = claveUnidad;
    }
    public BigDecimal getImporte() {
        return this.importe;
    }
    
    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }
    public String getClaveProd() {
        return this.claveProd;
    }
    
    public void setClaveProd(String claveProd) {
        this.claveProd = claveProd;
    }




}


