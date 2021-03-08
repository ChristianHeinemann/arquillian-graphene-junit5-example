package org.example;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@RunAsClient
public class GoogleTest {

    @Page
    GooglePage googlePage;

    @Before
    public void openGoogle() {
        Graphene.goTo(GooglePage.class);
    }

    @Test
    public void testOpeningHomePage() {
        String pageTitle = googlePage.getTitle();
        Assert.assertEquals(pageTitle, "Google");
    }
}
