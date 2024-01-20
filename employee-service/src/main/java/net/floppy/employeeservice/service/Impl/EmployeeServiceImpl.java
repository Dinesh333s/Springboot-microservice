package net.floppy.employeeservice.service.Impl;

import lombok.AllArgsConstructor;
import net.floppy.employeeservice.dto.EmployeeDto;
import net.floppy.employeeservice.entity.Employee;
import net.floppy.employeeservice.exception.ResourceNotFoundException;
import net.floppy.employeeservice.mapper.EmployeeMapper;
import net.floppy.employeeservice.repository.EmployeeRepository;
import net.floppy.employeeservice.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private ModelMapper modelMapper;
    @Override
    public EmployeeDto saveEmployees(EmployeeDto employeeDto) {
//        Employee employee = new Employee(
//                employeeDto.getId(),
//                employeeDto.getFirstName(),
//                employeeDto.getLastName(),
//                employeeDto.getEmail()
//        );
//        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Employee employee = EmployeeMapper.MAPPER.MapToEmp(employeeDto);
        Employee saved_emp = employeeRepository.save(employee);

//        EmployeeDto empDto = new EmployeeDto(
//                saved_emp.getId(),
//                saved_emp.getFirstName(),
//                saved_emp.getLastName(),
//                saved_emp.getEmail()
//        );
//        EmployeeDto empDto = modelMapper.map(saved_emp, EmployeeDto.class);
        EmployeeDto empDto = EmployeeMapper.MAPPER.MapToEmpDto(saved_emp);
        return empDto;
    }

    @Override
    public EmployeeDto getEmpById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee","EmployeeID",id));

//        EmployeeDto employeeDto = new EmployeeDto(
//                employee.getId(),
//                employee.getFirstName(),
//                employee.getLastName(),
//                employee.getEmail()
//        );
//        EmployeeDto empDto = modelMapper.map(employee, EmployeeDto.class);
        EmployeeDto empDto = EmployeeMapper.MAPPER.MapToEmpDto(employee);
        return empDto;
    }
}
