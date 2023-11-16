package us.codezen.appraisal.dto;

import lombok.Data;

@Data
public class UpdateAppraisalResDTO {
  private Long id;
  private String type;
  private String classVehicle;
  private String flag;
  private String line;
  private String tonnage;
  private String passengers;
  private String bodywork;
  private String displacement;
  private String valueBeforeIva;
}
