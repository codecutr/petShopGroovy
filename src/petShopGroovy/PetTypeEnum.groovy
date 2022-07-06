package petShopGroovy

enum PetTypeEnum {
    DOG('Dog','Canine'),
    CAT('Cat','Feline'),

    final String id
    final String desc
    static final Map map

    static {
        map = [:] as TreeMap
        values().each{petType ->
            println "id: " + petType.id + ", desc:" + petType.desc
            map.put(petType.id, petType)
        }

    }

    private PetTypeEnum(String id, String desc) {
        this.id = id
        this.desc = desc
    }
}
