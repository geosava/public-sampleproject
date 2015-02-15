/***********************************************************************************************************************
 * Copyright (c) 2014. Betiator.com All Rights Reserved.
 **********************************************************************************************************************/

package gr.javapapo.web.jsf.sample;

import gr.javapapo.ProgLang;
import gr.javapapo.ProgLangService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * TODO Add Javadoc
 * Created by papo on 2/15/15.
 */
@ManagedBean(name="prolangtableview")
@ViewScoped
public class ProgLangTableBean{

    @EJB
    private ProgLangService langService;


    public List<ProgLang> getLangs() {
        return langService.getAllLangs();
    }

}
