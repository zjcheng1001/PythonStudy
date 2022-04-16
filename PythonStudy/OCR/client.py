import requests
import json
import cv2
import base64


def cv2_to_base64(image):
    data = cv2.imencode('.jpg', image)[1]
    return base64.b64encode(data.tostring()).decode('utf-8')


# hub serving start -m chinese_ocr_db_crnn_mobile -p 8866

data = {'images': [cv2_to_base64(cv2.imread('ocr.jpg'))]}
headers = {'content-type': 'application/json'}
url = 'http://127.0.0.1:8866/predict/chinese_ocr_db_crnn_mobile'
r = requests.post(url=url, headers=headers, data=json.dumps(data))
print(r.json()['results'])
