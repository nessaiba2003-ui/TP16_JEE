package ma.ens.tp8monitoring.controller;

import io.micrometer.core.instrument.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {

    private static final Logger logger = LoggerFactory.getLogger(MonitoringController.class);

    @GetMapping("/process")
    public String processData() {
        // Incrémenter le compteur personnalisé à chaque appel
        Metrics.counter("custom.requests.count").increment();

        logger.info("Requête enregistrée dans Prometheus");
        return "Traitement terminé";
    }
}
