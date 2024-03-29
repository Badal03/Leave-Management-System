package com.example.tmpproject.repository;

import com.example.tmpproject.model.Department;
import com.example.tmpproject.model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesignationRepositry extends JpaRepository<Designation,Integer>
{
    public Designation findById(int design_id);
    public List<Designation> findAllBy();
    public Designation deleteById(int design_id);
}
