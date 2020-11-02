package dk.apaq.economic.model;

public class Notes {
    private String heading;
    private String textLine1;
    private String textLine2;

    public String getHeading() {
        return heading;
    }

    /**
     * The invoice heading. Usually displayed at the top of the invoice.
     * @param heading
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getTextLine1() {
        return textLine1;
    }

    /**
     * The first line of supplementary text on the invoice. This is usually displayed right under the heading in a
     * smaller font.
     * @param textLine1
     */
    public void setTextLine1(String textLine1) {
        this.textLine1 = textLine1;
    }

    public String getTextLine2() {
        return textLine2;
    }

    /**
     * The second line of supplementary text in the notes on the invoice. This is usually displayed as a footer on the
     * invoice.
     * @param textLine2
     */
    public void setTextLine2(String textLine2) {
        this.textLine2 = textLine2;
    }
}
