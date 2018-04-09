/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.Collections;
import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.credential.CallerOnlyCredential;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStore;

/**
 *
 * @author Vano.Beridze
 */
@ApplicationScoped
public class MyIdentityStore implements IdentityStore {

    @Override
    public CredentialValidationResult validate(Credential credential) {

        CallerOnlyCredential callerOnlyCredential = (CallerOnlyCredential) credential;
        String token = callerOnlyCredential.getCaller();
        if ("1234567890".equals(token)) {
            return new CredentialValidationResult("user", Collections.EMPTY_SET);
        }
        return CredentialValidationResult.INVALID_RESULT;
    }

}
