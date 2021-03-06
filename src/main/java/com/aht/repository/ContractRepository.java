package com.aht.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aht.entities.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

}
