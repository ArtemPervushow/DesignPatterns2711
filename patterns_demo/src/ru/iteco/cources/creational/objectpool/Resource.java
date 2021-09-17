package ru.iteco.cources.creational.objectpool;

public class Resource {

  public void setConnectionResource(ConnectionResource connectionResource) {
    this.connectionResource = connectionResource;
  }

  private ConnectionResource connectionResource;

  public ConnectionResource getConnectionResource() {
    return connectionResource;
  }

  public void work(){
    connectionResource.work();
  }


}
