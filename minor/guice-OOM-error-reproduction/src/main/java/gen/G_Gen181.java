
  package gen;
  public class G_Gen181 {
  		@com.google.inject.Inject
  		public G_Gen181(G_Gen182 g_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  