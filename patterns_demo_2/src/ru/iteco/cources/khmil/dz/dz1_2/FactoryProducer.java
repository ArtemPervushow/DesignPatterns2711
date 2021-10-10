package ru.iteco.cources.khmil.dz.dz1_2;

public class FactoryProducer {
    Factory createFactory(FactoryType factoryType){
        switch (factoryType){
            case SQL: return new SqlDbFactory();
            case OBJ: return new ObjDbFactory();
            default: return new XmlDbFactory();
        }
    }
}
