package Interfaces;

import java.util.ArrayList;

public interface Repositório<T, U> {
    void salvar(T o);
    void remover(T o);
    ArrayList<T> listagem();
    T obter(U id);
}
