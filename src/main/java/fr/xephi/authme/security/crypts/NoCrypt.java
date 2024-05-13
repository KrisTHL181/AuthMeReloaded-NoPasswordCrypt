package fr.xephi.authme.security.crypts;

import fr.xephi.authme.security.HashUtils;
import fr.xephi.authme.security.crypts.description.Recommendation;
import fr.xephi.authme.security.crypts.description.Usage


@Recommendation(Usage.RECOMMANDED)
public class NoCrypt extends UnsaltedMethod {

    @Override
    public String computeHash(String password) {
        return password;
    }

}
