package us.codezen.owner.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class QueryOwnerReqDTO {
    @NonNull
    private Long identification;
}