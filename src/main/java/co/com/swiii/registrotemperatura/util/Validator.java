package co.com.swiii.registrotemperatura.util;

import co.com.swiii.registrotemperatura.model.exception.BusinessException;

import java.util.Date;

public class Validator {

    public static void valorNulo(Long valor, String mensaje) throws BusinessException {
        if (valor == null) {
            throw new BusinessException(mensaje);
        }
    }

    public static void valorNulo(Date fechaMuestreo, String mensaje) throws BusinessException {
        if (fechaMuestreo == null) {
            throw new BusinessException(mensaje);
        }
    }

    public static void nombreNulo(String nombre, String mensaje) throws BusinessException {
        if (nombre == null) {
            throw new BusinessException(mensaje);
        }
    }

    public static void validarFechaNula(Date fecha, String mensaje) throws BusinessException {
        if (fecha == null) {
            throw new BusinessException(mensaje);
        }
    }

}
