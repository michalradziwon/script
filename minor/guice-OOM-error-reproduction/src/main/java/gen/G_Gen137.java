
  package gen;
  public class G_Gen137 {
  		@com.google.inject.Inject
  		public G_Gen137(G_Gen138 g_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  