import uiautomator2 as ui2

d = ui2.connect()
d.app_start('com.test.helloworld', '.MainActivity')

# 主页面
t = d(resourceId="com.test.helloworld:id/textView").get_text()
print(t)
print(d.app_current())
print()

# 页面B
d(text="BUTTON1").click()
text = d(textStartsWith="This").get_text()
print(text)
print(d.app_current())
d.press("back")
print()

# 页面C
d(text="BUTTON2").click()
d(resourceId="com.test.helloworld:id/etActivityc").send_keys("thishsishishfh")
d(resourceId="com.test.helloworld:id/buttonc1").click()
t = d(resourceId="com.test.helloworld:id/textView").get_text()
print(t)
print("thishsishishfh" == str(t).split("：")[1])
print(d.app_current())


