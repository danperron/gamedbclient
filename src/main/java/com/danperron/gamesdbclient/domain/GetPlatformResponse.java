
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
    "platform"
})
@XmlRootElement(name = "Data", namespace = "http://danperron.com/gamesdbclient/domain")
public class GetPlatformResponse {

    @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String baseImgUrl;
    @XmlElement(name = "Platform", namespace = "http://danperron.com/gamesdbclient/domain", required = true)
    protected GetPlatformResponse.Platform platform;

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
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link GetPlatformResponse.Platform }
     *     
     */
    public GetPlatformResponse.Platform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPlatformResponse.Platform }
     *     
     */
    public void setPlatform(GetPlatformResponse.Platform value) {
        this.platform = value;
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
     *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="console" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *         &lt;element name="controller" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *         &lt;element name="overview" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="developer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cpu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="graphics" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sound" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="display" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="media" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="maxcontrollers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
     *                   &lt;element name="boxart"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="banner"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="consoleart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="controllerart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "platform",
        "console",
        "controller",
        "overview",
        "developer",
        "manufacturer",
        "cpu",
        "memory",
        "graphics",
        "sound",
        "display",
        "media",
        "maxcontrollers",
        "rating",
        "images"
    })
    public static class Platform {

        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform")
        protected long id;
        @XmlElement(name = "Platform", namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String platform;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String console;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String controller;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String overview;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String developer;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String manufacturer;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String cpu;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String memory;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String graphics;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String sound;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String display;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected String media;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform")
        protected int maxcontrollers;
        @XmlElement(name = "Rating", namespace = "http://danperron.com/gamesdbclient/getplatform")
        protected float rating;
        @XmlElement(name = "Images", namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
        protected GetPlatformResponse.Platform.Images images;

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
         * Gets the value of the console property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsole() {
            return console;
        }

        /**
         * Sets the value of the console property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsole(String value) {
            this.console = value;
        }

        /**
         * Gets the value of the controller property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getController() {
            return controller;
        }

        /**
         * Sets the value of the controller property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setController(String value) {
            this.controller = value;
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
         * Gets the value of the manufacturer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturer() {
            return manufacturer;
        }

        /**
         * Sets the value of the manufacturer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturer(String value) {
            this.manufacturer = value;
        }

        /**
         * Gets the value of the cpu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpu() {
            return cpu;
        }

        /**
         * Sets the value of the cpu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpu(String value) {
            this.cpu = value;
        }

        /**
         * Gets the value of the memory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemory() {
            return memory;
        }

        /**
         * Sets the value of the memory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemory(String value) {
            this.memory = value;
        }

        /**
         * Gets the value of the graphics property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGraphics() {
            return graphics;
        }

        /**
         * Sets the value of the graphics property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGraphics(String value) {
            this.graphics = value;
        }

        /**
         * Gets the value of the sound property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSound() {
            return sound;
        }

        /**
         * Sets the value of the sound property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSound(String value) {
            this.sound = value;
        }

        /**
         * Gets the value of the display property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplay() {
            return display;
        }

        /**
         * Sets the value of the display property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplay(String value) {
            this.display = value;
        }

        /**
         * Gets the value of the media property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedia() {
            return media;
        }

        /**
         * Sets the value of the media property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedia(String value) {
            this.media = value;
        }

        /**
         * Gets the value of the maxcontrollers property.
         * 
         */
        public int getMaxcontrollers() {
            return maxcontrollers;
        }

        /**
         * Sets the value of the maxcontrollers property.
         * 
         */
        public void setMaxcontrollers(int value) {
            this.maxcontrollers = value;
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
         *     {@link GetPlatformResponse.Platform.Images }
         *     
         */
        public GetPlatformResponse.Platform.Images getImages() {
            return images;
        }

        /**
         * Sets the value of the images property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetPlatformResponse.Platform.Images }
         *     
         */
        public void setImages(GetPlatformResponse.Platform.Images value) {
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
         *         &lt;element name="boxart"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="banner"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="consoleart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="controllerart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "consoleart",
            "controllerart"
        })
        public static class Images {

            @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform")
            protected List<GetPlatformResponse.Platform.Images.Fanart> fanart;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
            protected GetPlatformResponse.Platform.Images.Boxart boxart;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
            protected GetPlatformResponse.Platform.Images.Banner banner;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
            protected String consoleart;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
            protected String controllerart;

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
             * {@link GetPlatformResponse.Platform.Images.Fanart }
             * 
             * 
             */
            public List<GetPlatformResponse.Platform.Images.Fanart> getFanart() {
                if (fanart == null) {
                    fanart = new ArrayList<GetPlatformResponse.Platform.Images.Fanart>();
                }
                return this.fanart;
            }

            /**
             * Gets the value of the boxart property.
             * 
             * @return
             *     possible object is
             *     {@link GetPlatformResponse.Platform.Images.Boxart }
             *     
             */
            public GetPlatformResponse.Platform.Images.Boxart getBoxart() {
                return boxart;
            }

            /**
             * Sets the value of the boxart property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetPlatformResponse.Platform.Images.Boxart }
             *     
             */
            public void setBoxart(GetPlatformResponse.Platform.Images.Boxart value) {
                this.boxart = value;
            }

            /**
             * Gets the value of the banner property.
             * 
             * @return
             *     possible object is
             *     {@link GetPlatformResponse.Platform.Images.Banner }
             *     
             */
            public GetPlatformResponse.Platform.Images.Banner getBanner() {
                return banner;
            }

            /**
             * Sets the value of the banner property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetPlatformResponse.Platform.Images.Banner }
             *     
             */
            public void setBanner(GetPlatformResponse.Platform.Images.Banner value) {
                this.banner = value;
            }

            /**
             * Gets the value of the consoleart property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConsoleart() {
                return consoleart;
            }

            /**
             * Sets the value of the consoleart property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConsoleart(String value) {
                this.consoleart = value;
            }

            /**
             * Gets the value of the controllerart property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getControllerart() {
                return controllerart;
            }

            /**
             * Sets the value of the controllerart property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setControllerart(String value) {
                this.controllerart = value;
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

                @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
                protected GetPlatformResponse.Platform.Images.Fanart.Original original;
                @XmlElement(namespace = "http://danperron.com/gamesdbclient/getplatform", required = true)
                protected String thumb;

                /**
                 * Gets the value of the original property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetPlatformResponse.Platform.Images.Fanart.Original }
                 *     
                 */
                public GetPlatformResponse.Platform.Images.Fanart.Original getOriginal() {
                    return original;
                }

                /**
                 * Sets the value of the original property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetPlatformResponse.Platform.Images.Fanart.Original }
                 *     
                 */
                public void setOriginal(GetPlatformResponse.Platform.Images.Fanart.Original value) {
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
