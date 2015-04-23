
  package gen;
  public class E_Gen49 {
  		@com.google.inject.Inject
  		public E_Gen49(E_Gen50 e_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  