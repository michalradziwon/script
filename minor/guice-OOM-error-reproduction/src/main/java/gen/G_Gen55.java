
  package gen;
  public class G_Gen55 {
  		@com.google.inject.Inject
  		public G_Gen55(G_Gen56 g_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  