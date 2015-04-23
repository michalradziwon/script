
  package gen;
  public class G_Gen183 {
  		@com.google.inject.Inject
  		public G_Gen183(G_Gen184 g_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  