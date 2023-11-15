package us.codezen.admin.dto;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidateAdminResDTO implements Serializable {
	@Nonnull
	private long id;

	@Nonnull
	private String email;
}