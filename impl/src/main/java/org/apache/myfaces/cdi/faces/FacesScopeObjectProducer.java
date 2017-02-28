/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.myfaces.cdi.faces;

import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.faces.annotation.HeaderMap;
import javax.faces.annotation.HeaderValuesMap;
import javax.faces.annotation.RequestCookieMap;
import javax.faces.annotation.RequestMap;
import javax.faces.annotation.RequestParameterMap;
import javax.faces.annotation.RequestParameterValuesMap;
import javax.faces.annotation.SessionMap;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

/**
 * This class produces all objects that are bound or related to FacesContext
 */
@ApplicationScoped
public class FacesScopeObjectProducer
{
    
   @Produces
   @FacesScoped 
   public FacesContext getFacesContext()
   {
      return FacesContext.getCurrentInstance();
   }
   
   @Produces
   @FacesScoped 
   public ExternalContext getExternalContext()
   {
      return FacesContext.getCurrentInstance().getExternalContext();
   }
   
   @Produces
   @FacesScoped 
   public Flash getFlash()
   {
      return FacesContext.getCurrentInstance().getExternalContext().getFlash();
   }
   
   @Produces
   @HeaderMap
   @FacesScoped
   public Map<String, String> getHeaderMap()
   {
       return FacesContext.getCurrentInstance().getExternalContext().getRequestHeaderMap();
   }

   @Produces
   @HeaderValuesMap
   @FacesScoped
   public Map<String, String[]> getHeaderValuesMap()
   {
       return FacesContext.getCurrentInstance().getExternalContext().getRequestHeaderValuesMap();
   }

   @Produces
   @RequestMap
   @FacesScoped
   public Map<String, Object> getRequestMap()
   {
       return FacesContext.getCurrentInstance().getExternalContext().getRequestMap();
   }   
   
   @Produces
   @RequestCookieMap
   @FacesScoped
   public Map<String, Object> getRequestCookieMap()
   {
       return FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
   }
   
   @Produces
   @RequestParameterMap
   @FacesScoped
   public Map<String, String> getRequestParameterMap()
   {
       return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
   }
   
   @Produces
   @RequestParameterValuesMap
   @FacesScoped
   public Map<String, String[]> getRequestParameterValuesMap()
   {
       return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterValuesMap();
   }   

   @Produces
   @SessionMap
   @FacesScoped
   public Map<String, Object> getSessionMap()
   {
       return FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
   }
   
}