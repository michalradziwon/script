
  package gen;
  public class G_Gen144 {
  		@com.google.inject.Inject
  		public G_Gen144(G_Gen145 g_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  