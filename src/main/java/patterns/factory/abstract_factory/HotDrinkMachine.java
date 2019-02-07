package patterns.factory.abstract_factory;

import org.reflections.Reflections;
import patterns.factory.abstract_factory.factory.HotDrinkFactory;
import patterns.factory.abstract_factory.model.HotDrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HotDrinkMachine {

    private Map<String, HotDrinkFactory> hotDrinkFactoryMap = new HashMap<>();

    public HotDrinkMachine() throws Exception {

        Set<Class<? extends HotDrinkFactory>> subTypesOf = new Reflections("patterns.factory.abstract_factory").getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> factoryClass : subTypesOf) {
            hotDrinkFactoryMap
                    .put(factoryClass.getSimpleName().replace("Factory", ""),
                            factoryClass.getDeclaredConstructor().newInstance());
        }
    }

    public HotDrink makeDrtnk() throws IOException {
        System.out.println("Available drinks:");
        hotDrinkFactoryMap.keySet().forEach(System.out::println);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String key = null;
            Integer amount = null;
            if ((key = bufferedReader.readLine()) != null && hotDrinkFactoryMap.containsKey(key)) {
                System.out.println("Specify amount:");
                amount = Integer.parseInt(bufferedReader.readLine());
                hotDrinkFactoryMap.get(key).prepare(amount).consume();
            }
        }
    }
}
