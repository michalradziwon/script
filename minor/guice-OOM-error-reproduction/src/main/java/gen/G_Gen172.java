
  package gen;
  public class G_Gen172 {
  		@com.google.inject.Inject
  		public G_Gen172(G_Gen173 g_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  