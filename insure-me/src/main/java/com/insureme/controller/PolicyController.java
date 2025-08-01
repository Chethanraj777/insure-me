package com.insureme.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.insureme.model.Policy;
import com.insureme.service.PolicyService;
import java.util.List;

@RestController
public class PolicyController {
    @Autowired
    private PolicyService service;

    @PostMapping("/createPolicy")
    public Policy create(@RequestBody Policy policy) {
        return service.createPolicy(policy);
    }

    @PutMapping("/updatePolicy/{id}")
    public Policy update(@PathVariable Long id, @RequestBody Policy policy) {
        return service.updatePolicy(id, policy);
    }

    @GetMapping("/viewPolicy/{id}")
    public Policy view(@PathVariable Long id) {
        return service.viewPolicy(id);
    }

    @DeleteMapping("/deletePolicy/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePolicy(id);
    }

    @GetMapping("/listPolicies")
    public List<Policy> listAll() {
        return service.listAll();
    }
}
