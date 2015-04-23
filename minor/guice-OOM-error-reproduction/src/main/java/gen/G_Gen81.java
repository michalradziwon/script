
  package gen;
  public class G_Gen81 {
  		@com.google.inject.Inject
  		public G_Gen81(G_Gen82 g_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  