package org.example.sealed;

import java.io.IOException;


public class InitBlocks {

    static {
        if (true) {
            //compilation error
            //throw new IOException();
        }
    }

    {
        if (true) {
            throw new IOException();
        }
    }

    public InitBlocks() throws IOException {
    }
}
