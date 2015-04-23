
  package gen;
  public class G_Gen120 {
  		@com.google.inject.Inject
  		public G_Gen120(G_Gen121 g_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  