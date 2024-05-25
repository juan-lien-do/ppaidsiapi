package dsi.utn.fakeapi.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class VinoDataHolder {
    private int anada;
    private String imagenEtiqueta;
    private LocalDate fechaActualizacion;
    private String nombre;
    private String notaDeCataBodega;
    private float precioARS;
    private List<String> maridajes;
    private boolean actualizable = false;
    // hace falta hacer un dto extra????

    private List<String> descripcionesVarietal;
    private List<Integer> porcentajesComposicionVarietal;
    private List<String> nombresUva;
}