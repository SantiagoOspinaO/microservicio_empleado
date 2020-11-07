package co.com.swiii.registrotemperatura.dto;

import lombok.Data;

import java.util.Date;

@Data
public class HistoricoTemperaturaDTO {

    private Date fechaMuestreo;
    private Long idHistoricoTemperatura;
    private double temperatura;


}
