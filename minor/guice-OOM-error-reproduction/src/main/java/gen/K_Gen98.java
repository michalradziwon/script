
  package gen;
  public class K_Gen98 {
  		@com.google.inject.Inject
  		public K_Gen98(K_Gen99 k_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  