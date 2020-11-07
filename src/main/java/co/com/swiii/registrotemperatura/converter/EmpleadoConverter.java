package co.com.swiii.registrotemperatura.converter;

import co.com.swiii.registrotemperatura.dto.HistoricoTemperaturaDTO;
import co.com.swiii.registrotemperatura.entity.EmpleadoEntity;
import co.com.swiii.registrotemperatura.model.Empleado;
import co.com.swiii.registrotemperatura.model.HistoricoTemperatura;
import co.com.swiii.registrotemperatura.model.exception.BusinessException;
import co.com.swiii.registrotemperatura.restclient.HistoricoTemperaturaRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EmpleadoConverter {

    @Autowired
    private HistoricoTemperaturaRestClient historicoTemperaturaRestClient;
    private EmpleadoEntity empleadoEntity = new EmpleadoEntity();


    public Empleado entityToModel(EmpleadoEntity empleadoEntity) {

        HistoricoTemperatura historicoTemperatura = new HistoricoTemperatura();
        HistoricoTemperaturaDTO historicoTemperaturaDTO = new HistoricoTemperaturaDTO();

        var empleado = new Empleado();
        empleado.setId(empleadoEntity.getId());
        empleado.setNombre(empleadoEntity.getNombre());
        empleado.setFechaNacimiento(empleadoEntity.getFechaNacimiento());


        //historicoTemperatura.setIdHistoricoTemperatura(historicoTemperaturaDTO.getIdHistoricoTemperatura());
        //historicoTemperatura.setFechaMuestreo(historicoTemperaturaDTO.getFechaMuestreo());
        //historicoTemperatura.setTemperatura(historicoTemperaturaDTO.getTemperatura());

        //empleado.setHistoricoTemperatura(historicoTemperatura);

        return empleado;
    }

    public Empleado entityToModel(EmpleadoEntity empleadoEntity, HistoricoTemperaturaDTO historicoTemperaturaDTO) throws BusinessException {

        HistoricoTemperatura historicoTemperatura = new HistoricoTemperatura();
        historicoTemperatura.setIdHistoricoTemperatura(historicoTemperaturaDTO.getIdHistoricoTemperatura());
        historicoTemperatura.setFechaMuestreo(historicoTemperaturaDTO.getFechaMuestreo());
        historicoTemperatura.setTemperatura(historicoTemperaturaDTO.getTemperatura());

        Empleado empleado = new Empleado();
        empleado.setId(empleadoEntity.getId());
        empleado.setNombre(empleadoEntity.getNombre());
        empleado.setFechaNacimiento(empleadoEntity.getFechaNacimiento());
        //empleado.setHistoricoTemperatura(historicoTemperatura);
        return empleado;
    }

    public EmpleadoEntity modelToEntity(Empleado empleado) {

        HistoricoTemperatura historicoTemperatura = new HistoricoTemperatura();

        var empleadoEntity = new EmpleadoEntity();
        empleadoEntity.setId(empleado.getId());
        empleadoEntity.setNombre(empleado.getNombre());
        empleadoEntity.setFechaNacimiento(empleado.getFechaNacimiento());
        //historicoTemperatura.setIdHistoricoTemperatura(empleado.getHistoricoTemperatura().getIdHistoricoTemperatura());

        //HistoricoTemperaturaDTO historicoTemperaturaDTO = new HistoricoTemperaturaDTO();
        // historicoTemperaturaDTO = historicoTemperaturaRestClient.findById(historicoTemperatura.getIdHistoricoTemperatura());

        //historicoTemperatura.setIdHistoricoTemperatura(historicoTemperaturaDTO.getIdHistoricoTemperatura());
        // historicoTemperatura.setFechaMuestreo(historicoTemperaturaDTO.getFechaMuestreo());
        // historicoTemperatura.setTemperatura(historicoTemperaturaDTO.getTemperatura());

        //empleado.setHistoricoTemperatura(historicoTemperatura);

        //empleadoConverter.entityToModel(empleadoEntity,historicoTemperaturaDTO);

        return empleadoEntity;
    }

    public List<Empleado> entityToModel(List<EmpleadoEntity> empleadosEntity) {

        List<Empleado> empleados = new ArrayList<>(empleadosEntity.size());
        empleadosEntity.forEach(entity -> empleados.add(entityToModel(entity)));
        return empleados;
    }

    public Empleado entityToModel(Optional<EmpleadoEntity> empleadoEntity) {

        Empleado empleado = null;
        if (empleadoEntity.isPresent()) {
            empleado = new Empleado();
            empleado.setId(empleadoEntity.get().getId());
            empleado.setNombre(empleadoEntity.get().getNombre());
            empleado.setFechaNacimiento(empleadoEntity.get().getFechaNacimiento());

            return empleado;
        }
        return empleado;
    }
}
