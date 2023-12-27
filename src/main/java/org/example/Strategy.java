package org.example;
import org.jetbrains.annotations.NotNull;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
public interface Strategy {
    @NotNull
    String process(@NotNull List<String> strings);
}