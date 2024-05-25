package dsi.utn.fakeapi.api.service;

import dsi.utn.fakeapi.api.models.VinoDataHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BodegaService {
    public VinoDataHolder[] getVinosBodegaMar() {
        List<VinoDataHolder> vinos = new ArrayList<>();
        vinos.add(
                VinoDataHolder.builder()
                        .imagenEtiqueta(null)
                        .anada(1997)
                        .nombre("Suspiro de Otoño")
                        .notaDeCataBodega("Es un vino peligroso")
                        .precioARS(7500)
                        .maridajes(new ArrayList<>(List.of(new String[]{"Pan"})))
                        .nombresUva(new ArrayList<>(List.of(new String[]{"Sauvignon Blanc", "Malbec"})))
                        .porcentajesComposicionVarietal(new ArrayList<>(List.of(new Integer[]{86, 14})))
                        .descripcionesVarietal(new ArrayList<>(List.of(new String[]{"Varietal 1", "Varietal 2"})))
                        .build()
        );
        vinos.add(
                VinoDataHolder.builder()
                        .imagenEtiqueta(null)
                        .anada(2010)
                        .nombre("Rocío Matinal")
                        .notaDeCataBodega("Es un vino divertido")
                        .precioARS(8000)
                        .maridajes(new ArrayList<>(List.of(new String[]{"Pan", "Salame"})))
                        .nombresUva(new ArrayList<>(List.of(new String[]{"Malbec"})))
                        .porcentajesComposicionVarietal(new ArrayList<>(List.of(new Integer[]{100})))
                        .descripcionesVarietal(new ArrayList<>(List.of(new String[]{"Varietal 1"})))
                        .build());

        vinos.add(
                VinoDataHolder.builder()
                        .imagenEtiqueta(null)
                        .anada(2014)
                        .nombre("Vino y se fue")
                        .notaDeCataBodega("Es un vino chistosito")
                        .precioARS(4000)
                        .maridajes(new ArrayList<>(List.of(new String[]{"Pan"})))
                        .nombresUva(new ArrayList<>(List.of(new String[]{"Malbec", "Pinot Gris"})))
                        .porcentajesComposicionVarietal(new ArrayList<>(List.of(new Integer[]{70, 30})))
                        .descripcionesVarietal(new ArrayList<>(List.of(new String[]{"Varietal 1", "Varietal 2"})))
                        .build());
        vinos.add(
                VinoDataHolder.builder()
                        .imagenEtiqueta(null)
                        .anada(2021)
                        .nombre("Vinooooooo")
                        .notaDeCataBodega("Es un vino muy dulce.")
                        .precioARS(4000)
                        .maridajes(new ArrayList<>(List.of(new String[]{"Pan"})))
                        .nombresUva(new ArrayList<>(List.of(new String[]{"Pinot Gris"})))
                        .porcentajesComposicionVarietal(new ArrayList<>(List.of(new Integer[]{100})))
                        .descripcionesVarietal(new ArrayList<>(List.of(new String[]{"Varietal 1"})))
                        .build());

        VinoDataHolder[] arr = new VinoDataHolder[vinos.size()];
        arr = vinos.toArray(arr);

        for (VinoDataHolder x : arr)
            System.out.print(x + " ");

        return arr;
    }

    public VinoDataHolder[] getVinosBodegaGenial() {
        List<VinoDataHolder> vinos = new ArrayList<>();
        vinos.add(
                VinoDataHolder.builder()
                        .imagenEtiqueta(null)
                        .anada(2005)
                        .nombre("Invierno Agradable")
                        .notaDeCataBodega("Ha subido la calidad estos días.")
                        .precioARS(10000)
                        .maridajes(new ArrayList<>(List.of(new String[]{"Queso", "Pan"})))
                        .nombresUva(new ArrayList<>(List.of(new String[]{"Sauvignon Blanc"})))
                        .porcentajesComposicionVarietal(new ArrayList<>(List.of(new Integer[]{100})))
                        .descripcionesVarietal(new ArrayList<>(List.of(new String[]{"Varietal 1"})))
                        .build()
        );
        vinos.add(
                VinoDataHolder.builder()
                        .imagenEtiqueta(null)
                        .anada(1991)
                        .nombre("Vino Y Se Quedó")
                        .notaDeCataBodega("Es un vino que se queda en las personas que lo prueban.")
                        .precioARS(12000)
                        .maridajes(new ArrayList<>(List.of(new String[]{"Pan"})))
                        .nombresUva(new ArrayList<>(List.of(new String[]{"Malbec", "Pinot Gris", "Sauvignon Blanc"})))
                        .porcentajesComposicionVarietal(new ArrayList<>(List.of(new Integer[]{60, 30, 10})))
                        .descripcionesVarietal(new ArrayList<>(List.of(new String[]{"Varietal 1", "Varietal 2", "Varietal 3"})))
                        .build()
        );

        VinoDataHolder[] arr = new VinoDataHolder[vinos.size()];
        arr = vinos.toArray(arr);

        for (VinoDataHolder x : arr)
            System.out.print(x + " ");

        return arr;
    }
}
