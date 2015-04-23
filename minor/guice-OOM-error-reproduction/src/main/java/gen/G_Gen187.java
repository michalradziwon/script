
  package gen;
  public class G_Gen187 {
  		@com.google.inject.Inject
  		public G_Gen187(G_Gen188 g_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  