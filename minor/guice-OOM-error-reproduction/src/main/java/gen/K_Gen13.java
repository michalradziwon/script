
  package gen;
  public class K_Gen13 {
  		@com.google.inject.Inject
  		public K_Gen13(K_Gen14 k_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  