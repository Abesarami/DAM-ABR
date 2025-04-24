package UD6.E1305;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class E1305 {
    static <T, V> List<V> transformar(List<T> t, Function<T, V> f) {
        List<V>  listanueva = new ArrayList<>();
        for (int i = 0; i < t.size(); i++) {
            listanueva.add((V) t.get(i));
        }
        return null;
    }
}
