package homework.trello.models;

public class Board {

    public String name;
    public Boolean defaultLabels;
    public Boolean defaultList;
    public String desc;
    public String idOrganization;
    public String idBoardSource;
    public String keepFromSource;
    public String powerUps;
    public String prefs_permissionsLevel;
    public String prefs_voting;
    public String prefs_comments;
    public String prefs_invitations;
    public Boolean prefs_selfJoin;
    public Boolean prefs_cardCovers;
    public String prefs_background;
    public String prefs_cardAging;

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", defaultLabels=" + defaultLabels +
                ", defaultList=" + defaultList +
                ", desc='" + desc + '\'' +
                ", idOrganization='" + idOrganization + '\'' +
                ", idBoardSource='" + idBoardSource + '\'' +
                ", keepFromSource='" + keepFromSource + '\'' +
                ", powerUps='" + powerUps + '\'' +
                ", prefs_permissionsLevel='" + prefs_permissionsLevel + '\'' +
                ", prefs_voting='" + prefs_voting + '\'' +
                ", prefs_comments='" + prefs_comments + '\'' +
                ", prefs_invitations='" + prefs_invitations + '\'' +
                ", prefs_selfJoin=" + prefs_selfJoin +
                ", prefs_cardCovers=" + prefs_cardCovers +
                ", prefs_background='" + prefs_background + '\'' +
                ", prefs_cardAging='" + prefs_cardAging + '\'' +
                '}';
    }
}
