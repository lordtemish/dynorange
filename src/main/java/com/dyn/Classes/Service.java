package com.dyn.Classes;

import org.springframework.data.annotation.Id;

/**
 * Created by lordtemich on 10/27/17.
 */
public class Service {
    @Id
    private String id;
    private String serv_type_id;
    private String infoRus;
    private String infoKaz;
    public Service(){

    }
    public Service(String serv_type_id,String rus, String kaz){
        this.serv_type_id=serv_type_id;
        this.infoRus=rus;
        this.infoKaz=kaz;
    }
    public String getId() {
        return id;
    }

    public String getInfoRus() {
        return infoRus;
    }

    public String getInfoKaz() {
        return infoKaz;
    }

    public String getServ_type_id() {
        return serv_type_id;
    }
    public void setInfoKaz(String infoKaz) {
        this.infoKaz = infoKaz;
    }

    public void setInfoRus(String infoRus) {
        this.infoRus = infoRus;
    }

    public void setServ_type_id(String serv_type_id) {
        this.serv_type_id = serv_type_id;
    }
}
