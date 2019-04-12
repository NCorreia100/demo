package com.teaneck_squad.demo.models;

@Entity(name ="user")
public class User {



    @ID
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID_", unique=true,nullable=FALSE)
    privare long userId;

    @Column(name = "FNAME", nullable=false)
    private String fName;

    @Column(name = "LNAME", nullable=false)
    private String lName;


    //getters and setters
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
