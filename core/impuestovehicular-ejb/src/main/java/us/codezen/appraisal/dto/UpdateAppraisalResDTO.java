import lombok.Data;
@Data
@AllArgsConstructor
public class UpdateAppraisalResDTO{
    private long id ;
    private String type;
    private String class;
    private String flag;
    private String line;
    private String tonnage;
    private String passengers;
    private String bodywork;
    private String displacement;
    private String valueBeforeIva;
      }