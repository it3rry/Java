package main

import (
	"github.com/gin-gonic/gin"
	"net/http"
)

func main() {
	r := gin.Default()

	r.GET("/json", func(c *gin.Context) {
		data := gin.H{
			"name": "小王子",
			"message": "hello",
			"age": 18,
		}



		c.JSON(http.StatusOK, data)
	})
	type msg struct {
		Name string
		Message string
		Age int
	}
	r.GET("/anther_json", func(c *gin.Context) {
		data := msg{
			"小王子", "Hello, golang", 18,
		}

		c.JSON(http.StatusOK, data)
	})
	_ = r.Run(":9090")
}
