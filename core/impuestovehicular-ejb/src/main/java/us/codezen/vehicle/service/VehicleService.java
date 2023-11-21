package us.codezen.vehicle.service;

import java.time.LocalDateTime;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import us.codezen.owner.dto.SearchOwnerResDTO;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;
import us.codezen.vehicle.dto.*;
import us.codezen.vehicle.entities.Vehicle;
import us.codezen.vehicle.entities.VehicleCharacteristics;
import us.codezen.vehicle.repository.VehicleCharacteristicsRepository;
import us.codezen.vehicle.repository.VehicleRepository;

@Stateless
public class VehicleService {
    @Inject
    private VehicleRepository vehicleRepository;

    @Inject
    private VehicleCharacteristicsRepository vehicleCharacteristicsRepository;

    public CreateVehicleResDTO create(CreateVehicleReqDTO createVehicleReqDTO){
        return new CreateVehicleResDTO(null, createVehicleReqDTO.getPlate());
    }

    // public CreateVehicleResDTO createVehicle(CreateVehicleReqDTO createVehicleReqDTO) {
    //     SearchOwnerResDTO owner = new SearchOwnerResDTO((long) 1, OwnerIdentificationTypeEnum.cc, "Laura", "Estefania",
    //             "Araque", "Corredor", LocalDateTime.of(2001, 0, 0, 0, 0), "309", "araque@gmail.com");

    //     final VehicleCharacteristics vehicleCharacteristics = new VehicleCharacteristics(
    //             null,
    //             createVehicleReqDTO.getTrademark(),
    //             createVehicleReqDTO.getLine(),
    //             createVehicleReqDTO.getType(),
    //             createVehicleReqDTO.getClassVehicle(),
    //             createVehicleReqDTO.getValueIva(),
    //             createVehicleReqDTO.getAncient(),
    //             createVehicleReqDTO.getModel(),
    //             createVehicleReqDTO.getBodywork(),
    //             createVehicleReqDTO.getCylinderCapacity(),
    //             createVehicleReqDTO.getTonnage(),
    //             createVehicleReqDTO.getPassengers(),
    //             createVehicleReqDTO.isImported(),
    //             createVehicleReqDTO.isArmored(),
    //             createVehicleReqDTO.isAutomaticBox(),
    //             createVehicleReqDTO.isStolen(),
    //             createVehicleReqDTO.isConfiscated(),
    //             createVehicleReqDTO.isScrapped(),
    //             createVehicleReqDTO.getState(),
    //             createVehicleReqDTO.getDomainExtension(),
    //             createVehicleReqDTO.getOpenLetters());
    //     vehicleCharacteristicsRepository.create(vehicleCharacteristics);

    //     vehicleRepository.create(new Vehicle());
        
