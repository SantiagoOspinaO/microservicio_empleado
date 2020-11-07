package co.com.swiii.registrotemperatura.service.empleado.implement;

import co.com.swiii.registrotemperatura.converter.EmpleadoConverter;
import co.com.swiii.registrotemperatura.dto.HistoricoTemperaturaDTO;
import co.com.swiii.registrotemperatura.entity.EmpleadoEntity;
import co.com.swiii.registrotemperatura.model.Empleado;
import co.com.swiii.registrotemperatura.repository.EmpleadoRepository;
import co.com.swiii.registrotemperatura.restclient.HistoricoTemperaturaRestClient;
import co.com.swiii.registrotemperatura.service.empleado.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @org.springframework.beans.factory.annotation.Autowired(required=true)
    private EmpleadoConverter empleadoConverter;

    @org.springframework.beans.factory.annotation.Autowired(required=true)
    private EmpleadoRepository empleadoRepository;

    @org.springframework.beans.factory.annotation.Autowired(required=true)
    private HistoricoTemperaturaRestClient historicoTemperaturaRestClient;

    private EmpleadoEntity empleadoEntity = new EmpleadoEntity();


    @Override
    public void save(Empleado empleado) {
        empleadoRepository.save(empleadoConverter.modelToEntity(empleado));
    }

    @Override
    public Empleado findById(Long id) {
        return empleadoConverter.entityToModel(empleadoRepository.findById(id));
    }

    @Override
    public void deleteById(Long id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    public List<Empleado> findAll() {
        empleadoConverter.entityToModel(empleadoRepository.findAll());
        return empleadoConverter.entityToModel(empleadoRepository.findAll());
    }
}
