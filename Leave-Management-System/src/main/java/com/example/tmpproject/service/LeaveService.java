package com.example.tmpproject.service;

import com.example.tmpproject.model.Department;
import com.example.tmpproject.model.Employee;
import com.example.tmpproject.model.LeaveApply;
import com.example.tmpproject.repository.LeaveRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService
{
    @Autowired
    private LeaveRepositry leaveRepositry;
    public LeaveApply saveLeave(LeaveApply leaveApply){return leaveRepositry.save(leaveApply);}
    public LeaveApply findLeave(int id){return leaveRepositry.findById(id);}
    public List<LeaveApply> findAllLeave(){return leaveRepositry.findAllBy();}
    public List<LeaveApply> findByEmployee(int emp_id){return leaveRepositry.findAllByEmployee(emp_id);}
    public List<LeaveApply>findEmployeeLeaveByDepartment(int dept_id){return leaveRepositry.findEmployeeLeaveByDepartment(dept_id);}
    public List<LeaveApply> findLeaveByDepartment(int status,int dept_id){return  leaveRepositry.findLeaveByDepartment(status,dept_id);}
    public long countBystatus(int s,int dept_id){return  leaveRepositry.countBystatus(s,dept_id);}
    public long countByEmployee(int emp_id){return  leaveRepositry.countByEmployee(emp_id);}
    public long countByEmployeeAndstatus(int status,int emp_id){return leaveRepositry.countByEmployeeAndStatus(status,emp_id);}
    public long countByManagerAndstatus(int status,int mgr_id){return leaveRepositry.countByManagerAndStatus(status,mgr_id);}
    public long countLeaveByDepartment(int dept_id){return leaveRepositry.countLeaveByDepartment(dept_id);}
}
