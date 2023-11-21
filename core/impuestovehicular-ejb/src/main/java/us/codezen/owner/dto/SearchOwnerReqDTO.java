package us.codezen.owner.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class SearchOwnerReqDTO {
    @NonNull
    private Long identification;
}