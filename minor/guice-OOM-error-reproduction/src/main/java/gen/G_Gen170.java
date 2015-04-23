
  package gen;
  public class G_Gen170 {
  		@com.google.inject.Inject
  		public G_Gen170(G_Gen171 g_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  