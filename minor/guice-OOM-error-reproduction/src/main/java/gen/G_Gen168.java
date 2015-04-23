
  package gen;
  public class G_Gen168 {
  		@com.google.inject.Inject
  		public G_Gen168(G_Gen169 g_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  