package sast.sastlink.sdk.model;

import java.util.List;

/**
 * @projectName: sast-link-SDK
 * @author: feelMoose
 * @date: 2023/7/16 21:35
 */
public class UserInfo {
    private String userId;
    private String email;
    private String avatar;
    private String badge;
    private String bio;
    private String dep;
    private List<String> hide;
    private List<String> link;
    private String nickname;
    private String org;

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", badge='" + badge + '\'' +
                ", bio='" + bio + '\'' +
                ", dep='" + dep + '\'' +
                ", hide='" + hide + '\'' +
                ", link='" + link + '\'' +
                ", nickname='" + nickname + '\'' +
                ", org='" + org + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public UserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public UserInfo setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getBadge() {
        return badge;
    }

    public UserInfo setBadge(String badge) {
        this.badge = badge;
        return this;
    }

    public List<String> getLink() {
        return link;
    }

    public UserInfo setLink(List<String> link) {
        this.link = link;
        return this;
    }

    public String getBio() {
        return bio;
    }

    public UserInfo setBio(String bio) {
        this.bio = bio;
        return this;
    }

    public String getDep() {
        return dep;
    }

    public UserInfo setDep(String dep) {
        this.dep = dep;
        return this;
    }

    public List<String> getHide() {
        return hide;
    }

    public UserInfo setHide(List<String> hide) {
        this.hide = hide;
        return this;
    }



    public String getNickname() {
        return nickname;
    }

    public UserInfo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getOrg() {
        return org;
    }

    public UserInfo setOrg(String org) {
        this.org = org;
        return this;
    }

    public UserInfo() {
    }

    public UserInfo(String userId, String email, String avatar, String badge, String bio, String dep, List<String> hide, List<String> link, String nickname, String org) {
        this.userId = userId;
        this.email = email;
        this.avatar = avatar;
        this.badge = badge;
        this.bio = bio;
        this.dep = dep;
        this.hide = hide;
        this.link = link;
        this.nickname = nickname;
        this.org = org;
    }
}
