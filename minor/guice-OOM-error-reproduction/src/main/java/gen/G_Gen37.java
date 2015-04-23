
  package gen;
  public class G_Gen37 {
  		@com.google.inject.Inject
  		public G_Gen37(G_Gen38 g_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  