package james.com.simplezhihudaily.Model;

import com.google.gson.annotations.SerializedName;

public class ThemeStory {
    final static private int isThemeStory = 2;
    @SerializedName("image")
    private String img;
    @SerializedName("id")
    private String id;
    @SerializedName("ga_prefix")
    private String ga_prefix;
    @SerializedName("title")
    private String title;
    private String date;
    private String themeID;

    public String getThemeID() {
        return themeID;
    }

    public void setThemeID(String themeID) {
        this.themeID = themeID;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ThemeStory(String img, String id, String ga_prefix, String title) {
        this.img = img;
        this.id = id;
        this.ga_prefix = ga_prefix;
        this.title = title;
    }

    public String getImgs() {
        return img;
    }
    public void setImgs(String s){
        this.img = s;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public int getAttr(){
        return isThemeStory;
    }
}
