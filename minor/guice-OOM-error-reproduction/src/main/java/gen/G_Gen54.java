
  package gen;
  public class G_Gen54 {
  		@com.google.inject.Inject
  		public G_Gen54(G_Gen55 g_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  