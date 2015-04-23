
  package gen;
  public class E_Gen70 {
  		@com.google.inject.Inject
  		public E_Gen70(E_Gen71 e_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  