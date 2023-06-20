package com.simformq.jpa_practical.repository;

import com.simformq.jpa_practical.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {
}
