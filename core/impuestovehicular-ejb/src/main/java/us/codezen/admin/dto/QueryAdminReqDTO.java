package us.codezen.admin.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
@Data
public class QueryAdminReqDTO implements Serializable {
	@Nonnull
	private String email;
}