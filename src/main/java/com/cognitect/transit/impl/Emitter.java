package com.cognitect.transit.impl;

public interface Emitter {

    void emit(Object o, boolean asMapKey, WriteCache cache) throws Exception;
    void emitNil(boolean asMapKey, WriteCache cache) throws Exception;
    void emitString(String prefix, String tag, String s, boolean asMapKey, WriteCache cache) throws Exception;
    void emitBoolean(Boolean b, boolean asMapKey, WriteCache cache) throws Exception;
    void emitInteger(Object i, boolean asMapKey, WriteCache cache) throws Exception;
    void emitDouble(Object d, boolean asMapKey, WriteCache cache) throws Exception;
    void emitBinary(Object b, boolean asMapKey, WriteCache cache) throws Exception;
    // TODO: can we narrow the type here?
    long arraySize(Object a);
    void emitArrayStart(Long size) throws Exception;
    void emitArrayEnd() throws Exception;
    long mapSize(Object m);
    void emitMapStart(Long size) throws Exception;
    void emitMapEnd() throws Exception;
    boolean prefersStrings();
}