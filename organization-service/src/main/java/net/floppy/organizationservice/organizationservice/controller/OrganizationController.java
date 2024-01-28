package net.floppy.organizationservice.organizationservice.controller;

import lombok.AllArgsConstructor;
import net.floppy.organizationservice.organizationservice.dto.OrganizationDto;
import net.floppy.organizationservice.organizationservice.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/organizations/")
@AllArgsConstructor
public class OrganizationController {
    private OrganizationService organizationService;

    @PostMapping("create")
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto)
    {
        OrganizationDto dto = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }

    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getByOrgCode(@PathVariable("code") String orgCode)
    {
        OrganizationDto organizationDto = organizationService.getByOrganization(orgCode);
                return ResponseEntity.ok(organizationDto);
    }
}
