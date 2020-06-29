package com.hiberus.techtest.repository;

import com.hiberus.techtest.entity.SubOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubOrderRepository extends CrudRepository<SubOrder, Long> {
}
