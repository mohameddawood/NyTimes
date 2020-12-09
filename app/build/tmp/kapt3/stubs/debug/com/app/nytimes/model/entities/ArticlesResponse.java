package com.app.nytimes.model.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001VB\u00d3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0006H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\tH\u00c6\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010M\u001a\u00020\rH\u00c6\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010O\u001a\u00020\u0006H\u00c6\u0003J\u0083\u0002\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\t\u0010T\u001a\u00020\rH\u00d6\u0001J\t\u0010U\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010 \u00a8\u0006W"}, d2 = {"Lcom/app/nytimes/model/entities/ArticlesResponse;", "Ljava/io/Serializable;", "abstract", "", "adxKeywords", "assetId", "", "byline", "column", "", "desFacet", "", "etaId", "", "geoFacet", "id", "media", "Lcom/app/nytimes/model/entities/ArticlesResponse$Media;", "nytdsection", "orgFacet", "perFacet", "publishedDate", "section", "source", "subsection", "title", "type", "updated", "uri", "url", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Object;Ljava/util/List;ILjava/util/List;JLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbstract", "()Ljava/lang/String;", "getAdxKeywords", "getAssetId", "()J", "getByline", "getColumn", "()Ljava/lang/Object;", "getDesFacet", "()Ljava/util/List;", "getEtaId", "()I", "getGeoFacet", "getId", "getMedia", "getNytdsection", "getOrgFacet", "getPerFacet", "getPublishedDate", "getSection", "getSource", "getSubsection", "getTitle", "getType", "getUpdated", "getUri", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Media", "app_debug"})
public final class ArticlesResponse implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "adx_keywords")
    private final java.lang.String adxKeywords = null;
    @com.google.gson.annotations.SerializedName(value = "asset_id")
    private final long assetId = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "byline")
    private final java.lang.String byline = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "column")
    private final java.lang.Object column = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "des_facet")
    private final java.util.List<java.lang.String> desFacet = null;
    @com.google.gson.annotations.SerializedName(value = "eta_id")
    private final int etaId = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "geo_facet")
    private final java.util.List<java.lang.String> geoFacet = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "media")
    private final java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media> media = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "nytdsection")
    private final java.lang.String nytdsection = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "org_facet")
    private final java.util.List<java.lang.String> orgFacet = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "per_facet")
    private final java.util.List<java.lang.String> perFacet = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "published_date")
    private final java.lang.String publishedDate = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "section")
    private final java.lang.String section = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "source")
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "subsection")
    private final java.lang.String subsection = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "type")
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "updated")
    private final java.lang.String updated = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "uri")
    private final java.lang.String uri = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "url")
    private final java.lang.String url = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbstract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdxKeywords() {
        return null;
    }
    
    public final long getAssetId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getByline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getColumn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDesFacet() {
        return null;
    }
    
    public final int getEtaId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGeoFacet() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNytdsection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOrgFacet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPerFacet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublishedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubsection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public ArticlesResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String p0_866449425, @org.jetbrains.annotations.NotNull()
    java.lang.String adxKeywords, long assetId, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.Object column, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> desFacet, int etaId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> geoFacet, long id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media> media, @org.jetbrains.annotations.NotNull()
    java.lang.String nytdsection, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> orgFacet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perFacet, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String section, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String subsection, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.nytimes.model.entities.ArticlesResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String p0_866449425, @org.jetbrains.annotations.NotNull()
    java.lang.String adxKeywords, long assetId, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.Object column, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> desFacet, int etaId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> geoFacet, long id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media> media, @org.jetbrains.annotations.NotNull()
    java.lang.String nytdsection, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> orgFacet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perFacet, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String section, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String subsection, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/app/nytimes/model/entities/ArticlesResponse$Media;", "Ljava/io/Serializable;", "approvedForSyndication", "", "caption", "", "copyright", "mediaMetadata", "", "Lcom/app/nytimes/model/entities/ArticlesResponse$Media$MediaMetadata;", "subtype", "type", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getApprovedForSyndication", "()I", "getCaption", "()Ljava/lang/String;", "getCopyright", "getMediaMetadata", "()Ljava/util/List;", "getSubtype", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "MediaMetadata", "app_debug"})
    public static final class Media implements java.io.Serializable {
        @com.google.gson.annotations.SerializedName(value = "approved_for_syndication")
        private final int approvedForSyndication = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "caption")
        private final java.lang.String caption = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "copyright")
        private final java.lang.String copyright = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "media-metadata")
        private final java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media.MediaMetadata> mediaMetadata = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "subtype")
        private final java.lang.String subtype = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "type")
        private final java.lang.String type = null;
        
        public final int getApprovedForSyndication() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCaption() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCopyright() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media.MediaMetadata> getMediaMetadata() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSubtype() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public Media(int approvedForSyndication, @org.jetbrains.annotations.NotNull()
        java.lang.String caption, @org.jetbrains.annotations.NotNull()
        java.lang.String copyright, @org.jetbrains.annotations.NotNull()
        java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media.MediaMetadata> mediaMetadata, @org.jetbrains.annotations.NotNull()
        java.lang.String subtype, @org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media.MediaMetadata> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.nytimes.model.entities.ArticlesResponse.Media copy(int approvedForSyndication, @org.jetbrains.annotations.NotNull()
        java.lang.String caption, @org.jetbrains.annotations.NotNull()
        java.lang.String copyright, @org.jetbrains.annotations.NotNull()
        java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media.MediaMetadata> mediaMetadata, @org.jetbrains.annotations.NotNull()
        java.lang.String subtype, @org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/app/nytimes/model/entities/ArticlesResponse$Media$MediaMetadata;", "Ljava/io/Serializable;", "format", "", "height", "", "url", "width", "(Ljava/lang/String;ILjava/lang/String;I)V", "getFormat", "()Ljava/lang/String;", "getHeight", "()I", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
        public static final class MediaMetadata implements java.io.Serializable {
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "format")
            private final java.lang.String format = null;
            @com.google.gson.annotations.SerializedName(value = "height")
            private final int height = 0;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "url")
            private final java.lang.String url = null;
            @com.google.gson.annotations.SerializedName(value = "width")
            private final int width = 0;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getFormat() {
                return null;
            }
            
            public final int getHeight() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUrl() {
                return null;
            }
            
            public final int getWidth() {
                return 0;
            }
            
            public MediaMetadata(@org.jetbrains.annotations.NotNull()
            java.lang.String format, int height, @org.jetbrains.annotations.NotNull()
            java.lang.String url, int width) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            public final int component2() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            public final int component4() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.app.nytimes.model.entities.ArticlesResponse.Media.MediaMetadata copy(@org.jetbrains.annotations.NotNull()
            java.lang.String format, int height, @org.jetbrains.annotations.NotNull()
            java.lang.String url, int width) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}