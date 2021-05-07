package treasurer.edifact.parser;

import com.bsgrd.treasurer.edifact.EdifactFileDeserializer;
import com.bsgrd.treasurer.edifact.dto.EdifactFile;
import com.bsgrd.treasurer.edifact.dto.Segment;
import com.bsgrd.treasurer.edifact.exception.EdifactDeserializationException;

public class EdifactFileParser {
    private final EdifactFileDeserializer deserializer;

    public EdifactFileParser(final EdifactFileDeserializer deserializer) {
        this.deserializer = deserializer;
    }

    public void parse(final byte[] fileBytes) throws EdifactDeserializationException {
        EdifactFile edifactFile = this.deserializer.deserialize(fileBytes);
        for (Segment segment : edifactFile.getSegments()) {
            segment.getSegmentIdentifier()
        }
    }

}
