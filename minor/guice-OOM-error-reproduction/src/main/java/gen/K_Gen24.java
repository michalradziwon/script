
  package gen;
  public class K_Gen24 {
  		@com.google.inject.Inject
  		public K_Gen24(K_Gen25 k_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  