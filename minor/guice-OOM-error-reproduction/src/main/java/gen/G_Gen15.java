
  package gen;
  public class G_Gen15 {
  		@com.google.inject.Inject
  		public G_Gen15(G_Gen16 g_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  