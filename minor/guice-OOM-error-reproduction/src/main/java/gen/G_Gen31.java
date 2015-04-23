
  package gen;
  public class G_Gen31 {
  		@com.google.inject.Inject
  		public G_Gen31(G_Gen32 g_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  