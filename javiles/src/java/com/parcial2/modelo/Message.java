package com.parcial2.modelo;
// Generated May 16, 2016 7:18:01 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Message generated by hbm2java
 */
public class Message  implements java.io.Serializable {


     private Integer idmessage;
     private Folder folder;
     private String subject;
     private String body;
     private Date receivedDate;
     private boolean replied;
     private boolean read;

    public Message() {
    }

    public Message(Folder folder, String subject, String body, Date receivedDate, boolean replied, boolean read) {
       this.folder = folder;
       this.subject = subject;
       this.body = body;
       this.receivedDate = receivedDate;
       this.replied = replied;
       this.read = read;
    }
   
    public Integer getIdmessage() {
        return this.idmessage;
    }
    
    public void setIdmessage(Integer idmessage) {
        this.idmessage = idmessage;
    }
    public Folder getFolder() {
        return this.folder;
    }
    
    public void setFolder(Folder folder) {
        this.folder = folder;
    }
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    public Date getReceivedDate() {
        return this.receivedDate;
    }
    
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }
    public boolean isReplied() {
        return this.replied;
    }
    
    public void setReplied(boolean replied) {
        this.replied = replied;
    }
    public boolean isRead() {
        return this.read;
    }
    
    public void setRead(boolean read) {
        this.read = read;
    }




}


