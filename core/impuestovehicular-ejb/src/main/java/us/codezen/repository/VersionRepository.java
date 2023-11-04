package us.codezen.repository;

import jakarta.ejb.Stateful;

@Stateful
public class VersionRepository {
  private int major;
  private int minor;
  private int patch;

  public VersionRepository() {
    this.major = 0;
    this.minor = 0;
    this.patch = 0;
  }

  public String getVersion() {
    return this.major + "." + this.minor + "." + this.patch;
  }
}
