
  package gen;
  public class K_Gen54 {
  		@com.google.inject.Inject
  		public K_Gen54(K_Gen55 k_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  