package indura.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {
    
    public static void scrapWebsite(String url) {
        try {

            String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";

            Document doc = Jsoup.connect(url)
                                .userAgent(userAgent)
                                .get();

            System.out.println(doc.title()); // Imprime el título de la página

            System.out.println("[*] Links of the website: ");
            System.out.println("--------------------------------------------------------------");
            Elements links = doc.select("a[href]"); // Selecciona todos los enlaces
            for (Element link : links) {
                System.out.println(link.attr("href"));
            }

            System.out.println("[*] Images of the website");
            System.out.println("--------------------------------------------------------------");
            Elements images = doc.select("img[src]"); // Selecciona todas las imágenes
            for (Element image : images) {
                System.out.println("Image URL: " + image.attr("src") + " - Alt text: " + image.attr("alt"));
            }

            System.out.println("[*] Paragraphs of the website:");
            System.out.println("--------------------------------------------------------------");
            Elements paragraphs = doc.select("p"); // Selecciona todos los párrafos
            for (Element paragraph : paragraphs) {
                System.out.println(paragraph.text());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
