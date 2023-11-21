package us.codezen.report.service;

import com.itextpdf.text.DocumentException;
import jakarta.persistence.EntityManager;
import us.codezen.appraisal.dto.QueryAppraisalResDTO;
import us.codezen.appraisal.entities.Appraisal;
import us.codezen.report.dto.CalculateReportReqDTO;
import us.codezen.report.dto.CalculateReportResDTO;
import us.codezen.report.dto.GenerateReportReqDTO;
import us.codezen.report.dto.GenerateReportResDTO;
import us.codezen.vehicle.dto.SearchVehicleResDTO;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class ReportService {
    List<String> listAuto = new ArrayList();
    List<String> listAppraisal = new ArrayList();
    public CalculateReportResDTO query(CalculateReportReqDTO calculateReportReqDTO) {
        // SearchVehicleResDTO vehicle = vehicleService(new SearchVehicleResDTO(query(querySearchVehicle.plate)));
        SearchVehicleResDTO vehicle = new SearchVehicleResDTO(
                "AGS-056",
                VehicleTypeServiceEnum.personal,
                1L,
                "ACURA",
                "MDX",
                "",
                "",
                10.0,
                "ACURA",
                "2600",
                "",
                1,
                 (long) 10,
                10,
                true,
                false,
                false,
                false,
                false,
                false,
                "NO",
                "CAMIONETAS Y CAMPEROS",
                "CAMIONETAS Y CAMPEROS"
        );

        Long id = vehicle.getIdCharacteristicsVehicle();
        String type = vehicle.getType();

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



        listAuto.add("Placa: " + vehicle.getPlate());
        listAuto.add(String.valueOf("ID Caracteristica: " + vehicle.getIdCharacteristicsVehicle()));
        listAuto.add("Marca: " + vehicle.getTrademark());
        listAuto.add("Linea: " + vehicle.getLine());
        listAuto.add("Modelo: " + vehicle.getModel());
        listAuto.add("Cilindraje: " + String.valueOf(vehicle.getCylinderCapacity()));
        listAuto.add("Tonelaje: " + String.valueOf(vehicle.getTonnage()));
        listAuto.add("Pasageros: " + String.valueOf(vehicle.getPassengers()));
        listAuto.add("Estado: " + vehicle.getState());
        listAuto.add("Dominio de Extencion: " + vehicle.getDomainExtension());
        listAuto.add("Tipo: " + vehicle.getType());

        listAppraisal.add("Avaluo: " + appraisal.getVatValue());


        // Traer el valor de appraisal
        //Double value = appraisal.getValue();
        return new CalculateReportResDTO();
    }

    public GenerateReportResDTO queryGenerate(GenerateReportReqDTO generateReportReqDTO){
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("Reporte"));
            document.add(new Paragraph("Vehiculo"));
            document.open();
            for (String dato : listAuto) {
                document.add(new Paragraph(dato));
            }

            document.add(new Paragraph("Avaluo"));
            for (String dato : listAppraisal) {
                document.add(new Paragraph(dato));
            }

            document.close();

        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new GenerateReportResDTO();
    }
}
