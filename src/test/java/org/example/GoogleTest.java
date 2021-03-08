package org.example;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ArquillianExtension.class)
@RunAsClient
class GoogleTest {

    @Page
    GooglePage googlePage;

    @BeforeEach
    void openGoogle() {
        Graphene.goTo(GooglePage.class);
    }

    @Test
    void testOpeningHomePage() {
        String pageTitle = googlePage.getTitle();
        Assertions.assertEquals(pageTitle, "Google");
    }
}
