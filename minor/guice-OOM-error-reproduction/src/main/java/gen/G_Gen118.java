
  package gen;
  public class G_Gen118 {
  		@com.google.inject.Inject
  		public G_Gen118(G_Gen119 g_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  