
  package gen;
  public class G_Gen184 {
  		@com.google.inject.Inject
  		public G_Gen184(G_Gen185 g_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  