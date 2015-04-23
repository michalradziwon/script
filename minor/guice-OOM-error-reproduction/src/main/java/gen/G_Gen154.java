
  package gen;
  public class G_Gen154 {
  		@com.google.inject.Inject
  		public G_Gen154(G_Gen155 g_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  