package com.KtorApp.repos

import com.KtorApp.data.model.ApiResponse
import com.KtorApp.data.model.Property

class PropRepoImp :propertyrepo{
    override val theProperites: Map<Int, List<Property>> by lazy {
mapOf(
    1 to page1
    ,2 to page2
    ,3 to page3
    ,4 to page4
    ,5 to page5
)


      }


    override val page1= listOf(
        Property(id=1,
            title ="apartment for sale in smouha",
            price =3000000,
            Description ="200m apartment for sale in smouha",
            type = "residential",
            bedrooms = 3,
            bathrooms = 2,
            image = "/images/apartment1",
            rating =5.0),

                Property(id=2,
        title ="apartment for sale in miami",
        price =2300000,
        Description ="170m apartment for sale in miami",
        type = "residential",
        bedrooms = 2,
        bathrooms = 2,
        image = "/images/apartment2",
                    rating =5.0),
        Property(id=3,
            title ="villa for sale in roshdy",
            price =13000000,
            Description ="250m villa for sale in roshdy",
            type = "residential",
            bedrooms = 5,
            bathrooms = 3,
            image = "/images/apartmnet3", rating =5.0)
    )




    override val page2= listOf(
        Property(id=4,
            title ="apartment for sale in miami",
            price =950000,
            Description ="100m apartment for sale in miami",
            type = "residential",
            bedrooms = 2,
            bathrooms = 2,
            image = "/images/apartment4", rating =5.0),
        Property(id=5,
            title ="apartment for sale in mamora",
            price =800000,
            Description ="120m apartment for sale in mamora",
            type = "residential",
            bedrooms = 2,
            bathrooms = 1,
            image = "/images/apartment5", rating =5.0),
        Property(id=6,
            title ="apartment for sale in mandara",
            price =1500000,
            Description ="140m apartment for sale in mandara",
            type = "residential",
            bedrooms = 3,
            bathrooms = 2,
            image = "/images/apartment6", rating =5.0)


    )
    override val page3= listOf(
        Property(id=7,
            title ="villa for sale in stanly",
            price =18000000,
            Description ="220m villa for sale in stanly",
            type = "residential",
            bedrooms = 4,
            bathrooms = 3,
            image = "/images/apartment7", rating =5.0),
        Property(id=8,
            title ="villa for sale in 5th settlement",
            price =22000000,
            Description ="240m villa for sale in 5th settlement",
            type = "residential",
            bedrooms = 5,
            bathrooms = 3,
            image = "/images/apartment8", rating =5.0),
        Property(id=9,
            title ="apartment for sale in dokki",
            price =800000,
            Description ="110m apartment for sale in dokki",
            type = "residential",
            bedrooms = 2,
            bathrooms = 2,
            image = "/images/apartment9", rating =5.0)


    )
    override val page4= listOf(
        Property(id=10,
            title ="apartment for sale in shorouk",
            price =1700000,
            Description ="150m apartment for sale in shouruk",
            type = "residential",
            bedrooms = 3,
            bathrooms = 2,
            image = "/images/apartment10", rating =5.0),
        Property(id=11,
            title ="apartment for sale in sheikh zayed",
            price =2200000,
            Description ="110m apartment for sale in sheikh zayed",
            type = "residential",
            bedrooms = 3,
            bathrooms = 2,
            image = "/images/apartment11", rating =5.0),
        Property(id=12,
            title ="apartment for sale in sidi beshr",
            price =700000,
            Description ="180m apartment for sale in sidi beshr",
            type = "residential",
            bedrooms = 3,
            bathrooms = 2,
            image = "/images/apartment12", rating =5.0)


    )
    override val page5= listOf(
        Property(id=13,
            title ="apartment for sale in Nasr City",
            price =1700000,
            Description ="150m apartment for sale in Nasr City",
            type = "residential",
            bedrooms = 3,
            bathrooms = 2,
            image = "/images/apartment13", rating =5.0),
        Property(id=14,
            title ="apartment for sale in 6th october",
            price =2200000,
            Description ="110m apartment for sale in 6th october",
            type = "residential",
            bedrooms = 3,
            bathrooms = 2,
            image = "/images/apartment14", rating =5.0),
        Property(id=15,
            title ="apartment for sale in awayed",
            price =700000,
            Description ="180m apartment for sale in awayed",
            type = "residential",
            bedrooms = 2,
            bathrooms = 1,
            image = "/images/apartment15", rating =5.0)


    )

    override suspend fun getAllProperties(page: Int): ApiResponse {
        return ApiResponse(
           success = true,
            message = "ok",
            nextpage = calculatepage(page=page)["nextpage"],
            prevpage = calculatepage(page=page)["prevpage"],
            properties = theProperites[page]!!


        )

    }
private fun calculatepage(page: Int):Map<String,Int?>{
    var nextpage :Int? = page
    var prevpage :Int? = page
    if (page in 1..4){
        nextpage = nextpage?.plus(1)
    }
    if (page in 2..5){
        prevpage = prevpage?.minus(1)
    }
    if (page ==1){
        prevpage =null
    }
if (page ==5){
    nextpage= null
}


return mapOf("nextpage" to nextpage,"prevpage" to prevpage)
}
    override suspend fun searchProperties(name: String?): ApiResponse {
        return ApiResponse(success = true,
            message = "ok"
            , properties = findproperty(query = name))
    }


    private fun findproperty(query: String?):List<Property>{
        val founded = mutableListOf<Property>()
        return if(!query.isNullOrEmpty()){
      theProperites.forEach {( _, property) ->
          property.forEach { property ->
              if (property.Description.contains(query)) {
                  founded.add(property)

              }
          }

      }
            founded
        } else {
            emptyList()
        }


    }





}




