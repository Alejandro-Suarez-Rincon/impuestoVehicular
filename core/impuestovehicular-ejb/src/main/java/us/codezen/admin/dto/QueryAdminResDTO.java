package us.codezen.admin.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class QueryAdminResDTO implements Serializable {
	@Nonnull
	private Long id;

	@Nonnull
	private String email;

}