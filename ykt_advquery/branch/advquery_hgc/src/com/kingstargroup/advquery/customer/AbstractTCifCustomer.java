/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Wed Oct 19 14:04:21 CST 2005 by MyEclipse Hibernate Tool.
 */
package com.kingstargroup.advquery.customer;

import java.io.Serializable;

/**
 * A class that represents a row in the T_CIF_CUSTOMER table. 
 * You can customize the behavior of this class by editing the class, {@link TCifCustomer()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractTCifCustomer 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer cutId;

    /** The value of the simple cutType property. */
    private java.lang.Integer cutType;

    /** The value of the simple cutState property. */
    private java.lang.Integer cutState;

    /** The value of the simple cutName property. */
    private java.lang.String cutName;

    /** The value of the simple password property. */
    private java.lang.String password;

    /** The value of the simple area property. */
    private java.lang.Integer area;

    /** The value of the simple libCardid property. */
    private java.lang.String libCardid;

    /** The value of the simple isHavecard property. */
    private java.lang.String isHavecard;

    /** The value of the simple stuempNo property. */
    private java.lang.String stuempNo;

    /** The value of the simple classdeptNo property. */
    private java.lang.String classdeptNo;

    /** The value of the simple classdeptName property. */
    private java.lang.String classdeptName;

    /** The value of the simple sCode property. */
    private java.lang.String scode;

    /** The value of the simple man property. */
    private java.lang.String man;

    /** The value of the simple sex property. */
    private java.lang.String sex;

    /** The value of the simple nation property. */
    private java.lang.Integer nation;

    /** The value of the simple manId property. */
    private java.lang.String manId;

    /** The value of the simple tel property. */
    private java.lang.String tel;

    /** The value of the simple address property. */
    private java.lang.String address;

    /** The value of the simple regTime property. */
    private java.lang.String regTime;

    /** The value of the simple canTime property. */
    private java.lang.String canTime;

    /** The value of the simple comments property. */
    private java.lang.String comments;

    /** The value of the simple feeType property. */
    private java.lang.Integer feeType;

    /** The value of the simple batchNo property. */
    private java.lang.String batchNo;

    /** The value of the simple classNo property. */
    private java.lang.String classNo;

    /** The value of the simple medFeetype property. */
    private java.lang.String medFeetype;

    /** The value of the simple inDate property. */
    private java.lang.String inDate;

    /** The value of the simple buildingNo property. */
    private java.lang.String buildingNo;

    /** The value of the simple floorNo property. */
    private java.lang.String floorNo;

    /** The value of the simple roomNo property. */
    private java.lang.String roomNo;

    /** The value of the simple updDate property. */
    private java.lang.String updDate;

    /** The value of the simple updTime property. */
    private java.lang.String updTime;

    /** The value of the simple synTime property. */
    private java.lang.String synTime;

    /**
     * Simple constructor of AbstractTCifCustomer instances.
     */
    public AbstractTCifCustomer()
    {
    }

    /**
     * Constructor of AbstractTCifCustomer instances given a simple primary key.
     * @param cutId
     */
    public AbstractTCifCustomer(java.lang.Integer cutId)
    {
        this.setCutId(cutId);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getCutId()
    {
        return cutId;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param cutId
     */
    public void setCutId(java.lang.Integer cutId)
    {
        this.hashValue = 0;
        this.cutId = cutId;
    }

    /**
     * Return the value of the CUT_TYPE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getCutType()
    {
        return this.cutType;
    }

    /**
     * Set the value of the CUT_TYPE column.
     * @param cutType
     */
    public void setCutType(java.lang.Integer cutType)
    {
        this.cutType = cutType;
    }

    /**
     * Return the value of the CUT_STATE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getCutState()
    {
        return this.cutState;
    }

    /**
     * Set the value of the CUT_STATE column.
     * @param cutState
     */
    public void setCutState(java.lang.Integer cutState)
    {
        this.cutState = cutState;
    }

    /**
     * Return the value of the CUT_NAME column.
     * @return java.lang.String
     */
    public java.lang.String getCutName()
    {
        return this.cutName;
    }

    /**
     * Set the value of the CUT_NAME column.
     * @param cutName
     */
    public void setCutName(java.lang.String cutName)
    {
        this.cutName = cutName;
    }

    /**
     * Return the value of the PASSWORD column.
     * @return java.lang.String
     */
    public java.lang.String getPassword()
    {
        return this.password;
    }

    /**
     * Set the value of the PASSWORD column.
     * @param password
     */
    public void setPassword(java.lang.String password)
    {
        this.password = password;
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
     * Return the value of the LIB_CARDID column.
     * @return java.lang.String
     */
    public java.lang.String getLibCardid()
    {
        return this.libCardid;
    }

    /**
     * Set the value of the LIB_CARDID column.
     * @param libCardid
     */
    public void setLibCardid(java.lang.String libCardid)
    {
        this.libCardid = libCardid;
    }

    /**
     * Return the value of the IS_HAVECARD column.
     * @return java.lang.String
     */
    public java.lang.String getIsHavecard()
    {
        return this.isHavecard;
    }

    /**
     * Set the value of the IS_HAVECARD column.
     * @param isHavecard
     */
    public void setIsHavecard(java.lang.String isHavecard)
    {
        this.isHavecard = isHavecard;
    }

    /**
     * Return the value of the STUEMP_NO column.
     * @return java.lang.String
     */
    public java.lang.String getStuempNo()
    {
        return this.stuempNo;
    }

    /**
     * Set the value of the STUEMP_NO column.
     * @param stuempNo
     */
    public void setStuempNo(java.lang.String stuempNo)
    {
        this.stuempNo = stuempNo;
    }

    /**
     * Return the value of the CLASSDEPT_NO column.
     * @return java.lang.String
     */
    public java.lang.String getClassdeptNo()
    {
        return this.classdeptNo;
    }

    /**
     * Set the value of the CLASSDEPT_NO column.
     * @param classdeptNo
     */
    public void setClassdeptNo(java.lang.String classdeptNo)
    {
        this.classdeptNo = classdeptNo;
    }

    /**
     * Return the value of the CLASSDEPT_NAME column.
     * @return java.lang.String
     */
    public java.lang.String getClassdeptName()
    {
        return this.classdeptName;
    }

    /**
     * Set the value of the CLASSDEPT_NAME column.
     * @param classdeptName
     */
    public void setClassdeptName(java.lang.String classdeptName)
    {
        this.classdeptName = classdeptName;
    }

    /**
     * Return the value of the S_CODE column.
     * @return java.lang.String
     */
    public java.lang.String getScode()
    {
        return this.scode;
    }

    /**
     * Set the value of the S_CODE column.
     * @param sCode
     */
    public void setScode(java.lang.String sCode)
    {
        this.scode = sCode;
    }

    /**
     * Return the value of the MAN column.
     * @return java.lang.String
     */
    public java.lang.String getMan()
    {
        return this.man;
    }

    /**
     * Set the value of the MAN column.
     * @param man
     */
    public void setMan(java.lang.String man)
    {
        this.man = man;
    }

    /**
     * Return the value of the SEX column.
     * @return java.lang.String
     */
    public java.lang.String getSex()
    {
        return this.sex;
    }

    /**
     * Set the value of the SEX column.
     * @param sex
     */
    public void setSex(java.lang.String sex)
    {
        this.sex = sex;
    }

    /**
     * Return the value of the NATION column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getNation()
    {
        return this.nation;
    }

    /**
     * Set the value of the NATION column.
     * @param nation
     */
    public void setNation(java.lang.Integer nation)
    {
        this.nation = nation;
    }

    /**
     * Return the value of the MAN_ID column.
     * @return java.lang.String
     */
    public java.lang.String getManId()
    {
        return this.manId;
    }

    /**
     * Set the value of the MAN_ID column.
     * @param manId
     */
    public void setManId(java.lang.String manId)
    {
        this.manId = manId;
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
     * Return the value of the REG_TIME column.
     * @return java.lang.String
     */
    public java.lang.String getRegTime()
    {
        return this.regTime;
    }

    /**
     * Set the value of the REG_TIME column.
     * @param regTime
     */
    public void setRegTime(java.lang.String regTime)
    {
        this.regTime = regTime;
    }

    /**
     * Return the value of the CAN_TIME column.
     * @return java.lang.String
     */
    public java.lang.String getCanTime()
    {
        return this.canTime;
    }

    /**
     * Set the value of the CAN_TIME column.
     * @param canTime
     */
    public void setCanTime(java.lang.String canTime)
    {
        this.canTime = canTime;
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
     * Return the value of the FEE_TYPE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getFeeType()
    {
        return this.feeType;
    }

    /**
     * Set the value of the FEE_TYPE column.
     * @param feeType
     */
    public void setFeeType(java.lang.Integer feeType)
    {
        this.feeType = feeType;
    }

    /**
     * Return the value of the BATCH_NO column.
     * @return java.lang.String
     */
    public java.lang.String getBatchNo()
    {
        return this.batchNo;
    }

    /**
     * Set the value of the BATCH_NO column.
     * @param batchNo
     */
    public void setBatchNo(java.lang.String batchNo)
    {
        this.batchNo = batchNo;
    }

    /**
     * Return the value of the CLASS_NO column.
     * @return java.lang.String
     */
    public java.lang.String getClassNo()
    {
        return this.classNo;
    }

    /**
     * Set the value of the CLASS_NO column.
     * @param classNo
     */
    public void setClassNo(java.lang.String classNo)
    {
        this.classNo = classNo;
    }

    /**
     * Return the value of the MED_FEETYPE column.
     * @return java.lang.String
     */
    public java.lang.String getMedFeetype()
    {
        return this.medFeetype;
    }

    /**
     * Set the value of the MED_FEETYPE column.
     * @param medFeetype
     */
    public void setMedFeetype(java.lang.String medFeetype)
    {
        this.medFeetype = medFeetype;
    }

    /**
     * Return the value of the IN_DATE column.
     * @return java.lang.String
     */
    public java.lang.String getInDate()
    {
        return this.inDate;
    }

    /**
     * Set the value of the IN_DATE column.
     * @param inDate
     */
    public void setInDate(java.lang.String inDate)
    {
        this.inDate = inDate;
    }

    /**
     * Return the value of the BUILDING_NO column.
     * @return java.lang.String
     */
    public java.lang.String getBuildingNo()
    {
        return this.buildingNo;
    }

    /**
     * Set the value of the BUILDING_NO column.
     * @param buildingNo
     */
    public void setBuildingNo(java.lang.String buildingNo)
    {
        this.buildingNo = buildingNo;
    }

    /**
     * Return the value of the FLOOR_NO column.
     * @return java.lang.String
     */
    public java.lang.String getFloorNo()
    {
        return this.floorNo;
    }

    /**
     * Set the value of the FLOOR_NO column.
     * @param floorNo
     */
    public void setFloorNo(java.lang.String floorNo)
    {
        this.floorNo = floorNo;
    }

    /**
     * Return the value of the ROOM_NO column.
     * @return java.lang.String
     */
    public java.lang.String getRoomNo()
    {
        return this.roomNo;
    }

    /**
     * Set the value of the ROOM_NO column.
     * @param roomNo
     */
    public void setRoomNo(java.lang.String roomNo)
    {
        this.roomNo = roomNo;
    }

    /**
     * Return the value of the UPD_DATE column.
     * @return java.lang.String
     */
    public java.lang.String getUpdDate()
    {
        return this.updDate;
    }

    /**
     * Set the value of the UPD_DATE column.
     * @param updDate
     */
    public void setUpdDate(java.lang.String updDate)
    {
        this.updDate = updDate;
    }

    /**
     * Return the value of the UPD_TIME column.
     * @return java.lang.String
     */
    public java.lang.String getUpdTime()
    {
        return this.updTime;
    }

    /**
     * Set the value of the UPD_TIME column.
     * @param updTime
     */
    public void setUpdTime(java.lang.String updTime)
    {
        this.updTime = updTime;
    }

    /**
     * Return the value of the SYN_TIME column.
     * @return java.lang.String
     */
    public java.lang.String getSynTime()
    {
        return this.synTime;
    }

    /**
     * Set the value of the SYN_TIME column.
     * @param synTime
     */
    public void setSynTime(java.lang.String synTime)
    {
        this.synTime = synTime;
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
        if (! (rhs instanceof TCifCustomer))
            return false;
        TCifCustomer that = (TCifCustomer) rhs;
        if (this.getCutId() == null || that.getCutId() == null)
            return false;
        return (this.getCutId().equals(that.getCutId()));
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
            int cutIdValue = this.getCutId() == null ? 0 : this.getCutId().hashCode();
            result = result * 37 + cutIdValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}