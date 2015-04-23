
  package gen;
  public class G_Gen60 {
  		@com.google.inject.Inject
  		public G_Gen60(G_Gen61 g_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  