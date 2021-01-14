package main

import (
	"github.com/gin-gonic/gin"
	"net/http"
)

type UserInfo struct {
	username string
	password string
}

//获取form表单提交的参数
func main() {
	r := gin.Default()
	r.LoadHTMLFiles("./login.html", "./index.html")


	r.GET("/user", func(c *gin.Context) {
		//username := c.Query("username")
		//password := c.Query("password")

		var u UserInfo
		err := c.ShouldBind(u)
		if err != nil {
			c.JSON(http.StatusBadRequest, gin.H{
				"error": err.Error(),
			})
		}else {
			c.JSON(http.StatusOK, gin.H{
				"status": "ok",
			})
		}

		c.JSON(http.StatusOK, gin.H{
			"message": "ok",
			"user": u,
		})
	})

	_ = r.Run(":9090")
}
