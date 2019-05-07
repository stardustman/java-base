package pattern.builder;

public class Square2 {

	private int color;
	private int borderSize;
	private int borderColor;
	private int left;
	private int top;
	private int right;
	private int bottom;

	private Square2(Builder builder) {
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

		public Builder setLeft(int left) {
			this.left = left;
			return this;
		}

		public Builder setTop(int top) {
			this.top = top;
			return this;
		}

		public Builder setRight(int right) {
			this.right = right;
			return this;
		}

		public Builder setBottom(int bottom) {
			this.bottom = bottom;
			return this;
		}

		public Builder setColor(int color) {
			this.color = color;
			return this;
		}

		public Builder setBorderSize(int size) {
			this.borderSize = size;
			return this;
		} // 边框大小

		public Builder setBorderColor(int color) {
			this.borderColor = color;
			return this;
		} // 边框颜色

		public Builder setPadding(int left, int top, int right, int bottom) {
			this.left = left;
			this.top = top;
			this.right = right;
			this.bottom = bottom;
			return this;
		}

		public Square2 build() {
			return new Square2(this);
		}
	}

	@Override
	public String toString() {
		return "Square [color=" + color + ", borderSize=" + borderSize + ", borderColor=" + borderColor + ", left="
				+ left + ", top=" + top + ", right=" + right + ", bottom=" + bottom + "]";
	}
	
	
}