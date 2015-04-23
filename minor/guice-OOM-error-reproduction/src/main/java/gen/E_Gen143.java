
  package gen;
  public class E_Gen143 {
  		@com.google.inject.Inject
  		public E_Gen143(E_Gen144 e_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  