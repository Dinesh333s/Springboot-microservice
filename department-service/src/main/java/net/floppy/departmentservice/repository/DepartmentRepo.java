package net.floppy.departmentservice.repository;

import net.floppy.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
    Department findByDepartmentCode(String code);
}
