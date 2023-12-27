package org.example;

import org.jetbrains.annotations.NotNull;

public interface ChainHandler {
    void process(@NotNull Request request);

    ChainHandler next();

    ChainHandler next(ChainHandler chainHandler);
}
