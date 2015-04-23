
  package gen;
  public class G_Gen145 {
  		@com.google.inject.Inject
  		public G_Gen145(G_Gen146 g_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  