package org.example;

import org.example.Test.TestDAO;
import org.example.Test.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TestServiceConstructor")
public class TestService {
    private final TestDAO testDAO;

    @Autowired
    public TestService(TestDAO testDAO){
        this.testDAO = testDAO;
    }
    public List<TestDTO> selectAllThings(){
        return testDAO.list();
    }
}
