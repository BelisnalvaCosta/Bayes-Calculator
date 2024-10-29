public class Main {

    public static void main(String[] args) {
        // Probabilidades conhecidas
        double probSpam = 0.4;           // P(A): Probabilidade de ser spam
        double probPromoGivenSpam = 0.7;  // P(B|A): Probabilidade de "promoção" dado que é spam
        double probPromo = 0.5;           // P(B): Probabilidade de "promoção" em qualquer email

        // Teorema de Bayes: P(A|B) = (P(B|A) * P(A)) / P(B)
        double probSpamGivenPromo = (probPromoGivenSpam * probSpam) / probPromo;

        System.out.println("A probabilidade de ser spam dado que o email contém 'promoção' é: "
                + (probSpamGivenPromo * 100) + "%");
    }
}