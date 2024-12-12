public class URLBuilder {
    public static String URLBuilder(String baseURL, String params) {
        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");
        
        for (int i = 0; i < pairs.length; i++) {
            String[] keyValue = pairs[i].split("=");
            if (!"null".equals(keyValue[1])) {
                if (i > 0) {
                     url.append("&");
                }
url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }
        return url.toString();
    }
}
    

