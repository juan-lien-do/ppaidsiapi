package dsi.utn.fakeapi.api.controller;

import dsi.utn.fakeapi.api.models.VinoDataHolder;
import dsi.utn.fakeapi.api.service.BodegaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@RestController
@RequestMapping("/bodegas")
public class BodegaControlador {
    @Autowired
    private final BodegaService bodegaService;

    //@GetMapping("/{nombre}")
    public ResponseEntity<VinoDataHolder[]> traerNovedades(@PathVariable String nombre) {
        if (Objects.equals(nombre, "BodegaMar")) {
            System.out.println("xd");
            return ResponseEntity.ok(bodegaService.getVinosBodegaMar());
        } else if (Objects.equals(nombre, "BodegaGenial")) {
            System.out.println("lol");
            return ResponseEntity.ok(bodegaService.getVinosBodegaGenial());
        } else {
            System.out.println("lmao");
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("bodegagenial.com/api/")
    public ResponseEntity<VinoDataHolder[]> traerBodegaGenial() {
        return traerNovedades("BodegaGenial");
    }

    @GetMapping("bodegamar.com/api/")
    public ResponseEntity<VinoDataHolder[]> traerBodegaMar(){
        return traerNovedades("BodegaMar");
    }

    @GetMapping("bodegamontana.com/api/")
    public ResponseEntity<String> traerBodegaMontana(){
        return ResponseEntity.ok("No hay datos todavia vuelva pronto");
    }


}
