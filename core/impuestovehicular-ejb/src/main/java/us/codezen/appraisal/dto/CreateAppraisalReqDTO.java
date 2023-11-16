import lombok.Data;
@Data
public class CreateAppraisalReqDTO{
    private Long id ;
    private String type;
    private String class;
    private String flag;
    private String line;
    private String tonnage;
    private String passengers;
    private String bodywork;
    private String displacement;
    private String valueBeforeIva;
    private String model;
    private boolean imported;
    private boolean shielded;
    private boolean automaticBox;
    private boolean openCards;
    private boolean confiscated;
    private boolean scrapped;
    private String state;
    private String domainextecion;
    private boolean old;
}