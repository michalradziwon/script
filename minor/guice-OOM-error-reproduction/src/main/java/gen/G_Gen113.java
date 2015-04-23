
  package gen;
  public class G_Gen113 {
  		@com.google.inject.Inject
  		public G_Gen113(G_Gen114 g_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  