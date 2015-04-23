
  package gen;
  public class G_Gen160 {
  		@com.google.inject.Inject
  		public G_Gen160(G_Gen161 g_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  