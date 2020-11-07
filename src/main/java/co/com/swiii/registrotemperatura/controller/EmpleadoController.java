package co.com.swiii.registrotemperatura.controller;

import co.com.swiii.registrotemperatura.converter.EmpleadoConverter;
import co.com.swiii.registrotemperatura.entity.EmpleadoEntity;
import co.com.swiii.registrotemperatura.model.Empleado;
import co.com.swiii.registrotemperatura.service.empleado.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;
    @Autowired
    EmpleadoConverter empleadoConverter;

    @PostMapping("/empleadoo")
    public void save(@RequestBody Empleado empleado) {
        empleadoService.save(empleado);
    }

    @GetMapping("/{id}/empleado")
    public Empleado findByID(@PathVariable(value = "id", required = true) Long id) {
        return empleadoService.findById(id);
    }

    @DeleteMapping("/{id}/empleado")
    public void deleteById(@PathVariable(value = "id", required = true) Long id) {
        empleadoService.deleteById(id);
    }

    @GetMapping("/empleado")
    public List<Empleado> findAll() {
        return empleadoService.findAll();
    }

    @PutMapping("/{id}/empleado")
    public void update(@RequestBody EmpleadoEntity empleadoEntity, @PathVariable(value = "id", required = true) Long id) {
        empleadoEntity.setId(id);
        empleadoService.save(empleadoConverter.entityToModel(empleadoEntity));
    }
}
