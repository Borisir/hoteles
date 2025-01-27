package models;

public class Hoteles {
    private Integer idhotel;
    private String nombre;
    private String habitaciones;
    private String ciudad;
    private Double latitud;
    private Double longitud;

    public Hoteles() {
    }

    public Hoteles(Integer idhotel, String nombre, String habitaciones, String ciudad, Double latitud, Double longitud) {
        this.idhotel = idhotel;
        this.nombre = nombre;
        this.habitaciones = habitaciones;
        this.ciudad = ciudad;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    public Integer getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Integer idhotel) {
        this.idhotel = idhotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }




 
    
}
