package main

import (
	"fmt"
	"github.com/gin-gonic/gin"
	"net/http"
)
func main() {

	r := gin.Default()
	r.LoadHTMLFiles("./index.html")
	r.GET("/index", func(c *gin.Context) {
		c.HTML(http.StatusOK, "index.html", nil)
	})

	r.POST("/upload", func(c *gin.Context) {
	// 从请求中读取文件
		f, err := c.FormFile("f1")
		if err != nil {
			c.JSON(http.StatusBadRequest, gin.H{
				"message": "cuow",
			})
		}else {
			// 将读取到的文件读取到服务端的本地
			dst := fmt.Sprintf("./%s", f.Filename)
			c.SaveUploadedFile(f, dst)
			c.JSON(http.StatusOK, gin.H{
				"status": "ok",
			})
		}

	})
	_ = r.Run(":9090")

}
