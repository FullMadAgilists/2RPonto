package com.ojavali.doisrponto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApontamentosRepository extends JpaRepository <Apontamentos, Long> {

   /* coloca aqui o crud */
}