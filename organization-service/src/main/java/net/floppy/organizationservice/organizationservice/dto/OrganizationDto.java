package net.floppy.organizationservice.organizationservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Schema(
        description = "OrganizationDto Model Information"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto {
    private Long id;
    @Schema(
            description = "OrganizationName"
    )
    private String organizationName;
    @Schema(
            description = "OrganizationDescription"
    )
    private String organizationDescription;
    @Schema(
            description = "OrganizationCode"
    )
    private String organizationCode;
    @Schema(
            description = "Created Date"
    )
    private LocalDateTime createdDate;
}
