package main

import (
	"github.com/gin-gonic/gin"
	"net/http"
)
func main() {
	r := gin.Default()

	group := r.Group("/video")


	r.GET("/index", func(c *gin.Context) {
		c.JSON(http.StatusOK, gin.H{
			"method": "get",
		})
	})




}
