package kg.megacom.FirstSpring.dao;

import kg.megacom.FirstSpring.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
