package co.com.swiii.registrotemperatura.service.empleado;

import co.com.swiii.registrotemperatura.model.Empleado;

import java.util.List;

public interface EmpleadoService {

    void save(Empleado empleado);
    Empleado findById(Long id);
    void deleteById(Long id);
    List<Empleado> findAll();
}
