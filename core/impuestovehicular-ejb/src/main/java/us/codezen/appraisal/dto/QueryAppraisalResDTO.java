import lombok.Data;
@Data
@AllArgsConstructor
public class QueryAppraisalResDTO{
    private Long id ;
    private String type;
    private String class;
    private String trademark;
    private String line;
    private String tonnage;
    private String passengers;
    private String bodywork;
    private String displacement;
    private String vatValue;
    private String model;
    private boolean imported;
    private boolean shielded;
    private boolean automaticBox;
    private boolean openLetters;
    private boolean confiscated;
    private boolean scrapped;
    private String state;
    private String domainextension;
    private boolean old;
    private String vehicleType;
    private String passengers;
    private String confiscated;
    private String stolen;    
        
}