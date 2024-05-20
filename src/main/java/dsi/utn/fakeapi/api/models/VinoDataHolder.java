package dsi.utn.fakeapi.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class VinoDataHolder {
    private int anada;
    private LocalDate fechaActualizacion;
    private String nombre;
    private String notaDeCataBodega;
    private float precioARS;
    private List<String> maridajes;
    private String descripcionVarietal;
    private int porcentajeComposicionVarietal;
    private String nombreUva;
    private boolean actualizable = false;
}