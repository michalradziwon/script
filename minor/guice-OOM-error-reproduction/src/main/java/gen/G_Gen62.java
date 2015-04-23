
  package gen;
  public class G_Gen62 {
  		@com.google.inject.Inject
  		public G_Gen62(G_Gen63 g_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  