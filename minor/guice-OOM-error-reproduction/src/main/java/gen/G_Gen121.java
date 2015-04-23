
  package gen;
  public class G_Gen121 {
  		@com.google.inject.Inject
  		public G_Gen121(G_Gen122 g_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  