import paddlehub as hub
import cv2

# 文档地址
# https://aistudio.baidu.com/aistudio/projectdetail/507159

# ocr = hub.Module(name="chinese_ocr_db_crnn_mobile")
ocr = hub.Module(name="chinese_ocr_db_crnn_server")

results = ocr.recognize_text(
                    images=[cv2.imread('k.jpg')],         # 图片数据，ndarray.shape 为 [H, W, C]，BGR格式；
                    use_gpu=False,                          # 是否使用 GPU；若使用GPU，请先设置CUDA_VISIBLE_DEVICES环境变量
                    output_dir='ocr_result',                # 图片的保存路径，默认设为 ocr_result；
                    visualization=True,                     # 是否将识别结果保存为图片文件；
                    box_thresh=0.5,                         # 检测文本框置信度的阈值；
                    text_thresh=0.5)                        # 识别中文文本置信度的阈值；


for result in results:
    data = result['data']
    for information in data:
        print(information['text'])
# print(results)