/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.thoughtworks.com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHandleStringWithSb() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.handleStringWithSb(), "app should handle String With string builder");
    }
}
