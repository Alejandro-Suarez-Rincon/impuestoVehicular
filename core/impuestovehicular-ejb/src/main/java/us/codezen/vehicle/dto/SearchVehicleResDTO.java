package us.codezen.vehicle.dto;

import lombok.Data;
import lombok.NonNull;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

@Data
public class SearchVehicleResDTO {
    @NonNull
    private String plate;
    @NonNull
    private VehicleTypeServiceEnum typeService;
    @NonNull
    private Long idCharacteristicsVehicle;
    @NonNull
    private String trademark;
    @NonNull
    private String line;
    @NonNull
    private double valueIva;
    @NonNull
    private boolean ancient;
    @NonNull
    private String model;
    @NonNull
    private String bodywork;
    @NonNull
    private int cylinderCapacity;
    @NonNull
    private long tonnage;
    @NonNull
    private int passengers;
    @NonNull
    private boolean imported;
    @NonNull
    private boolean armored;
    @NonNull
    private boolean automaticBox;
    @NonNull
    private boolean openLetters;
    @NonNull
    private boolean stolen;
    @NonNull
    private boolean confiscated;
    @NonNull
    private boolean scrapped;
    @NonNull
    private String state;
    @NonNull
    private String domainExtension;
    @NonNull
    private String type;
    @NonNull
    private String classVehicle;
}
