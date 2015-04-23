
  package gen;
  public class G_Gen16 {
  		@com.google.inject.Inject
  		public G_Gen16(G_Gen17 g_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  