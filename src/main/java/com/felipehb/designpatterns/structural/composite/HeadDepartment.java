package com.felipehb.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeadDepartment implements Department {

    private List<Department> childrenDepartments;

    public HeadDepartment(Department... departments) {
        childrenDepartments = new ArrayList<>();
        Collections.addAll(childrenDepartments, departments);
    }

    @Override
    public String getDepartmentResponsability() {
        return childrenDepartments.stream().map(Department::getDepartmentResponsability).reduce((x,y) -> x+", "+y).orElse("");
    }
}
