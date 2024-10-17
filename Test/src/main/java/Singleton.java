public class Singleton  {
    private Singleton() {}

    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public String getBlockOfHtml() {
        return """
            <html>

                <body>
                    <span>example text</span>
                </body>
            </html>""";
    }
}