package org.example;
import org.jetbrains.annotations.NotNull;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
public interface StrategyService {
    String exec(List<String> strings);

    StrategyService setStrategy(@NotNull Strategy strategy);
}