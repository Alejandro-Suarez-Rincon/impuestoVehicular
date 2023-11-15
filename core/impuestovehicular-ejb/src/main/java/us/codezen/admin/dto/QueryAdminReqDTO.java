package us.codezen.admin.dto;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryAdminReqDTO implements Serializable {
	@Nonnull
	private String email;
}