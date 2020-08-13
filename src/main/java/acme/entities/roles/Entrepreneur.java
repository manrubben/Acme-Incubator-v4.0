
package acme.entities.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import acme.framework.entities.UserRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Entrepreneur extends UserRole {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 255)
	private String				name;

	@NotBlank
	@Length(max = 255)
	private String				sector;

	@NotBlank
	private Integer				qualification;

	@NotBlank
	@Length(max = 255)
	private String				skills;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
