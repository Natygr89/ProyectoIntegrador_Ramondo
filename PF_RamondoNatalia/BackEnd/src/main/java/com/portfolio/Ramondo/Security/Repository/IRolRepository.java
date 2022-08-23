package com.portfolio.Ramondo.Security.Repository;

import com.portfolio.Ramondo.Security.Entity.Rol;
import com.portfolio.Ramondo.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
