package us.codezen.report.service;

import com.itextpdf.text.DocumentException;
import jakarta.persistence.EntityManager;
import us.codezen.appraisal.dto.QueryAppraisalResDTO;
import us.codezen.appraisal.entities.Appraisal;
import us.codezen.report.dto.CalculateReportResDTO;
import us.codezen.report.dto.GenerateReportResDTO;
import us.codezen.vehicle.dto.SearchVehicleResDTO;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class ReportService {
    public CalculateReportResDTO query(CalculateReportResDTO calculateReportResDTO) {
        // SearchVehicleResDTO vehicle = vehicleService(new SearchVehicleResDTO(query(querySearchVehicle.plate)));
        SearchVehicleResDTO vehicle = new SearchVehicleResDTO(
                "AGS-056",
                VehicleTypeServiceEnum.personal,
                "1",
                "ACURA",
                "MDX",
                0,
                false,
                "2021",
                "ACURA",
                2600,
                1200,
                5,
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

        String id = vehicle.getIdCharacteristicsVehicle();
        String type = vehicle.getType();

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

        // Traer el valor de appraisal
        //Double value = appraisal.getValue();



        return calculateReportResDTO;
    }

    public GenerateReportResDTO query(GenerateReportResDTO generateReportResDTO){
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("Reporte"));



        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        document.open();
        // Aqui tiene que traer y guardar todo en el pdf


        document.close();

        return generateReportResDTO;
    }
}
