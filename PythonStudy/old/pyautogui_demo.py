import pyautogui
import time
from time import sleep
import shlex


def get_mouse_position():
    print('开始获取鼠标位置')
    try:
        while True:
            x, y = pyautogui.position()
            rgb = pyautogui.screenshot().getpixel((x, y))
            print(f"x:{x} y:{y} RGB:{rgb}")
            time.sleep(1)
    except KeyboardInterrupt:
        print('退出程序！')


# get_mouse_position()


def auto_write_code():
    # sleep(3)
    # 停止程序
    # pyautogui.click(30, 610)
    # 点击代码空白处，选中pycharm输入框
    # pyautogui.click(1135, 495)
    # 点击新页面
    pyautogui.click(608, 91)
    sleep(1)
    # 输入回车
    pyautogui.press('enter')
    # 输入内容
    sleep(1)
    # pyautogui.press('shift')
    pyautogui.typewrite("print('hello world!')", 0.3)
    sleep(1)
    # 选中执行的py文件
    pyautogui.click(192, 559)
    # 双击右键，打开菜单选项
    # pyautogui.rightClick(838, 340)
    # # 选择运行程序
    # pyautogui.click(885, 599)
    sleep(1)
    # 开始执行程序
    pyautogui.click(34, 590)

# auto_write_code()
get_mouse_position()
