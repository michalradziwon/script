
  package gen;
  public class G_Gen26 {
  		@com.google.inject.Inject
  		public G_Gen26(G_Gen27 g_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  