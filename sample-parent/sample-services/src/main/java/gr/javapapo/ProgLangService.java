/***********************************************************************************************************************
 * Copyright (c) 2014. Betiator.com All Rights Reserved.
 **********************************************************************************************************************/

package gr.javapapo;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Stateless Session bean related to Programming Languages
 * Created by papo on 2/15/15.
 */
@Stateless
public class ProgLangService{


    /**
     * Fetches all  Programming Languages, for the time being the
     * service does not call the DB layer, rather than creating a list
     * with data on the fly.
     * @return
     */
    public List<ProgLang> getAllLangs(){
        List<ProgLang> result = new ArrayList<>();
        ProgLang java = new ProgLang("java","James Gosling", 1995);
        ProgLang cLang = new ProgLang("c"," Dennis Ritchie", 1972);
        result.add(java);
        result.add(cLang);
        return result;
    }
}
