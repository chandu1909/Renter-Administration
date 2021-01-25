package com.csp.RenterAdministration.respository;

import com.csp.RenterAdministration.model.Tool;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.sql.Date;

/** @Author chandra sekhar Polavarapu */
public interface ToolDb extends CrudRepository<Tool, Long> {

  @Modifying
  @Transactional
  @Query("Update Tool t set t.pricePerDay = :pricePerDay where t.toolId = :id")
  int updatePricePerDay(double pricePerDay, long id);

  @Modifying
  @Transactional
  @Query("Update Tool t set t.pricePerHour = :pricePerHour where t.toolId = :id")
  int updatePricePerHour(double pricePerHour, long id);

  @Modifying
  @Transactional
  @Query(
      "Update Tool t set t.unavailableStartDate = :unavailableStartDate AND t.unavailableEndDate = :unavailableEndDate where t.toolId = :id")
  int updateUnavailability(Date unavailableStartDate, Date unavailableEndDate, long id);
}
