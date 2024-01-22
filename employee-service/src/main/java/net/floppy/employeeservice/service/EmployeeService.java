package net.floppy.employeeservice.service;

import net.floppy.employeeservice.dto.ApiResponseDto;
import net.floppy.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployees(EmployeeDto employeeDto);

    ApiResponseDto getEmpById(Long id);
}
