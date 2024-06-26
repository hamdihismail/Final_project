package com.example.final_project;

public class Item {
    private String title;
    private String description;

    private String date;
    private String link;
    private String media;

    private int id;
    public int getId() {
        return id;
    }

    public void setId(String link) {
        int id = 0;
        try {
            String numerics = link.replaceAll("[^0-9]", "");
            id = Integer.valueOf(numerics);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
//        if((link !=null)&&(link !="")){
//            String numerics = link.replaceAll("[^0-9]", "");
//            id = Integer.valueOf(numerics);
//        }
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() { return link; }

    public void setLink(String link) {

        this.link = link;
        setId(link);
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }



    public Item(String title, String description, String date, String link, String media) {
        this.title = title;
        this.description = description;
        this.date = date;
        setLink(link);
        this.media = media;
    }
    public Item(){}
}
