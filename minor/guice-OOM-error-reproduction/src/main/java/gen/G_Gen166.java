
  package gen;
  public class G_Gen166 {
  		@com.google.inject.Inject
  		public G_Gen166(G_Gen167 g_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  