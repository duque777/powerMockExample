package com.example.com.example.service;

import com.example.Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Util.class)
@PowerMockRunnerDelegate(SpringRunner.class)
public class CallUtilTest {

    @Test
    public void callTestMockedPassou(){
        PowerMockito.mockStatic(Util.class);
        Mockito.when(Util.getNome()).thenReturn("Olivier");
        String expected = "Olivier";
        CallUtil callUtil = new CallUtil();
        String retorno = callUtil.pegarNome();
        assertEquals(expected, retorno);
    }

    @Test
    public void callTestMockedErro(){
        PowerMockito.mockStatic(Util.class);
        Mockito.when(Util.getNome()).thenReturn("Olivier");
        String expected = "Nao";
        CallUtil callUtil = new CallUtil();
        String retorno = callUtil.pegarNome();
        assertNotEquals(expected, retorno);
    }

}