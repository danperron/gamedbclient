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


/**
 * Describes the response from GetArt call.
 * 
 * @author Dan Perron <danp3rr0n@gmail.com>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baseImgUrl",
    "images"
})
@XmlRootElement(name = "Data", namespace = "http://danperron.com/gamesdbclient/")
public class GetArtResponse {

    @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String baseImgUrl;
    @XmlElement(name = "Images", namespace = "http://danperron.com/gamesdbclient/domain", required = true)
    protected GetArtResponse.Images images;

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
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link GetArtResponse.Images }
     *     
     */
    public GetArtResponse.Images getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetArtResponse.Images }
     *     
     */
    public void setImages(GetArtResponse.Images value) {
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
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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
     *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                 &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="banner" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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
     *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
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

        @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art")
        protected List<GetArtResponse.Images.Fanart> fanart;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art")
        protected List<GetArtResponse.Images.Boxart> boxart;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art")
        protected List<GetArtResponse.Images.Banner> banner;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art", required = true)
        protected GetArtResponse.Images.Screenshot screenshot;
        @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art", required = true)
        protected GetArtResponse.Images.Clearlogo clearlogo;

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
         * {@link GetArtResponse.Images.Fanart }
         * 
         * 
         */
        public List<GetArtResponse.Images.Fanart> getFanart() {
            if (fanart == null) {
                fanart = new ArrayList<GetArtResponse.Images.Fanart>();
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
         * {@link GetArtResponse.Images.Boxart }
         * 
         * 
         */
        public List<GetArtResponse.Images.Boxart> getBoxart() {
            if (boxart == null) {
                boxart = new ArrayList<GetArtResponse.Images.Boxart>();
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
         * {@link GetArtResponse.Images.Banner }
         * 
         * 
         */
        public List<GetArtResponse.Images.Banner> getBanner() {
            if (banner == null) {
                banner = new ArrayList<GetArtResponse.Images.Banner>();
            }
            return this.banner;
        }

        /**
         * Gets the value of the screenshot property.
         * 
         * @return
         *     possible object is
         *     {@link GetArtResponse.Images.Screenshot }
         *     
         */
        public GetArtResponse.Images.Screenshot getScreenshot() {
            return screenshot;
        }

        /**
         * Sets the value of the screenshot property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetArtResponse.Images.Screenshot }
         *     
         */
        public void setScreenshot(GetArtResponse.Images.Screenshot value) {
            this.screenshot = value;
        }

        /**
         * Gets the value of the clearlogo property.
         * 
         * @return
         *     possible object is
         *     {@link GetArtResponse.Images.Clearlogo }
         *     
         */
        public GetArtResponse.Images.Clearlogo getClearlogo() {
            return clearlogo;
        }

        /**
         * Sets the value of the clearlogo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetArtResponse.Images.Clearlogo }
         *     
         */
        public void setClearlogo(GetArtResponse.Images.Clearlogo value) {
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
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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
            protected Short width;
            @XmlAttribute(name = "height")
            protected Short height;

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
             *     {@link Short }
             *     
             */
            public Short getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setWidth(Short value) {
                this.width = value;
            }

            /**
             * Gets the value of the height property.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setHeight(Short value) {
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
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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
            protected Short width;
            @XmlAttribute(name = "height")
            protected Short height;
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
             *     {@link Short }
             *     
             */
            public Short getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setWidth(Short value) {
                this.width = value;
            }

            /**
             * Gets the value of the height property.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setHeight(Short value) {
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
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
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
            protected Short width;
            @XmlAttribute(name = "height")
            protected Byte height;

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
             *     {@link Short }
             *     
             */
            public Short getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setWidth(Short value) {
                this.width = value;
            }

            /**
             * Gets the value of the height property.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setHeight(Byte value) {
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
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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

            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art", required = true)
            protected GetArtResponse.Images.Fanart.Original original;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art", required = true)
            protected String thumb;

            /**
             * Gets the value of the original property.
             * 
             * @return
             *     possible object is
             *     {@link GetArtResponse.Images.Fanart.Original }
             *     
             */
            public GetArtResponse.Images.Fanart.Original getOriginal() {
                return original;
            }

            /**
             * Sets the value of the original property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetArtResponse.Images.Fanart.Original }
             *     
             */
            public void setOriginal(GetArtResponse.Images.Fanart.Original value) {
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
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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
                protected Short width;
                @XmlAttribute(name = "height")
                protected Short height;

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
                 *     {@link Short }
                 *     
                 */
                public Short getWidth() {
                    return width;
                }

                /**
                 * Sets the value of the width property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setWidth(Short value) {
                    this.width = value;
                }

                /**
                 * Gets the value of the height property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Short }
                 *     
                 */
                public Short getHeight() {
                    return height;
                }

                /**
                 * Sets the value of the height property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setHeight(Short value) {
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
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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

            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art", required = true)
            protected GetArtResponse.Images.Screenshot.Original original;
            @XmlElement(namespace = "http://danperron.com/gamesdbclient/domain/art", required = true)
            protected String thumb;

            /**
             * Gets the value of the original property.
             * 
             * @return
             *     possible object is
             *     {@link GetArtResponse.Images.Screenshot.Original }
             *     
             */
            public GetArtResponse.Images.Screenshot.Original getOriginal() {
                return original;
            }

            /**
             * Sets the value of the original property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetArtResponse.Images.Screenshot.Original }
             *     
             */
            public void setOriginal(GetArtResponse.Images.Screenshot.Original value) {
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
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
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
                protected Short width;
                @XmlAttribute(name = "height")
                protected Short height;

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
                 *     {@link Short }
                 *     
                 */
                public Short getWidth() {
                    return width;
                }

                /**
                 * Sets the value of the width property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setWidth(Short value) {
                    this.width = value;
                }

                /**
                 * Gets the value of the height property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Short }
                 *     
                 */
                public Short getHeight() {
                    return height;
                }

                /**
                 * Sets the value of the height property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setHeight(Short value) {
                    this.height = value;
                }

            }

        }

    }

}
