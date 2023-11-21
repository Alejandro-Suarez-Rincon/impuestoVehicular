package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

@Data
public class QueryVehicleResDTO {
    @NonNull
    private String plate;
    @NonNull
    private VehicleTypeServiceEnum typeService;
    @NonNull
    private String idCharacteristicsVehicle;
    @NonNull
    private String trademark;
    @NonNull
    private String line;
    @NonNull
    private String valueIva;
    @NonNull
    private boolean ancient;
    @NonNull
    private String model;
    @NonNull
    private String bodywork;
    @NonNull
    private int cylinderCapacity;
    @NonNull
    private String tonnage;
    @NonNull
    private String passengers;
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
