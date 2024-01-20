package net.floppy.departmentservice.service;

import net.floppy.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentDto(String depCode);
}
