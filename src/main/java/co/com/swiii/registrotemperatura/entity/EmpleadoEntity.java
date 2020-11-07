package co.com.swiii.registrotemperatura.entity;

import co.com.swiii.registrotemperatura.model.HistoricoTemperatura;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "empleado")
public class EmpleadoEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name="idHistoricoTemperatura")
    private Long idHistoricoTemperatura;

}
