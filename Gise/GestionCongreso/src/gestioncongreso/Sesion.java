package gestioncongreso;

import java.sql.Date;

public class Sesion {
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private Usuario usuario;

    public Sesion(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    @Override
    public String toString() {
        return "Sesion " + "Fecha y hora de inicio= " + fechaHoraInicio + ", Fecha y hora de fin= " + fechaHoraFin;
    }
    
    
}
