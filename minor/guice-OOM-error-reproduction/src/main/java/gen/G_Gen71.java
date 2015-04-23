
  package gen;
  public class G_Gen71 {
  		@com.google.inject.Inject
  		public G_Gen71(G_Gen72 g_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  