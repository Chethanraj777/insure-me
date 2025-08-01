package com.insureme.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.insureme.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {}
