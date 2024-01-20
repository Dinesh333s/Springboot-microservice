package net.floppy.employeeservice.service.Impl;

import lombok.AllArgsConstructor;
import net.floppy.employeeservice.dto.EmployeeDto;
import net.floppy.employeeservice.entity.Employee;
import net.floppy.employeeservice.repository.EmployeeRepository;
import net.floppy.employeeservice.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployees(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
        Employee saved_emp = employeeRepository.save(employee);

        EmployeeDto empDto = new EmployeeDto(
                saved_emp.getId(),
                saved_emp.getFirstName(),
                saved_emp.getLastName(),
                saved_emp.getEmail()
        );
        return empDto;
    }

    @Override
    public EmployeeDto getEmpById(Long id) {
        Employee employee = employeeRepository.findById(id).get();

        EmployeeDto employeeDto = new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );

        return employeeDto;
    }
}
