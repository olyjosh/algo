// Introduced in Chapter 13
/** Simply checks each position in the text for the pattern. */
public class NaiveStringMatcher extends AbstractStringMatcher {

  /** Pattern is the pattern being sought. */
  public NaiveStringMatcher(String pattern) {
    super(pattern);
  }

  public int match(String text) {
    for (int position = 0;
         position + getPattern().length() <= text.length();
         position++) {
      if (matchAt(text, position)) {
        return position;
      }
    }
    return -1;
  }

}
