/*package com.example.demo;


import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {

    private static final int PRODUCT_ID = 1;

    @Mock
    ProductRepo mockProductRepo;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void read(){
        Product product = new Product(PRODUCT_ID, "Kaffe", 15, "Slavekaffe");

        Mockito.when(mockProductRepo.read(PRODUCT_ID)).thenReturn(product);

        Mockito.verify(mockProductRepo, times(1).)
    }
}*/
