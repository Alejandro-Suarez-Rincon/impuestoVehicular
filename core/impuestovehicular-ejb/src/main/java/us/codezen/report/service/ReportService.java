package us.codezen.report.service;

import us.codezen.appraisal.dto.QueryAppraisalResDTO;
import us.codezen.report.dto.CalculateReportResDTO;
import us.codezen.vehicle.dto.SearchVehicleResDTO;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

public class ReportService {
    public CalculateReportResDTO query(CalculateReportResDTO calculateReportResDTO) {
        // SearchVehicleResDTO vehicle = vehicleService(new SearchVehicleResDTO(query(querySearchVehicle.plate)));
        SearchVehicleResDTO vehicle = new SearchVehicleResDTO(
                1L,
                1049661L,       // identificacion
                "Toyota",           // marca
                "Corolla",          // línea
                "Sedán",            // tipo
                "Sedán",            // claseVehiculo
                25000.0,            // valorIva
                "2010",             // antigüedad
                "Corolla",          // modelo
                "Sedán",            // carrocería
                2000,               // capacidadCilindros
                1500L,              // tonelaje
                5,                  // pasajeros
                false,              // importado
                false,              // blindado
                true,               // cajaAutomática
                false,              // robado
                false,              // confiscado
                false,              // desmantelado
                "Usado",            // estado
                "XYZ",              // extensiónDominio
                "ABC123"            // placasAbiertas
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
