package zw.co.mckenzie.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zw.co.mckenzie.bean.Vehicle;
import zw.co.mckenzie.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.setName("Benz");
        System.out.println("Not from context: " + veh.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("mercedesVehicle", Vehicle.class);
        Vehicle veh2 = context.getBean("bentlyVehicle", Vehicle.class);
        Vehicle veh3 = context.getBean("mustangVehicle", Vehicle.class);
        System.out.println("from Primary Bean: " + context.getBean(Vehicle.class).getName());

        System.out.println(veh1.getName());
        System.out.println(veh2.getName());
        System.out.println(veh3.getName());
    }
}