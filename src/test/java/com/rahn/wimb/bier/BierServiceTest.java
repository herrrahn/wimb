package com.rahn.wimb.bier;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

import static java.util.Collections.*;
import static org.mockito.Mockito.*;

public class BierServiceTest {

    private BierService bierService;
    private BierRepository bierRepositoryMock;

    @Before
    public void setUp(){
        this.bierRepositoryMock = mock(BierRepository.class);
        this.bierService = new BierService(this.bierRepositoryMock);
    }

    @Test
    public void save() {
        Bier b = new Bier(UUID.randomUUID(), "Augustiner", BierType.HELLES);

        this.bierService.save(b);

        doReturn(b).when(bierRepositoryMock).save(b);
        verify(bierRepositoryMock).save(b);
    }

    @Test
    public void findAll() {
        this.bierService.findAll();
        doReturn(emptyList()).when(bierRepositoryMock).findAll();
        verify(bierRepositoryMock).findAll();
    }
}
