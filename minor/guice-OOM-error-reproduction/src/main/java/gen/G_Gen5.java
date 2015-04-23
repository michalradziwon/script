
  package gen;
  public class G_Gen5 {
  		@com.google.inject.Inject
  		public G_Gen5(G_Gen6 g_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  