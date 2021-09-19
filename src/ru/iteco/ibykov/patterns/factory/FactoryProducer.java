package ru.iteco.ibykov.patterns.factory;

public class FactoryProducer {
    Factory createFactory(String databaseType){
        try {


            switch (databaseType){
                case "sql":
                    return new SqlDbFactory();
                case "obj":
                    return new ObjDbFactory();
                case "xml":
                    return new XmlDbFactory();
                default:
                        throw new IllegalArgumentException("Unimplementable database type!");

            }
        } catch (Exception e){e.printStackTrace();}
    return null;//never executes actually
    }
}
