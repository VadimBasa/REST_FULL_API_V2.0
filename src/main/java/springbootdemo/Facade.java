package springbootdemo;

import springbootdemo.model.User;
import springbootdemo.service.ServiceAdmin;
import springbootdemo.service.ServiceUserDefault;

public class Facade {
    private ServiceUserDefault serviceUserDefault;
    private ServiceAdmin serviceAdmin;

    public Facade() {
        serviceUserDefault = new ServiceUserDefault();
        serviceAdmin = new ServiceAdmin();
    }

    public void getProfileUserDefault() {
        serviceUserDefault.getProfile();
    }
    public void getProfileAdmin() {
        serviceAdmin.getProfile();
    }

}
