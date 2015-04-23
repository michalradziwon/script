
  package gen;
  public class G_Gen43 {
  		@com.google.inject.Inject
  		public G_Gen43(G_Gen44 g_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  