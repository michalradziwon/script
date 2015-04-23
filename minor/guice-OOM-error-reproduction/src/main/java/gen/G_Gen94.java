
  package gen;
  public class G_Gen94 {
  		@com.google.inject.Inject
  		public G_Gen94(G_Gen95 g_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  