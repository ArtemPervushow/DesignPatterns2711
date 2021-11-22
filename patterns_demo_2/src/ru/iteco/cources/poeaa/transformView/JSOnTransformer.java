package ru.iteco.cources.poeaa.transformView;

public class JSOnTransformer {
    public String showHTMLProduct(Product product){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("<body>");
        stringBuilder.append("<a ");
        stringBuilder.append("name " + product.getName());
        stringBuilder.append("/>");
        stringBuilder.append("</body>");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }

    public String showHTMLUser(User user) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("<body>");
        stringBuilder.append("<a ");
        stringBuilder.append("age " + user.getAge());
        stringBuilder.append("/>");
        stringBuilder.append("</body>");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }
}
