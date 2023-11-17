package us.codezen.report.service;

import us.codezen.appraisal.dto.QueryAppraisalResDTO;
import us.codezen.report.dto.CalculateReportResDTO;
import us.codezen.vehicle.dto.SearchVehicleResDTO;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

public class ReportService {
    public CalculateReportResDTO query(CalculateReportResDTO calculateReportResDTO) {
        // SearchVehicleResDTO vehicle = vehicleService(new SearchVehicleResDTO(query(querySearchVehicle.plate)));
        SearchVehicleResDTO vehicle = new SearchVehicleResDTO(
                "AGS-056",
                VehicleTypeServiceEnum.personal,
                "1",
                "ACURA",
                "MDX",
                "",
                false,
                "2021",
                "ACURA",
                "CERRADA",
                "2600",
                "5",
                false,
                false,
                true,
                false,
                false,
                false,
                false,
                "ACTIVO",
                "NO",
                "CAMIONETAS Y CAMPEROS",
                "CAMIONETAS Y CAMPEROS"
        );

        // Duda en estos datos

        // QueryAppraisalResDTO appraisal = appraisalService(new QueryAppraisalResDTO(query(query(queryQueryApraisal.id))));
        QueryAppraisalResDTO appraisal = new QueryAppraisalResDTO(
                1L,
                "CAMIONETAS Y CAMPEROS",
                "CAMIONETAS Y CAMPEROS",
                "ACURA",
                "MDX",
                "2600",
                "ACURA",
                "2600",
                "",
                "2021",
                false,
                false,
                true,
                false,
                false,
                "ACTIVO",
                "NO",
                false,
                "CAMIONETAS Y CAMPEROS",
                "5",
                "NO"
        );


        return calculateReportResDTO;
    }
}
