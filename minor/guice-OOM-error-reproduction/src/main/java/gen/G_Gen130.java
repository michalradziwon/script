
  package gen;
  public class G_Gen130 {
  		@com.google.inject.Inject
  		public G_Gen130(G_Gen131 g_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  