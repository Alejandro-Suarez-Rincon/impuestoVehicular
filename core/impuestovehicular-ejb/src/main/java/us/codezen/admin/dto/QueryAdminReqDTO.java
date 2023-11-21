package us.codezen.admin.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryAdminReqDTO implements Serializable {
	@NonNull
	private String email;
}
