package net.floppy.organizationservice.organizationservice.repository;

import net.floppy.organizationservice.organizationservice.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
    Optional<Organization> findByOrganizationCode(String code);
}
