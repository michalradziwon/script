
  package gen;
  public class G_Gen88 {
  		@com.google.inject.Inject
  		public G_Gen88(G_Gen89 g_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  