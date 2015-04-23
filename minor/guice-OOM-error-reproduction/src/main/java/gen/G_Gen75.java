
  package gen;
  public class G_Gen75 {
  		@com.google.inject.Inject
  		public G_Gen75(G_Gen76 g_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  