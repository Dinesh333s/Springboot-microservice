package net.floppy.employeeservice.service.Impl;

import net.floppy.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080/", value = "DEPARTMENT-SERVICE")
public interface APIFeignClient {
    @GetMapping("api/departments/{department_code}")
    DepartmentDto GetDepartmentCode(@PathVariable("department_code") String departmentCode);
}
