package dsi.utn.fakeapi.api.service;

import dsi.utn.fakeapi.api.models.VinoDataHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BodegaService {
    public VinoDataHolder[] getVinosBodegaMar(){
        List<VinoDataHolder> vinos = new ArrayList<>();
        vinos.add(
                VinoDataHolder.builder()
                        .anada(1997)
                        .nombre("Suspiro de Otoño")
                        .nombreUva("Sauvignon Blanc")
                        .notaDeCataBodega("Es un vino peligroso")
                        .precioARS(7500)
                        .porcentajeComposicionVarietal(86)
                        .build()
        );
        vinos.add(VinoDataHolder.builder()
                .anada(2010)
                .nombre("Rocío Matinal")
                .nombreUva("Malbec")
                .notaDeCataBodega("Es un vino divertido")
                .precioARS(8000)
                .porcentajeComposicionVarietal(85)
                .build());

        vinos.add(VinoDataHolder.builder()
                .anada(2014)
                .nombre("Vino y se fue")
                .nombreUva("Malbec")
                .notaDeCataBodega("Es un vino chistosito")
                .precioARS(4000)
                .porcentajeComposicionVarietal(80)
                .build());
        vinos.add(VinoDataHolder.builder()
                .anada(2021)
                .nombre("Vinooooooo")
                .nombreUva("Pinot Gris")
                .notaDeCataBodega("Es un vino chistosito")
                .precioARS(4000)
                .porcentajeComposicionVarietal(80)
                .build());

        VinoDataHolder[] arr = new VinoDataHolder[vinos.size()];
        arr = vinos.toArray(arr);

        for (VinoDataHolder x : arr)
            System.out.print(x + " ");

        return arr;
    }

    public VinoDataHolder[] getVinosBodegaGenial(){
        List<VinoDataHolder> vinos = new ArrayList<>();
        vinos.add(
                VinoDataHolder.builder()
                        .anada(2005)
                        .nombre("Invierno Agradable")
                        .nombreUva("Sauvignon Blanc")
                        .notaDeCataBodega("Ha subido la calidad estos días.")
                        .precioARS(10000)
                        .porcentajeComposicionVarietal(80)
                        .build()
        );
        vinos.add(
                VinoDataHolder.builder()
                        .anada(1991)
                        .nombre("Vino Y Se Quedó")
                        .nombreUva("Sauvignon Blanc")
                        .notaDeCataBodega("Es un vino que se queda en las personas que lo prueban.")
                        .precioARS(10000)
                        .porcentajeComposicionVarietal(81)
                        .build()
        );

        VinoDataHolder[] arr = new VinoDataHolder[vinos.size()];
        arr = vinos.toArray(arr);

        for (VinoDataHolder x : arr)
            System.out.print(x + " ");

        return arr;
    }
}
