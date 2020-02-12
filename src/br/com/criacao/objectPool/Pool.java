package br.com.criacao.objectPool;

public interface Pool<T> {
    T acquire();
    void release(T t);
}
