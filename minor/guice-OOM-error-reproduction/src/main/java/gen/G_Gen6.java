
  package gen;
  public class G_Gen6 {
  		@com.google.inject.Inject
  		public G_Gen6(G_Gen7 g_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  