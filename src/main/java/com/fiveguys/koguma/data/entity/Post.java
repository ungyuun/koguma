package com.fiveguys.koguma.data.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "posts")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "writer_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "category_name", length = 15)
    private String categoryName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_category_id")
    private ClubPostCategory clubPostCategory;

    @Column(name = "club_category_name",length = 15)
    private String clubPostCategoryName;

    @Column(nullable = false, length = 90)
    private String title;

    @Column(nullable = false, length = 1500)
    private String content;

    @Column(name = "post_type",nullable = false)
    private Boolean postType;

    private Double latitude;

    private Double longitude;

    @Column(nullable = false, length = 20)
    private String dong;

    @Column(nullable = false)
    private int views = 0;

    @Column(name = "active_flag",nullable = false)
    private Boolean activeFlag;

    public void increaseViews(int views){
        this.views++;
    }

    @Builder
    public Post(Long id, Member member, Category category, String categoryName,
                ClubPostCategory clubPostCategory, String clubPostCategoryName, String title,
                String content, Boolean postType, Double latitude, Double longitude, String dong,
                int views, Boolean activeFlag){
        this.id = id;
        this.member = member;
        this.category = category;
        this.categoryName = categoryName;
        this.clubPostCategory = clubPostCategory;
        this.clubPostCategoryName = clubPostCategoryName;
        this.title = title;
        this.content = content;
        this.postType = postType;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dong = dong;
        this.views = views;
        this.activeFlag = activeFlag;
    }
}