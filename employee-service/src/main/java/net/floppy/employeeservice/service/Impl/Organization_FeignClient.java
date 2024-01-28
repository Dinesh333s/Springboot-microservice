package net.floppy.employeeservice.service.Impl;

import net.floppy.employeeservice.dto.OrganizationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ORGANIZATION-SERVICE")
public interface Organization_FeignClient {
    @GetMapping("api/organizations/{code}")
    OrganizationDto getByOrgCode(@PathVariable("code") String orgCode);
}
