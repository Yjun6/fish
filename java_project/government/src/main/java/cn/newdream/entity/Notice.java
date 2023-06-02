package cn.newdream.entity;

/**
 * Created with IntelliJ IDEA.
 * Description: 表的实体类
 * User:Yu
 * Date:2023-05-31
 * Time:16:45
 */
public class Notice {
    private Integer id;//编号
    private String title;//标题
    private String time;//发布时间
    private Integer readcount;//阅读量
    private String content1;//简要内容
    private String content2;//详细内容

//    @Override
//    public String toString() {
//        return "Notice{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", time='" + time + '\'' +
//                ", readcount=" + readcount +
//                ", content1='" + content1 + '\'' +
//                ", content2='" + content2 + '\'' +
//                '}';
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getReadcount() {
        return readcount;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }
}
