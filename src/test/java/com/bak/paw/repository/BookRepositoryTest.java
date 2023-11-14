package com.bak.paw.repository;

import com.bak.paw.UnitTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@UnitTest
@ExtendWith(MockitoExtension.class)
class BookRepositoryTest {

    @Mock
    Logger log;

    @InjectMocks
    BookRepository unitUnderTest;

@Test
    public void findAll(){
    assertThat(unitUnderTest.findAllFromDb()).hasSize(3);
}
}