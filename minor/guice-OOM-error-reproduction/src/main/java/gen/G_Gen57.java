
  package gen;
  public class G_Gen57 {
  		@com.google.inject.Inject
  		public G_Gen57(G_Gen58 g_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  