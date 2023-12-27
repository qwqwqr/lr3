package org.example;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

public class ChainService {

    public Request exec(String inputStream) {
        Request request = new Request();
        request.setInputStream(inputStream);
        ChainHandler handler = new HeadersChainHandler();
        handler.next(new MethodChainHandler())
                .next(new PathChainHandler())
                .next(new SessionChainHandler());

        handler.process(request);

        return request;
    }
}