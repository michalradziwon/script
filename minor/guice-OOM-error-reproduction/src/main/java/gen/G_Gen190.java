
  package gen;
  public class G_Gen190 {
  		@com.google.inject.Inject
  		public G_Gen190(G_Gen191 g_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  