package us.codezen.admin.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
@Data
public class SearchAdminReqDTO implements Serializable {
	@NonNull
	private String email;
}
