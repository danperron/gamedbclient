package com.danperron.gamesdbclient.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baseImgUrl",
    "game"
})
@XmlRootElement(name = "Data", namespace = "http://danperron.com/gamesdbclient/domain")
public class GetGameResponse {

    @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String baseImgUrl;
    @XmlElement(name = "Game", namespace = "http://danperron.com/gamesdbclient/domain", required = true)
    protected GetGameResponse.Game game;

    /**
     * Gets the value of the baseImgUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImgUrl() {
        return baseImgUrl;
    }

    /**
     * Sets the value of the baseImgUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImgUrl(String value) {
        this.baseImgUrl = value;
    }

    /**
     * Gets the value of the game property.
     * 
     * @return
     *     possible object is
     *     {@link GetGameResponse.Game }
     *     
     */
    public GetGameResponse.Game getGame() {
        return game;
    }

    /**
     * Sets the value of the game property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGameResponse.Game }
     *     
     */
    public void setGame(GetGameResponse.Game value) {
        this.game = value;
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
     *         &lt;element name="PlatformId" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Overview" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ESRB" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Genres"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Players" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Co-op" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Youtube" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *         &lt;element name="Publisher" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Developer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *         &lt;element name="Images"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="fanart" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="original"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="thumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="boxart" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="banner" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="screenshot"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="original"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="thumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="clearlogo"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "platformId",
        "platform",
        "releaseDate",
        "overview",
        "esrb",
        "genres",
        "players",
        "coOp",
        "youtube",
        "publisher",
        "developer",
        "rating",
        "images"
    })
    public static class Game {

        @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game")
        protected long id;
        @XmlElement(name = "GameTitle", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String gameTitle;
        @XmlElement(name = "PlatformId", namespace = "http://danperron.com/gamesdbclient/domain/game")
        protected byte platformId;
        @XmlElement(name = "Platform", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String platform;
        @XmlElement(name = "ReleaseDate", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String releaseDate;
        @XmlElement(name = "Overview", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String overview;
        @XmlElement(name = "ESRB", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String esrb;
        @XmlElement(name = "Genres", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected GetGameResponse.Game.Genres genres;
        @XmlElement(name = "Players", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String players;
        @XmlElement(name = "Co-op", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String coOp;
        @XmlElement(name = "Youtube", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String youtube;
        @XmlElement(name = "Publisher", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String publisher;
        @XmlElement(name = "Developer", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected String developer;
        @XmlElement(name = "Rating", namespace = "http://danperron.com/gamesdbclient/domain/game")
        protected float rating;
        @XmlElement(name = "Images", namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
        protected GetGameResponse.Game.Images images;

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
         * Gets the value of the platformId property.
         * 
         */
        public byte getPlatformId() {
            return platformId;
        }

        /**
         * Sets the value of the platformId property.
         * 
         */
        public void setPlatformId(byte value) {
            this.platformId = value;
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
         * Gets the value of the overview property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverview() {
            return overview;
        }

        /**
         * Sets the value of the overview property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverview(String value) {
            this.overview = value;
        }

        /**
         * Gets the value of the esrb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getESRB() {
            return esrb;
        }

        /**
         * Sets the value of the esrb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setESRB(String value) {
            this.esrb = value;
        }

        /**
         * Gets the value of the genres property.
         * 
         * @return
         *     possible object is
         *     {@link GetGameResponse.Game.Genres }
         *     
         */
        public GetGameResponse.Game.Genres getGenres() {
            return genres;
        }

        /**
         * Sets the value of the genres property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetGameResponse.Game.Genres }
         *     
         */
        public void setGenres(GetGameResponse.Game.Genres value) {
            this.genres = value;
        }

        /**
         * Gets the value of the players property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlayers() {
            return players;
        }

        /**
         * Sets the value of the players property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlayers(String value) {
            this.players = value;
        }

        /**
         * Gets the value of the coOp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoOp() {
            return coOp;
        }

        /**
         * Sets the value of the coOp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoOp(String value) {
            this.coOp = value;
        }

        /**
         * Gets the value of the youtube property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYoutube() {
            return youtube;
        }

        /**
         * Sets the value of the youtube property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYoutube(String value) {
            this.youtube = value;
        }

        /**
         * Gets the value of the publisher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublisher() {
            return publisher;
        }

        /**
         * Sets the value of the publisher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublisher(String value) {
            this.publisher = value;
        }

        /**
         * Gets the value of the developer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeveloper() {
            return developer;
        }

        /**
         * Sets the value of the developer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeveloper(String value) {
            this.developer = value;
        }

        /**
         * Gets the value of the rating property.
         * 
         */
        public float getRating() {
            return rating;
        }

        /**
         * Sets the value of the rating property.
         * 
         */
        public void setRating(float value) {
            this.rating = value;
        }

        /**
         * Gets the value of the images property.
         * 
         * @return
         *     possible object is
         *     {@link GetGameResponse.Game.Images }
         *     
         */
        public GetGameResponse.Game.Images getImages() {
            return images;
        }

        /**
         * Sets the value of the images property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetGameResponse.Game.Images }
         *     
         */
        public void setImages(GetGameResponse.Game.Images value) {
            this.images = value;
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
         *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "genre"
        })
        public static class Genres {

            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
            protected String genre;

            /**
             * Gets the value of the genre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGenre() {
                return genre;
            }

            /**
             * Sets the value of the genre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGenre(String value) {
                this.genre = value;
            }

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
         *         &lt;element name="fanart" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="original"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="thumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="boxart" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="banner" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="screenshot"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="original"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="thumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="clearlogo"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "fanart",
            "boxart",
            "banner",
            "screenshot",
            "clearlogo"
        })
        public static class Images {

            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game")
            protected List<GetGameResponse.Game.Images.Fanart> fanart;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game")
            protected List<GetGameResponse.Game.Images.Boxart> boxart;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game")
            protected List<GetGameResponse.Game.Images.Banner> banner;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
            protected GetGameResponse.Game.Images.Screenshot screenshot;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
            protected GetGameResponse.Game.Images.Clearlogo clearlogo;

            /**
             * Gets the value of the fanart property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fanart property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFanart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetGameResponse.Game.Images.Fanart }
             * 
             * 
             */
            public List<GetGameResponse.Game.Images.Fanart> getFanart() {
                if (fanart == null) {
                    fanart = new ArrayList<GetGameResponse.Game.Images.Fanart>();
                }
                return this.fanart;
            }

            /**
             * Gets the value of the boxart property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the boxart property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBoxart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetGameResponse.Game.Images.Boxart }
             * 
             * 
             */
            public List<GetGameResponse.Game.Images.Boxart> getBoxart() {
                if (boxart == null) {
                    boxart = new ArrayList<GetGameResponse.Game.Images.Boxart>();
                }
                return this.boxart;
            }

            /**
             * Gets the value of the banner property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the banner property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBanner().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetGameResponse.Game.Images.Banner }
             * 
             * 
             */
            public List<GetGameResponse.Game.Images.Banner> getBanner() {
                if (banner == null) {
                    banner = new ArrayList<GetGameResponse.Game.Images.Banner>();
                }
                return this.banner;
            }

            /**
             * Gets the value of the screenshot property.
             * 
             * @return
             *     possible object is
             *     {@link GetGameResponse.Game.Images.Screenshot }
             *     
             */
            public GetGameResponse.Game.Images.Screenshot getScreenshot() {
                return screenshot;
            }

            /**
             * Sets the value of the screenshot property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetGameResponse.Game.Images.Screenshot }
             *     
             */
            public void setScreenshot(GetGameResponse.Game.Images.Screenshot value) {
                this.screenshot = value;
            }

            /**
             * Gets the value of the clearlogo property.
             * 
             * @return
             *     possible object is
             *     {@link GetGameResponse.Game.Images.Clearlogo }
             *     
             */
            public GetGameResponse.Game.Images.Clearlogo getClearlogo() {
                return clearlogo;
            }

            /**
             * Sets the value of the clearlogo property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetGameResponse.Game.Images.Clearlogo }
             *     
             */
            public void setClearlogo(GetGameResponse.Game.Images.Clearlogo value) {
                this.clearlogo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Banner {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "width")
                protected Integer width;
                @XmlAttribute(name = "height")
                protected Integer height;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the width property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getWidth() {
                    return width;
                }

                /**
                 * Sets the value of the width property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setWidth(Integer value) {
                    this.width = value;
                }

                /**
                 * Gets the value of the height property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getHeight() {
                    return height;
                }

                /**
                 * Sets the value of the height property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setHeight(Integer value) {
                    this.height = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Boxart {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "side")
                protected String side;
                @XmlAttribute(name = "width")
                protected Integer width;
                @XmlAttribute(name = "height")
                protected Integer height;
                @XmlAttribute(name = "thumb")
                protected String thumb;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the side property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSide() {
                    return side;
                }

                /**
                 * Sets the value of the side property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSide(String value) {
                    this.side = value;
                }

                /**
                 * Gets the value of the width property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getWidth() {
                    return width;
                }

                /**
                 * Sets the value of the width property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setWidth(Integer value) {
                    this.width = value;
                }

                /**
                 * Gets the value of the height property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getHeight() {
                    return height;
                }

                /**
                 * Sets the value of the height property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setHeight(Integer value) {
                    this.height = value;
                }

                /**
                 * Gets the value of the thumb property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getThumb() {
                    return thumb;
                }

                /**
                 * Sets the value of the thumb property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setThumb(String value) {
                    this.thumb = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Clearlogo {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "width")
                protected Integer width;
                @XmlAttribute(name = "height")
                protected Integer height;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the width property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getWidth() {
                    return width;
                }

                /**
                 * Sets the value of the width property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setWidth(Integer value) {
                    this.width = value;
                }

                /**
                 * Gets the value of the height property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getHeight() {
                    return height;
                }

                /**
                 * Sets the value of the height property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setHeight(Integer value) {
                    this.height = value;
                }

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
             *         &lt;element name="original"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="thumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "original",
                "thumb"
            })
            public static class Fanart {

                @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
                protected GetGameResponse.Game.Images.Fanart.Original original;
                @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
                protected String thumb;

                /**
                 * Gets the value of the original property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetGameResponse.Game.Images.Fanart.Original }
                 *     
                 */
                public GetGameResponse.Game.Images.Fanart.Original getOriginal() {
                    return original;
                }

                /**
                 * Sets the value of the original property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetGameResponse.Game.Images.Fanart.Original }
                 *     
                 */
                public void setOriginal(GetGameResponse.Game.Images.Fanart.Original value) {
                    this.original = value;
                }

                /**
                 * Gets the value of the thumb property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getThumb() {
                    return thumb;
                }

                /**
                 * Sets the value of the thumb property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setThumb(String value) {
                    this.thumb = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/simpleContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Original {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "width")
                    protected Integer width;
                    @XmlAttribute(name = "height")
                    protected Integer height;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the width property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getWidth() {
                        return width;
                    }

                    /**
                     * Sets the value of the width property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setWidth(Integer value) {
                        this.width = value;
                    }

                    /**
                     * Gets the value of the height property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getHeight() {
                        return height;
                    }

                    /**
                     * Sets the value of the height property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setHeight(Integer value) {
                        this.height = value;
                    }

                }

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
             *         &lt;element name="original"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="thumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "original",
                "thumb"
            })
            public static class Screenshot {

                @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
                protected GetGameResponse.Game.Images.Screenshot.Original original;
                @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/game", required = true)
                protected String thumb;

                /**
                 * Gets the value of the original property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetGameResponse.Game.Images.Screenshot.Original }
                 *     
                 */
                public GetGameResponse.Game.Images.Screenshot.Original getOriginal() {
                    return original;
                }

                /**
                 * Sets the value of the original property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetGameResponse.Game.Images.Screenshot.Original }
                 *     
                 */
                public void setOriginal(GetGameResponse.Game.Images.Screenshot.Original value) {
                    this.original = value;
                }

                /**
                 * Gets the value of the thumb property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getThumb() {
                    return thumb;
                }

                /**
                 * Sets the value of the thumb property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setThumb(String value) {
                    this.thumb = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/simpleContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Original {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "width")
                    protected Integer width;
                    @XmlAttribute(name = "height")
                    protected Integer height;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the width property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getWidth() {
                        return width;
                    }

                    /**
                     * Sets the value of the width property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setWidth(Integer value) {
                        this.width = value;
                    }

                    /**
                     * Gets the value of the height property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getHeight() {
                        return height;
                    }

                    /**
                     * Sets the value of the height property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setHeight(Integer value) {
                        this.height = value;
                    }

                }

            }

        }

    }

}
