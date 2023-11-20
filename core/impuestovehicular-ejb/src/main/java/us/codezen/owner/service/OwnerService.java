package us.codezen.owner.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import us.codezen.owner.dto.*;
import us.codezen.owner.entities.Owner;
import us.codezen.owner.repository.OwnerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class OwnerService {
    @Inject
    private OwnerRepository ownerRepository;

    public CreateOwnerResDTO createOwner(CreateOwnerReqDTO createOwnerReqDTO) {
        final Owner owner = new Owner(
                createOwnerReqDTO.getIdentification(),
                createOwnerReqDTO.getIdentificationType(),
                createOwnerReqDTO.getFirstname(),
                createOwnerReqDTO.getSecondName(),
                createOwnerReqDTO.getFirstLastName(),
                createOwnerReqDTO.getSecondLastName(),
                createOwnerReqDTO.getBornDate(),
                createOwnerReqDTO.getPhone(),
                createOwnerReqDTO.getEmail());
        ownerRepository.createOwner(owner);
        return new CreateOwnerResDTO(
                owner.getIdentification(),
                owner.getIdentificationType(),
                owner.getFirstName(),
                owner.getSecondName(),
                owner.getFirstLastName(),
                owner.getSecondLastName(),
                owner.getBornDate(),
                owner.getPhone(),
                owner.getEmail());
    }

    public QueryOwnerResDTO queryOwner(QueryOwnerReqDTO queryOwnerReqDto) {
        Owner owner = ownerRepository.getOwner(queryOwnerReqDto.getIdentification());

        if (owner != null) {
            return new QueryOwnerResDTO(
                    owner.getIdentification(),
                    owner.getIdentificationType(),
                    owner.getFirstName(),
                    owner.getSecondName(),
                    owner.getFirstLastName(),
                    owner.getSecondLastName(),
                    owner.getBornDate(),
                    owner.getPhone(),
                    owner.getEmail()
            );
        } else {
            return null;
        }
    }
    public List<QueryOwnerResDTO> searchOwner(SearchOwnerReqDTO searchOwnerReqDTO) {
        List<Owner> owners = ownerRepository.SearchOwner;
                searchOwnerReqDTO.getIdentification();

        return owners.stream()
                .map(owner -> new QueryOwnerResDTO(
                        owner.getIdentification(),
                        owner.getIdentificationType(),
                        owner.getFirstName(),
                        owner.getSecondName(),
                        owner.getFirstLastName(),
                        owner.getSecondLastName(),
                        owner.getBornDate(),
                        owner.getPhone(),
                        owner.getEmail()
                ))
                .collect(Collectors.toList());
    }
    public UpdateOwnerResDTO updateOwner(UpdateOwnerReqDTO updateOwnerReqDTO) {
        Long identification = updateOwnerReqDTO.getIdentification();

        Owner existingOwner = ownerRepository.SearchOwner.set(identification);
        if (existingOwner == null) {
            return null;
        }

        existingOwner.setIdentificationType(updateOwnerReqDTO.getIdentificationType());
        existingOwner.setFirstName(updateOwnerReqDTO.getFirstname());
        existingOwner.setSecondName(updateOwnerReqDTO.getSecondName());
        existingOwner.setFirstLastName(updateOwnerReqDTO.getFirstLastName());
        existingOwner.setSecondLastName(updateOwnerReqDTO.getSecondLastName());
        existingOwner.setBornDate(String.valueOf(updateOwnerReqDTO.getBornDate()));
        existingOwner.setPhone(updateOwnerReqDTO.getPhone());
        existingOwner.setEmail(updateOwnerReqDTO.getEmail());

        ownerRepository.updateOwner(existingOwner);

        return null;
    }
}

