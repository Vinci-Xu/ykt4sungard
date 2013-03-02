/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Thu May 11 11:57:13 CST 2006 by MyEclipse Hibernate Tool.
 */
package com.kingstargroup.conference.hibernate.form;

import java.io.Serializable;

/**
 * A class that represents a row in the T_PIF_DEVICE table. 
 * You can customize the behavior of this class by editing the class, {@link TPifDevice()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractTPifDevice 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer deviceId;

    /** The value of the simple deviceName property. */
    private java.lang.String deviceName;

    /** The value of the simple dev999Id property. */
    private java.lang.String dev999Id;

    /** The value of the simple devphy999Id property. */
    private java.lang.String devphy999Id;

    /** The value of the simple dev999No property. */
    private java.lang.Integer dev999No;

    /** The value of the simple devtype property. */
    private java.lang.String devtype;

    /** The value of the simple devversion property. */
    private java.lang.String devversion;

    /** The value of the simple cardstr property. */
    private java.lang.String cardstr;

    /** The value of the simple cardtype property. */
    private java.lang.String cardtype;

    /** The value of the simple portcount property. */
    private java.lang.Integer portcount;

    /** The value of the simple fdevphyId property. */
    private java.lang.String fdevphyId;

    /** The value of the simple portno property. */
    private java.lang.Integer portno;

    /** The value of the simple stateId property. */
    private java.lang.Integer stateId;

    /** The value of the simple joinmode property. */
    private java.lang.Integer joinmode;

    /** The value of the simple comadd property. */
    private java.lang.String comadd;

    /** The value of the simple port property. */
    private java.lang.String port;

    /** The value of the simple baudrate property. */
    private java.lang.Integer baudrate;

    /** The value of the simple comtype property. */
    private java.lang.Integer comtype;

    /** The value of the simple bsheetvdate property. */
    private java.lang.String bsheetvdate;

    /** The value of the simple bsheetver property. */
    private java.lang.String bsheetver;

    /** The value of the simple lasttraserno property. */
    private java.lang.Integer lasttraserno;

    /** The value of the simple lasttradate property. */
    private java.lang.String lasttradate;

    /** The value of the simple lastshutserno property. */
    private java.lang.Integer lastshutserno;

    /** The value of the simple lastshutdate property. */
    private java.lang.String lastshutdate;

    /** The value of the simple syspwd property. */
    private java.lang.String syspwd;

    /** The value of the simple admpwd property. */
    private java.lang.String admpwd;

    /** The value of the simple pwdonoff property. */
    private java.lang.Integer pwdonoff;

    /** The value of the simple puserno property. */
    private java.lang.String puserno;

    /** The value of the simple cardset property. */
    private java.lang.String cardset;

    /** The value of the simple funonoff property. */
    private java.lang.String funonoff;

    /** The value of the simple cardusenum property. */
    private java.lang.Integer cardusenum;

    /** The value of the simple maxdeposit property. */
    private java.lang.Integer maxdeposit;

    /** The value of the simple mindeposit property. */
    private java.lang.Integer mindeposit;

    /** The value of the simple ration property. */
    private java.lang.Integer ration;

    /** The value of the simple maxtrade property. */
    private java.lang.Integer maxtrade;

    /** The value of the simple shuttimes property. */
    private java.lang.String shuttimes;

    /** The value of the simple card65pwd property. */
    private java.lang.String card65pwd;

    /** The value of the simple authpwd property. */
    private java.lang.String authpwd;

    /** The value of the simple ftflag property. */
    private java.lang.Integer ftflag;

    /** The value of the simple feetype property. */
    private java.lang.Integer feetype;

    /** The value of the simple phytype property. */
    private java.lang.Integer phytype;

    /** The value of the simple webLevel property. */
    private java.lang.Integer webLevel;

    /** The value of the simple subsystemId property. */
    private java.lang.Integer subsystemId;

    /** The value of the simple area property. */
    private java.lang.Integer area;

    /** The value of the simple initKey property. */
    private java.lang.String initKey;

    /** The value of the simple manager property. */
    private java.lang.String manager;

    /** The value of the simple tel property. */
    private java.lang.String tel;

    /** The value of the simple address property. */
    private java.lang.String address;

    /** The value of the simple operateTime property. */
    private java.lang.String operateTime;

    /** The value of the simple comments property. */
    private java.lang.String comments;

    /** The value of the simple isFeeCode property. */
    private java.lang.Integer isFeeCode;

    /** The value of the simple modeCode property. */
    private java.lang.Integer modeCode;

    /** The value of the simple openTime1 property. */
    private java.lang.Integer openTime1;

    /** The value of the simple openTime2 property. */
    private java.lang.Integer openTime2;

    /** The value of the simple isAlleyway property. */
    private java.lang.String isAlleyway;

    /** The value of the simple isSaveData property. */
    private java.lang.String isSaveData;

    /** The value of the simple isLcdDisplay property. */
    private java.lang.String isLcdDisplay;

    /** The value of the simple devUsage property. */
    private java.lang.Integer devUsage;

    /**
     * Simple constructor of AbstractTPifDevice instances.
     */
    public AbstractTPifDevice()
    {
    }

    /**
     * Constructor of AbstractTPifDevice instances given a simple primary key.
     * @param deviceId
     */
    public AbstractTPifDevice(java.lang.Integer deviceId)
    {
        this.setDeviceId(deviceId);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getDeviceId()
    {
        return deviceId;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param deviceId
     */
    public void setDeviceId(java.lang.Integer deviceId)
    {
        this.hashValue = 0;
        this.deviceId = deviceId;
    }

    /**
     * Return the value of the DEVICE_NAME column.
     * @return java.lang.String
     */
    public java.lang.String getDeviceName()
    {
        return this.deviceName;
    }

    /**
     * Set the value of the DEVICE_NAME column.
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName)
    {
        this.deviceName = deviceName;
    }

    /**
     * Return the value of the DEV999_ID column.
     * @return java.lang.String
     */
    public java.lang.String getDev999Id()
    {
        return this.dev999Id;
    }

    /**
     * Set the value of the DEV999_ID column.
     * @param dev999Id
     */
    public void setDev999Id(java.lang.String dev999Id)
    {
        this.dev999Id = dev999Id;
    }

    /**
     * Return the value of the DEVPHY999_ID column.
     * @return java.lang.String
     */
    public java.lang.String getDevphy999Id()
    {
        return this.devphy999Id;
    }

    /**
     * Set the value of the DEVPHY999_ID column.
     * @param devphy999Id
     */
    public void setDevphy999Id(java.lang.String devphy999Id)
    {
        this.devphy999Id = devphy999Id;
    }

    /**
     * Return the value of the DEV999_NO column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getDev999No()
    {
        return this.dev999No;
    }

    /**
     * Set the value of the DEV999_NO column.
     * @param dev999No
     */
    public void setDev999No(java.lang.Integer dev999No)
    {
        this.dev999No = dev999No;
    }

    /**
     * Return the value of the DEVTYPE column.
     * @return java.lang.String
     */
    public java.lang.String getDevtype()
    {
        return this.devtype;
    }

    /**
     * Set the value of the DEVTYPE column.
     * @param devtype
     */
    public void setDevtype(java.lang.String devtype)
    {
        this.devtype = devtype;
    }

    /**
     * Return the value of the DEVVERSION column.
     * @return java.lang.String
     */
    public java.lang.String getDevversion()
    {
        return this.devversion;
    }

    /**
     * Set the value of the DEVVERSION column.
     * @param devversion
     */
    public void setDevversion(java.lang.String devversion)
    {
        this.devversion = devversion;
    }

    /**
     * Return the value of the CARDSTR column.
     * @return java.lang.String
     */
    public java.lang.String getCardstr()
    {
        return this.cardstr;
    }

    /**
     * Set the value of the CARDSTR column.
     * @param cardstr
     */
    public void setCardstr(java.lang.String cardstr)
    {
        this.cardstr = cardstr;
    }

    /**
     * Return the value of the CARDTYPE column.
     * @return java.lang.String
     */
    public java.lang.String getCardtype()
    {
        return this.cardtype;
    }

    /**
     * Set the value of the CARDTYPE column.
     * @param cardtype
     */
    public void setCardtype(java.lang.String cardtype)
    {
        this.cardtype = cardtype;
    }

    /**
     * Return the value of the PORTCOUNT column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getPortcount()
    {
        return this.portcount;
    }

    /**
     * Set the value of the PORTCOUNT column.
     * @param portcount
     */
    public void setPortcount(java.lang.Integer portcount)
    {
        this.portcount = portcount;
    }

    /**
     * Return the value of the FDEVPHY_ID column.
     * @return java.lang.String
     */
    public java.lang.String getFdevphyId()
    {
        return this.fdevphyId;
    }

    /**
     * Set the value of the FDEVPHY_ID column.
     * @param fdevphyId
     */
    public void setFdevphyId(java.lang.String fdevphyId)
    {
        this.fdevphyId = fdevphyId;
    }

    /**
     * Return the value of the PORTNO column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getPortno()
    {
        return this.portno;
    }

    /**
     * Set the value of the PORTNO column.
     * @param portno
     */
    public void setPortno(java.lang.Integer portno)
    {
        this.portno = portno;
    }

    /**
     * Return the value of the STATE_ID column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getStateId()
    {
        return this.stateId;
    }

    /**
     * Set the value of the STATE_ID column.
     * @param stateId
     */
    public void setStateId(java.lang.Integer stateId)
    {
        this.stateId = stateId;
    }

    /**
     * Return the value of the JOINMODE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getJoinmode()
    {
        return this.joinmode;
    }

    /**
     * Set the value of the JOINMODE column.
     * @param joinmode
     */
    public void setJoinmode(java.lang.Integer joinmode)
    {
        this.joinmode = joinmode;
    }

    /**
     * Return the value of the COMADD column.
     * @return java.lang.String
     */
    public java.lang.String getComadd()
    {
        return this.comadd;
    }

    /**
     * Set the value of the COMADD column.
     * @param comadd
     */
    public void setComadd(java.lang.String comadd)
    {
        this.comadd = comadd;
    }

    /**
     * Return the value of the PORT column.
     * @return java.lang.String
     */
    public java.lang.String getPort()
    {
        return this.port;
    }

    /**
     * Set the value of the PORT column.
     * @param port
     */
    public void setPort(java.lang.String port)
    {
        this.port = port;
    }

    /**
     * Return the value of the BAUDRATE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getBaudrate()
    {
        return this.baudrate;
    }

    /**
     * Set the value of the BAUDRATE column.
     * @param baudrate
     */
    public void setBaudrate(java.lang.Integer baudrate)
    {
        this.baudrate = baudrate;
    }

    /**
     * Return the value of the COMTYPE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getComtype()
    {
        return this.comtype;
    }

    /**
     * Set the value of the COMTYPE column.
     * @param comtype
     */
    public void setComtype(java.lang.Integer comtype)
    {
        this.comtype = comtype;
    }

    /**
     * Return the value of the BSHEETVDATE column.
     * @return java.lang.String
     */
    public java.lang.String getBsheetvdate()
    {
        return this.bsheetvdate;
    }

    /**
     * Set the value of the BSHEETVDATE column.
     * @param bsheetvdate
     */
    public void setBsheetvdate(java.lang.String bsheetvdate)
    {
        this.bsheetvdate = bsheetvdate;
    }

    /**
     * Return the value of the BSHEETVER column.
     * @return java.lang.String
     */
    public java.lang.String getBsheetver()
    {
        return this.bsheetver;
    }

    /**
     * Set the value of the BSHEETVER column.
     * @param bsheetver
     */
    public void setBsheetver(java.lang.String bsheetver)
    {
        this.bsheetver = bsheetver;
    }

    /**
     * Return the value of the LASTTRASERNO column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getLasttraserno()
    {
        return this.lasttraserno;
    }

    /**
     * Set the value of the LASTTRASERNO column.
     * @param lasttraserno
     */
    public void setLasttraserno(java.lang.Integer lasttraserno)
    {
        this.lasttraserno = lasttraserno;
    }

    /**
     * Return the value of the LASTTRADATE column.
     * @return java.lang.String
     */
    public java.lang.String getLasttradate()
    {
        return this.lasttradate;
    }

    /**
     * Set the value of the LASTTRADATE column.
     * @param lasttradate
     */
    public void setLasttradate(java.lang.String lasttradate)
    {
        this.lasttradate = lasttradate;
    }

    /**
     * Return the value of the LASTSHUTSERNO column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getLastshutserno()
    {
        return this.lastshutserno;
    }

    /**
     * Set the value of the LASTSHUTSERNO column.
     * @param lastshutserno
     */
    public void setLastshutserno(java.lang.Integer lastshutserno)
    {
        this.lastshutserno = lastshutserno;
    }

    /**
     * Return the value of the LASTSHUTDATE column.
     * @return java.lang.String
     */
    public java.lang.String getLastshutdate()
    {
        return this.lastshutdate;
    }

    /**
     * Set the value of the LASTSHUTDATE column.
     * @param lastshutdate
     */
    public void setLastshutdate(java.lang.String lastshutdate)
    {
        this.lastshutdate = lastshutdate;
    }

    /**
     * Return the value of the SYSPWD column.
     * @return java.lang.String
     */
    public java.lang.String getSyspwd()
    {
        return this.syspwd;
    }

    /**
     * Set the value of the SYSPWD column.
     * @param syspwd
     */
    public void setSyspwd(java.lang.String syspwd)
    {
        this.syspwd = syspwd;
    }

    /**
     * Return the value of the ADMPWD column.
     * @return java.lang.String
     */
    public java.lang.String getAdmpwd()
    {
        return this.admpwd;
    }

    /**
     * Set the value of the ADMPWD column.
     * @param admpwd
     */
    public void setAdmpwd(java.lang.String admpwd)
    {
        this.admpwd = admpwd;
    }

    /**
     * Return the value of the PWDONOFF column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getPwdonoff()
    {
        return this.pwdonoff;
    }

    /**
     * Set the value of the PWDONOFF column.
     * @param pwdonoff
     */
    public void setPwdonoff(java.lang.Integer pwdonoff)
    {
        this.pwdonoff = pwdonoff;
    }

    /**
     * Return the value of the PUSERNO column.
     * @return java.lang.String
     */
    public java.lang.String getPuserno()
    {
        return this.puserno;
    }

    /**
     * Set the value of the PUSERNO column.
     * @param puserno
     */
    public void setPuserno(java.lang.String puserno)
    {
        this.puserno = puserno;
    }

    /**
     * Return the value of the CARDSET column.
     * @return java.lang.String
     */
    public java.lang.String getCardset()
    {
        return this.cardset;
    }

    /**
     * Set the value of the CARDSET column.
     * @param cardset
     */
    public void setCardset(java.lang.String cardset)
    {
        this.cardset = cardset;
    }

    /**
     * Return the value of the FUNONOFF column.
     * @return java.lang.String
     */
    public java.lang.String getFunonoff()
    {
        return this.funonoff;
    }

    /**
     * Set the value of the FUNONOFF column.
     * @param funonoff
     */
    public void setFunonoff(java.lang.String funonoff)
    {
        this.funonoff = funonoff;
    }

    /**
     * Return the value of the CARDUSENUM column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getCardusenum()
    {
        return this.cardusenum;
    }

    /**
     * Set the value of the CARDUSENUM column.
     * @param cardusenum
     */
    public void setCardusenum(java.lang.Integer cardusenum)
    {
        this.cardusenum = cardusenum;
    }

    /**
     * Return the value of the MAXDEPOSIT column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getMaxdeposit()
    {
        return this.maxdeposit;
    }

    /**
     * Set the value of the MAXDEPOSIT column.
     * @param maxdeposit
     */
    public void setMaxdeposit(java.lang.Integer maxdeposit)
    {
        this.maxdeposit = maxdeposit;
    }

    /**
     * Return the value of the MINDEPOSIT column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getMindeposit()
    {
        return this.mindeposit;
    }

    /**
     * Set the value of the MINDEPOSIT column.
     * @param mindeposit
     */
    public void setMindeposit(java.lang.Integer mindeposit)
    {
        this.mindeposit = mindeposit;
    }

    /**
     * Return the value of the RATION column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getRation()
    {
        return this.ration;
    }

    /**
     * Set the value of the RATION column.
     * @param ration
     */
    public void setRation(java.lang.Integer ration)
    {
        this.ration = ration;
    }

    /**
     * Return the value of the MAXTRADE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getMaxtrade()
    {
        return this.maxtrade;
    }

    /**
     * Set the value of the MAXTRADE column.
     * @param maxtrade
     */
    public void setMaxtrade(java.lang.Integer maxtrade)
    {
        this.maxtrade = maxtrade;
    }

    /**
     * Return the value of the SHUTTIMES column.
     * @return java.lang.String
     */
    public java.lang.String getShuttimes()
    {
        return this.shuttimes;
    }

    /**
     * Set the value of the SHUTTIMES column.
     * @param shuttimes
     */
    public void setShuttimes(java.lang.String shuttimes)
    {
        this.shuttimes = shuttimes;
    }

    /**
     * Return the value of the CARD65PWD column.
     * @return java.lang.String
     */
    public java.lang.String getCard65pwd()
    {
        return this.card65pwd;
    }

    /**
     * Set the value of the CARD65PWD column.
     * @param card65pwd
     */
    public void setCard65pwd(java.lang.String card65pwd)
    {
        this.card65pwd = card65pwd;
    }

    /**
     * Return the value of the AUTHPWD column.
     * @return java.lang.String
     */
    public java.lang.String getAuthpwd()
    {
        return this.authpwd;
    }

    /**
     * Set the value of the AUTHPWD column.
     * @param authpwd
     */
    public void setAuthpwd(java.lang.String authpwd)
    {
        this.authpwd = authpwd;
    }

    /**
     * Return the value of the FTFLAG column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getFtflag()
    {
        return this.ftflag;
    }

    /**
     * Set the value of the FTFLAG column.
     * @param ftflag
     */
    public void setFtflag(java.lang.Integer ftflag)
    {
        this.ftflag = ftflag;
    }

    /**
     * Return the value of the FEETYPE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getFeetype()
    {
        return this.feetype;
    }

    /**
     * Set the value of the FEETYPE column.
     * @param feetype
     */
    public void setFeetype(java.lang.Integer feetype)
    {
        this.feetype = feetype;
    }

    /**
     * Return the value of the PHYTYPE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getPhytype()
    {
        return this.phytype;
    }

    /**
     * Set the value of the PHYTYPE column.
     * @param phytype
     */
    public void setPhytype(java.lang.Integer phytype)
    {
        this.phytype = phytype;
    }

    /**
     * Return the value of the WEB_LEVEL column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getWebLevel()
    {
        return this.webLevel;
    }

    /**
     * Set the value of the WEB_LEVEL column.
     * @param webLevel
     */
    public void setWebLevel(java.lang.Integer webLevel)
    {
        this.webLevel = webLevel;
    }

    /**
     * Return the value of the SUBSYSTEM_ID column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getSubsystemId()
    {
        return this.subsystemId;
    }

    /**
     * Set the value of the SUBSYSTEM_ID column.
     * @param subsystemId
     */
    public void setSubsystemId(java.lang.Integer subsystemId)
    {
        this.subsystemId = subsystemId;
    }

    /**
     * Return the value of the AREA column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getArea()
    {
        return this.area;
    }

    /**
     * Set the value of the AREA column.
     * @param area
     */
    public void setArea(java.lang.Integer area)
    {
        this.area = area;
    }

    /**
     * Return the value of the INIT_KEY column.
     * @return java.lang.String
     */
    public java.lang.String getInitKey()
    {
        return this.initKey;
    }

    /**
     * Set the value of the INIT_KEY column.
     * @param initKey
     */
    public void setInitKey(java.lang.String initKey)
    {
        this.initKey = initKey;
    }

    /**
     * Return the value of the MANAGER column.
     * @return java.lang.String
     */
    public java.lang.String getManager()
    {
        return this.manager;
    }

    /**
     * Set the value of the MANAGER column.
     * @param manager
     */
    public void setManager(java.lang.String manager)
    {
        this.manager = manager;
    }

    /**
     * Return the value of the TEL column.
     * @return java.lang.String
     */
    public java.lang.String getTel()
    {
        return this.tel;
    }

    /**
     * Set the value of the TEL column.
     * @param tel
     */
    public void setTel(java.lang.String tel)
    {
        this.tel = tel;
    }

    /**
     * Return the value of the ADDRESS column.
     * @return java.lang.String
     */
    public java.lang.String getAddress()
    {
        return this.address;
    }

    /**
     * Set the value of the ADDRESS column.
     * @param address
     */
    public void setAddress(java.lang.String address)
    {
        this.address = address;
    }

    /**
     * Return the value of the OPERATE_TIME column.
     * @return java.lang.String
     */
    public java.lang.String getOperateTime()
    {
        return this.operateTime;
    }

    /**
     * Set the value of the OPERATE_TIME column.
     * @param operateTime
     */
    public void setOperateTime(java.lang.String operateTime)
    {
        this.operateTime = operateTime;
    }

    /**
     * Return the value of the COMMENTS column.
     * @return java.lang.String
     */
    public java.lang.String getComments()
    {
        return this.comments;
    }

    /**
     * Set the value of the COMMENTS column.
     * @param comments
     */
    public void setComments(java.lang.String comments)
    {
        this.comments = comments;
    }

    /**
     * Return the value of the IS_FEE_CODE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getIsFeeCode()
    {
        return this.isFeeCode;
    }

    /**
     * Set the value of the IS_FEE_CODE column.
     * @param isFeeCode
     */
    public void setIsFeeCode(java.lang.Integer isFeeCode)
    {
        this.isFeeCode = isFeeCode;
    }

    /**
     * Return the value of the MODE_CODE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getModeCode()
    {
        return this.modeCode;
    }

    /**
     * Set the value of the MODE_CODE column.
     * @param modeCode
     */
    public void setModeCode(java.lang.Integer modeCode)
    {
        this.modeCode = modeCode;
    }

    /**
     * Return the value of the OPEN_TIME1 column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getOpenTime1()
    {
        return this.openTime1;
    }

    /**
     * Set the value of the OPEN_TIME1 column.
     * @param openTime1
     */
    public void setOpenTime1(java.lang.Integer openTime1)
    {
        this.openTime1 = openTime1;
    }

    /**
     * Return the value of the OPEN_TIME2 column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getOpenTime2()
    {
        return this.openTime2;
    }

    /**
     * Set the value of the OPEN_TIME2 column.
     * @param openTime2
     */
    public void setOpenTime2(java.lang.Integer openTime2)
    {
        this.openTime2 = openTime2;
    }

    /**
     * Return the value of the IS_ALLEYWAY column.
     * @return java.lang.String
     */
    public java.lang.String getIsAlleyway()
    {
        return this.isAlleyway;
    }

    /**
     * Set the value of the IS_ALLEYWAY column.
     * @param isAlleyway
     */
    public void setIsAlleyway(java.lang.String isAlleyway)
    {
        this.isAlleyway = isAlleyway;
    }

    /**
     * Return the value of the IS_SAVE_DATA column.
     * @return java.lang.String
     */
    public java.lang.String getIsSaveData()
    {
        return this.isSaveData;
    }

    /**
     * Set the value of the IS_SAVE_DATA column.
     * @param isSaveData
     */
    public void setIsSaveData(java.lang.String isSaveData)
    {
        this.isSaveData = isSaveData;
    }

    /**
     * Return the value of the IS_LCD_DISPLAY column.
     * @return java.lang.String
     */
    public java.lang.String getIsLcdDisplay()
    {
        return this.isLcdDisplay;
    }

    /**
     * Set the value of the IS_LCD_DISPLAY column.
     * @param isLcdDisplay
     */
    public void setIsLcdDisplay(java.lang.String isLcdDisplay)
    {
        this.isLcdDisplay = isLcdDisplay;
    }


    /**
     * Return the value of the DEV_USAGE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getDevUsage()
    {
        return this.devUsage;
    }

    /**
     * Set the value of the DEV_USAGE column.
     * @param devUsage
     */
    public void setDevUsage(java.lang.Integer devUsage)
    {
        this.devUsage = devUsage;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof TPifDevice))
            return false;
        TPifDevice that = (TPifDevice) rhs;
        if (this.getDeviceId() == null || that.getDeviceId() == null)
            return false;
        return (this.getDeviceId().equals(that.getDeviceId()));
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int deviceIdValue = this.getDeviceId() == null ? 0 : this.getDeviceId().hashCode();
            result = result * 37 + deviceIdValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}