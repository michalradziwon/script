
  package gen;
  public class G_Gen186 {
  		@com.google.inject.Inject
  		public G_Gen186(G_Gen187 g_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  