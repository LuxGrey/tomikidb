```plantuml
@startuml
hide empty description
[*] --> ArtistList
ArtistList -> ArtistDetails : view details
ArtistDetails -> ArtistList : go back
ArtistList -> TagList
TagList -> ArtistList
ArtistList -> ProfileTypeList
ProfileTypeList -> ArtistList
TagList -> ProfileTypeList
ProfileTypeList -> TagList
@enduml
```