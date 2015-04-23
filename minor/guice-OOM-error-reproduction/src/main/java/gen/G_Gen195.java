
  package gen;
  public class G_Gen195 {
  		@com.google.inject.Inject
  		public G_Gen195(G_Gen196 g_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  