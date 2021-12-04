package org.birlasoft.train;

import java.util.Objects;

public class Service {
    String servicename;
    Integer serviceId;

    public Service(String servicename, Integer serviceId) {
        this.servicename = servicename;
        this.serviceId = serviceId;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Service{" +
                "servicename='" + servicename + '\'' +
                ", serviceId=" + serviceId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(servicename, service.servicename) && Objects.equals(serviceId, service.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicename, serviceId);
    }

    public static String getService(String serviceName) {
        return "MyService";
    }
}
