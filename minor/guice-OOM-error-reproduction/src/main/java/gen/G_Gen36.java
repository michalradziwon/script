
  package gen;
  public class G_Gen36 {
  		@com.google.inject.Inject
  		public G_Gen36(G_Gen37 g_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  