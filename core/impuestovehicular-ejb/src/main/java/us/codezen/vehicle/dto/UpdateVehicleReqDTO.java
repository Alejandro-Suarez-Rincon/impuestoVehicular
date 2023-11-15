import lombok.Data;
@Data
public class CreateVehicleReqDTO(
    private String plate;
    private String typeService;
    private String idCharacteristicsVehicle;
    private String trademark
    private String line;
    private String valueIva;
    private boolean ancient;
    private String model;
    private String bodywork;
    private String cylinderCapacity;
    private String tonnage;
    private String passengers;
    private boolean imported;
    private boolean blindado;
    private boolean armored;
    private boolean automaticBox;
    private boolean openLetters;
    private boolean stolen;
    private boolean confiscated;
    private boolean scrapped;
    private String state;
    private String domainExtension;
)