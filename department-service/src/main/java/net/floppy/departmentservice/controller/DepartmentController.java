package net.floppy.departmentservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.floppy.departmentservice.dto.DepartmentDto;
import net.floppy.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Department Service - DepartmentController",
        description = "Department controller Exposes REST APIs for Department Service"
)
@RestController
@RequestMapping("api/departments/")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;

    @Operation(
            summary = "Save Department REST API",
            description = "Save Department REST API is used to save department object in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PostMapping("create")
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto)
    {
        DepartmentDto dto = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Department REST API",
            description = "Get Department REST API is used to get the department object in a database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("{department_code}")
    public ResponseEntity<DepartmentDto> GetDepartmentCode(@PathVariable("department_code") String departmentCode)
    {
     DepartmentDto dto =  departmentService.getDepartmentDto(departmentCode);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
