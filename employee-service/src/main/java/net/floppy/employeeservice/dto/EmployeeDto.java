package net.floppy.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Schema(
        description = "EmployeeDto Model Information"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;
    @Schema(
            description = "Employee firstName"
    )
    private String firstName;
    @Schema(
            description = "Employee lastName"
    )
    private String lastName;
    @Schema(
            description = "Employee email"
    )
    private String email;
    @Schema(
            description = "Employee DepartmentCode"
    )
    private String departmentCode;
    @Schema(
            description = "Employee OrganizationCode"
    )
    private String organizationCode;
}
