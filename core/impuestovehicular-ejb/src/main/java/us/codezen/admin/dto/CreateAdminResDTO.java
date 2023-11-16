package us.codezen.admin.dto;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
public class CreateAdminResDTO {
	@Nonnull
	private Long id;

	@Nonnull
	private String email;
}
