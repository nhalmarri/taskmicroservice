package com.nora.orderstock.repository;

import com.nora.orderstock.entity.StockEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<StockEntity, Long> {
    Iterable<StockEntity> findByItem(String item);
}