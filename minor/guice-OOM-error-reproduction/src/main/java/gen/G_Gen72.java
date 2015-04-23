
  package gen;
  public class G_Gen72 {
  		@com.google.inject.Inject
  		public G_Gen72(G_Gen73 g_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  