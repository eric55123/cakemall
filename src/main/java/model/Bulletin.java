package model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bulletin")
public class Bulletin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bulletin_no")
    private Integer bulletinNo;

    @Column(name = "bulletin_title")
    private String bulletinTitle;

    @Column(name = "bulletin_content")
    private Long bulletinContent;

    @Column(name = "bulletiin_update")
    private LocalDateTime bulletinUpdateTime;

    @Column(name = "admin_id")
    private Integer adminId;

    public Integer getBulletinNo() {
        return bulletinNo;
    }

    public void setBulletinNo(Integer bulletinNo) {
        this.bulletinNo = bulletinNo;
    }

    public String getBulletinTitle() {
        return bulletinTitle;
    }

    public void setBulletinTitle(String bulletinTitle) {
        this.bulletinTitle = bulletinTitle;
    }

    public Long getBulletinContent() {
        return bulletinContent;
    }

    public void setBulletinContent(Long bulletinContent) {
        this.bulletinContent = bulletinContent;
    }

    public LocalDateTime getBulletinUpdateTime() {
        return bulletinUpdateTime;
    }

    public void setBulletinUpdateTime(LocalDateTime bulletinUpdateTime) {
        this.bulletinUpdateTime = bulletinUpdateTime;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}
