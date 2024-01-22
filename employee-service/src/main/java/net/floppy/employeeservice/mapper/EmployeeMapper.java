package net.floppy.employeeservice.mapper;

import net.floppy.employeeservice.dto.EmployeeDto;
import net.floppy.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    Employee MapToEmp(EmployeeDto employeeDto);

    EmployeeDto MapToEmpDto(Employee employee);
}
