package com.vieboo.rxretrofit.model;

/**
 * Created by JacksonGenerator on 17-11-8.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Translation2 {
    @JsonProperty("word_mean")
    private List<String> wordMean;
    @JsonProperty("ph_am")
    private String phAm;
    @JsonProperty("ph_am_mp3")
    private String phAmMp3;
    @JsonProperty("ph_tts_mp3")
    private String phTtsMp3;
    @JsonProperty("ph_en")
    private String phEn;
    @JsonProperty("ph_en_mp3")
    private String phEnMp3;

    public List<String> getWordMean() {
        return wordMean;
    }

    public void setWordMean(List<String> wordMean) {
        this.wordMean = wordMean;
    }

    public String getPhAm() {
        return phAm;
    }

    public void setPhAm(String phAm) {
        this.phAm = phAm;
    }

    public String getPhAmMp3() {
        return phAmMp3;
    }

    public void setPhAmMp3(String phAmMp3) {
        this.phAmMp3 = phAmMp3;
    }

    public String getPhTtsMp3() {
        return phTtsMp3;
    }

    public void setPhTtsMp3(String phTtsMp3) {
        this.phTtsMp3 = phTtsMp3;
    }

    public String getPhEn() {
        return phEn;
    }

    public void setPhEn(String phEn) {
        this.phEn = phEn;
    }

    public String getPhEnMp3() {
        return phEnMp3;
    }

    public void setPhEnMp3(String phEnMp3) {
        this.phEnMp3 = phEnMp3;
    }
}