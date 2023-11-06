package dev.joseluisgs.models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Tenista {
    private UUID id;
    private String nombre;
    private String pais;
    private enum mano_dominante{};
    private enum tipo_reves{};
    private double ganancias;
    LocalDateTime fecha_nacimiento;

}
