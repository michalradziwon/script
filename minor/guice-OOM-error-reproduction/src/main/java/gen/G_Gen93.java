
  package gen;
  public class G_Gen93 {
  		@com.google.inject.Inject
  		public G_Gen93(G_Gen94 g_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  