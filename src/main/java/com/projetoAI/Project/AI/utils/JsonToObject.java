package com.projetoAI.Project.AI.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.projetoAI.Project.AI.gemini.GeminiResponse;

public class JsonToObject {

    public GeminiResponse JsonToResponse(String jsonString) {
        // Create Gson object
        Gson gson = new GsonBuilder().create();

        // Convert JSON string to Java object
        RespostaRaiz respostaRaiz = gson.fromJson(jsonString, RespostaRaiz.class);

        GeminiResponse resposta = gson.fromJson(respostaRaiz.getCandidates()[0].getContent().getParts()[0].getText(), GeminiResponse.class);

        // Access data from the object
        return resposta;
    }

    // Define classes for the JSON structure
    public static class RespostaRaiz {
        private Candidate[] candidates;
        private UsageMetadata usageMetadata;

        public Candidate[] getCandidates() {
            return candidates;
        }

        public UsageMetadata getUsageMetadata() {
            return usageMetadata;
        }
    }

    public static class Candidate {
        private Content content;
        private String finishReason;
        private int index;
        private SafetyRating[] safetyRatings;

        public Content getContent() {
            return content;
        }

        public String getFinishReason() {
            return finishReason;
        }

        public int getIndex() {
            return index;
        }

        public SafetyRating[] getSafetyRatings() {
            return safetyRatings;
        }
    }

    public static class Content {
        private Part[] parts;
        private String role;

        public Part[] getParts() {
            return parts;
        }

        public String getRole() {
            return role;
        }
    }

    public static class Part {
        private String text;

        public String getText() {
            return text;
        }
    }

    public static class SafetyRating {
        private String category;
        private String probability;

        public String getCategory() {
            return category;
        }

        public String getProbability() {
            return probability;
        }
    }

    public static class UsageMetadata {
        private int promptTokenCount;
        private int candidatesTokenCount;
        private int totalTokenCount;

        public int getPromptTokenCount() {
            return promptTokenCount;
        }

        public int getCandidatesTokenCount() {
            return candidatesTokenCount;
        }

        public int getTotalTokenCount() {
            return totalTokenCount;
        }
    }
}