package org.example.sealed;

import java.io.IOException;

public interface OverloadingOverwriting {

    static void staticOverwriteMe() {

    }

    void overwriteMe();

    Object narrowReturnType() throws IOException;

}
