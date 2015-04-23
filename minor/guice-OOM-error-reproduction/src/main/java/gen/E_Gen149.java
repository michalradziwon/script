
  package gen;
  public class E_Gen149 {
  		@com.google.inject.Inject
  		public E_Gen149(E_Gen150 e_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  