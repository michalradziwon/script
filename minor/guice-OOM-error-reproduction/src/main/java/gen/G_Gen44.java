
  package gen;
  public class G_Gen44 {
  		@com.google.inject.Inject
  		public G_Gen44(G_Gen45 g_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  