package co.com.swiii.registrotemperatura.restclient;

import co.com.swiii.registrotemperatura.dto.HistoricoTemperaturaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="servicio.historicotemperatura", url ="localhost:8081")
public interface HistoricoTemperaturaRestClient {

    @GetMapping("/{id}/historicotemperatura")
    HistoricoTemperaturaDTO findById(@PathVariable Long id);

}
