package co.com.swiii.registrotemperatura.model;

import co.com.swiii.registrotemperatura.model.exception.BusinessException;
import co.com.swiii.registrotemperatura.util.Validator;
import lombok.Data;

import java.util.Date;
import java.util.List;

public class Empleado {

    public static final String ID_REQUERIDO = "El Id es requerido";
    public static final String NOMBRE_REQUERIDO = "El nombre es requerido";
    public static final String FECHA_NACIMIENTO_REQUERIDA = "La fecha de nacimiento es requerida";

    private Long id;
    private String nombre;
    private Date fechaNacimiento;
    //private HistoricoTemperatura historicoTemperatura;


    public Empleado() {
        super();
    }

    public static class EmpleadoBuilder {

        private Long id;
        private String nombre;
        private Date fechaNacimiento;


        public Long getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public Date getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public EmpleadoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder setFechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Empleado build() throws BusinessException {
            Empleado empleado = new Empleado();
            Validator.valorNulo(id, ID_REQUERIDO);
            empleado.id = this.id;
            Validator.nombreNulo(nombre, NOMBRE_REQUERIDO);
            empleado.nombre = this.nombre;
            Validator.validarFechaNula(fechaNacimiento, FECHA_NACIMIENTO_REQUERIDA);
            empleado.fechaNacimiento = this.fechaNacimiento;

            return empleado;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


}
