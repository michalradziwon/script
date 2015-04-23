
  package gen;
  public class G_Gen196 {
  		@com.google.inject.Inject
  		public G_Gen196(G_Gen197 g_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  