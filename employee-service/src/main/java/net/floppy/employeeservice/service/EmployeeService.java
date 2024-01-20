package net.floppy.employeeservice.service;

import net.floppy.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployees(EmployeeDto employeeDto);

    EmployeeDto getEmpById(Long id);
}
