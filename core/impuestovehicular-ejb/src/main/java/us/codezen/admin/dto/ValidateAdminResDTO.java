package us.codezen.admin.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class ValidateAdminResDTO implements Serializable {
	@NonNull
	private Long id;

	@NonNull
	private String email;
}
