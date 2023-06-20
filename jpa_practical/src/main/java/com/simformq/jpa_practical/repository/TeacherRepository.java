package com.simformq.jpa_practical.repository;

import com.simformq.jpa_practical.entity.*;
import org.hibernate.sql.ast.tree.expression.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
