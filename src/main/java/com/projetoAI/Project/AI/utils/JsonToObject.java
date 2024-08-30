package com.projetoAI.Project.AI.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.projetoAI.Project.AI.dtos.GeminiResponseDTO;

public class JsonToObject {

    // Recebe a String do HttpResponse.body e transforma em um objeto GeminiResponse
    public static GeminiResponseDTO JsonToResponse(String jsonString) throws NullPointerException{
        Gson gson = new GsonBuilder().create();

        GeminiDTO geminiDTO = gson.fromJson(jsonString, GeminiDTO.class);

        GeminiResponseDTO resposta = gson.fromJson(geminiDTO.getCandidates()[0].getContent().getParts()[0].getText(), GeminiResponseDTO.class);

        // Access data from the object
        return resposta;
    }

    // Classes Para Tranferencia de dados
    private static class GeminiDTO {
        private Candidate[] candidates;
        private UsageMetadata usageMetadata;

        public Candidate[] getCandidates() {
            return candidates;
        }

        public UsageMetadata getUsageMetadata() {
            return usageMetadata;
        }
    }
    private static class Candidate {
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
    private static class Content {
        private Part[] parts;
        private String role;

        public Part[] getParts() {
            return parts;
        }

        public String getRole() {
            return role;
        }
    }
    private static class Part {
        private String text;

        public String getText() {
            return text;
        }
    }
    private static class SafetyRating {
        private String category;
        private String probability;

        public String getCategory() {
            return category;
        }

        public String getProbability() {
            return probability;
        }
    }
    private static class UsageMetadata {
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