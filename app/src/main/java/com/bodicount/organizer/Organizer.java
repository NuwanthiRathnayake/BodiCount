package com.bodicount.organizer;

import com.bodicount.commons.User;
import com.bodicount.commons.UserTypes;

import java.util.ArrayList;
import java.util.List;

public class Organizer extends User {
    private List<String> studentList = new ArrayList<>();

    @Override
    public String getType() {
        return UserTypes.ORGANIZER;
    }

    public List<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<String> studentList) {
        this.studentList = studentList;
    }
}
