
  package gen;
  public class K_Gen5 {
  		@com.google.inject.Inject
  		public K_Gen5(K_Gen6 k_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  