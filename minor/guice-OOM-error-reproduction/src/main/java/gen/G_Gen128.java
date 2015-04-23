
  package gen;
  public class G_Gen128 {
  		@com.google.inject.Inject
  		public G_Gen128(G_Gen129 g_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  