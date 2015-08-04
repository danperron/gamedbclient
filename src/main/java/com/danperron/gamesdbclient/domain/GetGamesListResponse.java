package com.danperron.gamesdbclient.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "game"
})
@XmlRootElement(name = "Data", namespace = "http://danperron.com/gamesdbclient/domain")
public class GetGamesListResponse {

    @XmlElement(name = "Game", namespace = "http://danperron.com/gamesdbclient/domain")
    protected List<GetGamesListResponse.Game> game;

    /**
     * Gets the value of the game property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the game property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetGamesListResponse.Game }
     * 
     * 
     */
    public List<GetGamesListResponse.Game> getGame() {
        if (game == null) {
            game = new ArrayList<GetGamesListResponse.Game>();
        }
        return this.game;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="GameTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "gameTitle",
        "releaseDate",
        "platform"
    })
    public static class Game {

        @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/gamelist")
        protected long id;
        @XmlElement(name = "GameTitle", namespace = "http://danperron.com/gamesdbclient/domain/gamelist", required = true)
        protected String gameTitle;
        @XmlElement(name = "ReleaseDate", namespace = "http://danperron.com/gamesdbclient/domain/gamelist")
        protected String releaseDate;
        @XmlElement(name = "Platform", namespace = "http://danperron.com/gamesdbclient/domain/gamelist", required = true)
        protected String platform;

        /**
         * Gets the value of the id property.
         * 
         */
        public long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(long value) {
            this.id = value;
        }

        /**
         * Gets the value of the gameTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGameTitle() {
            return gameTitle;
        }

        /**
         * Sets the value of the gameTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGameTitle(String value) {
            this.gameTitle = value;
        }

        /**
         * Gets the value of the releaseDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReleaseDate() {
            return releaseDate;
        }

        /**
         * Sets the value of the releaseDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReleaseDate(String value) {
            this.releaseDate = value;
        }

        /**
         * Gets the value of the platform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatform() {
            return platform;
        }

        /**
         * Sets the value of the platform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatform(String value) {
            this.platform = value;
        }

    }

}
