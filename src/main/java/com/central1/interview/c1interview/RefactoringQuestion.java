package com.central1.interview.c1interview;

import java.util.List;
import java.util.Set;

public class RefactoringQuestion {
    private final Service service;

    public RefactoringQuestion(Service service) {
        this.service = service;
    }

    public List<String> method1() {
        try {
            service.serviceStarted();
            return service.serviceMethod1();
        } catch (RuntimeException e) {
            service.handFailure(e);
            e.printStackTrace();
        } finally {
            service.serviceEnded();
        }
        return null;
    }

    public Set<String> method2() {
        try {
            service.serviceStarted();
            return service.serviceMethod2();
        } catch (RuntimeException e) {
            service.handFailure(e);
            e.printStackTrace();
        } finally {
            service.serviceEnded();
        }
        return null;
    }

    public String method3() {
        try {
            service.serviceStarted();
            return service.serviceMethod3();
        } catch (RuntimeException e) {
            service.handFailure(e);
            e.printStackTrace();
        } finally {
            service.serviceEnded();
        }
        return null;
    }

    // This interface cannot be modified, it comes from a 3rd party library
    interface Service {

        List<String> serviceMethod1();

        Set<String> serviceMethod2();

        String serviceMethod3();

        void handFailure(Exception e);

        void serviceStarted();

        void serviceEnded();
    }
}