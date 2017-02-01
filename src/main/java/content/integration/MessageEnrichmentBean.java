package content.integration;

public class MessageEnrichmentBean {

    public static String addJournalId(String custom) {
        return custom.replaceAll("<article ", "<article journalId=\"0000001\" ");
    }

    public static String addParent(String custom) {
        return custom.replaceFirst("<article ", "<journal>\n<article ") + "\n</journal>";
    }
}
