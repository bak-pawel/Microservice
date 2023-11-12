package com.bak.paw;

import org.jetbrains.annotations.TestOnly;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>UnitTest class.</p>
 *
 * @author bakpaw
 * @version $Id: $Id
 * @since 1.0.0
 */
@TestOnly
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.TYPE})
@Tag("UnitTest")
@Test
public @interface UnitTest {
}
