package ma.emsi.eljazouly.tp1.llm;

/**
 * Résultat d'un échange avec l'API du LLM.
 *
 * @param questionJson    le JSON de la requête envoyée à l'API (mis en forme pour l'affichage).
 * @param reponseJson     le JSON de la réponse renvoyée par l'API.
 * @param reponseExtraite le texte de la réponse, extrait du JSON, à afficher à l'utilisateur.
 */
public record LlmInteraction(String questionJson, String reponseJson, String reponseExtraite) {
}
