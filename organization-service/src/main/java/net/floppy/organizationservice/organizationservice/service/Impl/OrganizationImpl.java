package net.floppy.organizationservice.organizationservice.service.Impl;

import lombok.AllArgsConstructor;
import net.floppy.organizationservice.organizationservice.dto.OrganizationDto;
import net.floppy.organizationservice.organizationservice.entity.Organization;
import net.floppy.organizationservice.organizationservice.mapper.OrganizationMapper;
import net.floppy.organizationservice.organizationservice.repository.OrganizationRepository;
import net.floppy.organizationservice.organizationservice.service.OrganizationService;
import org.apache.catalina.mapper.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrganizationImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.MAPPER.organizationDto_to_organization(organizationDto);
        organizationRepository.save(organization);
        OrganizationDto dto = OrganizationMapper.MAPPER.organization_to_organizationDto(organization);
        return dto;
    }

    @Override
    public OrganizationDto getByOrganization(String orgCode) {
        Optional<Organization> organization = Optional.ofNullable(organizationRepository.findByOrganizationCode(orgCode).
                orElseThrow(() -> new RuntimeException("not found")));
        OrganizationDto organizationDto = OrganizationMapper.MAPPER.organization_to_organizationDto(organization.get());

        return organizationDto;
    }
}
