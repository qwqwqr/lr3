package org.example;
import java.util.ArrayList;
import java.util.List;
public interface Iterator<T> {
    boolean hasNext();

    T next();
}