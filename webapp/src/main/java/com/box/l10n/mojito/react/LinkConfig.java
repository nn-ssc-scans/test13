package com.box.l10n.mojito.react;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("l10n")
public class LinkConfig {

  Map<String, RepositoryConfig> link = new HashMap<>();

  public Map<String, RepositoryConfig> getLink() {
    return link;
  }

  public void setLinks(Map<String, RepositoryConfig> link) {
    this.link = link;
  }
}
