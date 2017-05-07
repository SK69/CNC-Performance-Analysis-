package experiments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Raksha on 07-05-2017.
 */
public class Controller {
    public static void main(String[] args){
        List<Component> components = new ArrayList();
        HashMap<Machine, List<Component> > info = new HashMap<Machine, List<Component>>();
        Machine machine = new Machine();
        machine.setMachineId(1);
        Component component = new Component(1, 1234, 121);
        components.add(component);
        info.put(machine, components);
        System.out.println(components.get(0).getStartTime());
        System.out.println(info.get(machine).get(0).getStartTime());

    }

}
