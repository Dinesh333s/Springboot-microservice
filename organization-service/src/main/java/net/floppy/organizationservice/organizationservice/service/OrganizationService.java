package net.floppy.organizationservice.organizationservice.service;

import net.floppy.organizationservice.organizationservice.dto.OrganizationDto;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto getByOrganization(String orgCode);
}
