package us.codezen.admin.dto;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Data
public class QueryAdminResDTO implements Serializable {
	@Nonnull
	private Long id;

	@Nonnull
	private String email;

}