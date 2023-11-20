package us.codezen.vehicle.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import us.codezen.admin.dto.CreateAdminResDTO;
import us.codezen.admin.entity.Admin;
import us.codezen.vehicle.dto.CreateVehicleReqDTO;
import us.codezen.vehicle.dto.CreateVehicleResDTO;
import us.codezen.vehicle.entities.Vehicle;
import us.codezen.vehicle.entities.VehicleCharacteristics;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;
import us.codezen.vehicle.repository.VehicleRepository;


@Stateless
public class VehicleService {
    @Inject
    private VehicleRepository vehicleRepository;

    public CreateVehicleResDTO createVehicle(CreateVehicleReqDTO createVehicleReqDTO) {
        final VehicleCharacteristics vehicle = new VehicleCharacteristics(
                createVehicleReqDTO.getIdCharacteristicsVehicle(),
                createVehicleReqDTO.getIdentification(),
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

        vehicleRepository.CreateVehicle(vehicle);

        return new CreateVehicleResDTO(vehicle.getIdentification(), vehicle.getIdCharacteristicsVehicle());

    }
}