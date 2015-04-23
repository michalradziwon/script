
  package gen;
  public class G_Gen188 {
  		@com.google.inject.Inject
  		public G_Gen188(G_Gen189 g_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  