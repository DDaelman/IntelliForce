package au.com.borner.salesforce.plugin.toolwindow.data;

import au.com.borner.salesforce.client.rest.AbstractRestClient;
import au.com.borner.salesforce.client.rest.domain.APIVersionResult;
import au.com.borner.salesforce.plugin.toolwindow.AbstractExplorerNode;
import au.com.borner.salesforce.plugin.toolwindow.AbstractExplorerRootNode;
import com.intellij.openapi.project.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mark
 */
public class DataExplorerRootNode extends AbstractExplorerRootNode {

    public DataExplorerRootNode(Project project, AbstractRestClient client, String name) {
        super(project, client, name);
    }

    @Override
    protected List<AbstractExplorerNode> getVersionNodes(List<APIVersionResult> apiVersions) {
        List<AbstractExplorerNode> result = new ArrayList<AbstractExplorerNode>(apiVersions.size());
        for (APIVersionResult apiVersionResult : apiVersions) {
            DataExplorerVersionNode node = new DataExplorerVersionNode(this, client, apiVersionResult);
            result.add(node);
        }
        return result;
    }

}
