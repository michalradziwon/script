
  package gen;
  public class G_Gen80 {
  		@com.google.inject.Inject
  		public G_Gen80(G_Gen81 g_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  