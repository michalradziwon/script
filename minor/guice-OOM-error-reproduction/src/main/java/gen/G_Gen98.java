
  package gen;
  public class G_Gen98 {
  		@com.google.inject.Inject
  		public G_Gen98(G_Gen99 g_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  