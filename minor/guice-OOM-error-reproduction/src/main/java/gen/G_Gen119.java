
  package gen;
  public class G_Gen119 {
  		@com.google.inject.Inject
  		public G_Gen119(G_Gen120 g_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  