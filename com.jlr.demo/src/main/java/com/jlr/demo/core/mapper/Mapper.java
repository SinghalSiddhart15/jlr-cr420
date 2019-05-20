package com.jlr.demo.core.mapper;

public interface Mapper<S, T> {
    T fromBean(S s);

    S toBean(T t);
}
