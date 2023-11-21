package us.codezen.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryAdminResDTO implements Serializable {
	@NonNull
	private Long id;

	@NonNull
	private String email;

}
