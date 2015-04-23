
  package gen;
  public class G_Gen156 {
  		@com.google.inject.Inject
  		public G_Gen156(G_Gen157 g_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  