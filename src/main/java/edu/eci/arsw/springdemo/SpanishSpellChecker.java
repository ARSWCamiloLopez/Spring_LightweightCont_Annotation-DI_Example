package edu.eci.arsw.springdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author camilolopez
 */
@Service
public class SpanishSpellChecker implements SpellChecker {

    /**
     *
     * @param text
     * @return
     */
    @Override
    public String checkSpell(String text) {
        return "revisando (" + text + ") con el verificador de sintaxis del espanol";

    }

}
