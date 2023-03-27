package org.example.sealed;

public class OverloadingOverwritingImpl implements OverloadingOverwriting {

    //@Override
    //for static overwrite does not work
    public void staticOverwriteMe() {

    }

    //overloading working fine
    public void staticOverwriteMe(int a) {

    }

    @Override
    public void overwriteMe() {

    }

    @Override
    public Integer narrowReturnType() throws RuntimeException{
        return null;
    }

    //@overload
    public void overwriteMe(int a) {

    }

}
