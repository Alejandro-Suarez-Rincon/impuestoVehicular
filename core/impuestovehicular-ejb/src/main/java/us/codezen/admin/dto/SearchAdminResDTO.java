package us.codezen.admin.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchAdminResDTO implements Serializable {
	@NonNull
	private Long id;

	@NonNull
	private String email;

}
