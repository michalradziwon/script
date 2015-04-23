
  package gen;
  public class G_Gen158 {
  		@com.google.inject.Inject
  		public G_Gen158(G_Gen159 g_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  