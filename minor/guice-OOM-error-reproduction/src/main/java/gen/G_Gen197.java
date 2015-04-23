
  package gen;
  public class G_Gen197 {
  		@com.google.inject.Inject
  		public G_Gen197(G_Gen198 g_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  