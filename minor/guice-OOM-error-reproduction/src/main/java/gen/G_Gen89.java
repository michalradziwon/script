
  package gen;
  public class G_Gen89 {
  		@com.google.inject.Inject
  		public G_Gen89(G_Gen90 g_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  