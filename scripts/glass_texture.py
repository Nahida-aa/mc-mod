from PIL import Image, ImageDraw, ImageFilter
import random

def create_purple_glass_texture(filename, size=(16, 16), base_color=(172, 4, 250, 16)):
    """
    创建一个带有半透明效果的紫色玻璃块纹理并保存为图像文件。

    :param filename: 保存图像的文件名
    :param size: 图像的大小，默认为 16x16 像素
    :param base_color: 基础颜色，默认为半透明紫色
    """
    width, height = size
    image = Image.new("RGBA", size)
    draw = ImageDraw.Draw(image)

    # 创建无具体方向的明亮渐变效果
    for y in range(height):
        for x in range(width):
            # r = base_color[0] + int((255 - base_color[0]) * ((x + y) / (2 * width)))
            # g = base_color[1] + int((255 - base_color[1]) * ((x + y) / (2 * width)))
            # b = base_color[2] + int((255 - base_color[2]) * ((x + y) / (2 * width)))
            # a = base_color[3]
            # r = max(0, min(255, r))
            # g = max(0, min(255, g))
            # b = max(0, min(255, b))
            # draw.point((x, y), fill=(r, g, b, a))
            draw.point((x, y), fill=base_color)

    # 添加噪声效果
    for y in range(height):
        for x in range(width):
            noise = random.randint(-30, 30)
            r, g, b, a = image.getpixel((x, y))
            r = max(0, min(255, r + noise))
            g = max(0, min(255, g + noise))
            b = max(0, min(255, b + noise))
            draw.point((x, y), fill=(r, g, b, a))

    # 模糊处理，使纹理更柔和
    image = image.filter(ImageFilter.GaussianBlur(1))

    image.save(filename)
    print(f"纹理已保存为 {filename}")

# 创建一个 16x16 像素的紫色玻璃块纹理
create_purple_glass_texture("purple_glass_texture.png")