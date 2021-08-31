package com.example.randomuserlist.model

//data class RandomUser(
//    val name : String = "개발하는 정대리 🙊",
//    val description: String = "오늘도 빡코딩 하고 계신가요?",
//    val profileImage: String = "https://randomuser.me/api/portraits/women/72.jpg"
//)

data class RandomUser (
    val email: String,
    val picture: Picture,
    val name: Name,
){
    val profileImage: String = this.picture.thumbnail
    val fullName: String = this.name.title + ", " + this.name.last + " " + this.name.first
    val description: String = "email: ${this.email}"
}

data class Picture (
    val large: String,
    val medium: String,
    val thumbnail: String
)
data class Name (
    val title: String,
    val first: String,
    val last: String
)
