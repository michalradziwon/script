
  package gen;
  public class G_Gen194 {
  		@com.google.inject.Inject
  		public G_Gen194(G_Gen195 g_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  