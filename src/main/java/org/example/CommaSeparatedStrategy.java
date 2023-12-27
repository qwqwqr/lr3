package org.example;

import org.apache.commons.lang3.StringUtils;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class CommaSeparatedStrategy implements Strategy {
    @NotNull
    @Override
    public String process(@NotNull List<String> strings) {
        return StringUtils.join(strings, ",");
    }
}