
  package gen;
  public class E_Gen7 {
  		@com.google.inject.Inject
  		public E_Gen7(E_Gen8 e_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  