package net.floppy.employeeservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.floppy.employeeservice.dto.ApiResponseDto;
import net.floppy.employeeservice.dto.EmployeeDto;
import net.floppy.employeeservice.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Tag(
        name = "Employee Service - EmployeeController",
        description = "Employee controller Exposes REST APIs for Employee Service"
)
@RestController
@RequestMapping("api/employees/")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;
    @Operation(
            summary = "Save Employee REST API",
            description = "Save Employee REST API is used to save Employee object in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PostMapping("create")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto empDto = employeeService.saveEmployees(employeeDto);
        return new ResponseEntity<>(empDto, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Employee REST API",
            description = "Get Employee REST API is used to get the employee object in a database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("{emp_id}")
    public ResponseEntity<ApiResponseDto> getEmpById(@PathVariable("emp_id") Long empId)
    {
        ApiResponseDto apiResponseDto = employeeService.getEmpById(empId);
        return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);
    }
}
