package us.codezen.admin.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class CreateAdminResDTO {
	@Nonnull
	private Long id;

	@Nonnull
	private String email;
}
