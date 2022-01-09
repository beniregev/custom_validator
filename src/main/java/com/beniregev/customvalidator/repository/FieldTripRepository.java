package com.beniregev.customvalidator.repository;

import com.beniregev.customvalidator.model.FieldTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldTripRepository extends JpaRepository<FieldTrip, Long> {
}
