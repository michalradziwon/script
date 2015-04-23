
  package gen;
  public class G_Gen117 {
  		@com.google.inject.Inject
  		public G_Gen117(G_Gen118 g_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  