    //     return new CreateVehicleResDTO(vehicleCharacteristics.getIdCharacteristicsVehicle());
    // }
    /*
     * public QueryVehicleResDTO consult(QueryVehicleReqDTO queryVehicleReqDTO) {
     * VehicleCharacteristics vehicleCharacteristics =
     * vehicleRepository.getVehicleByIdCharacteristcs(queryVehicleReqDTO.
     * getIdCharacteristicsVehicle());
     * if (vehicleCharacteristics != null) {
     * return new QueryVehicleResDTO(
     * vehicleCharacteristics.getIdCharacteristicsVehicle(),
     * vehicleCharacteristics.getIdentification(),
     * vehicleCharacteristics.getTrademark(),
     * vehicleCharacteristics.getLine(),
     * vehicleCharacteristics.getType(),
     * vehicleCharacteristics.getClassVehicle(),
     * vehicleCharacteristics.getValueIva(),
     * vehicleCharacteristics.getAncient(),
     * vehicleCharacteristics.getModel(),
     * vehicleCharacteristics.getBodywork(),
     * vehicleCharacteristics.getCylinderCapacity(),
     * vehicleCharacteristics.getTonnage(),
     * vehicleCharacteristics.getPassengers(),
     * vehicleCharacteristics.isImported(),
     * vehicleCharacteristics.isArmored(),
     * vehicleCharacteristics.isAutomaticBox(),
     * vehicleCharacteristics.isStolen(),
     * vehicleCharacteristics.isConfiscated(),
     * vehicleCharacteristics.isScrapped(),
     * vehicleCharacteristics.getState(),
     * vehicleCharacteristics.getDomainExtension(),
     * vehicleCharacteristics.getOpenLetters());
     * }else{
     * return null;
     * }
     * }
     * public SearchVehicleResDTO search(Long idCharacteristicsVehicle){
     * VehicleCharacteristics vehicleCharacteristics=
     * vehicleRepository.getVehicleByIdCharacteristcs(idCharacteristicsVehicle);
     * if (vehicleCharacteristics!=null){
     * return new SearchVehicleResDTO(
     * vehicleCharacteristics.getIdCharacteristicsVehicle(),
     * vehicleCharacteristics.getIdentification(),
     * vehicleCharacteristics.getTrademark(),
     * vehicleCharacteristics.getLine(),
     * vehicleCharacteristics.getType(),
     * vehicleCharacteristics.getClassVehicle(),
     * vehicleCharacteristics.getValueIva(),
     * vehicleCharacteristics.getAncient(),
     * vehicleCharacteristics.getModel(),
     * vehicleCharacteristics.getBodywork(),
     * vehicleCharacteristics.getCylinderCapacity(),
     * vehicleCharacteristics.getTonnage(),
     * vehicleCharacteristics.getPassengers(),
     * vehicleCharacteristics.isImported(),
     * vehicleCharacteristics.isArmored(),
     * vehicleCharacteristics.isAutomaticBox(),
     * vehicleCharacteristics.isStolen(),
     * vehicleCharacteristics.isConfiscated(),
     * vehicleCharacteristics.isScrapped(),
     * vehicleCharacteristics.getState(),
     * vehicleCharacteristics.getDomainExtension(),
     * vehicleCharacteristics.getOpenLetters());
     * }else{
     * return null;
     * }
     * }
     * public VehicleCharacteristics updateVehicle(UpdateVehicleReqDTO
     * updateVehicleReqDTO){
     * 
     * VehicleCharacteristics existVehicle=
     * vehicleRepository.getVehicleByIdCharacteristcs(updateVehicleReqDTO.
     * getIdCharacteristicsVehicle());
     * if (existVehicle!=null){
     * mapUpdateDTOVehicle(existVehicle, updateVehicleReqDTO);
     * return vehicleRepository.updateVehicle(existVehicle);
     * 
     * }else {
     * return null;
     * }
     * }
     * public void mapUpdateDTOVehicle(VehicleCharacteristics
     * vehicleCharacteristics, UpdateVehicleReqDTO updateVehicleReqDTO){
     * vehicleCharacteristics.setIdCharacteristicsVehicle(updateVehicleReqDTO.
     * getIdCharacteristicsVehicle());
     * vehicleCharacteristics.setIdentification(updateVehicleReqDTO.
     * getIdentification());
     * vehicleCharacteristics.setTrademark(updateVehicleReqDTO.getTrademark());
     * vehicleCharacteristics.setLine(updateVehicleReqDTO.getLine());
     * vehicleCharacteristics.setType(updateVehicleReqDTO.getType());
     * vehicleCharacteristics.setClassVehicle(updateVehicleReqDTO.getClassVehicle())
     * ;
     * vehicleCharacteristics.setValueIva(updateVehicleReqDTO.getValueIva());
     * vehicleCharacteristics.setAncient(updateVehicleReqDTO.getAncient());
     * vehicleCharacteristics.setModel(updateVehicleReqDTO.getModel());
     * vehicleCharacteristics.setBodywork(updateVehicleReqDTO.getBodywork());
     * vehicleCharacteristics.setCylinderCapacity(updateVehicleReqDTO.
     * getCylinderCapacity());
     * vehicleCharacteristics.setTonnage(updateVehicleReqDTO.getTonnage());
     * vehicleCharacteristics.setPassengers(updateVehicleReqDTO.getPassengers());
     * vehicleCharacteristics.setImported(updateVehicleReqDTO.isImported());
     * vehicleCharacteristics.setArmored(updateVehicleReqDTO.isArmored());
     * vehicleCharacteristics.setAutomaticBox(updateVehicleReqDTO.isAutomaticBox());
     * vehicleCharacteristics.setStolen(updateVehicleReqDTO.isStolen());
     * vehicleCharacteristics.setConfiscated(updateVehicleReqDTO.isConfiscated());
     * vehicleCharacteristics.setScrapped(updateVehicleReqDTO.isScrapped());
     * vehicleCharacteristics.setState(updateVehicleReqDTO.getState());
     * vehicleCharacteristics.setDomainExtension(updateVehicleReqDTO.
     * getDomainExtension());
     * vehicleCharacteristics.setOpenLetters(updateVehicleReqDTO.getOpenLetters());
     * 
     * }
     */
}
