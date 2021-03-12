```plantuml
@startuml
hide empty description
[*] --> ArtistList
ArtistList -down-> ArtistDetails : view details
ArtistDetails -up-> ArtistList : go back
ArtistList -> TagList
TagList -> ArtistList
ArtistList -> ProfileTypeList
ProfileTypeList -> ArtistList
TagList -> ProfileTypeList
ProfileTypeList -> TagList
@enduml
```