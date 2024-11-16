package com.central1.interview.c1interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RefactoringQuestionTest {
    private RefactoringQuestion refacto;

    private final RefactoringQuestion.Service mockedService = Mockito.mock(RefactoringQuestion.Service.class);

    @BeforeEach
    public void setUp() {
        refacto = new RefactoringQuestion(mockedService);
    }

    @Test
    public void testMethod1Success() {
        final List<String> expectedResult = List.of("Hello");
        when(mockedService.serviceMethod1()).thenReturn(expectedResult);

        final List<String> result = refacto.method1();

        assertThat(result).isEqualTo(expectedResult);

        InOrder inOrder = inOrder(mockedService);
        inOrder.verify(mockedService).serviceStarted();
        inOrder.verify(mockedService).serviceMethod1();
        inOrder.verify(mockedService).serviceEnded();

        verify(mockedService, never()).handFailure(any());
        verify(mockedService, never()).serviceMethod2();
        verify(mockedService, never()).serviceMethod3();
    }

    @Test
    public void testMethod1Failure() {
        when(mockedService.serviceMethod1()).thenThrow(new RuntimeException("Failure"));

        final List<String> result = refacto.method1();

        assertThat(result).isNull();

        InOrder inOrder = inOrder(mockedService);
        inOrder.verify(mockedService).serviceStarted();
        inOrder.verify(mockedService).serviceMethod1();
        inOrder.verify(mockedService).handFailure(any());
        inOrder.verify(mockedService).serviceEnded();

        verify(mockedService, never()).serviceMethod2();
        verify(mockedService, never()).serviceMethod3();
    }

    @Test
    public void testMethod2Success() {
        final Set<String> expectedResult = Set.of("Hello");
        when(mockedService.serviceMethod2()).thenReturn(expectedResult);

        final Set<String> result = refacto.method2();

        assertThat(result).isEqualTo(expectedResult);

        InOrder inOrder = inOrder(mockedService);
        inOrder.verify(mockedService).serviceStarted();
        inOrder.verify(mockedService).serviceMethod2();
        inOrder.verify(mockedService).serviceEnded();

        verify(mockedService, never()).handFailure(any());
        verify(mockedService, never()).serviceMethod1();
        verify(mockedService, never()).serviceMethod3();
    }

    @Test
    public void testMethod2Failure() {
        when(mockedService.serviceMethod2()).thenThrow(new RuntimeException("Failure"));

        final Set<String> result = refacto.method2();

        assertThat(result).isNull();

        InOrder inOrder = inOrder(mockedService);
        inOrder.verify(mockedService).serviceStarted();
        inOrder.verify(mockedService).serviceMethod2();
        inOrder.verify(mockedService).handFailure(any());
        inOrder.verify(mockedService).serviceEnded();

        verify(mockedService, never()).serviceMethod1();
        verify(mockedService, never()).serviceMethod3();
    }

    @Test
    public void testMethod3Success() {
        final String expectedResult = "Hello";
        when(mockedService.serviceMethod3()).thenReturn(expectedResult);

        final String result = refacto.method3();

        assertThat(result).isEqualTo(expectedResult);

        InOrder inOrder = inOrder(mockedService);
        inOrder.verify(mockedService).serviceStarted();
        inOrder.verify(mockedService).serviceMethod3();
        inOrder.verify(mockedService).serviceEnded();

        verify(mockedService, never()).handFailure(any());
        verify(mockedService, never()).serviceMethod1();
        verify(mockedService, never()).serviceMethod2();
    }

    @Test
    public void testMethod3Failure() {
        when(mockedService.serviceMethod3()).thenThrow(new RuntimeException("Failure"));

        final String result = refacto.method3();

        assertThat(result).isNull();

        InOrder inOrder = inOrder(mockedService);
        inOrder.verify(mockedService).serviceStarted();
        inOrder.verify(mockedService).serviceMethod3();
        inOrder.verify(mockedService).handFailure(any());
        inOrder.verify(mockedService).serviceEnded();

        verify(mockedService, never()).serviceMethod1();
        verify(mockedService, never()).serviceMethod2();
    }
}