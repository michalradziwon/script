
  package gen;
  public class G_Gen91 {
  		@com.google.inject.Inject
  		public G_Gen91(G_Gen92 g_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  