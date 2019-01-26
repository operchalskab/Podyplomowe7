public enum Formatter {
    CALM {
        @Override
        public String format(String message) {
            return "To jest Twoja wiadomość: " + message;
        }
    },
    NERVOUS {
        @Override
        public String format(String message) {
            return "Przestań zawracać mi głowę swoją wiadmością: " + message;
        }
    };

    public abstract String format(String message);
    }