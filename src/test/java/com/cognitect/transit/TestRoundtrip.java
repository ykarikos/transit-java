// Copyright (c) Cognitect, Inc.
// All rights reserved.

package com.cognitect.transit;

public class TestRoundtrip {

    public static void main(String [] args) throws Exception {

        // TODO: use argument to set up json or msgpack
        Reader reader = Reader.getJsonInstance(System.in, Reader.defaultDecoders());
        Writer writer = Writer.getJsonInstance(System.out, Writer.defaultHandlers());

        try {
            while(true) {
                Object o = reader.read();
                writer.write(o);
            }
        }
        catch(Exception e) {
            // exit
        }
    }
}