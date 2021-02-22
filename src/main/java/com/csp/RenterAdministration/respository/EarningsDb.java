package com.csp.RenterAdministration.respository;

import com.csp.RenterAdministration.model.Earnings;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author chandra sekhar Polavarapu
 */
public interface EarningsDb extends CrudRepository<Earnings, Long> {
}
