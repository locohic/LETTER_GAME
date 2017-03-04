package fr.esiea.unique.ahingora.nadeswaran.dictionary;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.unique.ahingora.nadeswaran.dictionary.IDictionary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test sample for Dictionary.
 */
public class DictionaryTest {

    private IDictionary dictionary;

    @Before
    public void setup() {
        //TODO
    }

    @Test
    public void testIsWord() {
        assertTrue(dictionary.isWord("maman"));
        assertFalse(dictionary.isWord("namam"));
    }
}
