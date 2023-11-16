package us.codezen.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@AllArgsConstructor
@Data
public class CreateAdminResDTO {
	@NonNull
	private Long id;

	@NonNull
	private String email;
}
