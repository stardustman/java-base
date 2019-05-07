package pattern.builder;

public class Square1 {

	private int color;
	private int borderSize;
	private int borderColor;
	private int left;
	private int top;
	private int right;
	private int bottom;

	private Square1(Builder builder) {
		this.color = builder.color;
		this.borderSize = builder.borderSize;
		this.borderColor = builder.borderColor;
		this.left = builder.left;
		this.top = builder.top;
		this.right = builder.right;
		this.bottom = builder.bottom;
	}

	public static class Builder {
		private int color;
		private int borderSize;
		private int borderColor;
		private int left;
		private int top;
		private int right;
		private int bottom;

		public void setLeft(int left) {
			this.left = left;
		}

		public void setTop(int top) {
			this.top = top;
		}

		public void setRight(int right) {
			this.right = right;
		}

		public void setBottom(int bottom) {
			this.bottom = bottom;
		}

		public void setColor(int color) {
			this.color = color;
		}

		public void setBorderSize(int size) {
			this.borderSize = size;
		} // 边框大小

		public void setBorderColor(int color) {
			this.borderColor = color;
		} // 边框颜色

		public void setPadding(int left, int top, int right, int bottom) {
			this.left = left;
			this.top = top;
			this.right = right;
			this.bottom = bottom;
		}

		public Square1 build() {
			return new Square1(this);
		}
	}

	@Override
	public String toString() {
		return "Square [color=" + color + ", borderSize=" + borderSize + ", borderColor=" + borderColor + ", left="
				+ left + ", top=" + top + ", right=" + right + ", bottom=" + bottom + "]";
	}
	
	
}