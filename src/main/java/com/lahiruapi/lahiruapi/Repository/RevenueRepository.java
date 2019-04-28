package com.lahiruapi.lahiruapi.Repository;

import com.lahiruapi.lahiruapi.Entity.Revenue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RevenueRepository extends CrudRepository<Revenue, Long> {
    List<Revenue> getRevenueByTimeRange(Revenue revenue);
}
