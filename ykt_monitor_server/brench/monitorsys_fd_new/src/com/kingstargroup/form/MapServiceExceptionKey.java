/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Mon Nov 13 14:23:51 CST 2006 by MyEclipse Hibernate Tool.
 */
package com.kingstargroup.form;

import java.io.Serializable;

/**
 * A class representing a composite primary key id for the MAP_SERVICE_EXCEPTION
 * table.  This object should only be instantiated for use with instances 
 * of the MapServiceException class.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized 
 * by MyEclipse Hibernate tool integration.
 */
public class MapServiceExceptionKey
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private volatile int hashValue = 0;

    /** The value of the ANALYSISTIME component of this composite id. */
    private java.lang.String analysistime;

    /** The value of the SERVICE_ID component of this composite id. */
    private java.lang.Integer serviceId;

    /**
     * Simple constructor of MapServiceExceptionKey instances.
     */
    public MapServiceExceptionKey()
    {
    }

    /**
     * Returns the value of the analysistime property.
     * @return java.lang.String
     */
    public java.lang.String getAnalysistime()
    {
        return analysistime;
    }

    /**
     * Sets the value of the analysistime property.
     * @param analysistime
     */
    public void setAnalysistime(java.lang.String analysistime)
    {
        hashValue = 0;
        this.analysistime = analysistime;
    }

    /**
     * Returns the value of the serviceId property.
     * @return java.lang.Integer
     */
    public java.lang.Integer getServiceId()
    {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * @param serviceId
     */
    public void setServiceId(java.lang.Integer serviceId)
    {
        hashValue = 0;
        this.serviceId = serviceId;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the id components.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof MapServiceExceptionKey))
            return false;
        MapServiceExceptionKey that = (MapServiceExceptionKey) rhs;
        if (this.getAnalysistime() == null || that.getAnalysistime() == null)
        {
            return false;
        }
        if (! this.getAnalysistime().equals(that.getAnalysistime()))
        {
            return false;
        }
        if (this.getServiceId() == null || that.getServiceId() == null)
        {
            return false;
        }
        if (! this.getServiceId().equals(that.getServiceId()))
        {
            return false;
        }
        return true;
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
            int analysistimeValue = this.getAnalysistime() == null ? 0 : this.getAnalysistime().hashCode();
            result = result * 37 + analysistimeValue;
            int serviceIdValue = this.getServiceId() == null ? 0 : this.getServiceId().hashCode();
            result = result * 37 + serviceIdValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}