package homework.part1;

import java.util.ArrayList;
import java.util.List;
//часть 1 ДЗ: стурктура + singleton
public class HW1 {
    public static void main(String[] args) {
        FS fs = FS.getInstance(); // вызвали метод getinstance
        FS fs1 = FS.getInstance();
        //FS fs2 = new FS(); // благодаря singletone невозможно создать другой (новый) объект FS
        //FS fs3 = new FS(); // благодаря singletone невозможно создать другой (новый) объект FS
        System.out.println(fs);
        System.out.println(fs1);
     //   System.out.println(fs2); // выводим объект
      //  System.out.println(fs3); // выводим объект
        Directory dir1 = new Directory();
        dir1.setName("кошка1");
        fs.entryList.add(dir1);
             for (FSItem fsItem : fs.entryList) {
            System.out.println("fsItem:"+fsItem.getName());
        }
        System.out.println("ФС 2");
        Directory dir2 =  new Directory();
        dir2.setName("собака");
        fs1.entryList.add(dir2);
        for (FSItem fsItem : fs1.entryList) {
            System.out.println("fsItem2:"+fsItem.getName());
        }

        FSItem file = FsItemFactory.getFactory("file").createFsItem(); //создание файла через фабрику
        FSItem dir = FsItemFactory.getFactory("").createFsItem(); //создание директории через фабрику

    }

}

//класс FS будет Singletone
class FS {
    List<FSItem> entryList = new ArrayList<>();

    private static volatile FS INSTANCE;

    public static FS getInstance() {
        FS localInstance = INSTANCE;
        if(localInstance == null) {
            synchronized (FS.class) {
                localInstance = INSTANCE;
                if(localInstance == null) {
                    INSTANCE = new FS();
                }
            }
        }

        return INSTANCE;
    }

    private FS() {
        //Если бы тут была сложная логика, то она выполнялась бы строго один раз
    }
}


interface FSItem {
    public String getName();
    public void setName(String name); // принимаем некий string
    public String getPath();
    public FSItem getParent();

}

class Directory implements FSItem {
    private List<FSItem> children;
    private String name;
    
    public List<FSItem> getChildren(){
        return null;
    }
    public boolean isFileSystem(){
        return false;
    };

    public String getName() {
        return name;
    }

    public void setName(String str) {
        name = str; // задала наименоевание для директории
    }

    public String getPath() {
        return null;
    }

    public FSItem getParent() {
        return null;
    }
}

class File implements FSItem {
    private String name;

    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name; // полю этого класса присвоила значение
    }

    public String getPath() {
        return null;
    }

    public FSItem getParent() {
        return null;
    }
}

class Link implements FSItem {
    private String name;
    private FSItem link;

    public FSItem getLink() {
        return null;
    }

    public String getName() {
        return null;
    }
// внутри функции добавила параметр
    public void setName(String name) {

    }

    public String getPath() {
        return null;
    }

    public FSItem getParent() {
        return null;
    }
}
// ч2 ДЗ применение двух любых паттернов фабрики
abstract class FsItemFactory {
    public abstract FSItem createFsItem();

    //возращает фабрику в зависимости от входящей строки
    public static FsItemFactory getFactory(String type){
        switch (type) {
            case "file":
                return new FileFactory();
            default:
                return new DirFactory();
        }
    }
}

class FileFactory extends FsItemFactory {

    @Override
    public FSItem createFsItem() {
        return new File();
    }
}

class DirFactory extends FsItemFactory {

    @Override
    public FSItem createFsItem() {
        return new Directory();
    }
}