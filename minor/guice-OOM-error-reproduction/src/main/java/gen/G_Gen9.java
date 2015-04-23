
  package gen;
  public class G_Gen9 {
  		@com.google.inject.Inject
  		public G_Gen9(G_Gen10 g_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  