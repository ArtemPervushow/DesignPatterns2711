package ru.iteco.cources.poeaa.transformview;

public class HtmlEntityTransformer {
    private Model model;

    public HtmlEntityTransformer(Model model) {
        this.model = model;
    }

    public String generateHtmlScore(String scoreNumber) {
        Score score = model.getScoreByName(scoreNumber);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("<a");
        stringBuilder.append(" name=");
        stringBuilder.append(score.getOwner());
        stringBuilder.append("/>");
        stringBuilder.append("</html");

        return stringBuilder.toString();
    }

    public String generateHtmlCredit(String creditNumber) {
        Credit credit = model.getCreditByName(creditNumber);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("<td");
        stringBuilder.append(" number=");
        stringBuilder.append(credit.getCreditNumber());
        stringBuilder.append("/>");
        stringBuilder.append("</html");

        return stringBuilder.toString();
    }
}
