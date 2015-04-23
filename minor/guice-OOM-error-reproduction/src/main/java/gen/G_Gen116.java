
  package gen;
  public class G_Gen116 {
  		@com.google.inject.Inject
  		public G_Gen116(G_Gen117 g_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  