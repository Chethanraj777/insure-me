package com.insureme.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insureme.model.Policy;
import com.insureme.repository.PolicyRepository;
import java.util.List;

@Service
public class PolicyService {
    @Autowired
    private PolicyRepository repository;

    public Policy createPolicy(Policy policy) {
        return repository.save(policy);
    }

    public Policy updatePolicy(Long id, Policy policy) {
        policy.setId(id);
        return repository.save(policy);
    }

    public Policy viewPolicy(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletePolicy(Long id) {
        repository.deleteById(id);
    }

    public List<Policy> listAll() {
        return repository.findAll();
    }
}
