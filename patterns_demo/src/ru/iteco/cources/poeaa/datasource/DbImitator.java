package ru.iteco.cources.poeaa.datasource;

import java.util.List;

public class DbImitator {
    public Object getObjectBySQL(String sql) {
        if(sql.contains("Product"))
            return "uuid=e37fbb96-5131-4596-a145-d75aff4e2760, name='Bread', cost=100.0, count=10, ownerUUID=a499df47-136c-4452-a3ba-49bd6312c66d";
        else
            return "";
    }

    public String getListObjectsBySQL(String sql) {
        return "Product{uuid=60bc461d-a15d-4cd3-bc2b-48de72739664, name='Bread', cost=100.0, count=10, ownerUUID=024435f9-8ae8-41c2-8c42-371d75f72c49}, Product{uuid=fec01e0f-9866-40cf-b1b0-24744975ee4b, name='Milk', cost=50.0, count=3, ownerUUID=94b3400f-f17e-4b5d-a756-10d097ffedf0}";
    }

    public void updateSomeBySQL(String sql) {

    }
}
