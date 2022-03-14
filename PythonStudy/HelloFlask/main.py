import os
from flask import Flask, request, render_template, flash, redirect, url_for, session
from markupsafe import escape
from werkzeug.utils import secure_filename


ROOT_PATH = os.path.abspath(os.path.dirname(__file__))
UPLOAD_FOLDER = os.path.join(ROOT_PATH, 'uploads')
if not os.path.exists(UPLOAD_FOLDER):
    os.mkdir(UPLOAD_FOLDER)
# 允许上传的文件类型
ALLOWED_EXTENSIONS = {'txt', 'png', 'jpg'}

app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = UPLOAD_FOLDER
app.config['SECRET_KEY'] = 'zzzzzz'


# index
@app.route('/')
def index():
    # redirect()函数可以重定向
    return redirect(url_for('login'))


# return html
@app.route('/hello')
def hello():
    return "<h1>this is a Hello title</h1><p>this is a tag: p</p><h2>this is a tile H2</h2>"


# raise error
@app.route('/error')
def error():
    """raise a error"""
    raise NotImplementedError("This is a ERROR!")


# <variable_name>
@app.route('/<names>')
def name(names):
    return f'hello, {names}!'


# 变量规则
@app.route('/user/<username>')
def show_user_profile(username):
    """show the user profile for that user"""
    return f'User {escape(username)}'


@app.route('/post/<int:post_id>')
def show_post(post_id):
    """show the post with the given id, the id is an integer"""
    return f'Post {post_id}'


# 转换器类型: path: 类似string, 可以包含斜杠, string不能包含有斜杠的文本
@app.route('/path/<path:subpath>')
def show_subpath(subpath):
    """show the subpath after /path/"""
    return f'Subpath {escape(subpath)}'


# 唯一的URL/重定向行为
@app.route('/projects/')
def projects():
    """接受 /projects 和 /projects/
     访问一个没有斜杠结尾的URL(/projects)时，Flask会重定向到(/projects/)
     """
    return 'The projects page'


# HTTP方法
@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        # 如果该字段不存在，则raise KeyError
        username = request.form['username']
        session['username'] = username
        # 可以使用args
        password = request.args.get('passwords', 'this key not exist!')
        return f'<h1>login success!</h1><p>Username : {username}</p><p>Password : {password}</p>'
    # else:
    #     return 'This is GET'
    return """
        <form name="login" method="post">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password">
        <br>
        <input type="submit" value="Submit">
        </form>
        """


@app.route('/sessionInfo')
def get_session():
    # 在login()中，将username保存在session里面
    if 'username' in session:
        return f'{session["username"]} 用户登录成功！'
    return "You are not logged in!"


@app.route('/logout')
def logout():
    # remove the username from the session if it's there
    session.pop('username', None)
    return 'You are logout!'


# 渲染模板
@app.route('/hello/')
@app.route('/hello/<string:name>')
def hello_name(name=None):
    return render_template('hello_name.html', word=name)


# 上传文件
# 检查拓展名是否合法
def allowed_file(filename):
    return '.' in filename and filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS


@app.route('/upload', methods=['GET', 'POST'])
def upload_file():
    if request.method == 'POST':
        # check if the post request has the file port
        if 'file' not in request.files:
            flash('No file part')
            return redirect(request.url)
        file = request.files['file']
        # If the user does not select a file, the browser submits an empty file without a filename
        if file.filename == '':
            flash('No selected file')
            return redirect(request.url)
        if file and allowed_file(file.filename):
            filename = secure_filename(file.filename)
            file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
            return 'File upload success!'
    return """
    <!doctype html>
    <title>Upload new File</title>
    <h1>Upload new File</h1>
    <form method=post enctype=multipart/form-data>
        <input type=file name=file>
        <input type=submit value=Upload>
    </form>
    """


if __name__ == '__main__':
    app.env = 'development'
    app.debug = True
    app.run(host='localhost', port=5050)
