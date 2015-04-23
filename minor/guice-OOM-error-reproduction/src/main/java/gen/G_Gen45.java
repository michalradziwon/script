
  package gen;
  public class G_Gen45 {
  		@com.google.inject.Inject
  		public G_Gen45(G_Gen46 g_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  