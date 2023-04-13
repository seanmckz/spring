package zw.co.mckenzie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import zw.co.mckenzie.bean.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean(name = "mercedesVehicle")
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }
    @Bean(value = "bentlyVehicle")
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("Bently");
        return veh;
    }

    @Primary
    @Bean("mustangVehicle")
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("Mustang");
        return veh;
    }
}
