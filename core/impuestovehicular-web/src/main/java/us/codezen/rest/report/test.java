package us.codezen.rest.report;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import us.codezen.report.dto.GenerateReportReqDTO;
import us.codezen.report.service.ReportService;


@Path("resd/report")
public class test {

    @POST
    @Path("file")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response getFile(GenerateReportReqDTO generateReportReqDTO) {
        ReportService reportService = new ReportService();
        reportService.queryGenerate(generateReportReqDTO);
        return Response.ok("filePath").build();

    }

}
