
  package gen;
  public class K_Gen23 {
  		@com.google.inject.Inject
  		public K_Gen23(K_Gen24 k_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  