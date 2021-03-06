/*
 * This file is generated by jOOQ.
 */
package org.jease.entity.tables.records;


import org.jease.entity.tables.Content;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContentRecord extends UpdatableRecordImpl<ContentRecord> {

    private static final long serialVersionUID = 1827438764;

    /**
     * Setter for <code>jease.content.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jease.content.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jease.content.parentID</code>.
     */
    public void setParentid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jease.content.parentID</code>.
     */
    public Integer getParentid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jease.content.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jease.content.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jease.content.lastModified</code>.
     */
    public void setLastmodified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jease.content.lastModified</code>.
     */
    public Timestamp getLastmodified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jease.content.creationDate</code>.
     */
    public void setCreationdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jease.content.creationDate</code>.
     */
    public Timestamp getCreationdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>jease.content.visible</code>.
     */
    public void setVisible(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>jease.content.visible</code>.
     */
    public Byte getVisible() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>jease.content.editorID</code>.
     */
    public void setEditorid(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>jease.content.editorID</code>.
     */
    public Integer getEditorid() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>jease.content.Access_login</code>.
     */
    public void setAccessLogin(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>jease.content.Access_login</code>.
     */
    public String getAccessLogin() {
        return (String) get(7);
    }

    /**
     * Setter for <code>jease.content.Access_password</code>.
     */
    public void setAccessPassword(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>jease.content.Access_password</code>.
     */
    public String getAccessPassword() {
        return (String) get(8);
    }

    /**
     * Setter for <code>jease.content.Access_start</code>.
     */
    public void setAccessStart(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>jease.content.Access_start</code>.
     */
    public Date getAccessStart() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>jease.content.Access_stop</code>.
     */
    public void setAccessStop(Date value) {
        set(10, value);
    }

    /**
     * Getter for <code>jease.content.Access_stop</code>.
     */
    public Date getAccessStop() {
        return (Date) get(10);
    }

    /**
     * Setter for <code>jease.content.Discussion_author</code>.
     */
    public void setDiscussionAuthor(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>jease.content.Discussion_author</code>.
     */
    public String getDiscussionAuthor() {
        return (String) get(11);
    }

    /**
     * Setter for <code>jease.content.Discussion_comment</code>.
     */
    public void setDiscussionComment(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>jease.content.Discussion_comment</code>.
     */
    public String getDiscussionComment() {
        return (String) get(12);
    }

    /**
     * Setter for <code>jease.content.Document_text</code>.
     */
    public void setDocumentText(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>jease.content.Document_text</code>.
     */
    public String getDocumentText() {
        return (String) get(13);
    }

    /**
     * Setter for <code>jease.content.Document_lastTextUpdate</code>.
     */
    public void setDocumentLasttextupdate(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>jease.content.Document_lastTextUpdate</code>.
     */
    public Long getDocumentLasttextupdate() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>jease.content.Factory_sequence</code>.
     */
    public void setFactorySequence(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>jease.content.Factory_sequence</code>.
     */
    public String getFactorySequence() {
        return (String) get(15);
    }

    /**
     * Setter for <code>jease.content.File_contentType</code>.
     */
    public void setFileContenttype(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>jease.content.File_contentType</code>.
     */
    public String getFileContenttype() {
        return (String) get(16);
    }

    /**
     * Setter for <code>jease.content.File_uuid</code>.
     */
    public void setFileUuid(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>jease.content.File_uuid</code>.
     */
    public String getFileUuid() {
        return (String) get(17);
    }

    /**
     * Setter for <code>jease.content.Gallery_preface</code>.
     */
    public void setGalleryPreface(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>jease.content.Gallery_preface</code>.
     */
    public String getGalleryPreface() {
        return (String) get(18);
    }

    /**
     * Setter for <code>jease.content.Gallery_scale</code>.
     */
    public void setGalleryScale(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>jease.content.Gallery_scale</code>.
     */
    public Integer getGalleryScale() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>jease.content.Gallery_labeled</code>.
     */
    public void setGalleryLabeled(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>jease.content.Gallery_labeled</code>.
     */
    public Byte getGalleryLabeled() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>jease.content.Link_url</code>.
     */
    public void setLinkUrl(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>jease.content.Link_url</code>.
     */
    public String getLinkUrl() {
        return (String) get(21);
    }

    /**
     * Setter for <code>jease.content.News_teaser</code>.
     */
    public void setNewsTeaser(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>jease.content.News_teaser</code>.
     */
    public String getNewsTeaser() {
        return (String) get(22);
    }

    /**
     * Setter for <code>jease.content.News_story</code>.
     */
    public void setNewsStory(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>jease.content.News_story</code>.
     */
    public String getNewsStory() {
        return (String) get(23);
    }

    /**
     * Setter for <code>jease.content.News_date</code>.
     */
    public void setNewsDate(Date value) {
        set(24, value);
    }

    /**
     * Getter for <code>jease.content.News_date</code>.
     */
    public Date getNewsDate() {
        return (Date) get(24);
    }

    /**
     * Setter for <code>jease.content.Reference_id</code>.
     */
    public void setReferenceId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>jease.content.Reference_id</code>.
     */
    public Integer getReferenceId() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>jease.content.Script_code</code>.
     */
    public void setScriptCode(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>jease.content.Script_code</code>.
     */
    public String getScriptCode() {
        return (String) get(26);
    }

    /**
     * Setter for <code>jease.content.Script_forward</code>.
     */
    public void setScriptForward(Byte value) {
        set(27, value);
    }

    /**
     * Getter for <code>jease.content.Script_forward</code>.
     */
    public Byte getScriptForward() {
        return (Byte) get(27);
    }

    /**
     * Setter for <code>jease.content.Text_content</code>.
     */
    public void setTextContent(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>jease.content.Text_content</code>.
     */
    public String getTextContent() {
        return (String) get(28);
    }

    /**
     * Setter for <code>jease.content.Test_plain</code>.
     */
    public void setTestPlain(Byte value) {
        set(29, value);
    }

    /**
     * Getter for <code>jease.content.Test_plain</code>.
     */
    public Byte getTestPlain() {
        return (Byte) get(29);
    }

    /**
     * Setter for <code>jease.content.Transit_uri</code>.
     */
    public void setTransitUri(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>jease.content.Transit_uri</code>.
     */
    public String getTransitUri() {
        return (String) get(30);
    }

    /**
     * Setter for <code>jease.content.Transit_forward</code>.
     */
    public void setTransitForward(Byte value) {
        set(31, value);
    }

    /**
     * Getter for <code>jease.content.Transit_forward</code>.
     */
    public Byte getTransitForward() {
        return (Byte) get(31);
    }

    /**
     * Setter for <code>jease.content.Wiki_content</code>.
     */
    public void setWikiContent(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>jease.content.Wiki_content</code>.
     */
    public String getWikiContent() {
        return (String) get(32);
    }

    /**
     * Setter for <code>jease.content.ClazzName</code>.
     */
    public void setClazzname(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>jease.content.ClazzName</code>.
     */
    public String getClazzname() {
        return (String) get(33);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContentRecord
     */
    public ContentRecord() {
        super(Content.CONTENT);
    }

    /**
     * Create a detached, initialised ContentRecord
     */
    public ContentRecord(Integer id, Integer parentid, String title, Timestamp lastmodified, Timestamp creationdate, Byte visible, Integer editorid, String accessLogin, String accessPassword, Date accessStart, Date accessStop, String discussionAuthor, String discussionComment, String documentText, Long documentLasttextupdate, String factorySequence, String fileContenttype, String fileUuid, String galleryPreface, Integer galleryScale, Byte galleryLabeled, String linkUrl, String newsTeaser, String newsStory, Date newsDate, Integer referenceId, String scriptCode, Byte scriptForward, String textContent, Byte testPlain, String transitUri, Byte transitForward, String wikiContent, String clazzname) {
        super(Content.CONTENT);

        set(0, id);
        set(1, parentid);
        set(2, title);
        set(3, lastmodified);
        set(4, creationdate);
        set(5, visible);
        set(6, editorid);
        set(7, accessLogin);
        set(8, accessPassword);
        set(9, accessStart);
        set(10, accessStop);
        set(11, discussionAuthor);
        set(12, discussionComment);
        set(13, documentText);
        set(14, documentLasttextupdate);
        set(15, factorySequence);
        set(16, fileContenttype);
        set(17, fileUuid);
        set(18, galleryPreface);
        set(19, galleryScale);
        set(20, galleryLabeled);
        set(21, linkUrl);
        set(22, newsTeaser);
        set(23, newsStory);
        set(24, newsDate);
        set(25, referenceId);
        set(26, scriptCode);
        set(27, scriptForward);
        set(28, textContent);
        set(29, testPlain);
        set(30, transitUri);
        set(31, transitForward);
        set(32, wikiContent);
        set(33, clazzname);
    }
}
