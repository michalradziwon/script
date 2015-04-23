
  package gen;
  public class E_Gen161 {
  		@com.google.inject.Inject
  		public E_Gen161(E_Gen162 e_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  