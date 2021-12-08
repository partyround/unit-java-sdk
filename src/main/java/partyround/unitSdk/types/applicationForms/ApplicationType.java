package partyround.unit.types.applicationForms;

public enum ApplicationType {
  INDIVIDUAL("Individual"),
  SOLE_PROPRIETORSHIP("SoleProprietorship"),
  BUSINESS("Business");

  final String name;

  ApplicationType(String name) {
    this.name = name;
  }
}
