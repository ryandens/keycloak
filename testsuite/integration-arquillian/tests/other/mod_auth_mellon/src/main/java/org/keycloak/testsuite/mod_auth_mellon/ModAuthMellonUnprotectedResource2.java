package org.keycloak.testsuite.mod_auth_mellon;

import io.github.pixee.security.HostValidator;
import io.github.pixee.security.Urls;
import org.keycloak.testsuite.page.AbstractPageWithInjectedUrl;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author mhajas
 */
public class ModAuthMellonUnprotectedResource2 extends AbstractPageWithInjectedUrl {

    @Override
    public URL getInjectedUrl() {
        try {
            return Urls.create(System.getProperty("apache.mod_auth_mellon2.url", "https://app-saml-127-0-0-1.nip.io:8843/"), Urls.HTTP_PROTOCOLS, HostValidator.DENY_COMMON_INFRASTRUCTURE_TARGETS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
