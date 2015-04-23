
  package gen;
  public class E_Gen88 {
  		@com.google.inject.Inject
  		public E_Gen88(E_Gen89 e_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  