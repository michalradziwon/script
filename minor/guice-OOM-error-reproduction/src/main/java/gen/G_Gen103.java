
  package gen;
  public class G_Gen103 {
  		@com.google.inject.Inject
  		public G_Gen103(G_Gen104 g_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  