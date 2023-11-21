package us.codezen.vehicle.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import us.codezen.admin.dto.CreateAdminResDTO;
import us.codezen.admin.entity.Admin;
import us.codezen.vehicle.dto.*;
import us.codezen.vehicle.entities.Vehicle;
import us.codezen.vehicle.entities.VehicleCharacteristics;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;
import us.codezen.vehicle.repository.VehicleRepository;


@Stateless
public class VehicleService {
    @Inject
    private VehicleRepository vehicleRepository;

/*    public CreateVehicleResDTO createVehicle(CreateVehicleReqDTO createVehicleReqDTO) {
        final VehicleCharacteristics vehicle = new VehicleCharacteristics(
                null,
                createVehicleReqDTO.getTrademark(),
                createVehicleReqDTO.getLine(),
                createVehicleReqDTO.getType(),
                createVehicleReqDTO.getClassVehicle(),
                createVehicleReqDTO.getValueIva(),
                createVehicleReqDTO.getAncient(),
                createVehicleReqDTO.getModel(),
                createVehicleReqDTO.getBodywork(),
                createVehicleReqDTO.getCylinderCapacity(),
                createVehicleReqDTO.getTonnage(),
                createVehicleReqDTO.getPassengers(),
                createVehicleReqDTO.isImported(),
                createVehicleReqDTO.isArmored(),
                createVehicleReqDTO.isAutomaticBox(),
                createVehicleReqDTO.isStolen(),
                createVehicleReqDTO.isConfiscated(),
                createVehicleReqDTO.isScrapped(),
                createVehicleReqDTO.getState(),
                createVehicleReqDTO.getDomainExtension(),
                createVehicleReqDTO.getOpenLetters());
        vehicleRepository.createVehicle(vehicle);      //Se crea servicio con el repositorio
        return new CreateVehicleResDTO(vehicle.getIdCharacteristicsVehicle());
    }*/
    /*
    public QueryVehicleResDTO consult(QueryVehicleReqDTO queryVehicleReqDTO) {
        VehicleCharacteristics vehicleCharacteristics = vehicleRepository.getVehicleByIdCharacteristcs(queryVehicleReqDTO.getIdCharacteristicsVehicle());
        if (vehicleCharacteristics != null) {
            return new QueryVehicleResDTO(
                    vehicleCharacteristics.getIdCharacteristicsVehicle(),
                    vehicleCharacteristics.getIdentification(),
                    vehicleCharacteristics.getTrademark(),
                    vehicleCharacteristics.getLine(),
                    vehicleCharacteristics.getType(),
                    vehicleCharacteristics.getClassVehicle(),
                    vehicleCharacteristics.getValueIva(),
                    vehicleCharacteristics.getAncient(),
                    vehicleCharacteristics.getModel(),
                    vehicleCharacteristics.getBodywork(),
                    vehicleCharacteristics.getCylinderCapacity(),
                    vehicleCharacteristics.getTonnage(),
                    vehicleCharacteristics.getPassengers(),
                    vehicleCharacteristics.isImported(),
                    vehicleCharacteristics.isArmored(),
                    vehicleCharacteristics.isAutomaticBox(),
                    vehicleCharacteristics.isStolen(),
                    vehicleCharacteristics.isConfiscated(),
                    vehicleCharacteristics.isScrapped(),
                    vehicleCharacteristics.getState(),
                    vehicleCharacteristics.getDomainExtension(),
                    vehicleCharacteristics.getOpenLetters());
        }else{
            return null;
        }
    }
    public SearchVehicleResDTO search(Long idCharacteristicsVehicle){
        VehicleCharacteristics vehicleCharacteristics= vehicleRepository.getVehicleByIdCharacteristcs(idCharacteristicsVehicle);
        if (vehicleCharacteristics!=null){
            return new SearchVehicleResDTO(
                    vehicleCharacteristics.getIdCharacteristicsVehicle(),
                    vehicleCharacteristics.getIdentification(),
                    vehicleCharacteristics.getTrademark(),
                    vehicleCharacteristics.getLine(),
                    vehicleCharacteristics.getType(),
                    vehicleCharacteristics.getClassVehicle(),
                    vehicleCharacteristics.getValueIva(),
                    vehicleCharacteristics.getAncient(),
                    vehicleCharacteristics.getModel(),
                    vehicleCharacteristics.getBodywork(),
                    vehicleCharacteristics.getCylinderCapacity(),
                    vehicleCharacteristics.getTonnage(),
                    vehicleCharacteristics.getPassengers(),
                    vehicleCharacteristics.isImported(),
                    vehicleCharacteristics.isArmored(),
                    vehicleCharacteristics.isAutomaticBox(),
                    vehicleCharacteristics.isStolen(),
                    vehicleCharacteristics.isConfiscated(),
                    vehicleCharacteristics.isScrapped(),
                    vehicleCharacteristics.getState(),
                    vehicleCharacteristics.getDomainExtension(),
                    vehicleCharacteristics.getOpenLetters());
        }else{
            return null;
        }
    }
    public VehicleCharacteristics updateVehicle(UpdateVehicleReqDTO updateVehicleReqDTO){

        VehicleCharacteristics existVehicle= vehicleRepository.getVehicleByIdCharacteristcs(updateVehicleReqDTO.getIdCharacteristicsVehicle());
        if (existVehicle!=null){
             mapUpdateDTOVehicle(existVehicle, updateVehicleReqDTO);
            return vehicleRepository.updateVehicle(existVehicle);

        }else {
            return null;
        }
    }
    public void mapUpdateDTOVehicle(VehicleCharacteristics vehicleCharacteristics, UpdateVehicleReqDTO updateVehicleReqDTO){
        vehicleCharacteristics.setIdCharacteristicsVehicle(updateVehicleReqDTO.getIdCharacteristicsVehicle());
        vehicleCharacteristics.setIdentification(updateVehicleReqDTO.getIdentification());
        vehicleCharacteristics.setTrademark(updateVehicleReqDTO.getTrademark());
        vehicleCharacteristics.setLine(updateVehicleReqDTO.getLine());
        vehicleCharacteristics.setType(updateVehicleReqDTO.getType());
        vehicleCharacteristics.setClassVehicle(updateVehicleReqDTO.getClassVehicle());
        vehicleCharacteristics.setValueIva(updateVehicleReqDTO.getValueIva());
        vehicleCharacteristics.setAncient(updateVehicleReqDTO.getAncient());
        vehicleCharacteristics.setModel(updateVehicleReqDTO.getModel());
        vehicleCharacteristics.setBodywork(updateVehicleReqDTO.getBodywork());
        vehicleCharacteristics.setCylinderCapacity(updateVehicleReqDTO.getCylinderCapacity());
        vehicleCharacteristics.setTonnage(updateVehicleReqDTO.getTonnage());
        vehicleCharacteristics.setPassengers(updateVehicleReqDTO.getPassengers());
        vehicleCharacteristics.setImported(updateVehicleReqDTO.isImported());
        vehicleCharacteristics.setArmored(updateVehicleReqDTO.isArmored());
        vehicleCharacteristics.setAutomaticBox(updateVehicleReqDTO.isAutomaticBox());
        vehicleCharacteristics.setStolen(updateVehicleReqDTO.isStolen());
        vehicleCharacteristics.setConfiscated(updateVehicleReqDTO.isConfiscated());
        vehicleCharacteristics.setScrapped(updateVehicleReqDTO.isScrapped());
        vehicleCharacteristics.setState(updateVehicleReqDTO.getState());
        vehicleCharacteristics.setDomainExtension(updateVehicleReqDTO.getDomainExtension());
        vehicleCharacteristics.setOpenLetters(updateVehicleReqDTO.getOpenLetters());

    }
    */
}
