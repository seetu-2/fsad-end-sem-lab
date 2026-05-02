package com.klef.fsad.exam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Shipment s WHERE s.id = :sid")
    int deleteByIdHQL(@Param("sid") int id);
}
