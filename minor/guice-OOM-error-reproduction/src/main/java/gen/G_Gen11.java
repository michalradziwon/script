
  package gen;
  public class G_Gen11 {
  		@com.google.inject.Inject
  		public G_Gen11(G_Gen12 g_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  