/*
 * Copyright (c) 2021 libf.All Rights Reserved.
 */

package com.libf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HelloMockito {
    @Mock
    private List<String> list;

    @Test
    public void helloWorld(){
        when(list.get(0)).thenReturn("hello");
        assertEquals(list.get(0), "hello");
    }
}
