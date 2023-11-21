package us.codezen.vehicle.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import us.codezen.owner.dto.CreateOwnerReqDTO;
import us.codezen.owner.dto.SearchOwnerResDTO;
import us.codezen.owner.entities.Owner;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;
import us.codezen.owner.service.OwnerService;
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

    @Inject
    private OwnerService ownerService;

    public CreateVehicleResDTO create(CreateVehicleReqDTO createVehicleReqDTO) {
        Owner owner = ownerService.create(new CreateOwnerReqDTO(createVehicleReqDTO.getIdentification(),
                createVehicleReqDTO.getIdentificationType(), createVehicleReqDTO.getFirstname(),
                createVehicleReqDTO.getSecondName(), createVehicleReqDTO.getFirstLastName(),
                createVehicleReqDTO.getSecondLastName(), createVehicleReqDTO.getBornDate(),
                createVehicleReqDTO.getPhone(), createVehicleReqDTO.getEmail()));
        Vehicle vehicle = new Vehicle();
        vehicle.setOwner(owner);
        VehicleCharacteristics vehicleCharacteristic = new VehicleCharacteristics(createVehicleReqDTO.getTrademark(),
                createVehicleReqDTO.getLine(), createVehicleReqDTO.getType(), createVehicleReqDTO.getClassVehicle(),
                createVehicleReqDTO.getValueIva(), createVehicleReqDTO.getAncient(), createVehicleReqDTO.getModel(),
                createVehicleReqDTO.getBodywork(), createVehicleReqDTO.getCylinderCapacity(),
                createVehicleReqDTO.getTonnage(),
                createVehicleReqDTO.getPassengers(), false, false, false, false, false, false, null, null,
                createVehicleReqDTO.getOpenLetters());
        VehicleCharacteristics vehicleCharacteristicsCreated = this.vehicleCharacteristicsRepository.create(vehicleCharacteristic);
;        List<VehicleCharacteristics> vehicleCharacteristics = new ArrayList<VehicleCharacteristics>();
        vehicleCharacteristics.add(vehicleCharacteristicsCreated);
        vehicle.setVehicleCharacteristics(vehicleCharacteristics);
        Vehicle vehicleCreated = this.vehicleRepository.create(vehicle);
        return new CreateVehicleResDTO(vehicleCreated.getId(), createVehicleReqDTO.getPlate());
    }

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
