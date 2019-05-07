package com.example.stockorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockorder.entity.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock,String >{

	List<Stock> findByStockId( String stockId);
	

}
