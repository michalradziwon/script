
  package gen;
  public class G_Gen173 {
  		@com.google.inject.Inject
  		public G_Gen173(G_Gen174 g_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  