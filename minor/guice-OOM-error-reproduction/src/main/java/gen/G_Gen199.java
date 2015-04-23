
  package gen;
  public class G_Gen199 {
  		@com.google.inject.Inject
  		public G_Gen199(G_Gen200 g_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  