package org.example.Test;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("TestDAO")
public class TestDAOImpl implements TestDAO{
    ArrayList<TestDTO> list;
    public TestDAOImpl(){
        list = new ArrayList<>();
        list.add(new TestDTO("one"));
        list.add(new TestDTO("two"));
    }
    @Override
    public List<TestDTO> list() {
        return list;
    }
}
