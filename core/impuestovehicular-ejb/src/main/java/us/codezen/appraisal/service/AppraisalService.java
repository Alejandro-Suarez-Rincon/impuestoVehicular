package us.codezen.appraisal.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import us.codezen.appraisal.dto.*;
import us.codezen.appraisal.entities.Appraisal;
import us.codezen.appraisal.repository.AppraisalRepository;

@Stateless
public class AppraisalService {
    @Inject
    private AppraisalRepository appraisalRepository;

    public CreateAppraisalResDTO createAppraisal(CreateAppraisalReqDTO createAppraisalReqDTO) {
        final Appraisal appraisal = new Appraisal(
                createAppraisalReqDTO.getId_appraisal(),
                createAppraisalReqDTO.getValueAppraisal(),
        createAppraisalReqDTO.getVehicleCharacteristics());
        appraisalRepository.createAppraisal(appraisal);

        return new CreateAppraisalResDTO(appraisal.getId_appraisal(), appraisal.getValueAppraisal());
    }
    public QueryAppraisalResDTO consult(QueryAppraisalReqDTO queryAppraisalReqDTO) {
        Appraisal appraisal = appraisalRepository.findByIdAppraisal(queryAppraisalReqDTO.getId_appraisal());
        if (appraisal != null) {
            return new QueryAppraisalResDTO(appraisal.getId_appraisal(),
                    appraisal.getValueAppraisal(),
                    appraisal.getVehicleCharacteristics());
        }else{
            return null;
        }
    }
    public SearchAppraisalResDTO search(Long Id_appraisal){
        Appraisal appraisal= appraisalRepository.findByIdAppraisal(Id_appraisal);
        if (appraisal!=null){
            return new SearchAppraisalResDTO(appraisal.getId_appraisal(),
                    appraisal.getValueAppraisal(),
                    appraisal.getVehicleCharacteristics());
        }else{
            return null;
        }
    }
    public Appraisal updateAppraisal(UpdateAppraisalReqDTO updateAppraisalReqDTO){

        Appraisal existAppraisal= appraisalRepository.findByIdAppraisal(updateAppraisalReqDTO.getId_appraisal());
        if (existAppraisal!=null){
            mapUpdateDTOAppraisal(existAppraisal, updateAppraisalReqDTO);
            return appraisalRepository.updateAppraisal(existAppraisal);

        }else {
            return null;
        }
    }
    public void mapUpdateDTOAppraisal(Appraisal appraisal, UpdateAppraisalReqDTO updateAppraisalReqDTO){
        appraisal.setId_appraisal(updateAppraisalReqDTO.getId_appraisal());
        appraisal.setValueAppraisal(updateAppraisalReqDTO.getValueAppraisal());
        appraisal.setVehicleCharacteristics(updateAppraisalReqDTO.getVehicleCharacteristics());
    }

}
