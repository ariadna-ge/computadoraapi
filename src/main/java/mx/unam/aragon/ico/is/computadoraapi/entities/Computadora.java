package mx.unam.aragon.ico.is.computadoraapi.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "computadoras")
public class Computadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private int clave;

    @Column(name = "marca_computadora", nullable = false, length = 50)
    private String marca;

    @Column(name = "modelo_computadora", columnDefinition = "VARCHAR(50) not null")
    private String modelo;

    @Column(name = "url_foto", nullable = true, insertable = false, columnDefinition = "varchar(250) DEFAULT 'https://www.shareicon.net/data/256x256/2016/07/08/117998_sun_512x512.png'")
    private String foto;

    @Column(name = "precio_pesos", nullable = true)
    private Float precio;

    @Override
    public String toString() {
        return "Computadora{" +
                "clave=" + clave +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", foto='" + foto + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computadora that = (Computadora) o;
        return clave == that.clave && Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo) && Objects.equals(foto, that.foto) && Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, marca, modelo, foto, precio);
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Computadora() {}

    public Computadora(int clave, String marca, String modelo, String foto, Float precio) {
        this.clave = clave;
        this.marca = marca;
        this.modelo = modelo;
        this.foto = foto;
        this.precio = precio;
    }
}
