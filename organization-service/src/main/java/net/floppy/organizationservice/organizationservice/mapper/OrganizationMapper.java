package net.floppy.organizationservice.organizationservice.mapper;

import net.floppy.organizationservice.organizationservice.dto.OrganizationDto;
import net.floppy.organizationservice.organizationservice.entity.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationMapper {
    OrganizationMapper MAPPER = Mappers.getMapper(OrganizationMapper.class);

    Organization organizationDto_to_organization(OrganizationDto organizationDto);

    OrganizationDto organization_to_organizationDto(Organization organization);
}
