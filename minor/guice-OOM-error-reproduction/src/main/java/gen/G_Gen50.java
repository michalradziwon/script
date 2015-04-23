
  package gen;
  public class G_Gen50 {
  		@com.google.inject.Inject
  		public G_Gen50(G_Gen51 g_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  