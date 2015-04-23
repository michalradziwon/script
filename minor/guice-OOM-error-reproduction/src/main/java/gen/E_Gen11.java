
  package gen;
  public class E_Gen11 {
  		@com.google.inject.Inject
  		public E_Gen11(E_Gen12 e_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  