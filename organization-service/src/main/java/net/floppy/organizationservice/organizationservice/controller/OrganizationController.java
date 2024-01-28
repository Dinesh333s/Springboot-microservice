package net.floppy.organizationservice.organizationservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.floppy.organizationservice.organizationservice.dto.OrganizationDto;
import net.floppy.organizationservice.organizationservice.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Tag(
        name = "Organization Service - OrganizationController",
        description = "Organization controller Exposes REST APIs for Organization Service"
)
@RestController
@RequestMapping("api/organizations/")
@AllArgsConstructor
public class OrganizationController {
    private OrganizationService organizationService;

    @Operation(
            summary = "Save Organization REST API",
            description = "Save Organization REST API is used to save Organization object in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PostMapping("create")
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto)
    {
        OrganizationDto dto = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }
    @Operation(
            summary = "Get Organization REST API",
            description = "Get Organization REST API is used to get the Organization object in a database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getByOrgCode(@PathVariable("code") String orgCode)
    {
        OrganizationDto organizationDto = organizationService.getByOrganization(orgCode);
                return ResponseEntity.ok(organizationDto);
    }
}
