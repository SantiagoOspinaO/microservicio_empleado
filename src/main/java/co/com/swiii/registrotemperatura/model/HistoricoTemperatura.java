package co.com.swiii.registrotemperatura.model;

import co.com.swiii.registrotemperatura.model.exception.BusinessException;
import co.com.swiii.registrotemperatura.util.Validator;

import java.util.Date;

public class HistoricoTemperatura {

    public static final String FECHA_MUESTREO_VACIA = "La fecha de muestreo es requerida";

    private Date fechaMuestreo;
    private Long idHistoricoTemperatura;
    private double temperatura;

    public HistoricoTemperatura(){
        super();
    }

    public static class HistoricoTemperaturaBuilder{

        private Date fechaMuestreo;
        private Long idHistoricoTemperatura;
        private double temperatura;

        public HistoricoTemperaturaBuilder setFechaMuestreo(Date fechaMuestreo) {
            this.fechaMuestreo = fechaMuestreo;
            return this;
        }

        public HistoricoTemperaturaBuilder setIdHistoricoTemperatura(Long idHistoricoTemperatura) {
            this.idHistoricoTemperatura = idHistoricoTemperatura;
            return this;
        }

        public HistoricoTemperaturaBuilder setTemperatura(double temperatura) {
            this.temperatura = temperatura;
            return this;
        }

        public HistoricoTemperatura build() throws BusinessException {
            HistoricoTemperatura historicoTemperatura = new HistoricoTemperatura();
            Validator.valorNulo(fechaMuestreo, FECHA_MUESTREO_VACIA);
            historicoTemperatura.fechaMuestreo = fechaMuestreo;
            return historicoTemperatura;
        }
    }

    public Date getFechaMuestreo() {
        return fechaMuestreo;
    }

    public void setFechaMuestreo(Date fechaMuestreo) {
        this.fechaMuestreo = fechaMuestreo;
    }

    public Long getIdHistoricoTemperatura() {
        return idHistoricoTemperatura;
    }

    public void setIdHistoricoTemperatura(Long idHistoricoTemperatura) {
        this.idHistoricoTemperatura = idHistoricoTemperatura;
    }
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
